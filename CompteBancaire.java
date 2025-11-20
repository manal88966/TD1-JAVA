public class CompteBancaire {
    private String iban;
    private long balanceInCents;

    public CompteBancaire(String iban,long balanceInCents){
        this.iban = iban;
        this.balanceInCents = balanceInCents;
        throw new IllegalArgumentException("Initial balance cannot be negative");
        throw new IllegalArgumentException("IBAN cannot be null or empty");
    }
    public void deposit(long amountInCents){
        if(amountInCents <=0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        
    }
    
}

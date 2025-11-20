public  final class Emailimm {
    private final String email;

    public Emailimm(String email) {
        if (email == null || email.isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Email cannot be null, empty, and must contain '@'");
        }
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public String toString() {
        return "Emailimm{ " +
                "email= " + email +
                '}';
    }
    public static void main(String[] args){
        Emailimm email = new Emailimm ("manalelmoudden@gmail.com");
        System.out.println(email.toString());
        try {
            // Example: demonstrate throwing and catching an IllegalArgumentException
            throw new IllegalArgumentException("Sample exception from main");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}


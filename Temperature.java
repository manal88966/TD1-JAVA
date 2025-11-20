public class Temperature {
    private double valueInCelesius;
    public double getValueInCelesius(){
        return valueInCelesius;
    }
    public void setValueInCelesius(double c){
         if(valueInCelesius <(-273.15)){
            throw new IllegalArgumentException("Valeur inferieure a -273.15");
        }
        else{
            valueInCelesius = c;
}

        
    }
    public Temperature(double c){
        valueInCelesius = c;
      
       

}
public static void main(String[] args){
    Temperature temp = new Temperature(-274.15);
    System.out.println("Temperature in Celsius: " + temp.getValueInCelesius());
    try {
        temp.setValueInCelesius(-273.15);
    } catch (IllegalArgumentException e) {
        System.out.println("Caught exception: " + e.getMessage());
    }
}
}

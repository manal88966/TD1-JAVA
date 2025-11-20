public class User {
    private String name;
    private String email;

    User(String name, String email){
        this.name = name ;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String toString(){
        return "Name: " + name + ", Email: " + email;
    }
    public static void main(String[] args){
        User user1 = new User("ikram", "ikram@user.com");
         User user2 = new User("manal", "manal@user.com");
         User u2 = user1;
         u2.setName("salma");
         System.out.println(user2.toString());
        System.out.println(user1.toString());
    
}
}

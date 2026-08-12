class Insta {

    // Instance Variables
    private String instaId;
    private String instaPass;
    private String instaBio;

    // Setter for ID
    public void setInstaId(String instaId) {
        this.instaId = instaId;
    }

    // Getter for ID
    public String getInstaId() {
        return instaId;
    }

    // Setter for Password
    public void setInstaPass(String password) {

        if (password.length() >= 8) {
            this.instaPass = password;
        } else {
            System.out.println("Password must be at least 8 characters.");
        }
    }

    // Getter for Password (Only for learning)
    public String getInstaPass() {
        return instaPass;
    }

    // Setter for Bio
    public void setInstaBio(String bio) {
        this.instaBio = bio;
    }

    // Getter for Bio
    public String getInstaBio() {
        return instaBio;
    }
}

public class encapsulation {

    public static void main(String[] args) {

        Insta first = new Insta();

        first.setInstaId("Rutik@123");
        first.setInstaPass("rutik34123");
        first.setInstaBio("I am from Pune");

        System.out.println("Insta ID : " + first.getInstaId());

       
        System.out.println("Password : " + first.getInstaPass());

        System.out.println("Insta Bio : " + first.getInstaBio());
    }
}
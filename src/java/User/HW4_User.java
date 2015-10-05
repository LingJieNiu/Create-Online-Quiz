/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author Ling
 */
public class HW4_User {

    private String firstName;
    private String lastName;
    private String emailAddress;
    int password;
    public HW4_User() {
        firstName = "";
        lastName = "";
        emailAddress = "";
        password=0;
    }

    public HW4_User(String firstName, String lastName, String emailAddress,int password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.password=password;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
     public int getPassword() {
        return password;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setpassword(int password) {
        this.password = password;
    }
    
    
}

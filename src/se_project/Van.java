package se_project;

class Cred { 
  
    public String username; 
    public String password; 
//    public void Cred(String username, String password) 
//    { 
//        this.username = username; 
//        this.password = password; 
//    } 
    public void setUserName(String n) 
    { 
        this.username = n; 
    } 
    public void setPass(String i) 
    { 
        this.password = i; 
    } 
}
class Person extends Cred{ 
  
    public String name; 
    public String email; 
    public String phoneNumber; 
//    public void Person(String usern,String pass,String name, String email, String phoneNumber) 
//    {   
//        this.username = usern; 
//        this.password = pass; 
//        this.name = name; 
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//    } 
    public void setName(String n) 
    { 
        this.name = n; 
    } 
    public void setEmail(String i) 
    { 
        this.email = i; 
    } 
    public void setPhoneNumber(String i) 
    { 
        this.phoneNumber = i; 
    } 
    public void display() 
    {   
        System.out.println("User password is: " + password + " and User username is: "+ username);
        System.out.println("User name is: " + name + " and User email is: "+ email+ " and User phoneNumber is: "+ phoneNumber);
    } 
}

public class Van extends Person{ 
  
    public String vanNumber; 
//    public void Van(String usern,String pass,String name, String email, String phoneNumber, String n) 
//    {   
//        this.username = usern; 
//        this.password = pass; 
//        this.name = name; 
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//        this.vanNumber = n; 
//    } 
    public void setVanNumber(String n) 
    { 
        this.vanNumber = n; 
    } 
    public void display() 
    {   
        System.out.println("Van number is: "+ vanNumber); 
        System.out.println("Van password is: " + password + " and Van username is: "+ username);
        System.out.println("Van name is: " + name + " and Van email is: "+ email+ " and Van phoneNumber is: "+ phoneNumber);
    } 
}
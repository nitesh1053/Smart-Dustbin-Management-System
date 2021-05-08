/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_project;
import java.util.*;

/**
 *
 * @author HP
 */

public class SE_Project {

    
    public static List<Van> vanlist = new ArrayList<Van>();
    public static List<Dustbin> dustbinlist = new ArrayList<Dustbin>();
    public static List<Person> authlist = new ArrayList<Person>();
    public static List<String> logreport = new ArrayList<String>();
    
    public static int moisture_sensor=50;
    public static double ultra_sensor=50;
    public static int vanDelay=3;
    public static int dustbinDelay=50;

    public static void main(String[] args) {
        // TODO code application logic here
        
        Dbconnector connect =new Dbconnector();
        Person p1 = new Person();
        p1.setPhoneNumber("8077983887");
        p1.setEmail("iit2019099@iiita.ac.in");
        p1.setName("Nitesh Rawat");
        p1.setUserName("nitesh");
        p1.setPass("nitesh");     
        authlist.add(p1);
        
        Person p2 = new Person();
        p2.setPhoneNumber("7891140253");
        p2.setEmail("iit2019129@iiita.ac.in");
        p2.setName("Sanyam Agarwal");
        p2.setUserName("sanyam");
        p2.setPass("sanyam");     
        authlist.add(p2);
        
        Person p3 = new Person();
        p3.setPhoneNumber("8086421147");
        p3.setEmail("iit2019159@iiita.ac.in");
        p3.setName("Hafiz Ali");
        p3.setUserName("hafiz");
        p3.setPass("hafiz");     
        authlist.add(p3);
        
        Person p4 = new Person();
        p4.setPhoneNumber("9111328179");
        p4.setEmail("iit2019160@iiita.ac.in");
        p4.setName("Tejas Dutta");
        p4.setUserName("tejas");
        p4.setPass("tejas");     
        authlist.add(p4);
        
        Dustbin d1=new Dustbin();
        d1.setId("ID 1");
        d1.setLocation("CC3");
        d1.setWidth(1.25);
        d1.setHeight(3.25); 
        d1.setLevel(50);
        d1.setLastEmptyDate("07-04-2021");
        d1.setMoisture(45);
        dustbinlist.add(d1);
        
        Dustbin d2=new Dustbin();
        d2.setId("ID 2");
        d2.setLocation("LIBRARY");
        d2.setWidth(2.45);
        d2.setHeight(4.76); 
        d2.setLevel(89);
        d2.setLastEmptyDate("07-04-2021");
        d2.setMoisture(10);
        dustbinlist.add(d2);

        Dustbin d3=new Dustbin();
        d3.setId("ID 3");
        d3.setLocation("CC2");
        d3.setWidth(3.56);
        d3.setHeight(2.54); 
        d3.setLevel(10);
        d3.setLastEmptyDate("08-04-2021");
        d3.setMoisture(97);
        dustbinlist.add(d3);
        
        
        Dustbin d4=new Dustbin();
        d4.setId("ID 4");
        d4.setLocation("MAIN GROUND");
        d4.setWidth(2.45);
        d4.setHeight(4.35); 
        d4.setLevel(78);
        d4.setLastEmptyDate("08-04-2021");
        d4.setMoisture(73);
        dustbinlist.add(d4);

        Van v1 = new Van();
        v1.setVanNumber("1");
        v1.setPhoneNumber("8077983887");
        v1.setEmail("iit2019099@iiita.ac.in");
        v1.setName("Nitesh");
        v1.setUserName("nitesh");
        v1.setPass("nitesh");
        vanlist.add(v1);
        
        Van v2 = new Van();
        v2.setVanNumber("2");
        v2.setPhoneNumber("7891140253");
        v2.setEmail("iit2019129@iiita.ac.in");
        v2.setName("Sanyam");
        v2.setUserName("sanyam");
        v2.setPass("sanyam");
        vanlist.add(v2);
        
        
        Van v3 = new Van();
        v3.setVanNumber("3");
        v3.setPhoneNumber("8086421147");
        v3.setEmail("iit2019159@iiita.ac.in");
        v3.setName("Hafiz");
        v3.setUserName("hafiz");
        v3.setPass("hafiz");
        vanlist.add(v3);
        
        
        
        Van v4 = new Van();
        v4.setVanNumber("4");
        v4.setPhoneNumber("9111328179");
        v4.setEmail("iit2019160@iiita.ac.in");
        v4.setName("Tejas");
        v4.setUserName("tejas");
        v4.setPass("tejas");
        vanlist.add(v4);
        
        
        home_page link = new home_page();
        link.setVisible(true);
        
    }
}
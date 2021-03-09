/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import se_project.mailll;
/**
 *
 * @author HP
 */

 class TestSleepMethod1 extends Thread{  
    private String sent;
    private String body;
    private String subject;
    private String dustbin_id;
    
    public TestSleepMethod1(String sent, String body, String subject,String dustbin_id) {
        this.subject = subject;
        this.body = body;
        this.sent = sent;
        this.dustbin_id=dustbin_id;
    }
 public void run(){  
    try{Thread.sleep(se_project.SE_Project.vanDelay);}catch(InterruptedException e){System.out.println(e);} 
    
    for (int i = 0; i < se_project.SE_Project.dustbinlist.size(); i++) { 
        String id=se_project.SE_Project.dustbinlist.get(i).id;
        if(id.equals(dustbin_id))
        {
            int level = se_project.SE_Project.dustbinlist.get(i).level;
            if(level !=0){
            mailll t1=new mailll();
            t1.sendMail(this.sent,this.body,this.subject);
            Date date = Calendar.getInstance().getTime();  
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
            String strDate = dateFormat.format(date);  
            se_project.SE_Project.logreport.add("Mail sent to authority as dustbin "+dustbin_id+ " is not clean till Timestamp="+strDate);
          }
        }
    } 
 }
 }
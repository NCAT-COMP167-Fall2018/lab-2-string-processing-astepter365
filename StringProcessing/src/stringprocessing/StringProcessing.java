/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ashton
 */
public class StringProcessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] records =  new String[100];
        try {
            // TODO code application logic here
            Scanner reader =  new Scanner(new File(args[0]));
            int currentIndex = 0;
            while(reader.hasNext()){
                String[] line  = reader.nextLine().split(",");
                
                String firstName =  line[0].trim();
                String lastName =  line[1].trim();
                String gender = line[2].trim();
                int age = Integer.parseInt(line[3].trim());
                String phoneNumber = line[4].trim();
                String emailAddress = line[5].trim();
                 if (!firstNameIsValid(firstName)) {
                    System.out.println("Firstname is not valid: " + firstName);
                    continue;
                }
                
                if (!firstNameIsValid(lastName)) {
                    System.out.println("LastName is not valid: " + lastName);
                    continue;
                }
                
                if (!genderIsValid(gender)) {
                    System.out.println("LastName is not valid: " + gender);
                    continue;
                }
                if(!ageIsValid(age)){
                    System.out.println("Age is not valid: " + age);
                    continue;
                }
                if(!phoneNumberIsValid(phoneNumber)){
                    System.out.println("PhoneNumber is not valid:" + phoneNumber);
                    continue;
                }
                if(!emailAddressIsValid(emailAddress)){
                    System.out.println("EmailAddress is not valid:" + emailAddress);
                    continue;
                            
                    
                }

                    
                
                records[currentIndex] = String.format("%-20s%-20s%-20s%-20d%-20s%-20s", firstName, lastName, gender, age, phoneNumber, emailAddress);
                System.out.println(records[currentIndex]);
                currentIndex++;
            }
                
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StringProcessing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static boolean firstNameIsValid(String firstName){
        
        if(firstName.matches("[A-Za-z]+")){
            
            return true;
        }else{
            
            return false;
        }
        
      
    }
    private static boolean genderIsValid(String gender){
        if(gender.equalsIgnoreCase("male")|| gender.equalsIgnoreCase("female")){
            return true;
            
        }else{
            return false;
        }
}
        
   private static boolean ageIsValid(int age){
     if(age > 1 && age < 130){
         return true;    
     }else{
         return false;
     }
   }
   private static boolean phoneNumberIsValid(String phoneNumber){
       if(phoneNumber.matches("[(][0-9]{3}[)][0-9]{3}[-][0-9]{4}")){
           return true;
       }else{
           return false;
       }
   }
   private static boolean emailAddressIsValid(String emailAddress){
       if(emailAddress.matches("[A-Za-z][A-Za-z0-9\\.]+@[A-Za-z0-9]+[\\.](?:net|com")){
           return true;
       }else{
           return false;
       }
   }     
    
}

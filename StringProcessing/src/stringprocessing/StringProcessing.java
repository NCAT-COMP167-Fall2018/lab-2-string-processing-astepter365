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
                
                String firstName =  line[0];
                String lastName =  line[1];
                String gender = line[2];
                String age = line[3];
                String phoneNumber = line[4];
                String emailAddress = line[5];
                

                    
                
                records[currentIndex] = String.format("%-20s%-20s%-20s%-20s%-20s%-20s", firstName, lastName, gender, age, phoneNumber, emailAddress);
                System.out.println(records[currentIndex]);
                currentIndex++;
            }
                
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StringProcessing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static boolean firstNameIsValid(String firstName){
        if(firstNameisValid(firstName)){
            System.out.println(records[currentIndex]);
        }
    }
}

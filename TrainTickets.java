
package traintickets;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class TrainTickets {

    
    public static void main(String[] args) throws IOException {
       
        int choose ;
        String name=null ,email=null;
        String number = null; 
        
        Scanner keyboard =new Scanner(System.in);//create a Scanner object for keyboard input
        Destination object1 =new Destination();//create a Destination object
        Booking object2=new Booking ();//create a Booking object
        Customer object3=new Customer(name,email,number,object1,object2);//create a customer object 
        //open file
        FileWriter file = new FileWriter("information.txt",true);
        PrintWriter outfile =new PrintWriter(file);
        
        
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("\t Welcome to the train ticket system");  
        System.out.println("-------------------------------------------------------------");
System.out.println("To start using the system \nPLEASE ENTER :");
   
    System.out.println("your fall name : ");
    name =keyboard.nextLine (); 
    object3.setCustomerName(name);
    System.out.println("your email : ");
    email = keyboard.nextLine ();
    object3.setEmail(email);
    System.out.println("your phoneNumber : ");
    number =keyboard.nextLine();
    // to ckeck that the constructor entered the number correctly
     do{
    if(10==number.length()){
    object3.setPhoneNumber(number); }

    else{ System.out.println("please try again"); 
System.out.println("your phoneNumber : ");
     number =keyboard.nextLine();
      object3.setPhoneNumber(number);}
    
    }while(number.length()!=10);
        

    
       do{// Display the menu
           System.out.println(" ENTER 1 TO BOOK A TICKETS "
                   + "\n ENTER 2 TO CHECK YOUR BOOKING "
          +" \n ENTER 3 TO EXIT " );
        choose=keyboard.nextInt();
           
        switch(choose){
            case 1:
        //pass a reference to the object to the trips and details mehods
        trips (object1); //call to method 
        System.out.println("\n**The available trips this week**\n");
        System.out.println("----------------------------------");
        System.out.println("Day" + "   " + "\t\ttime");
        System.out.println("----------------------------------");
        // Array TO display tha days and times
        String [] days = {"Sunday" ,"Monday ", "Tuseday" ,"Wednesday ","Thursday" 
        ,"Friday","Saturday"};
        String [] time_ ={"9:00am","7:00am","11:00am","1:00pm","6:00am"
                ,"not","not"} ;
         String [] time_2 ={"5:00pm","4;00pm","3:00pm","6:00pm","2:00pm","available",
             "available" };
                
        
        for (int index =0 ; index < days.length ; index ++){
           
        
        System.out.println(days [index] +"   \t"+ time_ [index] + " - " +
                time_2 [index]);
        }   
       
        System.out.println(">>choose what day you like to go ");
        keyboard.nextLine(); 
        String day=keyboard.nextLine(); 
        object1.setDay(day);
       
      System.out.println(">>choose what the time you prefer ");
      String  time=keyboard.nextLine();        
      object1.setTime(time);
      System.out.println("----------------------------------\n");
        
        
     
      details ( object3,object2);//call to method 
      
      
      outfile.println(object3.toString());//print in file 
      outfile.close();//close of file
      
      
      
      
      
      
      tax(object3,object2);//call the method
              
                break;
            case 2:
               
                Search(name,email,number);
                break;
           case 3:
                System.out.println("Thanks for using our system , Have nice day ! :) ");
                break;
            default:System.out.println("wrong choose ,try again please ");
        }
                                         
       }while(choose!=3);        
             
    }//end of main method
    
    /**
     * trips method take the information of the booking
     * @param object1 reference to a Destination object
     */
    
  public static void trips (Destination object1 ){
    int choose ;
   
       int x=1;
    Scanner keyboard = new Scanner(System.in);//create a Scanner object for keyboard input
  while (x==1){
        System.out.println(" --------------our ststions in ----------------"
                           +"\n 1-Riyadh "
                           +"\n 2-Makkah "
                           +"\n 3-Jeddah "
                            +"\nwhere would like to go : (Hint: ENTER 1 for Riyadh , ENTER 2 for Makkah ," +
              " ENTER 3 for Jeddah)");
        choose= keyboard.nextInt();
        switch(choose){
            case 1:
                x=0;
                object1.setPlace("Riyadh"); 
        
        
                break;
                
            case 2 :
                x=0;
                object1.setPlace("Makkah"); 
                 
        
                break;
            case 3: 
                x=0 ;
                object1.setPlace("Jeddah"); 
                
        
                break;
            default :
                System.out.println("Wrong choice, try again please  ");  
        } //end of switch
     }
  
  
  }//end of method trips
  
  
  /**
   * details method take more information from the customer about the booking 
     * @param object3 reference to Customer object
   * @param object2 reference to a Booking object
   */
 public static void details (Customer object3,Booking object2 ) {
    String ticket ;
    int number ;

    Random randomNumber= new Random();
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("  **Choose one of the following **");
    System.out.println("----------------------------------");
    System.out.println("Ticket Type" + "   " + "\tPrice");
    System.out.println("----------------------------------");
    System.out.println(" VIP" + "        "+"\t160SAR");
    System.out.println(" STANDER" + "   " +"\t70SAR");
    System.out.println("----------------------------------");
    System.out.println(">>Choose your ticket type  ");
    ticket=keyboard.nextLine();
    
    
    System.out.println(">>How many tickets do you want ? ");
    number=keyboard.nextInt();
    object2.setNumberOfTickets(number);
    
    
    
    
     if(ticket.equalsIgnoreCase("VIP") || ticket.equalsIgnoreCase("vip") ){
        object2.setTicketType(ticket);
        object2.setPrice(160.00); 
        object2.setGate(1);
          System.out.println("\t***");      
     for(int i=0; i < number; i++){
     
     System.out.println("your number seat is>>" );
       int num= randomNumber.nextInt(100)+1;
     System.out.println(num);
 }//end for loop
         System.out.println("\t***");      

    }//end if statement
 
 
 else if (ticket.equalsIgnoreCase("STANDER") || ticket.equalsIgnoreCase("stander")){
        object2.setTicketType(ticket);
        object2.setPrice(70.00);
        object2.setGate(2);
                          System.out.println("\t***");      

 for(int i=0; i < number; i++){
      System.out.println("your number seat is>>" );
      int num= randomNumber.nextInt(100)+1;
      System.out.println(num);
     
 }//end for loop
                           System.out.println("\t***");
                           
                           

    }//end else if statement

   
 }//end of details method
 
  /**
   * tax method print the bill 
     * @param object3 reference to Customer object
   * @param object2 reference to a Booking object
   */
 
public static void tax(Customer object3,Booking object2){
     Scanner keyboard =new Scanner(System.in);
    System.out.println("Do you want to print the receipt (Y/N) ? ");
              String  answer=keyboard.nextLine(); 
               char letter = answer.charAt(0);

                if(letter==('Y')||letter==('y')){
            System.out.println("-----------THE RECEIPT------------------ ");
                System.out.println("---The Customer Information---");
               
                System.out.println("Customer name\n"+object3.getCustomerName() +"\nPhone number\n"
                        +object3.getPhoneNumber()+"\nEmail\n"+object3.getEmail());
                    System.out.println("-----------------------------------------");
                    System.out.println( " Destination\t"+"Day\t"+"\tTime\n"+object3.getdestination());
                                        System.out.println("-----------------------------------------");
                    System.out.println("\t\tTHE TAX WILL BE 10%\n"+"Ticket type\t"+"gate number\t"
                          +"Number Of Tickets\n"+object3.getbooking());
                        System.out.print("\nTotal price\n"+ object2.getCalculate());
               System.out.println("\nHave a safe trip\n");}
                
                else System.out.println("\nHave a safe trip\n");
                  }//end of tax method


  /**
     * search method search for the information in the file
     * @param name Customer Name
     * @param email Customer email
     * @param phone Customer phone
     */
 /*   public static void Search(String name ,String email , String phone ) throws IOException {
        System.out.println("NOTE:if it did not print any thing then you do not hava booking ");
        
      
            //open file
           File file = new File ("information.txt");
           Scanner inputfile =new Scanner(file);//read from file
           // to check if the file existe
           if(!file.exists()){
           System.out.println("file not found");
           System.exit(0);
           }
           
           while(inputfile.hasNext()){
               
           final String input=inputfile.nextLine();
           //search in file 
           if(input.contains(name) && input.contains(email) && input.contains(phone)){
               System.out.println("\nYES YOU HAVA A BOOKING ");
              System.out.println("Customer name\t"+"\tPhone number\t"+"\tEmail\t"+
                          "Destination\t"+"Day\t"+"\tTime\t"+"Ticket type\t"+"gate number\t"
                          +"Number Of Tickets\t");
               System.out.println(input); 
               break ;
           }//end if
   
        }//end while
            
  
     }//end method
                      
}*/
public static void Search(String name ,String email , String phone ) throws IOException {
    System.out.println(" NOTE : if it did not print anything then you do not have a booking");
    
        
           File file = new File ("information.txt"); //open file
           Scanner inputfile =new Scanner(file); // to read from file
           
           // to check that the file is opened correctly
           if(!file.exists()){
           System.out.println("file not found");
           System.exit(0);
           }
           
           while(inputfile.hasNext()){
               
           final String input=inputfile.nextLine();
           
           //search in file 
           if(input.contains(name) && input.contains(email) && input.contains(phone)){
               
               System.out.println("Yes you have a booking ");
               System.out.println("Customer name\t"+"Phone number\t"+"Email\t"+
                          "\t Destination\t"+"Day\t"+"Time\t"+"Ticket type\t"+"gate number\t"
                          +"Number Of Tickets\t");
               System.out.println(input); //display the result
               break ;
           }//end if
   
        }//end while
         
          
}//end method

}

package traintickets;


public class Customer 
{
  private String customerName;
  private String phoneNumber ;
  private String email;
  private Destination destination ;
  private Booking booking ;
 
 
    /**
      This constructor initializes the customerName, 
      phoneNumber, and email fields with an
      empty string.
   */
  public Customer(){
customerName="";
phoneNumber="";
email=" ";

  }
  /**
   *  This constructor initializes the customerName, 
      phoneNumber, and email fields 
   * @param name Customer name
   * @param mobileNumber Customer phone Number
   * @param e_mail Customer email
   * @param destination an Destination object
   * @param booking an Booking object
   */
  public Customer(String name,String mobileNumber ,String e_mail ,Destination destination,Booking booking){
  
  customerName=name ;
  phoneNumber=mobileNumber;
  email=e_mail;
 this .destination=destination;
  this.booking=booking;
  } 
  
   /**
     * the setCustomerName method stores a value in the customerName filed
     * @param name_ the value to store in customerName
     */
  
  
   public void setCustomerName(String name_ ){
   
   customerName=name_;
   
   
   }
   /**
     *setPhoneNumber method stores a value in the phoneNumber filed
     * @param number the value to store in phoneNumber
     */
   public void setPhoneNumber(String number ){
   
   
   phoneNumber=number;
   
   }
    /**
     *setEmail method stores a value in the email filed
     * @param e the value to store in email
     */
   public void setEmail(String e){
   
  email=e;
   
   
   }
    /**
     * The getCustomerName method returns a Customer object's customerName
     * @return The value in the customerName
     */ 
   public String getCustomerName(){
      return customerName;
   
   }
   /**
     * The getPhoneNumber method returns a Customer object's phoneNumber
     * @return The value in the phoneNumber
     */ 
   public String getPhoneNumber(){
      return phoneNumber;
   
   
   
   }
   /**
     * The getEmail method returns a Customer object's email
     * @return The value in the email
     */ 
   public String getEmail(){
      return email;
   
   
   
   }
   /**
     * the getdestination method
     * @return a reference to a copy of this Customer's 
     * Destination object
     */
  public Destination getdestination(){
      
      return destination;
}
  /**
     * the getbooking method
     * @return a reference to a copy of this Customer's 
     * Booking object
     */
   public Booking getbooking(){
      
      return booking;
}
   /**
 * toString method 
 * @return a string containing the Customer information 
 */
 public String toString(){
        return ""+customerName + "\t "+phoneNumber +"\t"+email
              + "\t " +destination+"\t "+booking ; 
  
    } 

    
   
   
   
}

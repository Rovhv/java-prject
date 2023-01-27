
package traintickets;


public class Booking {
    private String ticketType;
    private int numberOftickets ;
    public double price ;
    public int gate ;
    
    
     /**
      This constructor initializes the ticketType, 
      fields with an empty string and numberOftickets 
      * and price and gate with 0.
   */
    public Booking(){
    
    ticketType=" ";
    numberOftickets=0;
    price=0.0;
    gate=0;
    
    }
  /**
   * This constructor initializes the ticket and number filed
   * @param ticket the booking ticket
   * @param number the number of booking ticket
   */ 
    public Booking(String ticket , int number ){

    ticketType=ticket;
    numberOftickets=number;
    
        }
    /**
     * This constructor initializes the priceOfTickt
     * @param priceOfTickt the price of booking
     * @param numberOfGate the gate of booking 
     */
    public Booking(double priceOfTickt,int numberOfGate ){
 
     price=priceOfTickt;
    gate=numberOfGate;
           }


    
    /**
     * the setTicketType method stores a value in the ticketType filed
     * @param t the value to store in setTicketType
     */
    public void setTicketType(String t){
    ticketType=t;
    }
    /**
     * the setNumberOfTickets method stores a value in the numberOftickets filed
     * @param num the value to store in numberOftickets
     */
    public void setNumberOfTickets( int n){
    numberOftickets=n;
    
    }
    /**
      the setPrice method stores a value in the price filed

     * @param p the value to store in price filed 
     */
    public void setPrice(double p){
    price=p;
    }
    /**
     * the setGate method stores a value in the gate filed
     * @param g the value to store in gate filed 
     */
    public void setGate (int g){
        
        gate=g;
    }
 /**
  * The getTicketType method returns a Booking object's ticketType
  * @return The value in the ticketType
  */
    public String  getTicketType(){
    
    return ticketType;
    
    }
   /**
  * The getNumberOfTickets method returns a Booking object's numberOftickets
  * @return The value in the numberOftickets
  */
    public int getNumberOfTickets(){
    
    return numberOftickets;
    
    }
    /**
     * The getGate method returns a Booking object's gate
     * @return The value in the gate
     */
    public int getGate(){
        return gate;
    
    
    }
 /**
  * The getCalculate method returns a Booking object's price after Calculation 
  * @return The value in the price
  */
    
    public double getCalculate(){
    price*=numberOftickets ;

    return price+=2.55;
    
    }
    /**
 * toString method 
 * @return a string containing the Booking information 
 */
    
 public String toString(){
        return ""+ticketType +"\t\t"+gate
                +"\t\t"+ numberOftickets+"\t\t\t" ;

    } 
    
}

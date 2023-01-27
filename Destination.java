/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traintickets;

/**
 *
 * @author rolar
 */
public class Destination {
    private String place;
    private String time ;
    private String day ;

    /**
      This constructor initializes the place, 
      time, and day fields with an
      empty string.
   */
   
    public Destination(){
    place="  ";
    time=" ";
    day="  ";
    }
    /**
      This constructor initializes the place, time
      day fields.
      @param place_ The Destination's  place.
      @param time_ The Destination's  time.
      @param day_ The Destination's  day.
   */
   
    
    public Destination(String place_,String time_,String day_){
place=place_;
time=time_;
day=day_;
}

   

    
    /**
     * the setPlace method stores a value in the place filed
     * @param trivelPlace the value to store in place
     */
 public void setPlace(String trivelPlace){
     place=trivelPlace;
 
 }   
 /**
  * setDay method stores a value in the day filed
  * @param trivelDay the value to store in day
  */
 public void setDay(String trivelDay ){
 
 day = trivelDay;
 
 }  
    /**
     * setTime  method stores a value in the time filed
     * @param trivalTime the value to store in time
     */
 public void setTime(String trivalTime){
 
 
 time=trivalTime;
 
 }   
   /**
    * The getPlace method returns a Destination object's place
    * @return The value in the place
    */ 
    
public String  getPlace  (){

return place;

} 
/**
 * The getDay method returns a Destination object's day
 * @return The value in the day 
 */ 
public String getDay (){

return day;

}
/**
 * The getTime method returns a Destination object's time
 * @return  value in the time
 */

public String getTime(){

return time;

}
/**
 * toString method 
 * @return a string containing the Destination information 
 */
    public String toString(){
        return "" +place +"\t\t" + day +" \t" +time ;


    }
    
    
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Booking;
public class Flight extends TransportService {
    // Atributes
    private String airline;
    private String seatClass;
    
    // Constructors
    public Flight(){
        super.setId(0);
        super.setOrigin("");
        super.setDestination("");
        super.setPrice(0);
    }
    public Flight (int id, String origin, String destinaton, double price, String airline, String seatClass){
        super.setId(id);
        super.setOrigin(origin);
        super.setDestination(destinaton);
        super.setPrice(price);
        this.airline = airline;
        this.seatClass = seatClass;
    }
    
    // Set Methods
    public void setAirline(String airline){
        this.airline = airline;
    }
    public void setSeatClass(String seatClass){
        this.seatClass = seatClass;
    }
    
    // Get Methods
    public String getAirline(){
        return this.airline;
    }
    public String getSeatClass(){
        return this.seatClass;
    }
    @Override
    public String getService(){
        String str = getId() + ": Active"; 
        return str;
    }
    @Override
    public String getLuggageInformation(){
        String str = getId() + ": Collecti luggage from the plane";
        return str;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Booking;

/**
 *
 * @author CENTIC
 */
public class Train extends TransportService{
    private String seatType;
    private int wagonNumber;
    
    public Train(){
        super.setId(0);
        super.setOrigin("null");
        super.setDestination("null");
        super.setPrice(0.0);
        this.setSeatType("null");
        this.setWagonNumber(0);
        
    }
    public Train (int id, String origin, String destination, double price, String seatType, int wagonNumber){
        super.setId(wagonNumber);
        super.setOrigin(origin);
        super.setDestination(destination);
        super.setPrice(price);
        this.setSeatType(seatType);
        this.setWagonNumber(wagonNumber);
    }

    public String getSeatType() {
        return seatType;
    }

    public final void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public int getWagonNumber() {
        return wagonNumber;
    }

    public final void setWagonNumber(int wagonNumber) {
        this.wagonNumber = wagonNumber;
    }
    
    public String getService(){
        String str = this.getId()+": activate";
        return str;
    }
    
    public String getLuggageInformation(){
        String str ="Collect luggage from the train";
        return str;
    }
    
    @Override
    public String toString(){
        String str = super.toString();
        str += "\n Seat Type: "+this.seatType+"\n Wagon Number: "+this.wagonNumber;
        return str;
    }
    
    
}

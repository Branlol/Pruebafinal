package Customers;

import Booking.TransportService;

public class Passenger extends Person{
    // Atributes
    private String passportNumber;
    private TransportService transportService;
    
    // Constructors
    public Passenger(){
        super.setName("");
        super.setAge(0);
        this.passportNumber = "";
        this.transportService = null;
    }
    public Passenger(String name, int age, String passportNumber){
        super.setName(name);
        super.setAge(age);
        this.passportNumber = passportNumber;
        this.transportService = null;
    }

    // Set Methods
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    public void setTransportService(TransportService transportService) {
        this.transportService = transportService;
    }
    
    // Get Methods
    public String getPassportNumber() {
        return passportNumber;
    }
    public String getTransportService(){
        return this.transportService.toString();
    }
    
    @Override
    public String toString(){
        String str = "-----Passanger Informations\nName:\t\t" + super.getName() + "\nAge:\t\t" + super.getAge() + "\nPassport Number:\t" + getPassportNumber() + "\nTransport Service:\t" + getTransportService();
        return str;
    }
}
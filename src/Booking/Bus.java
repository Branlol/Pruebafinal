
package Booking;


abstract class Bus extends TransportService{
    
    private String busCompany;
    private String boardingPoint;

    public Bus() {
    }

    public Bus(String busCompany, String boardingPoint) {
        this.setBusCompany(busCompany);
        this.setBoardingPoint(boardingPoint);
    }
    
    public void setBusCompany(String busCompany) {
        this.busCompany = busCompany;
    }
    public void setBoardingPoint(String boardingPoint) {
        this.boardingPoint = boardingPoint;
    }

    public String getBusCompany() {
        return busCompany;
    }
   
    public String getBoardingPoint() {
        return this.boardingPoint;
    }
    
    public String getServiceInformation(){
        String str = "\n" + this.getId() + " is active" ;
        return str;
    }
    @Override
    public String getLuggageInformation(){
        String str = "\ncollect luggage from the bus" + this.getId();
        return str;
    }
    @Override
    public String toString() {
        String str = super.toString() + "\nCompany: " + this.getBusCompany() + "\nBoarding point: " + this.boardingPoint;
        return str;
    }

}
public class Ride  {
    private String Sourc,destination;
    private Double speed,time;
    rideManager rm =new rideManager();

    public void setSourc(String sourc) {
        Sourc = sourc;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getSourc() {
        return Sourc;
    }
    public String getDestination() {
        return destination;
    }
}

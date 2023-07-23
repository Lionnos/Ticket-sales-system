package Model.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Programming {
    private String idProgramming;
    private String idVehicle;
    private String origin;
    private String destination;
    private Timestamp programmingDate;
    private Timestamp programmingHour;
    private BigDecimal totalCost;
    private boolean state;

    public Programming(String idProgramming, String idVehicle, String origin, String destination,
                       Timestamp programmingDate, Timestamp programmingHour, BigDecimal totalCost, boolean state) {
        this.idProgramming = idProgramming;
        this.idVehicle = idVehicle;
        this.origin = origin;
        this.destination = destination;
        this.programmingDate = programmingDate;
        this.programmingHour = programmingHour;
        this.totalCost = totalCost;
        this.state = state;
    }

    // Getters and Setters
    public String getIdProgramming() {
        return idProgramming;
    }

    public void setIdProgramming(String idProgramming) {
        this.idProgramming = idProgramming;
    }

    public String getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(String idVehicle) {
        this.idVehicle = idVehicle;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Timestamp getProgrammingDate() {
        return programmingDate;
    }

    public void setProgrammingDate(Timestamp programmingDate) {
        this.programmingDate = programmingDate;
    }

    public Timestamp getProgrammingHour() {
        return programmingHour;
    }

    public void setProgrammingHour(Timestamp programmingHour) {
        this.programmingHour = programmingHour;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Programming{" +
                "idProgramming='" + idProgramming + '\'' +
                ", idVehicle='" + idVehicle + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", programmingDate=" + programmingDate +
                ", programmingHour=" + programmingHour +
                ", totalCost=" + totalCost +
                ", state=" + state +
                '}';
    }
}

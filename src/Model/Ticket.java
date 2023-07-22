package Model;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

public class Ticket {
    private String idTicket;
    private String idUser;
    private String idClient;
    private String idProgramming;
    private String description;
    private String destination;
    private int seatNumber;
    private Date createdAt;
    private Date travelDate;
    private Time departureTime;
    private String moneyType;
    private BigDecimal price;
    private boolean state;

    public Ticket(String idTicket, String idUser, String idClient, String idProgramming,
                  String description, String destination, int seatNumber, Date createdAt,
                  Date travelDate, Time departureTime, String moneyType, BigDecimal price,
                  boolean state) {
        this.idTicket = idTicket;
        this.idUser = idUser;
        this.idClient = idClient;
        this.idProgramming = idProgramming;
        this.description = description;
        this.destination = destination;
        this.seatNumber = seatNumber;
        this.createdAt = createdAt;
        this.travelDate = travelDate;
        this.departureTime = departureTime;
        this.moneyType = moneyType;
        this.price = price;
        this.state = state;
    }

    // Getters and Setters
    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getIdProgramming() {
        return idProgramming;
    }

    public void setIdProgramming(String idProgramming) {
        this.idProgramming = idProgramming;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public String getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "idTicket='" + idTicket + '\'' +
                ", idUser='" + idUser + '\'' +
                ", idClient='" + idClient + '\'' +
                ", idProgramming='" + idProgramming + '\'' +
                ", description='" + description + '\'' +
                ", destination='" + destination + '\'' +
                ", seatNumber=" + seatNumber +
                ", createdAt=" + createdAt +
                ", travelDate=" + travelDate +
                ", departureTime=" + departureTime +
                ", moneyType='" + moneyType + '\'' +
                ", price=" + price +
                ", state=" + state +
                '}';
    }
}
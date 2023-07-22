package Model;

public class Vehicle {
    private String idVehicle;
    private String description;
    private String plate;
    private String model;
    private int seatNumbers;
    private boolean state;

    public Vehicle(String idVehicle, String description, String plate, String model,
                   int seatNumbers, boolean state) {
        this.idVehicle = idVehicle;
        this.description = description;
        this.plate = plate;
        this.model = model;
        this.seatNumbers = seatNumbers;
        this.state = state;
    }

    // Getters and Setters
    public String getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(String idVehicle) {
        this.idVehicle = idVehicle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeatNumbers() {
        return seatNumbers;
    }

    public void setSeatNumbers(int seatNumbers) {
        this.seatNumbers = seatNumbers;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "idVehicle='" + idVehicle + '\'' +
                ", description='" + description + '\'' +
                ", plate='" + plate + '\'' +
                ", model='" + model + '\'' +
                ", seatNumbers=" + seatNumbers +
                ", state=" + state +
                '}';
    }
}
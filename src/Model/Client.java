package Model;

public class Client {
    private String idClient;
    private String firstName;
    private String lastName;
    private String documentType;
    private int documentNumber;
    private Integer ruc;
    private String businessName;
    private boolean gender;
    private int telephone;
    private String address;

    public Client(String idClient, String firstName, String lastName, String documentType,
                  int documentNumber, Integer ruc, String businessName, boolean gender,
                  int telephone, String address) {
        
        this.idClient = idClient;
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.ruc = ruc;
        this.businessName = businessName;
        this.gender = gender;
        this.telephone = telephone;
        this.address = address;
    }

    // Getters and Setters
    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Integer getRuc() {
        return ruc;
    }

    public void setRuc(Integer ruc) {
        this.ruc = ruc;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient='" + idClient + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", documentType='" + documentType + '\'' +
                ", documentNumber=" + documentNumber +
                ", ruc=" + ruc +
                ", businessName='" + businessName + '\'' +
                ", gender=" + gender +
                ", telephone=" + telephone +
                ", address='" + address + '\'' +
                '}';
    }
}

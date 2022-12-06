package it.develhope.encapsulation;

public class House {

    private int floorsNumber;
    private String address;
    private String[] residentNames;


    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getResidentNames() {
        return residentNames;
    }

    public void setResidentNames(String[] residentNames) {
        this.residentNames = residentNames;
    }
}

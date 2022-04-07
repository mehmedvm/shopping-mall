package shopping_malls;

import java.util.ArrayList;

public class ShoppingMall {
    //Fields
    String name;
    String address;
    ArrayList<String> electronicDevices = new ArrayList<>();
    ArrayList<String> hardware = new ArrayList<>();
    ArrayList<String> toys = new ArrayList<>();

    //Constructors
    public ShoppingMall() {
    }

    public ShoppingMall(String name, String address, ArrayList<String> electronicDevices, ArrayList<String> hardware, ArrayList<String> toys) {
        this.name = name;
        this.address = address;
        this.electronicDevices = electronicDevices;
        this.hardware = hardware;
        this.toys = toys;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getElectronicDevices() {
        return electronicDevices;
    }

    public void setElectronicDevices(ArrayList<String> electronicDevices) {
        this.electronicDevices = electronicDevices;
    }

    public ArrayList<String> getHardware() {
        return hardware;
    }

    public void setHardware(ArrayList<String> hardware) {
        this.hardware = hardware;
    }

    public ArrayList<String> getToys() {
        return toys;
    }

    public void setToys(ArrayList<String> toys) {
        this.toys = toys;
    }

    //ToString
    @Override
    public String toString() {
        return "ShoppingMall{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", electronicDevices=" + electronicDevices +
                ", hardware=" + hardware +
                ", toys=" + toys +
                '}';
    }
}

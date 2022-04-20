package mall.bestbuy;

import mall.interfaces.IPay;

import java.util.Scanner;

public class ElectronicDevice implements IPay {
    //Fields
    String name;
    String brand;
    String model;
    int price;

    //Default Constructor
    public ElectronicDevice() {
    }

    //Parametirized Constructor
    public ElectronicDevice(String name, String brand, String model, int price) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //To String
    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    //Methods

    @Override
    public void pay() {
        System.out.println("This is where you pay, enter the amount to pay:");

    }

    //Add Electonic Device ()
    public void addElectronicDevice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name of Electronic Device: ");
        this.name = scanner.nextLine();
        System.out.print("Name of Brand: ");
        this.brand = scanner.nextLine();
        System.out.print("Name of Model: ");
        this.model = scanner.nextLine();
        System.out.print("Price: ");
        this.price = scanner.nextInt();

    }

    //Remove El. Dev ()

}

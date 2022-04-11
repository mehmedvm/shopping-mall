package mall.toys_r_us;

public class Toy {
    //Fields
    String brand;
    String model;
    int price;

    //Default Constructor
    public Toy() {
    }

    //Parametirazed Constructor
    public Toy(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //Getters and Setters
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
        return "Toy{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    //Methods

}

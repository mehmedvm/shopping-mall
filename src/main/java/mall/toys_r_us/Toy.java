package mall.toys_r_us;

public class Toy {
    //Fields
    String name;
    String brand;
    String model;
    int price;

    //Default Constructor
    public Toy() {
    }

    //Parametirazed Constructor
    public Toy(String name, String brand, String model, int price) {
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
        return "Toy{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    //Methods

}

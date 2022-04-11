package mall.lowes;

public class Screwdriver extends Hardware{
    //Fields
    String type;
    int size;

    //Constructors
    public Screwdriver() {
    }

    public Screwdriver(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public Screwdriver(String name, String brand, String model, int price, String type, int size) {
        super(name, brand, model, price);
        this.type = type;
        this.size = size;
    }

    //Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //To String

    @Override
    public String toString() {
        return "Screwdriver{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", size=" + size +
                '}';
    }


    //Methods

}

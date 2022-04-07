package lowes;

public class Hammer extends Hardware{
    //Fields
    String color;
    int size;

    //Constructors
    public Hammer() {
    }

    public Hammer(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public Hammer(String brand, String model, int price, String color, int size) {
        super(brand, model, price);
        this.color = color;
        this.size = size;
    }

    //Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return "Hammer{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    //Methods

}

package mall.lowes;

public class Drill extends Hardware{
    // Fields
    private int  size;
    private String color;

    //Constructors
    public Drill() {
    }

    public Drill(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public Drill(String name, String brand, String model, int price, int size, String color) {
        super(name, brand, model, price);
        this.size = size;
        this.color = color;
    }

    //Getters and Setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //To String
    @Override
    public String toString() {
        return "Drill{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    //Methods


}

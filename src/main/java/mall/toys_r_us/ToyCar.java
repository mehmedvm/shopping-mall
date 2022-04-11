package mall.toys_r_us;

public class ToyCar extends Toy {
    //Fields
    int ageRange;
    String color;
    int size;

    //Constructors
    public ToyCar() {
    }

    public ToyCar(int ageRange, String color, int size) {
        this.ageRange = ageRange;
        this.color = color;
        this.size = size;
    }

    public ToyCar(String name, String brand, String model, int price, int ageRange, String color, int size) {
        super(name, brand, model, price);
        this.ageRange = ageRange;
        this.color = color;
        this.size = size;
    }

    // Getters and Setters
    public int getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(int ageRange) {
        this.ageRange = ageRange;
    }

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
        return "ToyCar{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", ageRange=" + ageRange +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }


}

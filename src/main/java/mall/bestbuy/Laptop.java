package mall.bestbuy;

public class Laptop extends ElectronicDevice {

    //Fields
    private String keyboard;
    private boolean isTouchscreen;

    //Constructors
    public Laptop() {
    }

    public Laptop(String keyboard, boolean isTouchscreen) {
        this.keyboard = keyboard;
        this.isTouchscreen = isTouchscreen;
    }

    public Laptop(String brand, String model, int price, String keyboard, boolean isTouchscreen) {
        super(brand, model, price);
        this.keyboard = keyboard;
        this.isTouchscreen = isTouchscreen;
    }

    //Getters and Setters
    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public boolean isTouchscreen() {
        return isTouchscreen;
    }

    public void setTouchscreen(boolean touchscreen) {
        isTouchscreen = touchscreen;
    }

    //To String
    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", keyboard='" + keyboard + '\'' +
                ", isTouchscreen=" + isTouchscreen +
                '}';
    }

    //Methods

}

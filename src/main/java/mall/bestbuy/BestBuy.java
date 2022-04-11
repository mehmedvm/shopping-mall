package mall.bestbuy;

public class BestBuy {
    //Fields
    String name;
    String address;

    //Constructors
    public BestBuy() {
    }

    public BestBuy(String name, String address) {
        this.name = name;
        this.address = address;
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

    //To String
    @Override
    public String toString() {
        return "BestBuy{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

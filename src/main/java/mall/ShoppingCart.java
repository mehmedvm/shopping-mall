package mall;

public class ShoppingCart {
    //Fields
    String cartItem;
    int cartItemPrice;

    //Constructors
    public ShoppingCart() {
    }

    public ShoppingCart(String cartItem, int cartItemPrice) {
        this.cartItem = cartItem;
        this.cartItemPrice = cartItemPrice;
    }

    //Getters and Setters
    public String getCartItem() {
        return cartItem;
    }

    public void setCartItem(String cartItem) {
        this.cartItem = cartItem;
    }

    public int getCartItemPrice() {
        return cartItemPrice;
    }

    public void setCartItemPrice(int cartItemPrice) {
        this.cartItemPrice = cartItemPrice;
    }

    //To String
    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartItem='" + cartItem + '\'' +
                ", cartItemPrice=" + cartItemPrice +
                '}';
    }

    //Methods
}

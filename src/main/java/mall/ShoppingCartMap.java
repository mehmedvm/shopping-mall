package mall;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCartMap {
    //Fields
    HashMap<String,Integer> cartItem;

    //Constructors
    public ShoppingCartMap() {
    }

    public ShoppingCartMap(HashMap<String, Integer> cartItem) {
        this.cartItem = cartItem;
    }

    // Getters and Setters
    public HashMap<String, Integer> getCartItem() {
        return cartItem;
    }

    public void setCartItem(HashMap<String, Integer> cartItem) {
        this.cartItem = cartItem;
    }

    //To String
    @Override
    public String toString() {
        return "ShoppingCartMap{" +
                "cartItem=" + cartItem +
                '}';
    }

}

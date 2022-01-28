class ShoppingCart {
    static ShoppingCart obj = new ShoppingCart();

    private ShoppingCart() {

    }

    static ShoppingCart addProduct(String product) {
        System.out.println(product + " is added to cart");
        return obj;
    }
}

class Singleton {
    public static void main(String[] args) {
        ShoppingCart sc1 = ShoppingCart.addProduct("bat");
        ShoppingCart sc2 = ShoppingCart.addProduct("ball");
    }
}
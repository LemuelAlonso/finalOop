
class CartItem {
    String coffeeName;
    String price;
    String rating;
    String imagePath;

    CartItem(String coffeeName, String price, String rating, String imagePath) {
        this.coffeeName = coffeeName;
        this.price = price;
        this.rating = rating;
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Coffee: " + coffeeName + ", Price: " + price + ", Rating: " + rating;
    }
}

public class inventory {
    private Product product;
    private String location;

    public inventory(Product product, String location) {
        this.setProduct(product);
        this.setLocation(location);
    }

    public void showInventory() {
        System.out.println("Location: " + location);
        product.displayProduct();
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

package discountstrategy;

/**
 *
 * @author Brian Schrader
 */
public class LineItem {

    
    private Product product;
    private int qty;
    private FakeDatabase database;

    //constructor
    public LineItem(String productID, int quantity, FakeDatabase database) {
        this.product = database.getProduct(productID);
        this.qty = quantity;
        this.database = database;
    }

    public LineItem() {

    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return qty;
    }

    public void setQuantity(int quantity) {
        this.qty = quantity;
    }

    private double getSubtotal() {
        return (product.getUnitPrice() * qty);
    }

    public double getDiscount() {
        return product.getTotalDiscount();
    }

    public double getSubtotalAfterDiscount() {
        return (product.getUnitPrice() * qty) - getDiscount();
    }
}

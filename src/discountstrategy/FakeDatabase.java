package discountstrategy;

/**
 *
 * @author Brian Schrader <brian@evolmarketing.com>
 */
public class FakeDatabase {

    private Customer[] customers = {
        new Customer("John", "Smith", "A2345"),
        new Customer("Julie", "Daniels", "B1234"),
        new Customer("Fred", "Jameson", "C9876")
    };

    private Product[] products = {
        new Product("P01", "Packer Hat", 15.95),
        new Product("P02", "Brewers Shirt", 16.49),
        new Product("P03", "Dockers Khakis", 52.99)
    };

    public Customer getCustomers(String customerID) {
        Customer customer = null;
        for (Customer sc : customers) {
            if (sc.getCustomerID().equals(customerID)) {
                customer = sc;
            }
        }
        return customer;
    }

    public Product getProduct(String productId) {
        Product product = null;
        for (Product p : products) {
            if (productId.equals(p.getProductID())) {
                product = p;
            }
        }
        return product;
    }
}

package discountstrategy;

/**
 *
 * @author Brian Schrader <brian@evolmarketing.com>
 */
public class Customer {

    private String firstName;
    private String lastName;
    private String customerID;

    //constructor
    public Customer(String firstName, String lastName, String customerID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerID = customerID;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() <= 1) {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() <= 1) {
            throw new IllegalArgumentException();
        }
        this.lastName = lastName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        if (customerID == null || customerID.length() <= 0) {
            throw new IllegalArgumentException();
        }
        this.customerID = customerID;
    }
}

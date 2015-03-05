package discountstrategy;

/**
 *
 * @author Brian Schrader <brian@evolmarketing.com>
 */
public class CashRegister {

    
    private ReceiptOutputStrategy receipt;

    /**
     * Constructor that initializes the receipt to PrintedReceipt
     *
     * @param customerID
     */
    public CashRegister(int customerID) {
        receipt = new PrintedReceipt();

    }

    //public methods
    public final void addProductToReceipt(String prodID, int quantity) {
        receipt.addProductToReceipt(prodID, quantity);
    }

    public final void setReceiptType(ReceiptOutputStrategy receipt) {
        if (receipt == null) {
            throw new NullPointerException();
        }
        this.receipt = receipt;
    }

    public final void printReceipt() {
        System.out.println(receipt.outputMessage());
    }
}

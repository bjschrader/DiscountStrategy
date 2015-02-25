package discountstrategy;

/**
 *
 * @author Brian Schrader <brian@evolmarketing.com>
 */
public interface ReceiptOutputStrategy {

    public abstract void outputReceipt(String data);

    public abstract void outputMessage(String msg);

    public boolean outputMessage();

    public void addProductToReceipt(String prodID, int quantity);
}

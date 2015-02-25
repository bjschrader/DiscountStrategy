package discountstrategy;

/**
 *
 * @author Brian Schrader <brian@evolmarketing.com>
 */
public class PrintedReceipt implements ReceiptOutputStrategy{
    private String prodID;

    @Override
    public void outputReceipt(String data) {
        System.out.println(data);
    }

    @Override
    public void outputMessage(String msg) {
        System.out.println("\n========== Data Entry Error ==========");
        System.out.println(msg);
        System.out.println("=======================================\n");
    }

    @Override
    public boolean outputMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addProductToReceipt(String prodID, int quantity) {
        System.out.println(prodID + quantity);
    }

    
    
}

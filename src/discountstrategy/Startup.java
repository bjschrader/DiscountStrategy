package discountstrategy;

/**
 *
 * @author Brian Schrader <brian@evolmarketing.com>
 */
public class Startup {

    public static void main(String[] args) {
        CashRegister reg = new CashRegister(101);

        reg.addProductToReceipt("101", 3);
        reg.addProductToReceipt("102", 1);
        reg.addProductToReceipt("105", 5);

        reg.printReceipt();
    }

}

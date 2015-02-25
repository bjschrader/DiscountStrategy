package discountstrategy;

/**
 *
 * @author Brian Schrader <brian@evolmarketing.com>
 */
public interface DatabaseStrategy {

    public abstract double getDiscountAmt(double unitPrice, int qty);

    public abstract double getDiscountRate();

    public abstract void setDiscountRate(double discountRate);
}

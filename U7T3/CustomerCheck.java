package U7T3;
import java.util.ArrayList;

public class CustomerCheck {
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check) {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices() {
        double sum = 0;
        for (int i = 0; i < check.size(); i++) {
            sum += check.get(i).getPrice();
        }
        return sum;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies() {
        for (MenuItem item: check) {
            if (item.isDailySpecial()) {
                return false;
            }
        }

        if (totalPrices() < 40) {
            return false;
        }

        return true;
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck() {
        double origCheck = totalPrices();
        double finalCheck = origCheck;
        int customers = 0;

        for (int i = 0; i < check.size(); i++) {
            if (check.get(i).isEntree()) {
                customers++;
            }
        }

        if (couponApplies()) {
            finalCheck -= 0.25 * origCheck;
        }

        if (customers >= 6) {
            finalCheck += 0.2 * origCheck;
        }

        return finalCheck;
    }
}

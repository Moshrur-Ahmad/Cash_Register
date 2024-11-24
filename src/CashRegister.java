public class CashRegister {
    private double purchase;
    private double payment;

    public CashRegister(double purchase,double payment) {
        this.purchase = purchase;
        this.payment=payment;
    }

    public CashRegister() {
        purchase=0.0;
        payment=0.0;
    }
    public void recordPurchase(double amount)
    {
        purchase=purchase+amount;
    }

    public void receivePayment(int dollars,int quartes,int dimes,int nickels,int pennies) {
        payment = dollars+quartes*Constants.Quarter_Value+dimes*Constants.Dime_Value+
                nickels*Constants.Nickel_Value+pennies*Constants.Penny_Value;
    }
    public double giveChange()
    {
        double change= payment-purchase;
        purchase=0.0;
        return change;
    }
}

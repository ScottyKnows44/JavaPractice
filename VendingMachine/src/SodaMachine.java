public class SodaMachine implements Machine{

    private int sodaAvailable;
    private double amountOfMoney;

    public SodaMachine(int sodaAvailable, double amountOfMoney) {
        this.sodaAvailable = sodaAvailable;
        this.amountOfMoney = amountOfMoney;
    }

    public int getSodaAvailable() {
        return sodaAvailable;
    }

    public void setSodaAvailable(int sodaAvailable) {
        this.sodaAvailable = sodaAvailable;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public void run() {
        setAmountOfMoney(100.00);
        System.out.println("Machine is running");
    }

    @Override
    public boolean hasMoneyToGive(int money) {
        return getSodaAvailable() > money;
    }

    @Override
    public void giveMoney(int money){
        double total = getAmountOfMoney();
        setAmountOfMoney(total - money);
    }

    @Override
    public void takeCustomersMoney(int money) {
        double total = getAmountOfMoney();
        setAmountOfMoney(total+money);
    }

    @Override
    public void giveDrinkToCustomer() {
        System.out.println("Gave drink to customer");
        setSodaAvailable(getSodaAvailable() - 1);
    }

    @Override
    public void shutDown() {
        System.out.println("Shutting down");
        setAmountOfMoney(0.00);
    }
}

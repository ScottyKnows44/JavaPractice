public class SnackMachine implements Machine{

    private int snacksAvailable;
    private double amountOfMoney;

    public SnackMachine(int snacksAvailable, double amountOfMoney) {
        this.snacksAvailable = snacksAvailable;
        this.amountOfMoney = amountOfMoney;
    }

    public int getSnacksAvailable() {
        return snacksAvailable;
    }

    public void setSnacksAvailable(int snacksAvailable) {
        this.snacksAvailable = snacksAvailable;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public void run() {
        System.out.println("Snack Machine is running");
    }

    @Override
    public boolean hasMoneyToGive(int money) {
        return false;
    }

    @Override
    public void giveMoney(int money) {

    }

    @Override
    public void takeCustomersMoney(int money) {

    }

    @Override
    public void giveDrinkToCustomer() {

    }

    @Override
    public void shutDown() {

    }
}

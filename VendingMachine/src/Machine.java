public interface Machine {
    void run();
    boolean hasMoneyToGive(int money);
    void giveMoney(int money);
    void takeCustomersMoney(int money);
    void giveDrinkToCustomer();
    void shutDown();
}

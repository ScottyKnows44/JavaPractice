public class main {
    public static void main(String[] args) {
        SodaMachine sm = new SodaMachine(20, 0.00);
        sm.run();
        sm.giveMoney(1);
        System.out.println(sm.getAmountOfMoney());
    }
}

public class main {
    public static void main(String[] args) {
        //Create checkout line and add Customers to it aka enqueue
        Checkout checkout = new Checkout();
        checkout.newCustomerTooCheckout(new Customer("Scott", 32.99, 27));
        checkout.newCustomerTooCheckout(new Customer("Bob", 68.90, 49));
        checkout.newCustomerTooCheckout(new Customer("Corey", 92.04, 37));
        checkout.newCustomerTooCheckout(new Customer("Betty", 12.69, 70));
        checkout.newCustomerTooCheckout(new Customer("Joe", 802.34, 43));


        //Checkout customers and Dequeue till checkout is empty
        System.out.println("Number of people in the checkout is: " + checkout.getSize());
        System.out.println("Printing the whole Queue: " + checkout.toString());
        checkout.checkoutCustomer();
        System.out.println("Number of people in the checkout is: " + checkout.getSize());
        System.out.println("Printing the whole Queue" + checkout.toString());
        checkout.checkoutCustomer();
        checkout.checkoutCustomer();
        checkout.checkoutCustomer();
        System.out.println("Printing the whole Queue" + checkout.toString());
        checkout.checkoutCustomer();

        //Should print "There is no one in the line"
        checkout.checkoutCustomer();
        //Check to see is size of checkout is 0
        System.out.println(checkout.getSize());
    }
}

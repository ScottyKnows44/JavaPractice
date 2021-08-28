import java.util.LinkedList;
import java.util.Queue;


public class Checkout {
    private static Queue line;
    private static Customer first;
    private static Customer last;
    private static int size = 0;

    public Checkout() {
        this.line = new LinkedList<>();
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public Customer getFirst() {
        return first;
    }

    public void setFirst(Customer first) {
        this.first = first;
    }

    public Customer getLast() {
        return last;
    }

    public void setLast(Customer last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void newCustomerTooCheckout(Customer customer){
        if(line.isEmpty()){
            last = customer;
            first = customer;
            line.add(customer);
            size++;
        } else {
            last = customer;
            line.add(customer);
            size++;
        }
    }
    public void checkoutCustomer(){
        if(line.isEmpty()){
            System.out.println("There is no one in the line");
            return;
        }
        line.remove(line.peek());
        first = (Customer) line.peek();
        size--;
    }

    public Queue<Customer> getLine() {
        return line;
    }

    public void setLine(Queue<Customer> line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "Checkout{" +
                "line=" + line +
                '}';
    }
}

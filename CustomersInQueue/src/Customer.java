public class Customer {
    private String name;
    private double totalBought;
    private int age;

    public Customer(String name, double totalBought, int age) {
        this.name = name;
        this.totalBought = totalBought;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalBought() {
        return totalBought;
    }

    public void setTotalBought(double totalBought) {
        this.totalBought = totalBought;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", totalBought=" + totalBought +
                ", age=" + age +
                '}';
    }
}

public class Customer {

    private String name;
    private String emailAddress;
    private double creditLimit;

    public Customer() {
        this("Nobody", "nobody@nowhere.com", 0.00);
    }

    public Customer(String name, String emailAddress) {
        this(name, emailAddress, 5800);
    }

    public Customer(String name, String emailAddress, double creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public void printCustomerInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.emailAddress);
        System.out.println("Credit Limit: " + this.creditLimit);
    }

}






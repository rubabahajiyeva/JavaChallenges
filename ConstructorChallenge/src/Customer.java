public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer() {
        this("Nobody", "nobody@nowhere.com");

    }

    public Customer(String name, String emailAddress) {
        this(name, 5800, emailAddress);
    }

    public Customer(String name, double creditLimit, String emailAddress) {

        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


}



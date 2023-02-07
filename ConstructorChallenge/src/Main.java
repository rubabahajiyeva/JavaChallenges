public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.printCustomerInfo();

        Customer customer2 = new Customer("Joe", "joe@gmail.com");
        customer2.printCustomerInfo();

        Customer customer3 = new Customer("Mark", "mark22@gmail.com", 6600);
        customer3.printCustomerInfo();

    }
}
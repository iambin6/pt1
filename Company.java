package model;

import java.text.ParseException;
import java.util.*;

public class Company implements Sortable, Searchable {

    private ArrayList<Customers> customers;
    private Scanner sc = new Scanner(System.in);

    public Company() {
        customers = new ArrayList<>();
        // Initialize with some customers
    }

    public void addNewCustomer() throws ParseException {
        // Method to add a new customer
    }

    public void PrintCustomer() {
        for (Customers c : customers) {
            System.out.println(c);
        }
    }

    public void changephoneCustomer() {
        // Implementation for changing customer phone
    }

    public void customerStatistical() {
        // Implementation for customer statistics
    }

    // Implementing Sortable interface methods
    @Override
    public void sortCustomersByName() {
        Collections.sort(customers, Comparator.comparing(Customers::getName));
        System.out.println("Customers sorted by name.");
    }

    @Override
    public void sortCustomersByPhoneNumber() {
        Collections.sort(customers, Comparator.comparing(Customers::getPhoneNumber));
        System.out.println("Customers sorted by phone number.");
    }

    // Implementing Searchable interface methods
    @Override
    public void searchCustomerByName(String name) {
        for (Customers c : customers) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.println(c);
                return;
            }
        }
        System.out.println("Customer not found.");
    }

    @Override
    public void searchCustomerByPhoneNumber(String phoneNumber) {
        for (Customers c : customers)
            if (Objects.equals(c.getPhoneNumber(), phoneNumber)) {
                System.out.println(c);
                return;
            }
        System.out.println("Customer not found.");
    }

}

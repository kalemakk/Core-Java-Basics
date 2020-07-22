package com.company.collections.queue;
import java.util.LinkedList;
public class Queue {
    public static void main(String[] args) {
        LinkedList<Customer> customers = new LinkedList<>();
        customers.add(new Customer("arnold"));
        customers.add(new Customer("suna"));
        customers.add(new Customer("Kanakulya"));
        customers.add(new Customer("alfred"));
        System.out.println(customers);
        serveCustomer(customers);
        System.out.println(customers);
    }
    static void serveCustomer(LinkedList<Customer> customers){
        Customer c = customers.poll();
        System.out.println("..................Serving in Process..............");
        if (c != null) {
            c.serve();
            System.out.println("Next Customer to be served is : "+customers.get(0));
        }else {
            System.out.println("The is no Customer on the Queue");
        }
    }
}

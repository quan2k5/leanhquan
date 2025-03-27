package business;
import entity.Customer;
import java.util.Scanner;

import static presentation.ShopManagement.customers;
public class CustomerBusiness {
    public static void addCustomer(Scanner sc) {
        Customer cs = new Customer();
        cs.inputData(sc);
        customers.add(cs);
    }
    public static void displayCustomer() {
        if (customers.isEmpty()) {
            System.out.println("khong co khach hang nao trong danh sach");
            return;
        }
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}

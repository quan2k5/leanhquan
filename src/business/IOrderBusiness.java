package business;

import entity.Customer;
import entity.Order;

import java.util.Scanner;

import static presentation.ShopManagement.customers;
import static presentation.ShopManagement.orders;
public interface IOrderBusiness {
    public static void displayOrder() {
        if (orders.isEmpty()) {
            System.out.println("khong co don hang torng danh sach");
            return;
        }
        for (Order od : orders) {
            System.out.println(od);
        }
    }
    public static void addOrder(Scanner sc) {
        Order od = new Order();
        od.inputData(sc);
        orders.add(od);
    }
    public static void updateCustomers(Scanner sc) {
        int id=sc.nextInt();
        for (Order od : orders) {
            if (od.getId() == id) {
                od.setStatus(sc.nextBoolean());
                System.out.println("Cap nhat thnah cong");
                return ;
            }
        }
        System.out.println("Khong tim thay id don hang");

    }
}

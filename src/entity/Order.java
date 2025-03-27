package entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Order implements IApp {
    static int counter = 1;
    private int id;
    private int customerId;
    private LocalDate orderDate;
    private double totalPrice;
    private boolean status;
    public Order(int id, LocalDate orderDate, double totalPrice, boolean status) {
        this.id = ++counter;
        this.customerId = id;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.status = status;
    }
    public Order() {

    }
    public int getId() {
        return id;
    }
    public int getCustomerId() {
        return customerId;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    @Override
    public String toString() {
        return "id=" + id + ", orderDate=" + orderDate + ", totalPrice=" + totalPrice;
    }
    @Override
    public void inputData(Scanner sc){
        System.out.println("Nhap id khach hang ");
        this.customerId = sc.nextInt();
        System.out.println("Nhap ngay dat hang");
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        this.orderDate = LocalDate.of(year, month, date);
        System.out.println("Nhap tong tien don hang");
        this.totalPrice = sc.nextDouble();
        System.out.println("Nhap trang thai don hang");
        this.status = sc.nextBoolean();
    }

}

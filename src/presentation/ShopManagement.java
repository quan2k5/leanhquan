package presentation;

import entity.Customer;
import entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static business.CustomerBusiness.addCustomer;
import static business.CustomerBusiness.displayCustomer;
import static business.IOrderBusiness.*;

public class ShopManagement {
    public static final List<Customer> customers = new ArrayList<Customer>();
    public static final List<Order> orders = new ArrayList<Order>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("*******Shop menu********");
            System.out.println("1.Quan li khach hang");
            System.out.println("2.Quan li don hang ");
            System.out.println("3.Thoat");
            System.out.println("Nhap lua chon cua ban");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    int choice1;
                    do{
                        System.out.println("*******Customers menu********");
                        System.out.println("1.Danh sach khach hang");
                        System.out.println("2.Them moi khach hang");
                        System.out.println("3.Thoat");
                        System.out.println("Nhap lua chon cua ban");
                        choice1 = sc.nextInt();
                        sc.nextLine();
                        switch(choice1) {
                            case 1:
                                displayCustomer();
                                break;
                            case 2:
                                addCustomer(sc);
                                break;
                            case 3:
                                System.out.println("Thoat menu customers");
                                break;
                            default:
                                System.out.println("Vui long chon tu 1 den 3");
                        }
                    }while(choice1 != 3);
                    break;
                case 2:
                    int choice2;
                    do{
                        System.out.println("*******Order menu********");
                        System.out.println("1.Danh sach don hang");
                        System.out.println("2.Them moi don hang");
                        System.out.println("3.Cap nhat trang thai don hang");
                        System.out.println("4.Danh sach don hang qua han");
                        System.out.println("5.Thong ke so luong don hang da giao");
                        System.out.println("6.Tinh tong doanh hu cac don hang da giao");
                        System.out.println("7.Thoat");
                        System.out.println("Nhap lua chon cua ban");
                        choice1 = sc.nextInt();
                        sc.nextLine();
                        switch(choice1) {
                            case 1:
                                displayOrder();
                                break;
                            case 2:
                                addOrder(sc);
                                break;
                            case 3:
                                updateCustomers(sc);
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                 break;
                            case 7:
                                break;
                            default:
                                System.out.println("Vui long chon tu 1 den 7");
                        }
                    }while(choice1 != 7);
                    break;
                case 3:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Vui long nhap lai tu 1 den 3");
            }


        }while(choice!=3);
    }
}

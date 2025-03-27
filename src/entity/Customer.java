package entity;
import java.util.Optional;
import java.util.Scanner;
public class Customer implements IApp {
    private static int count=1;
    private int id;
    private String name;
    private Optional<String> email;
    public Customer() {
        this.id = ++count;
        this.name = name;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Optional<String> getEmail() {
        return email;
    }
    public void setEmail(Optional<String> email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", email=" + email.get() ;
    }
    @Override
    public  void inputData(Scanner sc){
        System.out.println("Nhap ten khach hang ");
        this.name=sc.nextLine();
        System.out.println("Nhap email khach hang");
        this.email= Optional.ofNullable(sc.nextLine());
    }


}

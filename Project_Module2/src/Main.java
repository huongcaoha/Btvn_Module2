import display.Display;
import entity.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Display.login();
        String currentDir = System.getProperty("user.dir");
        String filePath = currentDir + "/src/database/listProductCart.txt";
        List<ProductCart> productCarts = new ArrayList<>();
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//        Date date = new Date();
//        try {
//            date = format.parse("23/08/1994");
//        }catch (Exception e){
//            e.printStackTrace();
//        }

//        Customer customer = new Customer(1,"huongcaoha","123456789","123456789",true,date,"0367508795","huongcaoha1994@gmail.com",date);
//        customers.add(customer);
//        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
//            out.writeObject(productCarts);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

//        List<Customer> newArr = new ArrayList<>();
//        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
//            newArr = (List<Customer>) in.readObject();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        for(Customer c : newArr){
//            System.out.println(c.getCustomerName());
//        }
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        System.out.println(format.format(date));
    }
}
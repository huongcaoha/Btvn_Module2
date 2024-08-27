package ra.common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

public class IMethod {
    public static <T> List<T> getListObject(String nameFile){
        List<T> list = null;
        String currentDir = System.getProperty("user.dir");
        String filename = currentDir + "/src/ra/database/" + nameFile;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            list = (List<T>) in.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    };

    public static <T> boolean saveDatabase(String nameFile, List<T> data){
        String currentDir = System.getProperty("user.dir");
        String filename = currentDir + "/src/ra/database/"+ nameFile;
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(data);
        }catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

    public static Integer getNumber(Scanner scanner , int number , String label){
        while (true){
            try {
                System.out.println(label);
                number = Integer.parseInt(scanner.nextLine().trim());
                if(number > 0){
                    break;
                }else {
                    System.err.println("Enter number > 0 !");
                }
            }catch (Exception e){
                System.err.println("Number invalid !");
            }
        }
        return number ;
    }
}

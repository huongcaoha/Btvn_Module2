package ra.common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

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
}

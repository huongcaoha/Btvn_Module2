package bai3.IInterface;

import java.util.List;
import java.util.Scanner;

public interface ICRUD<T> {
    public void displayList(List<T> list);
    public boolean add() ;
    public boolean update();
    public boolean delete();
}

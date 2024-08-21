package bai7;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0 ;
    private static final  int DEFAULT_CAPACITY = 10 ;
    private Object elements[] = new Object[size];

    public MyList() {
    }

    public MyList(int capacity) {
        this.size = capacity;
    }
    public void add(int index , E element){
        if(index < 0 && index > size){
            System.err.println("Index 0 out of bounds for length 0 !");
        }else {

            Object[] newArr = new Object[size+1];
            for(int i = 0 ; i < elements.length ; i++){
                if(i < index){
                    newArr[i] = elements[i];
                } else if (i > index) {
                    newArr[i+1] = elements[i];
                }else {
                   newArr[i+1]= elements[i];
                    newArr[index] = element ;
                }
            }

            elements = newArr;
            size++ ;
        }
    }

    public void add(E element){

        Object[] newArr = new Object[size+1];
        for(int i = 0 ; i < elements.length ; i++){
            newArr[i] = elements[i];
        }
        newArr[size] = element;
        elements = newArr ;
        size++;

    }

    public E remove(int index){
        E tmp = null;
       for(int i = index ; i < elements.length-1 ; i++){
            tmp = (E) elements[i];
           elements[i] = elements[i+1];
           elements[i+1] = tmp ;
       }

       Object[] newArr = new Object[elements.length-1];
       for(int i = 0 ; i < newArr.length ; i++){
           newArr[i] = elements[i];
       }
       elements = newArr;
       size-- ;
       return tmp ;
    }

    public int size(){
        return  size;
    }

    public Object[] clone(){
        Object[] rs = elements;
       return rs;
    }
    public E get(int  i){
        return (E) elements[i];
    }
//    public boolean contains(E o){
//        for(Object ob : elements){
//          /*  if(ob)*/
//            ArrayList<Integer> input = new ArrayList<>();
//            input.contains()
//        }
//    }
public static void main(String[] args) {
    MyList<Integer> demo = new MyList<>();
//    demo.add(15);
    demo.add(20);
    demo.add(35);
    demo.add(1,25);
    demo.add(0,99);
    for(int i = 0 ; i < demo.size ; i++){
        System.out.println(demo.get(i));
    }
//    ArrayList<Integer> input = new ArrayList<>();
//    input.add(0,15);
}
}

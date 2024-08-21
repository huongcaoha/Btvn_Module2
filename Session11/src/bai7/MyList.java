package bai7;

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
                if(elements[i] != null){
                    if(i < index){
                        newArr[i] = elements[i];
                    } else if (i > index) {
                        newArr[i+1] = elements[i];
                    }else {
                        newArr[i+1]= elements[i];
                        newArr[index] = element ;
                    }
                }else {
                    break;
                }
            }

            elements = newArr;
            size++ ;
        }
    }

    public boolean add(E element){

        Object[] newArr = new Object[size+1];
        for(int i = 0 ; i < elements.length ; i++){
            if(elements[i] != null){
                newArr[i] = elements[i];
            }else {
                break;
            }
        }
        newArr[size] = element;
        elements = newArr ;
        size++;
        return true ;
    }

    public E remove(int index){
        E tmp = null;
        boolean check = false ;
        for(int i = 0 ; i < elements.length -1; i++){
            if(elements[i] != null){
                if(i == index){
                    check = true;
                }
                if (check){
                    Object temp = elements[i];
                    elements[i] = elements[i+1] ;
                    elements[i+1] = temp;
                }
            }else {
                break;
            }
        }
        if(!check){
            System.err.println("Not found index !");
        }else {
            Object[] newArr = new Object[elements.length-1];
            for(int i = 0 ; i < newArr.length ; i++){
                if(elements[i] != null){
                    newArr[i] = elements[i];
                }else {
                    break;
                }
            }
            elements = newArr;
            size-- ;
        }
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
    public boolean contains(E o){
        for(Object ob : elements){
           if(ob != null){
               if(ob.equals(o)){
                   return true ;
               }
           }else {
               break;
           }
        }
        return false;
    }

    public int indexOf(E o){
        for (int i = 0 ; i < elements.length ; i++){
            if(elements[i] != null){
                if(elements[i].equals(o)){
                    return i ;
                }
            }else {
                break;
            }
        }
        return -1 ;
    }

    public void ensureCapacity(int minCapacity){
        if(minCapacity > 0 && elements.length - size < minCapacity ){
            Object[] newArr = new Object[elements.length + minCapacity];
            for(int i = 0 ; i < elements.length ; i++){
                if(elements[i] != null){
                    newArr[i] = elements[i] ;
                }else {
                    break ;
                }
            }
            elements = newArr ;

        }
    }

    public void clear(){
        Object[] newArr = new Object[DEFAULT_CAPACITY];
        elements = newArr ;
        size = 0 ;
    }
public static void main(String[] args) {
    MyList<Integer> demo = new MyList<>();
    demo.add(15);
    demo.add(30);
    demo.add(35);
    System.out.println("before remove !");
    for(int i = 0 ; i < demo.size ; i++){
       if(demo.get(i) != null){
           System.out.println(demo.get(i));
       }
    }
    demo.remove(1);

    System.out.println("after remove !");
    for(int i = 0 ; i < demo.size ; i++){
        if(demo.get(i) != null){
            System.out.println(demo.get(i));
        }
    }

    System.out.println(demo.indexOf(20));

    System.out.println("after clear : ");
    demo.clear();
    for(int i = 0 ; i < demo.size ; i++){
        if(demo.get(i) != null){
            System.out.println(demo.get(i));
        }
    }

}
}

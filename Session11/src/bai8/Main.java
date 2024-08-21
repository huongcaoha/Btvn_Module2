package bai8;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        System.out.println("Test method add :");
        myLinkedList.add(10);
        myLinkedList.add(15);
        myLinkedList.add(99);
//        myLinkedList.get(1);
        myLinkedList.display();

        System.out.println("Test method add(int index ,E o) :");
        myLinkedList.add(1,1);
        myLinkedList.display();

        System.out.println("Test method add first :");
        myLinkedList.addFirst(0);
        myLinkedList.display();

        System.out.println("Test method add last:");
        myLinkedList.addLast(100);
        myLinkedList.display();

        System.out.println("Test method remove(int index) :");
        myLinkedList.remove(1);
        myLinkedList.display();

        System.out.println("Test method get size :");
        System.out.println("Size : " + myLinkedList.size());

        System.out.println("Test method contains :");
        System.out.println(myLinkedList.contains(15));

        System.out.println("Test method indexOf :");
        System.out.println(myLinkedList.indexOf(100));

        System.out.println("Get first : " + myLinkedList.getFirst());
        System.out.println("Get last : " + myLinkedList.getLast());

        System.out.println("Test method clear :");
        myLinkedList.clear();
        myLinkedList.display();

    }
}

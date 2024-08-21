package bai8;

public class MyLinkedList<E> {
    private Node<E> head ;
    private int numNodes ;

    public MyLinkedList() {
        this.head = null ;
        this.numNodes = 0 ;
    }
    public void add(int index , E element){
        if(index == 0){
            addFirst(element);
        }else if (index == numNodes-1){
            addLast(element);
        }else {
            Node<E> newNode = new Node<>(element);
            Node<E> current = head;
            int i = 0 ;
            while (current.getNext() != null){
                if(i == index-1){
                    break;
                }else {
                    current = current.getNext();
                    i++;
                }
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
      numNodes++;
    }
    public boolean isEmpty(){
        return  this.numNodes == 0 ;
    }

    public void addFirst(E e){
       Node<E> newNode = new Node<>(e);
       newNode.setNext(head);
       head = newNode;
       numNodes++;
    }

    public void addLast(E e){
        Node<E> newNode = new Node<>(e);
        Node<E> current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(newNode);
        numNodes++;
    }

    public E remove(int index){
       if(index < 0 || index >= numNodes){
           System.err.println("Not found index !");
           return null ;
       }else {
           int i = 0 ;
           Node<E> current = head;
           if(isEmpty()){
               System.err.println("Not found index !");
               return null;
           } else if (index == 0) {
               head = head.getNext();
           } else {
               while (current.getNext() != null){
                   if(i == index-1){
                       break;
                   }else {
                       i++ ;
                       current = current.getNext();
                   }
               }
               current.setNext(current.getNext().getNext());
           }
           numNodes--;
           return (E) current;
       }
    }

    public boolean remove(Object e){
        Node<E> current = head;
        boolean isEpty = false ;
        while (current.getNext() != null){
            if(current.getData().equals(e)){
                isEpty = true;
                break;
            }else {
                current = current.getNext();
            }
        }
        if(!isEpty){
            System.err.println("Not found object !");
            return false;
        }else {
            current.setNext(current.getNext().getNext());
            numNodes-- ;
            return true;
        }

    }

    public int size(){
        return numNodes;
    }

    public E clone(){
        return (E) this;
    }

    public  boolean contains(E o){
        Node<E> current = head;
        while (current.getNext() != null){
            if(current.getData().equals(o)){
                return true ;
            }else {
                current = current.getNext();
            }
        }
        return false ;
    }

    public int indexOf(E o){

        Node<E> current = head ;
        for(int i = 0 ; i < numNodes ; i++){
            if(current.getData().equals(o)){
                return i;
            }else {
                current = current.getNext();
            }
        }
        return  -1 ;
    }

    public boolean add(E o){
        Node<E> newNode = new Node<>(o);
        if(numNodes == 0){
            head = newNode ;
            numNodes++;
        }else {
            Node<E> current = head ;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
            numNodes++;
        }
        return true ;
    }

    public E get(int index){
        int i = 0 ;
        Node<E> current = head;
      if(index == 0){
          return (E) head.getData();
      }else {
          while (current.getNext() != null){
              if(i == index){
                  return (E) current.getData();
              }else {
                  current = current.getNext();
                  i++ ;
              }
          }
          System.err.println("Not found index !");
          return null;
      }
    }

    public E getFirst(){
        return (E) head.getData();
    }

    public E getLast(){
        Node<E> current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        return (E) current.getData();
    }

    public void clear(){
        head = null ;
    }

    public void display(){
       if(head == null){
           System.err.println("List empty !");
       }else {
           System.out.print("[ ");
           Node<E> current = head;
           System.out.print(current.getData());
           while (current.getNext() != null){
               if(current.getNext() != null){
                   System.out.print(" ,");
               }
               current = current.getNext();
               System.out.print(current.getData());
           }
           System.out.println(" ]");
       }
    }
}

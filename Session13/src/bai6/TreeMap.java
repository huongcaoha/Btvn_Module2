package bai6;

import bai6.Node;

import java.util.List;

public class TreeMap {
    private Node root ;

    public void add(int value){
        root = addRecursive(root,value);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node addRecursive(Node node , int value ){
        if(node == null){
            return new Node(value);
        }
        if(value >= node.getValue()){
             node.setRight(addRecursive(node.getRight(),value));
        }else {
            node.setLeft(addRecursive(node.getLeft(),value));
        }
        return  node ;
    }

    public void buildTreeFromArray(List<Integer> arr){
        for(int el : arr){
            add(el);
        }
    }

    public void inorderTraversal(Node node){
        if(node != null){
            inorderTraversal(node.getLeft());
            System.out.print(node.getValue()+ " ");
            inorderTraversal(node.getRight());
        }
    }

    public void  postorder(Node current){
        if(current != null){
            postorder(current.getLeft());
            postorder(current.getRight());
            System.out.print(current.getValue() + " ");
        }
    }
}

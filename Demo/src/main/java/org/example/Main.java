package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8};

        for(int i=0; i < a.length; i++){

            if(a[i] % 2 == 0){

                continue;

            }
            System.out.println(i);;

        }
    }
}
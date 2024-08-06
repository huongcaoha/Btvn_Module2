package baitap;

import Common.Employee;

public class Baitap8 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1,"Nguyen Van A" ,18,1,1.5f),
                new Employee(2,"Nguyen Van B" ,19,2,2.0f),
                new Employee(3,"Nguyen Van C" ,20,1,2.5f),
                new Employee(4,"Nguyen Van D" ,21,3,3.0f),
                new Employee(5,"Nguyen Van E" ,22,2,3.5f),
        };
        for(Employee employee : employees){
            employee.displayData();
        }
    }
}

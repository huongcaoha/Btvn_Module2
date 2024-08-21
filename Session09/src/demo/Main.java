package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User user1 = new User("Hưởng",23);
        User user2 = new User("Ngọc",43);
        User user3 = new User("Hùng",31);
        User user4 = new User("Linh",26);
        User user5 = new User("Yến",32);
        User user6 = new User("Huỳnh",23);
        User user7 = new User("Dương",25);
        User user8 = new User("Minh",27);

      users.addAll(Arrays.asList(user1,user2,user3,user4,user5,user6,user7,user8));

        System.out.println("Before sort :");
        for(User u : users){
            u.display();
        }
        System.out.println();
        users.sort(Comparator.comparing(User::getName));
        System.out.println("After sort by name :");
        for(User u : users){
            u.display();
        }
        System.out.println();
      users.sort(Comparator.comparingInt(User::getAge));
        System.out.println("After sort by age :");
        for(User u : users){
            u.display();
        }
    }
}

package homeWork.L10HW;

import homeWork.L10HW.task1.User;

public class L10HW {

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        User user1 = new User("VOVAN", 13371488);
        System.out.println(user1);
        System.out.println(user1.hashCode());
        System.out.println(user1.equals(new User("VOVAN", 13371488)));
        System.out.println(user1.equals(new User("VOVAN", 1)));
    }
}

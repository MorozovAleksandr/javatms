package homeWork.L10HW;

import homeWork.L10HW.additionalTask.CopyType;
import homeWork.L10HW.task1.User;

public class L10HW {

    public static void main(String[] args) throws CloneNotSupportedException {
        // task1();

        additionalTask();
    }

    public static void task1() {
        User user1 = new User("VOVAN", 13371488, "+375111111111");
        System.out.println(user1);
        System.out.println(user1.hashCode());
        System.out.println(user1.equals(new User("VOVAN", 13371488, "+375111111111")));
        System.out.println(user1.equals(new User("VOVAN", 1, "+375111111111")));
    }

    public static User customClone(User user, CopyType copyType) throws CloneNotSupportedException {
        return switch (copyType) {
            case SHALLOW -> user.clone();
            case DEEP -> user.deepClone();
        };
    }

    public static void additionalTask() throws CloneNotSupportedException {
        User user = new User("Arthas", 13371488, "+375111111111");
        User deepCloneUser = customClone(user, CopyType.DEEP);
        User shallowCloneUser = customClone(user, CopyType.SHALLOW);

        System.out.println(user.getPhone().equals(deepCloneUser.getPhone()));
        System.out.println(user.getPhone().equals(shallowCloneUser.getPhone()));
    }
}

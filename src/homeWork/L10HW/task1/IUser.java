package homeWork.L10HW.task1;

public interface IUser extends Cloneable {
    boolean equals();

    int hashCode();

    String toString();

    int getId();

    IUser clone() throws CloneNotSupportedException;

    IUser deepClone() throws CloneNotSupportedException;

    void setPhone(Phone phone);

    Phone getPhone();
}

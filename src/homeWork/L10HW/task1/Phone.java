package homeWork.L10HW.task1;

public class Phone implements Cloneable {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Phone(String phoneNumber) {
        setPhoneNumber(phoneNumber);
    }

    public Phone clone() throws CloneNotSupportedException {
        return (Phone) super.clone();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

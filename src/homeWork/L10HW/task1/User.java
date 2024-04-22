package homeWork.L10HW.task1;

public class User implements IUser {
    private final String name;
    private final int id;
    private Phone phone;

    public User(String name, int id, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.phone = new Phone(phoneNumber);
    }

    public int getId() {
        return id;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }


    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    public User deepClone() throws CloneNotSupportedException {
        User cloneUser = (User) super.clone();
        Phone clonePhone = this.phone.clone();
        cloneUser.setPhone(clonePhone);
        return cloneUser;
    }

    @Override
    public boolean equals() {
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "User {\n\tname:" + name + "\n\tid:" + id + "\n\tphone: " + phone + "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof User other)) {
            return false;
        }

        return this.id == other.getId();
    }
}

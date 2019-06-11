package ua.zp.brain.labs.oop.basics.collections;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author Shakhov Yevhen.
 */

public class User {
    /*

     */
    private String name;
    private int age;
    private int phone;

    /**
     *
     * @param name
     * @param age
     * @param phone
     */
    public User(String name, int age, int phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age &&
                phone == user.phone &&
                Objects.equals(name, user.name);
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age, phone);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /*

         */
        HashSet<User> userSet = new HashSet<>();
        userSet.add(new User("Yevhen",26,5156561));
        userSet.add(new User("Yevhen",26,5156561));
        userSet.add(new User("Yevhen",25,5156561));
        /*

         */
        for(User us: userSet){
            System.out.println(us+"\n");
        }
    }
}

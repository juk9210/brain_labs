package ua.zp.brain.labs.oop.basics.inheritance;

import java.util.Objects;

/**
 * Create class Human.
 *
 * @author Shakhov Yevhen.
 */

class Human {
    /**
     * Create private field with get/set.
     */
    private String name;
    private String age;
    private int numberPhone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    /**
     * Create private methods - sayHello and sayGoodbye.
     */

    void sayHello() {
        System.out.println("Hello");
    }

    void sayGoodbay() {
        System.out.println("Goodbye");
    }

    /**
     * Override method equals.
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return numberPhone == human.numberPhone &&
                Objects.equals(name, human.name) &&
                Objects.equals(age, human.age);
    }

    /**
     * Override method hashCode.
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age, numberPhone);
    }

    /**
     * Override method toString.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", numberPhone=" + numberPhone +
                '}';
    }

    /**
     * Create constructor with options.
     *
     * @param name
     * @param numberPhone
     */
    Human(String name, int numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
    }
}

package ua.zp.brain.labs.oop.basics.classes;

/**
 *
 */
public class StoreCostumer {
    private String sex;
    private int age;
    private String size;
    private static final String NATIONALITY = "asian";

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static String getNATIONALITY() {
        return NATIONALITY;
    }
    public void add(){
        System.out.println("Add product to cart");
    }
    public void view(){
        System.out.println("View bonus accumulation");
    }
    public void buy(){
        System.out.println("Buy goods");
    }
}

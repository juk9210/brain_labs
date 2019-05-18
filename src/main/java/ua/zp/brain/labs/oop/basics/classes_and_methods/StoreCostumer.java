package ua.zp.brain.labs.oop.basics.classes_and_methods;

/**
 * Create class PostOficce.Describe private fields and we create methods.
 *
 * @author Shakhov Yevhen.
 */
class StoreCostumer {
    private String sex;
    private int age;
    private String size;
    //Add a field with a constant
    private static final String NATIONALITY = "asian";

    // Add for private fields do get / set
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

    //Add methods for this class.
    public void add() {
        System.out.println("Add product to cart");
    }

    public void view() {
        System.out.println("View bonus accumulation");
    }

    public void buy() {
        System.out.println("Buy goods");
    }
}

package ua.zp.brain.labs.oop.basics.Lab9;

/**
 *
 */
public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Menu of pizza: ");
        Pizza [] menu = new Pizza[4];
        menu[0] = new Pizza("Four cheeses","Pizza dough,mozzarella, emmantal cheese,",120,20);
        menu[1] = new Pizza("Bavarian","Cheese,bavarian sausages",130,20);
        menu[2] = new Pizza("Hawaiian","Cheese,pineapple,hen",120,20);
        menu[3] = new Pizza("Carbonare","Cheese,balyk,bow,egg",135,20);
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]+"\n");
        }
    }
}

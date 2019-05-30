package ua.zp.brain.labs.oop.basics.enums;

import java.util.Scanner;

/**Create class Main with main method.
 * @author Shakhov Yevhen.
 */

public class Main {
    /**
     * Create main method.
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Create five instances of class User.
         */
        User bogdan = new User(Role.DIRECTOR, "123", "bad");
        User alex = new User(Role.ADMINISTRATOR, "321", "good");
        User ann = new User(Role.MANAGER, "555", "sad");
        User oleg = new User(Role.CUSTOMER, "999", "red");
        User sasha = new User(Role.ANONYMOUS, "159", "green");
        /**
         * Create an array in which enter instances of class User.
         */
        User[] users = {bogdan, alex, ann, oleg, sasha};
        /**
         * Create instances of class Store.
         */
        Store silpo = new Store("Silpo", 6515131, users);
        /**
         * Сall the method tryLogin and wrap it in an infinite loop, for reusable sequential use.
         */
        while (true){
            tryLogin(silpo);
        }
    }

    /**
     * Create static method tryLogin in which call Scanner for input login and password.Call method login for Store.
     * If the method returns true: call methods getCurrentUserRights and logout;else print in the console -
     * "Неверный логин и/или пароль".
     * @param store
     */
    static void tryLogin(Store store) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = scan.nextLine();
        System.out.println("Введите пароль: ");
        String password = scan.nextLine();
        boolean isAuth = store.login(login, password);
        if (isAuth) {
            store.getCurrentUserRights();
            store.logout();
        } else {
            System.out.println("Неверный логин и/или пароль");
        }
    }
}

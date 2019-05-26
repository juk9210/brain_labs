package ua.zp.brain.labs.oop.basics.enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User bogdan = new User(Role.DIRECTOR, "123", "bad");
        User alex = new User(Role.ADMINISTRATOR, "321", "good");
        User ann = new User(Role.MANAGER, "555", "sad");
        User oleg = new User(Role.CUSTOMER, "999", "red");
        User sasha = new User(Role.ANONYMOUS, "159", "green");
        User[] users = {bogdan, alex, ann, oleg, sasha};
        Store silpo = new Store("Silpo", 6515131, users);
        while (true){
            tryLogin(silpo);
        }
    }

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

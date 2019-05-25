package ua.zp.brain.labs.oop.basics.enums;

public class Main {
    public static void main(String[] args) {
        User bogdan = new User("sad","123","Bogdan");
        User alex = new User("good","321","Alex");
        User ann = new User("bad","555","Ann");
        User[] users = {bogdan,alex,ann};
        Store silpo = new Store("Silpo",6515131,users);

    }
}

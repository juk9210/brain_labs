package ua.zp.brain.labs.oop.basics.enums;

public class Store {
    private String nameOfStore;
    private int url;
    private User[] users;
    private User authorUser;

    Store(String nameOfStore, int url, User[] users) {
        this.nameOfStore = nameOfStore;
        this.url = url;
        this.users = users;
    }

    boolean login(String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                authorUser = user;
                return true;
            }
        }
        return false;
    }

    void getCurrentUserRights() {
        switch (authorUser.getRole()) {
            case DIRECTOR:
                System.out.println("Директор магазина,может управлять кадрами и ценами");
                break;
            case ADMINISTRATOR:
                System.out.println("Администратор магазина, может добавлять товары и редактировать их описание");
                break;
            case MANAGER:
                System.out.println("Менеджер магазина, может общаться с клиентами");
                break;
            case CUSTOMER:
                System.out.println("Клиент магазина, может покупать товар и пользоваться дисконтом");
                break;
            case ANONYMOUS:
                System.out.println("Анонимный пользователь,может покупать товары и/или авторизироваться");
                break;
                default:
                    System.out.println("ERROR");
        }
    }
    void logout(){
        authorUser = null;
        System.out.println("Пользователь вышел из системы");
    }

    public String getNameOfStore() {
        return nameOfStore;
    }

    public void setNameOfStore(String nameOfStore) {
        this.nameOfStore = nameOfStore;
    }

    public int getUrl() {
        return url;
    }

    public void setUrl(int url) {
        this.url = url;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User getAuthorUser() {
        return authorUser;
    }

    public void setAuthorUser(User authorUser) {
        this.authorUser = authorUser;
    }
}

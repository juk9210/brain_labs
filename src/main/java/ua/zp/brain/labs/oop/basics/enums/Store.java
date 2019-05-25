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

    public String getNameOfStore() { return nameOfStore;
    }

    public void setNameOfStore(String nameOfStore) { this.nameOfStore = nameOfStore;
    }

    public int getUrl() { return url;
    }

    public void setUrl(int url) { this.url = url;
    }

    public User[] getUsers() { return users;
    }

    public void setUsers(User[] users) { this.users = users;
    }

    public User getAuthoriUser() { return authorUser;
    }

    public void setAuthoriUser(User authoriUser) { this.authorUser = authoriUser;
    }

    void login(String login, String paswword) {

    }
}

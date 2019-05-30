package ua.zp.brain.labs.oop.basics.enums;

/**
 * Create class User.
 *
 * @author Shakhov Yevhen.
 */

public class User {
    /**
     * Create private fields with get/set.
     */
    private String login;
    private String password;
    private String name;
    /**
     * Replace the type of the role field with the type created by Enum and set by default ANONYMOUS.
     */
    private Role role = Role.ANONYMOUS;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Create constructor with options.
     *
     * @param role
     * @param password
     * @param login
     */
    public User(Role role, String password, String login) {
        this.login = login;
        this.password = password;
        this.role = role;
    }
}

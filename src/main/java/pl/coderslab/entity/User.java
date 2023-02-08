package pl.coderslab.entity;

public class User {
    private static int id;
    private static String userName;
    private static String email;
    private static String password;


    public static int getId() {
        return id;
    }
    public static String getUserName() {
        return userName;
    }
    public static String getEmail() {
        return email;
    }
    public static String getPassword() {
        return password;
    }
    public static void setId(int id) {
        User.id = id;
    }
    public static void setUserName(String userName) {
        User.userName = userName;
    }
    public static void setEmail(String email) {
        User.email = email;
    }
    public static void setPassword(String password) {
        User.password = password;
    }
}

package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        UserDao userDao = new UserDao();

        user.setUserName("testUser7");
        user.setEmail("test@email19.com");
        user.setPassword("haslo7");
  //      userDao.create(user);
        System.out.println(user.getId());
        User read = userDao.read(1);
        System.out.println("ID: " + read.getId() + "\nUsername: " + read.getUserName() + "\nPassword: " +read.getPassword() + "\nemail: " + read.getEmail());
        System.out.println(userDao.hashPassword("haslo7"));

        User update = new User();
        update.setUserName("testupdate");
        update.setEmail("update@email31.com");
        update.setPassword("StareHaslo");
        userDao.create(update);
        User read2 = userDao.read(update.getId());
        System.out.println("ID: " + read2.getId() + "\nUsername: " + read2.getUserName() + "\nPassword: " +read2.getPassword() + "\nemail: " + read2.getEmail());

        read2.setEmail("nowy@email.com");
        read2.setPassword("NoweHaslo");

        userDao.update(read2);

    }
}
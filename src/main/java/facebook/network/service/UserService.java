package facebook.network.service;

import facebook.network.date.Datebase;
import facebook.network.model.User;

public class UserService {

    public static void main(String[] args) {
        User alex = new User("Alex", "Bobov", "ssss");
        System.out.println(alex);

        getAllusers();
        getFirst();
        getLast();
        String name = "Marina";
        System.out.println("getByName is: \n" + getByName(name));

        //todo create method getBy...(all fields)
    }

    private static User getByName(String name) {
        User[] users = Datebase.getUsers();
        for (User user : users) {
            if (name.equals(user.getName())) {
                return user;
            }
        }
        return null;
    }

    private static void getLast() {
        User[] users = Datebase.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    private static void   getFirst() {
        System.out.println("First User is: ");
        System.out.println(Datebase.getUsers()[0]);

    }

    private static void getAllusers() {
        System.out.println("Last User is: ");
        System.out.println(Datebase.getUsers()[Datebase.getUsers().length - 1]);
    }
}

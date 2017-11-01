package facebook.network.service;

import facebook.network.date.Datebase;
import facebook.network.model.User;
import vertex.counter.StringLength;
import vertex.counter.VertexCounter;

public class UserService {

    public static void main(String[] args) {
        getFirst();
        getLast();
        String name = "Valera";
        System.out.println("getByName is: \n" + getByName(name));
        String surName = "Bromov";
        System.out.println("getBySurname is: \n" + getBySurname(surName));
        String city = Datebase.getUsers()[2].getCityBorn();
        System.out.println(getByCityBorn(city));
        String nickName = "Mad";
        System.out.println(getByNickName(nickName));
        String pass = "12345";
        getByPassword(pass);
        int ages = 20;
        System.out.println(getByAge(ages));


        VertexCounter vertexCounter = new VertexCounter();
        int unicode = vertexCounter.countUnicode("test");
        System.out.println(unicode);

        StringLength stringLength = new StringLength();
        int length = stringLength.countLengthOfString("Privet");
        System.out.println(length);
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

    private static User getBySurname(String name) {
        User[] users = Datebase.getUsers();
        for (User user : users) {
            if (name.equals(user.getSurName())) {
                return user;
            }
        }
        return null;
    }

    private static String getByCityBorn(String city) {
        User[] users = Datebase.getUsers();
        for (User user : users) {
            if (city.equals(user.getCityBorn())) {
                return user.getName() + " You are my Countryman!";
            }
        }
        return "Don`t have countrymen, Sorry.";
    }

    private static String getByNickName(String nickName) {
        User[] users = Datebase.getUsers();
        for (User user : users) {
            if (nickName.equals(user.getNickName())) {
                String s = user.getName() + " " + user.getSurName();
                return s;
            }
        }
        return "Don`t registered this nickName!";
    }

    private static void getByPassword(String password) {
        User[] users = Datebase.getUsers();
        for (User user : users) {
            if (password.equals(user.getPassword())) {
                getAllusers();
                break;
            }
        }
        System.out.println("You Entered wrong number!");
    }

    private static User getByAge(int age) {
        User[] users = Datebase.getUsers();
        for (User user : users) {
            if (age < user.getAge()) {
                return user;
            }
        }
        return null;
    }



    private static void getAllusers() {
        User[] users = Datebase.getUsers();
        System.out.println("It is All users from Datebase:");
        for (User user : users) {
            System.out.println(user);
        }
    }

    private static void   getFirst() {
        System.out.println("First User is: ");
        System.out.println(Datebase.getUsers()[0]);

    }

    private static void getLast() {
        System.out.println("Last User is: ");
        System.out.println(Datebase.getUsers()[Datebase.getUsers().length - 1]);
    }
}

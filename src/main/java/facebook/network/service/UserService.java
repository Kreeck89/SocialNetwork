package facebook.network.service;

import facebook.network.date.Datebase;
import facebook.network.model.User;
import vertex.counter.StringLength;
import vertex.counter.VertexCounter;

import java.util.List;

public class UserService {

    public static void main(String[] args) {
        getFirst();
        getLast();
        String name = "Valera";
        System.out.println("getByName is: \n" + getByName(name));
        String surName = "Bromov";
        System.out.println("getBySurname is: \n" + getBySurname(surName));
        String city = Datebase.getUsers().get(2).getCityBorn();
        System.out.println(getByCityBorn(city));
        String nickName = "Mad";
        System.out.println(getByNickName(nickName));
        String pass = "123";
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
        List<User> list = Datebase.getUsers();
        for (User user : list) {
            if (name.equals(user.getName())) {
                return user;
            }
        }
        return null;
    }

    private static User getBySurname(String name) {
        List<User> list = Datebase.getUsers();
        for (User user : list) {
            if (name.equals(user.getSurName())) {
                return user;
            }
        }
        return null;
    }

    private static String getByCityBorn(String city) {
        List<User> list = Datebase.getUsers();
        for (User user : list) {
            if (city.equals(user.getCityBorn())) {
                return user.getName() + " You are my Countryman!";
            }
        }
        return "Don`t have countrymen, Sorry.";
    }

    private static String getByNickName(String nickName) {
        List<User> list = Datebase.getUsers();
        for (User user : list) {
            if (nickName.equals(user.getNickName())) {
                String s = user.getName() + " " + user.getSurName();
                return s;
            }
        }
        return "Don`t registered this nickName!";
    }

    private static void getByPassword(String password) {
        List<User> list = Datebase.getUsers();
        for (User user : list) {
            if (password.equals(user.getPassword())) {
                System.out.println(list);
                break;
            } else {
                System.out.println("You Entered wrong number!");
            }
        }
    }

    private static User getByAge(int age) {
        List<User> list = Datebase.getUsers();
        for (User user : list) {
            if (age < user.getAge()) {
                return user;
            }
        }
        return null;
    }

    private static void getAllusers() {
        List<User> list = Datebase.getUsers();
        System.out.println("It is All users from Datebase:");
        for (User user : list) {
            System.out.println(user);
        }
    }

    private static void getFirst() {
        System.out.println("First User is: ");
        System.out.println(Datebase.getUsers().get(1));

    }

    private static void getLast() {
        System.out.println("Last User is: ");
        System.out.println(Datebase.getUsers().get(Datebase.getUsers().size() - 1));
    }
}

package facebook.network.date;

import facebook.network.model.User;

import java.util.ArrayList;
import java.util.List;

public class Datebase {

    public static List<User> getUsers () {
        List<User> list = new ArrayList<>();
        list.add(new User("Alex", "Bobov", "ssss"));
        list.add(new User("Valera",
                "Zinov",
                "Kiev",
                "Mad",
                "qwerty12345",
                27));
                list.add(new User());
        list.get(2).setNickName("Crazy");
        list.get(2).setPassword("123");
        list.get(2).setAge(55);
        list.get(2).setCityBorn("Kiev");
        return list;
    }
}

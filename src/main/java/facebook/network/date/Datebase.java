package facebook.network.date;

import facebook.network.model.User;

public class Datebase {

    public static User[] getUsers () {
        User users[] = {new User("Alex", "Bobov", "ssss"),
                new User("Valera",
                        "Zinov",
                        "Kiev",
                        "Mad",
                        "qwerty12345",
                        27),
                new User()};
        users[2].setNickName("Crazy");
        users[2].setPassword("12345");
        users[2].setAge(55);
        users[2].setCityBorn("Kiev");
        return users;
    }
}

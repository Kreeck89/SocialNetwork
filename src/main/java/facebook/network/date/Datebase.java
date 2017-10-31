package facebook.network.date;

import facebook.network.model.User;

public class Datebase {

    public static User[] getUsers () {
        User users[] = {new User(), new User("Igor", "Vlasov", "Proger"), new User()};
        users[0].setName("Oleg");
        users[2].setName("Marina");
        users[2].setCityBorn("Kiev");
        users[2].setAge(26);
        return users;
    }
}

package facebook.network.model;

public class User {

    private String name;
    private String surName;
    private String cityBorn;
    private String nickName;
    private String password;
    private int age;

    public User() {
    }

    public User(String name, String surName, String nickName) {
        this.name = name;
        this.surName = surName;
        this.nickName = nickName;
    }

    public User(String name, String surName, String cityBorn, String nickName, String password, int age) {
        this.name = name;
        this.surName = surName;
        this.cityBorn = cityBorn;
        this.nickName = nickName;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getCityBorn() {
        return cityBorn;
    }

    public void setCityBorn(String cityBorn) {
        this.cityBorn = cityBorn;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "name:" + name
                + "\n"
                + "surName:" + surName
                + "\n"
                + "cityBorn:" + cityBorn
                + "\n"
                + "nickName:" + nickName
                + "\n"
                + "age:" + age
                + "\n";
    }
}

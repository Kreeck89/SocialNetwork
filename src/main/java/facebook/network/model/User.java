package facebook.network.model;

public class User {

    private String name;
    private String surName;
    private String cityBorn;
    private String nickName;
    private int age;
    private int hight;

    public User() {
    }

    public User(String name, String surName, String nickName) {
        this.name = name;
        this.surName = surName;
        this.nickName = nickName;
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

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "name:" + name
                + "\nsurName:" + surName
                + "\ncityBorn:" + cityBorn
                + "\nnickName:" + nickName
                + "\nage:" + age
                + "\nhight:" + hight
                + "\n";
    }
}

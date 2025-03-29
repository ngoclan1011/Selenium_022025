package Bai2_JavaOOP.person;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String phone;
    private String address;

    public Person(String name, int age, String gender, String phone, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    protected String getPhone() {
        return phone;
    }

    protected String getAddress() {
        return address;
    }
}

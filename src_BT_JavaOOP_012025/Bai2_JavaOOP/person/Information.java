package Bai2_JavaOOP.person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person("Lan", 35, "Nữ", "0939194683", "Hà Nội");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getPhone());
        System.out.println(person.getAddress());

    }
}

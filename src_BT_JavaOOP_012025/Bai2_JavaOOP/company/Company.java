package Bai2_JavaOOP.company;

import Bai1_JavaOOP.NhanVien;
import Bai2_JavaOOP.person.Person;

public class Company {
    public static void main(String[] args) {
        Person person = new Person("Phương", 27, "Nữ", "0939194683", "Hà Nội");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());

    }
}

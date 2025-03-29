package Bai1_JavaOOP;

public class NhanVien {

    private String name;
    private int age;
    private String gender;
    private static String phone;
    private String address;

    public NhanVien() {
    }

    public NhanVien(String name, int age, String gender, String phone, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public static String getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Thảo", 24, "Nữ", "0939212496", "HCM");
        nv1.getInfo();

        NhanVien nv2 = new NhanVien("Nhi", 30, "Nữ", "0989845848", "ĐN");
        nv2.getInfo();

        //Automation cho form nhập liệu
        System.out.println(nv1.getAddress());
    }

}

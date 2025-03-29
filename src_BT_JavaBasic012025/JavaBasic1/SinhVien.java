package JavaBasic1;

public class SinhVien {
    int instanceVar = 12345;

    static String company = "Anh Tester";

    public static void main(String[] args) {
        String localVar = "Selenium";

        System.out.println(localVar);
        System.out.println(company);

        SinhVien sinhVien = new SinhVien();

        System.out.println(sinhVien.instanceVar);

        System.out.println(ThongTin.name);
        System.out.println(ThongTin.phone);
    }
}

package JavaBasic5;

import java.util.ArrayList;

public class VongLap_ArrayList {

    public static ArrayList<String> thongTinNhanVien(){
        ArrayList<String> nhanVien = new ArrayList<>();
        nhanVien.add("Nguyễn Văn Hải");
        nhanVien.add("Nam");
        nhanVien.add("Bắc Ninh");

        return nhanVien;
    }

    public static ArrayList<String> addNewEmployee(String name, String gender, String address){
        ArrayList<String> nhanVien = new ArrayList<>();
        nhanVien.add(name);
        nhanVien.add(gender);
        nhanVien.add(address);

        return nhanVien;
    }

    public static void main(String[] args) {

        //int mangSoChan[] = new int[30];
        ArrayList<Integer> listSoNguyen = new ArrayList<>();
        //int index = 0;

        for (int i = 3; i <= 97; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " là số chẵn");
                listSoNguyen.add(i); //Gán giá trị số chẵn vào vị trí tuần tự trong mảng
                //index++;
            }
        }

        for (int item : listSoNguyen){
            System.out.println(item);
        }

        thongTinNhanVien();

        ArrayList<String> nhanvien = addNewEmployee("Phát", "Nam", "Hà Nội");

        for (String item : nhanvien){
            System.out.println(item);
        }

    }
}

package JavaBasic4;

public class VongLap_Mang {
    public static void main(String[] args) {

        int mangSoChan[] = new int[30];
        int index = 0;

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " là số chẵn");
                mangSoChan[index] = i; //Gán giá trị số chẵn vào vị trí tuần tự trong mảng
                index++;
            }
        }

        for (int item : mangSoChan){
            System.out.println(item);
        }

    }
}

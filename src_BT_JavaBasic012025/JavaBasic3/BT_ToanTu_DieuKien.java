package JavaBasic3;

public class BT_ToanTu_DieuKien {

    static void soSanhDieuKien(int n) {
        int number = 100;

        if (n == number) {
            System.out.println(n + " = " + number);
        } else if (n < number) {
            System.out.println(n + " < " + number);
        } else {
            System.out.println(n + " > " + number);
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 20;

        System.out.println("a > b: " + (a > b));
        System.out.println(b < c);

        System.out.println((a < b) && (b > c)); //false

        System.out.println((a < b) || (b > c)); //true

        soSanhDieuKien(100);
    }
}

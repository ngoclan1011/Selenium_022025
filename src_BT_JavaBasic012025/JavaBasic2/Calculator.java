package JavaBasic2;

public class Calculator {
    public static int tong2SoNguyen(int number1, int number2){
        return number1 + number2;
    }

    public static double tich2SoThuc(double number1, double number2){
        return number1 * number2;
    }

    public static void main(String[] args) {
        System.out.println(tong2SoNguyen(10, 20));
        System.out.println(tich2SoThuc(5.5F, 10));
    }
}

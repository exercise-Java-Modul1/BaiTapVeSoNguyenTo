import java.util.Scanner;

public class SoNguyenToTu_1_den_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn in ra bao nhiêu số nguyên tố?: ");
        int output = sc.nextInt();
        for (int number = 3; number < 1000; number++) {
            int count = 0;
            int dem = 1;
            for (int i = number - 1; i > 1; i--) {
                if (number%i == 0) {
                    dem++;
                } else {
                    dem = dem;
                }
            }
                if (dem == 1) {
                    System.out.println(number + " la so nguyen to");
                }
        }
    }
}

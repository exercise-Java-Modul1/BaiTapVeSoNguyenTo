import java.util.Scanner;

public class SoNguyenToTu_1_den_100 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input :");
        for (int number = 100; number > 2; number--){
                int dem = 0;
                for (int i = number - 1; i > 1; i--) {
                    if (number % i == 0) {
                        dem++;
                    } else {
                        dem = dem;
                    }
                }
                if (dem == 0) {
                    System.out.println(number + " la so nguyen to");
                }
            }
    }
}

import java.util.Scanner;

public class SoNguyenToTu_1_den_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn in ra bao nhiêu số nguyên tố?: ");
        int output = sc.nextInt();
        int count = 0;
        int number = 2;
        while (count <= output){
                int dem = 1;
                for (int i = number - 1; i > 1; i--) {
                    if (number % i == 0) {
                        dem++;
                    }
                }
                if (dem == 1) {
                    System.out.println(number + " là số nguyên tố");
                    count++;
                }
                number++;
            }

    }
}

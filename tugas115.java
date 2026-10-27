import java.util.Scanner;

public class tugas115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = input.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

                if (j < i) {
                    System.out.print(" ");
                }

                total++;
            }

            System.out.println();
        }

        System.out.println("Total angka tercetak: " + total);

        input.close();
    }
}

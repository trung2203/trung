import java.util.Scanner;
import java.util.Arrays;

public class BT_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] A = new int[n];
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        // Tìm giá trị lớn nhất
        int max = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);

        // Sắp xếp mảng tăng dần
        Arrays.sort(A);
        System.out.println("Mảng số ban đầu: " + Arrays.toString(A));
        System.out.println("Mảng đã sắp xếp tăng dần: " + Arrays.toString(A));
    }
}
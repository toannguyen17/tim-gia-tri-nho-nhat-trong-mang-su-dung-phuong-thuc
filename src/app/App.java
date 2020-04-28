package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng: ");
        do {
            size = scanner.nextInt();
            if (size < 1 && size > 20) {
                System.out.println("Độ dài mảng từ 1 đến 20: ");
            }
        } while (size < 1 && size > 20);

        System.out.println("Nhập vào các phần tử của mảng: ");

        int[] arrs = new int[size];
        for (int i = 0; i < size; i++) {
            arrs[i] = scanner.nextInt();
        }

        int[] min = minValue(arrs);
        System.out.println("\nThe smallest property value in the list is " + min[0] + " , at position " + min[1]);
    }
    public static int[] minValue(int... arrs){
        int[] result = {arrs[0], 0};
        for (int i = 0; i < arrs.length; i++) {
            System.out.print(arrs[i] + "\t");
            if (result[0] > arrs[i]) {
                result[0] = arrs[i];
                result[1] = i;
            }
        }
        return result;
    }
}


package buoi6;

import java.util.Scanner;
import java.util.Arrays;
public class trungbinhcong {
    public static void main(String[] args) {
         System.out.println("nhap phan tu cua mang: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double total = 0;
        for(int i=0; i<arr.length; i++){
            System.out.print("nhap vào giá trị thứ: "+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.format("Ket qua la: ", average);
    }
        }
    

    
    


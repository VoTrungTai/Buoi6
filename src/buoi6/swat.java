
package buoi6;

import java.util.Arrays;
public class swat {
    public static void main(String[] args) {
         int[] numbers ={2, 4, 6, 8, 10, 12};
         for (int i = 0; i < numbers.length / 2; i++) {
             int temp = numbers[i];
             numbers[i] = numbers[numbers.length-1-i];
             numbers[numbers.length-1-i]=temp;
            
        }
         System.out.println(Arrays.toString(numbers));
    }
    
}

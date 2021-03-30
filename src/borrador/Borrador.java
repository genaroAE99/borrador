
package borrador;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Borrador {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = 3; 
        int[] A = {4,2,3};
        int a = A.length; 
        System.out.println(a);
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] + " ");
            
        }
    }
    
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        // make inputs into an array of arrays
        
        Scanner scan = new Scanner(System.in); 
        int[][] index = new int[6][6]; 
        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                index[i][j] = scan.nextInt();      
            }
        }
        
        // identify the numbers/algorithm that make up the hourglass
        // use previous information to write loops that sums up all of the hourglasses and puts sums in an array

        
        int[] final_array = new int[16]; 
        int k=0; 
        int sum=0; 
        while (k<16) {
            for (int i=0; i<4; i++) {
                int i_one = i; 
                int i_two = i+1; 
                int i_three = i+2; 
                for (int j=0; j<4; j++) {
                       sum = index[i_one][j]+index[i_one][j+1]+index[i_one][j+2]+index[i_two][j+1]+index[i_three][j]+index[i_three][j+1]+index[i_three][j+2];
                        final_array[k]=sum;             
                        k++;
                    }
                }   
            }
        
        // make a findMax piece of code for the array written (see below)
        
        // int q=0; 
        // while (q<final_array.length) {
        //     System.out.print(final_array[q]); 
        //     q++; 
        // }
        
        System.out.println(findMax(final_array)); 
    }
    
    public static int findMax(int[] array) {
        int max=array[0]; 
        int i=0; 
        while (i<array.length) {
            if (max < array[i]) {
                max = array[i]; 
            }
            i++; 
        }
        return max; 
    }
}

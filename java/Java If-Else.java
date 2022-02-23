/* Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 21, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird. */

import java.util.*;


public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        if(N>100 || N<1){return;}
        else if(N%2 != 0 || (N>=6 && N<=20)){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
    }
}


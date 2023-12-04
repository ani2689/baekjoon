package n1000_5000.n2750;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] input = new int[n];

        for(int i = 0; i < n; i++){
            input[i] = sc.nextInt();
        }

        Arrays.sort(input);

        for(int i = 0; i < n; i++){
            System.out.println(input[i]);
        }
    }
}

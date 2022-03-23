package Recursion;

import java.util.Scanner;

public class Print_N_to_1 {
    public static void printNto1(int n){
        // base condition
        if(n == 1)
            System.out.print("1 ");
        else{
            System.out.print(n + " ");
            printNto1(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        printNto1(n);
    }
}

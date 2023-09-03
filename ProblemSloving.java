package com.mycompany.problemsloving;

import java.util.Scanner;

public class ProblemSloving {

    public static void main(String[] args) {
//        watermelon problem link https://codeforces.com/problemset/problem/4/A
        Scanner scan = new Scanner(System.in);
        int numberValue = scan.nextInt();
        System.out.println((numberValue == 2 || numberValue % 2 != 0) ? "NO" : "YES");
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int d_1, d_2, res, res_1;
        Scanner num = new Scanner(System.in);
        System.out.print("Enter diagonal 1: ");
        d_1 = num.nextInt();
        System.out.print("Enter diagonal 2: ");
        d_2 = num.nextInt();
        res = d_2/2;
        res_1 = d_1*res;
        System.out.print(res_1);
    }
}

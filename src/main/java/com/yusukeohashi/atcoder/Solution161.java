package com.yusukeohashi.atcoder;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution161 {
    public static void ABCSwap() {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        Integer c = scanner.nextInt();

        Integer temp = a;
        a = b;
        b = temp;

        temp = a;
        a = c;
        c = temp;

        System.out.format("%d %d %d", a, b, c);
    }

    public static void Sort() {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        Integer M = Integer.parseInt(scanner.next());
        Integer[] inputList = new Integer[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int vote = Integer.parseInt(scanner.next());
            inputList[i] = vote;
            sum += vote;
        }

        Arrays.sort(inputList, Collections.reverseOrder());
        if (inputList[M - 1] * 4 * M >= sum) {
            System.out.println("Yes");
        } else {
            System.out.print("No");
        }
    }
}

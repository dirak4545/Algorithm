package chapter02;

import java.util.Scanner;

public class q001 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        long ans = 0;
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//            ans += arr[i];
//        }
//        System.out.println(ans);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int ans = 0;
        for (int i = 0; i < cNum.length; i++) {
            ans += cNum[i] - '0';
        }
        System.out.println(ans);
    }
}
//내 코드 백준에서 런타임오류 발생



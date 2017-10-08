package homeTask;


import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 1;
//        int n;
//        int sum;
//
//        Scanner s = new Scanner(System.in);
//        n = s.nextInt();
//        for (int i = 0; i < n; i++) {
//            sum = a + b;
//            a = b;
//            b = sum;
//            System.out.println(sum);
//        }


        System.out.println(fib(7));
    }

    public static int fib(int i) {
        if (i == 1) return 1;
        if (i == 2) return 1;
        return fib(i - 1) + fib(i - 2);
    }
}

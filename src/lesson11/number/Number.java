package lesson11.number;

public class Number {
    public static int max(int a, int b, int c, int d) {
//        return Math.max(a, Math.max(b, Math.max(c, d)));
//        int mx = a;  // 3
//        if (b > mx) mx = b;  // 5
//        if (c > mx) mx = c;  // 7
//        if (d > mx) mx = d;  // 9
//        return mx;
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    public static int min(int... num){
        int mn = num[0];  // 13
        for (int i = 1; i < num.length; i++) {
            if(num[i] < mn){  // 5 < 13
                mn = num[i]; // 5
            }
        }
        return mn;
    }

    public static double average(int a, int b, int c, int d){
        return  (a+b+c+d) / (double)4;
    }

    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;  // fact = fact * 1
        }
        return fact;
    }

}

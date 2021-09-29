package recur;

public class RecurDemo {
    public static double factorial(int n) {
        if (n<2) return 1;
        return n * factorial(n-1);
    }
    
    public static double ap(int n, double a, double d) {
        if (n<2) return a;
        return ap(n-1, a, d) + d;
    }
    
    public static double gp(int n, double a, double q) {
        if (n<2) return a;
        return gp(n-1, a, q) * q;
    }
    
    public static double sum(double[] a, int n) {
        if (n==1) return a[0];
        return sum(a, n-1) + a[n-1];
    }
    
    public static int max(int[] a, int n) {
        if (n==1) return a[0];
        int m = max(a, n-1);
        return m > a[n-1]? m: a[n-1];
    }
    
    public static int min(int[] a, int n) {
        if (n==1) return a[0];
        int m = min(a, n-1);
        return m < a[n-1]? m: a[n-1];
    }
    
    public static String convert(int n, int base) {
        if (n==0) return "0";
        return convert(n/base, base) + Character.forDigit(n%base, base);
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(ap(6, 1.5, 2));
        System.out.println(gp(6, 1.5, 2));
        double a[] = {1.5, 2, 4, 5, 2, 6.5};
        System.out.println(sum(a, 6));
        int b[] = {1, 5, 9, 7, 2, 19, 10};
        System.out.println(max(b, 7));
        System.out.println(min(b, 7));
        System.out.println("Bianry: " + convert(266, 2));
        System.out.println("Decimal: " + convert(266, 10));
        System.out.println("Octal: " + convert(266, 8));
        System.out.println("Hexadecimal: " + convert(266, 16));
    }
}

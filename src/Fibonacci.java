public class Fibonacci {
    public static void main(String args[]) {
        int n = 200, s = 0, t = 1;
        System.out.print("Up to " + n + ": ");

        while (s <= n) {
            System.out.print(s + " + ");
            int sum = s + t;
            s = t;
            t = sum;
        }
    }
}
public class Fibonacci {
//        public static int fib(int n) {
//            if (n <= 1) {
//                return n; // base case
//            }
//            return fib(n - 1) + fib(n - 2); // recursive calls
//        }
//
//        public static void main(String[] args) {
//            int n = 6;
//            System.out.println("Fibonacci of " + n + " = " + fib(n));

            public static void main(String[] args) {
                int n = 6;
                int a = 0, b = 1;

                System.out.print("Fibonacci Series: ");
                for (int i = 1; i <= n; i++) {
                    System.out.print(a + " ");
                    int next = a + b;
                    a = b;
                    b = next;
                }
        }
    }

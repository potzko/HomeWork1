import java.util.Scanner;
// homework assignment 2
// fullstack course
// Omer Rodnay 20/8/23
public class HW2 {
    final static double MAX_VALUE = 6000;
    static double maximumForLargeInc = MAX_VALUE * 100 / 110;

    private static int Pow(int a, int b){
        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        } else if (b % 2 == 0){
            return Pow(a * a, b / 2);
        } else {
            return a * Pow(a * a, b / 2);
        }
    }
    private static int getDigitBase10(int num, int digit){
        return (num / Pow(10, digit)) % 10;
    }
    public static void main() {
        /* ------------------------------
               if - else exercise
        ------------------------------ */

        Scanner inp = new Scanner(System.in);
        //input
        int a = inp.nextInt(), b = inp.nextInt();
        // 1
        if (a < b) {
            System.out.println("growing");
        }
        // 2
        if (a < b) {
            System.out.printf("a: %d, is larger then b %d\n", a, b);
        } else {
            System.out.printf("b: %d, is larger then a %d\n", b, a);
        }
        // 3 (will use the variable a as the input)
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        // 4
        if (a % b == 0){
            System.out.println("b divides a with no reminder");
        }
        if (b % a == 0) {
            System.out.println("a divides b with no reminder");
        }
        // 5
        if (b < a) {
            // I can have a little bit of fun here :)
            // equivalent to: a, b = b, a
            a ^= b;
            b ^= a;
            a ^= b;
        }
        System.out.printf("smaller: %d, larger: %d\n", a, b);
        // 6
        System.out.println("what is your name?");
        String name = inp.nextLine();
        System.out.println("what is your salary?");
        double salary = inp.nextDouble();
        if (maximumForLargeInc >= salary) {
            salary *= 1.1;
        } else {
            salary *= 1.05;
        }
        System.out.printf("hi %s, your new salary is %f\n", name, salary);

        /* ------------------------------
                modulo exercise
         ----------------------------- */
        System.out.println("input a number");
        int num = inp.nextInt();
        for (int i = 0; i < 4; i++) {
            System.out.printf("the digit in index %d is %d\n", i, getDigitBase10(num, i));
        }
        System.out.printf("the sum of the first 2 digits is\n", getDigitBase10(num, 0) + getDigitBase10(num, 1));
        String ret = "";
        while (num != 0){
            ret += num % 10;
            num /= 10;
        }
        if (ret == "") {
            ret = "0";
        }
        System.out.printf("the number reversed is: %s", ret);

    }
}

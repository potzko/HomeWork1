import java.util.Random;
import java.util.Scanner;

public class HW3 {
    // loops
    public static void loopHW() {
        Random rng = new Random();
        Scanner scanner = new Scanner(System.in);

        //1
        int sum = 0, count = 0, inp;
        do {
            System.out.println("input a number");
            inp = scanner.nextInt();
            count += 1;
            sum += inp;
        }
        while (inp != 1);
        System.out.printf("you input %d numbers with the avrage %d and the sum %d\n", count, sum / count, sum);

        //2
        sum = 0;
        System.out.println("input the maximum amount");
        int max = scanner.nextInt();

        // I use a while and not a do while as in case of inputs: max = 10, inp = 10. the result should be 0, and the do while option is a bit ugly
        System.out.println("input a meal price");
        inp = scanner.nextInt();
        while (inp + sum <= max) {
            sum += inp;
            System.out.println("input a meal price");
            inp = scanner.nextInt();
        }
        System.out.println("the total price before passing the max is " + sum);

        //3
        inp = 0;
        sum = 0;
        max = 1000;
        while (sum < 1000 && inp >= 0) {
            inp = scanner.nextInt();
            if (inp % 2 == 1) {
                sum += inp;
            } else {
                //for clarity
                continue;
            }
        }

        //4
        max = 100;
        inp = 0;
        int target = rng.nextInt(max) + 1; //0..=99 + 1 = 1..=100
        max = (int) Math.ceil(Math.log(max));
        count = 0;
        System.out.println(target);
        do {
            System.out.println("enter a guess: ");
            inp = scanner.nextInt();
            if (inp < target) {
                System.out.println("too low! ");
            } else if (inp > target) {
                System.out.println("too high! ");
            }
            count += 1;
        } while (inp != target);
        if (max <= count) {
            System.out.println("you win!");
        } else {
            System.out.println("you lose");
        }

        //5
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        //6
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }

        //7
        inp = 11;
        while (0 < inp && 10 > inp) {
            System.out.println("enter a number smaller then 10");
            inp = scanner.nextInt();
        }
        int total = 1; //0! = 1
        for (int i = 1; i <= inp; i++) {
            total *= i;
        }
        System.out.println(total);

        //8
        //mul
        sum = 0;
        int tmp = 0;
        System.out.println("enter 2 numbers to mul and div");
        int a = scanner.nextInt(), b = scanner.nextInt();
        for (int i = 0; i < b; i++) {
            tmp += a;
        }
        System.out.println(a);
        //div
        sum = 0;
        while (a < b) {
            sum += 1;
            a -= b;
        }
        System.out.printf("the result of the div is %d with the remainder %d\n", a, sum);
    }

    public static void HW3General() {
        Scanner scanner = new Scanner(System.in);

        //1
        int sum = 0;
        System.out.println("enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            int inp = scanner.nextInt();
            if (inp > 0) {
                sum += inp;
            }
        }
        System.out.println("the sum of the positive numbers is: " + sum);

        //2
        int sumPosiive = 0;
        int sumNegative = 0;
        System.out.println("enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            int inp = scanner.nextInt();
            if (inp > 0) {
                sumPosiive += inp;
            } else {
                sumNegative += inp;
            }
        }
        System.out.println("the sum of the positive numbers is: " + sumPosiive);
        System.out.println("the sum of the negative numbers is: " + sumNegative);

        //3
        int a, b, c;
        System.out.println("enter a and b, I will print a**b");
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (b == 0) {
            c = 1;
        } else {
            c = a;
        }
        for (int i = 1; i < b; i++) {
            c *= a;
        }
        System.out.printf("%d to the power of %d = %d\n", a, b, c);

        //4
        System.out.println("enter a number to be printed in reverse");
        a = scanner.nextInt();
        b = 0;
        while (a > 0) {
            b *= 10;
            b += a % 10;
            a /= 10;
        }
        System.out.println(b);

        //5
        int sumEven = 0;
        int productOdd = 1;
        System.out.println("enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            int inp = scanner.nextInt();
            if (inp > 0) {
                sumEven += inp;
            } else {
                productOdd *= inp;
            }
        }
        System.out.printf("the sum of the even numbers is: %d, and the product of the odd numbers is: %d\n", sumEven, productOdd);

        //6
        System.out.println("enter a number, and ill print the sum of the harmonic series up to the Nth element");
        a = scanner.nextInt();
        double sumSeries = 0;
        for (int i = 1; i <= a; i++) {
            sumSeries += 1.0 / i;
        }
        System.out.println(sumSeries);

        //7
        int size = 5;
        //7.1
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //7.2
        System.out.println();
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        //7.3
        System.out.println();
        for (int i = 1; i <= size; i++) {
            // Print spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

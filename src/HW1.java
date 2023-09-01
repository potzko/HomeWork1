import java.util.Scanner;

// homework assignment 1
// fullstack course
// Omer Rodnay 14/8/23
public class HW1 {
    public static int[] changeMaker(int[] delimitations , int value){
        //returns the maximum amount of each delimitation
        //assumes a sorted input list, and that value is breakable in the list using greedy algorithm
        int[] ret = new int[delimitations.length];
        for (int i = 0; i < delimitations.length; i++) {
            ret[i] = value / delimitations[i];
            value = value % delimitations[i];
        }
        return ret;
    }
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
        // sum = 3 + 1 + 4 = 8
        // average = sum / 3 = 8 / 3 = 2.66666...
        System.out.println("sum = " + (a + b + c));
        System.out.println("average = " + (a + b + c) / 3.0);
        System.out.println("how long is your movie in seconds?");
        int movieLength = input.nextInt();
        int[] timeInSeconds = {3600, 60, 1}; // 3600 seconds in an hour
        // 60 seconds in a minute
        int[] tmp = changeMaker(timeInSeconds, movieLength);
        // for example for 7355
        // 7200 + 120 + 35 -> 2 hours, 2 min, and 35 seconds
        System.out.printf("hours: %d, min: %d, seconds: %d\n", tmp[0], tmp[1], tmp[2]);
        System.out.println("what are the length and width of your rectangle?");
        System.out.printf("your rectangle's area is %d", input.nextInt() * input.nextInt());
    }
}
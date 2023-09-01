import java.util.Scanner;
// class 2 code
// fullstack course
// Omer Rodnay 20/8/23
public class ClassWork2 {
    public static void main(){
        Scanner inp = new Scanner(System.in);
        System.out.println("please enter Tomer's age");
        int ageTomer = inp.nextInt();
        System.out.println("please enter Dany's age");
        int ageDany = inp.nextInt();
        if (ageTomer < ageDany) {
            System.out.println("dany is older");
        } else if (ageDany < ageTomer) {
            System.out.println("Tomer is older");
        } else {
            System.out.println("Dany and tomer are the same age");
        }

        System.out.println("please enter a number");
        int num = inp.nextInt();
        if (num % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        System.out.println("enter a number between 0 and 2");
        int choice = inp.nextInt();
        switch (choice){
            case 0 : System.out.println("rock"); break;
            case 1 : System.out.println("paper"); break;
            case 2 : System.out.println("scissors"); break;
            default : System.out.println("bad case");;
        }

        System.out.println("enter a number between 1 and 7");
        int day = inp.nextInt();
        switch (choice){
            case 1 : System.out.println("sunday"); break;
            case 5 : System.out.println("thursday"); break;
            case 7 : System.out.println("saturday"); break;
            case 2,3,4,6: break;
            default : System.out.println("bad number");;
        }
    }
}

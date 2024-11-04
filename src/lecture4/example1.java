package lecture4;

import java.util.Scanner;

public class example1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("what percentage did you earn?: ");
        int percent = scanner.nextInt();
        if (percent >= 90) {
            System.out.println("You got an A!");
        } else if (percent >= 80) {
            System.out.println("you got an B!");
        } else if (percent >= 70) {
            System.out.println("you got an C!");
        } else if (percent >= 60) {
            System.out.println("you got an D!");
        } else if (percent < 60) {
            System.out.println("you got an F!");
        }
    }
}

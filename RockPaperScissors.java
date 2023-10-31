// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rock (0), Paper (1), Scissors (2): ");
        int player = scan.nextInt();
        int computer = (int) (Math.random() * 3) + 0;


        if (player == 0) {
            System.out.println("You played rock!");
        } else if (player == 1) {
            System.out.println("Your played paper!");
        } else if (player == 2) {
            System.out.println("You played scissors");
        }


        if (computer == 0) {
            System.out.println("The computer played rock!");
        } else if (computer == 1) {
            System.out.println("The computer played  paper!");
        } else if (computer == 2) {
            System.out.println("The computer played scissors");


            if (player == 0 && computer == 0) {
                System.out.println("Its a draw!! ");
            } else if (player == 0 && computer == 1)
                System.out.println("You Lost");
        } else if (player == 0 && computer == 2)
            System.out.println("You WON!!!");

        if (player == 1 && computer == 0) {
            System.out.println("You WON!!! ");
        } else if (player == 1 && computer == 1) {
            System.out.println("Its a draw");
        } else if (player == 1 && computer == 2)
            System.out.println("You Lost ");

        if (player == 2 && computer == 0) {
            System.out.println("You Lost ");
        } else if (player == 2 && computer == 1) {
            System.out.println("YOU WON!!! ");
        } else if (player == 2 && computer == 2) {
            System.out.println("its a draw");
        }
    }
}






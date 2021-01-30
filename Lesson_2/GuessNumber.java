import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;
    GuessNumber (Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        }

    public void start() {
    System.out.println("Let's play!");
    int numberOfPC = (byte) (Math.random() * 101);
    System.out.println("PC says: \"I've gueesed the number\"" + " " + numberOfPC);
    while (true) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        byte numberOfPlayer1 = s.nextByte();
        System.out.println("Number of " + player1.getName() + " is " + numberOfPlayer1);
        System.out.print("Enter the number: ");
        byte numberOfPlayer2 = s.nextByte();
        System.out.println("Number of " + player2.getName() + " is " + numberOfPlayer2);
        if (numberOfPlayer1 == numberOfPC) {
            System.out.println("Winner is " + player1.getName());
            break;
        } else if (numberOfPlayer2 == numberOfPC) {
            System.out.println("Winner is " + player2.getName());
            break;
        } else {
            if (numberOfPlayer1 > numberOfPC) {
                System.out.println("Number of " + player1.getName() + " is too big");
            } if (numberOfPlayer1 < numberOfPC) {
                System.out.println("Number of " + player1.getName() + " is too small");
            } if (numberOfPlayer2 > numberOfPC) {
                System.out.println("Number of " + player2.getName() + " is too big");
            } if (numberOfPlayer2 < numberOfPC) {
                System.out.println("Number of " + player2.getName() + " is too small");
            }
                System.out.println("Players must try again!");
            }
        }
    }
}
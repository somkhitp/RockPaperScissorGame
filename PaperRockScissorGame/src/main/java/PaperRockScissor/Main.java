package PaperRockScissor;

import java.util.*;

public class Main {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            while (true) {


                System.out.println("Let's Play Paper, Rock, Scissor!!");
                System.out.println("Enter \"R\" for Rock.");
                System.out.println("Enter \"P\" for Paper.");
                System.out.println("Enter \"S\" for Scissor.");
                System.out.println("Let's Get Started!!");
                String[] rps = {"R", "P", "S"};
                String computerMove = rps[new Random().nextInt(rps.length)];

                String playerMove;

                while (true) {
                    System.out.println("Enter Your Move: ");
                    playerMove = scanner.nextLine().toUpperCase(); // Converts input to UpperCase for case sensitivity

                    if (playerMove.equals("R") || playerMove.equals("P") || playerMove.equals("S")) {
                        break;
                    }
                    System.out.println(playerMove + " is not a valid move.");
                }
                System.out.println("Computer played: " + computerMove);

                if (playerMove.equals(computerMove)) {
                    System.out.println("The game is a tie!");
                } else if (playerMove.equals("R") && computerMove.equals("S") ||
                        (playerMove.equals("P") && computerMove.equals("R")) ||
                        (playerMove.equals("S") && computerMove.equals("P"))) {
                    System.out.println("You Win!! " + playerMove + " beats " + computerMove);
                } else {
                    System.out.println("Computer Wins!! " + computerMove + " beats " + playerMove);
                }

                System.out.println("Play Again? (Y/N");
                String playAgain = scanner.nextLine().toUpperCase();

                if (!playAgain.equals("Y")) {
                    break;
                }
            }
            scanner.close();
        }
}
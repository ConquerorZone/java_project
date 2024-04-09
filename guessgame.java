import java.util.Random;
import java.util.Scanner;

class Game {
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);
    private final int targetNumber = random.nextInt(1, 100);
    int userInput;
    private int score = 0;

    public void print() {
        System.out.println("The number is " + targetNumber);
        System.out.println("Your score is " + score);
    }

    public void takeInput() {
        if (score == 0) {
            System.out.println("Guess a number from 1 to 100: ");
            userInput = scanner.nextInt();
            System.out.println("You entered " + userInput);
        } else {
            userInput = scanner.nextInt();
            System.out.println("You entered " + userInput);

        }

    }

    public void check() {
        score++;
        if (userInput == targetNumber) {
            System.out.println("Congratulations, you guessed it!");

        } else if (userInput < targetNumber) {
            System.out.println("Take a bigger number.");
            takeInput();
            check();
        } else if (userInput > targetNumber) {
            System.out.println("Take a smaller number.");
            takeInput();
            check();
        }

    }

    public void playGame() {
        takeInput();
        check();
    }
}

public class guessgame {
    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();
        game.print();
    }
}

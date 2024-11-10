import java.util.Random;
import java.util.Scanner;

class game {
    private Random r = new Random();
    private Scanner sc = new Scanner(System.in);
    private int Random_no = r.nextInt(1, 100);//to generate random numbers for game
    private int input_no;
    private int score = 0;
     
    //   below method will show score and random no to the player
    public void print() {
        System.out.println("the number is " + Random_no);
        System.out.println("your score is " + score);
    }
    //   below method gonna take input from prayer
    //   what numers he can choose between
    //   what number player entered
    public void takinginput() {
        System.out.println("guess number from 1 to 100");
        input_no = sc.nextInt();
        System.out.println("you entered " + input_no);
    }
    // this method is to check guessing
    // if it's incorrect then it'll ask player to enter lesser number 
    // or bigger number
    // if it's correct it'll tell player and exit the method 
    public void check() {
        score++;
        if (Random_no == input_no) {
            System.out.println("guess is correct");

        } else if (Random_no < input_no) {
            System.out.println("take a lesser number");
        } else if (Random_no > input_no) {
            System.out.println("take a bigger number");
        }

        else {
            System.out.println("guess is incorrect");
        }

    }
    // this method is to process the input method and 
    // check method Repeatedly it'll process it untill
    // player wins
    public void process() {
        while (Random_no != input_no) {
            takinginput();
            check();
        }
    }
}

public class exercise3 {
    public static void main(String[] args) {
        game happy = new game();
        happy.process(); // invoking process method 
        happy.print();   // invoking print method 
    }

}

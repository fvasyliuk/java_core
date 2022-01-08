import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args){
        MyGame game = new MyGame();
        game.checkYear();
        game.start();
    }
}

class MyGame{
    

        public void start() {
        this.printOptions();
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();

        switch (option) {
            case "1":
                this.play();
                break;
            case "2": 
                this.exit();
                break;
            default:
                System.out.println("invalid option, please try again \n");
                this.start();
        }
    }

    private void printOptions() {
        String text = "Enter number of options:";
        String[] options = {"1 - Start game", "2 - exit"};
        System.out.println(text);
        for (String option : options) {
            System.out.println(option);
        }
    }

    private void exit() {
        System.out.println("The End");
        System.exit(0);
    }

    private void play() {
        try {
            System.out.println("Start game");
            Random rand = new Random();

            int player = rand.nextInt(12);
            int computer = rand.nextInt(12);
            
            if (player > computer) {
                System.out.println("You are the winner");
            } else if (player < computer) {
                System.out.println("You are the loser");
            } else {
                System.out.println("Equivalent result, try again");
            }
            System.out.println(String.format("You: %s, Computer: %s \n", player, computer) );
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            this.start();
        }
    }

    public void checkYear() {
        try {
            System.out.println("Enter your age: ");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            if (age < 18) {
                throw new YearExceptions("your age - " + age);
            }
        } catch (YearExceptions e) {
            e.printStackTrace();
            this.exit();
        }
    }
}
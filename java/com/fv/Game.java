import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args){
        MyGame game = new MyGame();
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
        }

        private void play() {
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
            
            this.start();
        }
    }
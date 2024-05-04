import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            System.out.println("welecome to the number guessing game!");
            Scanner scanner = new Scanner(System.in);
            System.out.println("you will be guessing a number from one to 100");
            double randNumber = Math.random();
            double d = randNumber * 100;   
            int randomInt1 = (int)d;
            System.out.println(randomInt1);
            int counter = 0;
            boolean game = true;
       
            while(game){
                counter++;
                System.out.println("guess: "+counter );
                int guess = scanner.nextInt();
                if(guess == randomInt1){
                    System.out.println("You guessed correctly!");
                    game = false;
                }else if((randomInt1 +10 > guess && guess > randomInt1 -10 )){
                    System.out.println("HOT");
                }else{
                    System.out.println("Cold");
                }
            }

     }
    }
    


import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args){
//        Ask a user for a secret number (secret number is 9)

        System.out.println("Try to guess the secret number!");

//        User inputs a number

        Scanner reader = new Scanner(System.in);
        int secretNumber = reader.nextInt();

//        If too high - tell them too high, else if too low - tell them too low, else correct

        if (secretNumber > 9){
            System.out.println("Too high, have another try!");
        } else if (secretNumber < 9){
            System.out.println("Too low, have another go!");
        } else {
            System.out.println("Guessed correctly!");
        }
    }
}

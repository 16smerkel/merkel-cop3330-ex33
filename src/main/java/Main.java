import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("What's your question?");
        String yourQuestion = scanner.nextLine();
        int theAns = rand.nextInt(4);
        if(theAns == 0)
        {
            System.out.println("Yes");
        }
        else if(theAns == 1)
        {
            System.out.println("No");
        }
        else if(theAns == 2)
        {
            System.out.println("Maybe");
        }
        else
        {
            System.out.println("Ask again later.");
        }
    }
}
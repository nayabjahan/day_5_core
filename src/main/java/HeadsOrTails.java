
import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {

        public static void main(String[] args)
        {
            int heads = 0;
            int tails = 0;
            int counter = 1;
            double randNum = 0.0;
            Scanner scanner = new Scanner(System.in);

            System.out.println("How many times will the coin be flipped? ");
            int flips = scanner.nextInt();

            while(counter <= flips)
            {
                randNum = Math.random();
                System.out.print(counter + " " + randNum);

                if(randNum < .5)
                {
                    heads++;
                    System.out.println("heads");
                }
                else
                {
                    tails++;
                    System.out.println("\t tails");
                }
                counter++;
            }
            System.out.println();
            System.out.println("Number of Heads = " + heads);
            System.out.println("Number of Tails = " + tails);



        }
    }


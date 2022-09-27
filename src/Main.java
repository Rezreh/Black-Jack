import java.util.Scanner;

import Deck.*;

public class Main {
    public static int position = 1;

    public static void main(String[] args) {
        char action = ' ';
        int count = 0;
        boolean bust = false;
        boolean stop = false;
        Scanner sc = new Scanner(System.in);

        Deck mydeck = new Deck();
        mydeck.shuffle(mydeck);
        System.out.println("Actions are H = Hit; S = Stay");
        mydeck.printDeck(mydeck);
        count = count + value(draw(mydeck));
        count = count + value(draw(mydeck));
        System.out.println("Your Count is :" + count);
        System.out.print("Please enter what you want to do : ");
        action = sc.next().charAt(0);
        if (action == 'h' || action == 'H') {

            while (!stop && !bust) {
                System.out.println("Your next Card is : " + mydeck.drawFromDeck(position, mydeck));
                count = count + value(mydeck.drawFromDeck(position, mydeck));
                System.out.println("Your Count is : " + count);
                position++;
                if (count < 21) {
                    //keep going
                } else if (count == 21) {
                    stop = true;
                    System.out.println("You have a Black Jack you win !!!");
                    break;
                } else if (count > 21) {
                    bust = true;
                    System.out.println("Bust! You lose!");
                    break;
                }
                System.out.print("Please enter what you want to do : ");
                action = sc.next().charAt(0);
                if (action == 's' || action == 'S') {
                    stop = true;
                }
            }
        }
        if (action == 's' || action == 'S') {
            System.out.println("Your Count is : " + count);
        }
    }

    public static Card draw(Deck D) {
        Card c = D.drawFromDeck(position, D);
        System.out.println("Your next Card is a : " + c);
        position++;
        return c;
    }

    public static int value(Card c) {

        if (c.getFace() >= 10) {
            return 10;
        } else {
            return c.getFace();
        }

    }
}
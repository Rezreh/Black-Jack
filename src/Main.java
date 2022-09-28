import java.util.Scanner;

import DeckOfCards.*;

public class Main {
    public static int position = 0;
    public static int count = 0;

    public static void main(String[] args) {
        char action = ' ';
        boolean stop = false;
        Scanner sc = new Scanner(System.in);
        Deck mydeck = new Deck();


        newGame(mydeck);
        //mydeck.printDeck(mydeck);
        action = sc.next().charAt(0);
        while (!stop) {
            stop = Player(action, mydeck, sc);
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

    public static void newGame(Deck d) {
        d.shuffle(d);
        System.out.println("Actions are H = Hit; S = Stay");
        count = count + value(draw(d));
        count = count + value(draw(d));
        System.out.println("Your Count is :" + count);
        System.out.print("Please enter what you want to do : ");
    }

    public static boolean Player(char action, Deck mydeck, Scanner sc) {
        boolean stop = false;
        if (action == 'h' || action == 'H') {
            System.out.println("Your next Card is : " + mydeck.drawFromDeck(position, mydeck));
            count = count + value(mydeck.drawFromDeck(position, mydeck));
            System.out.println("Your Count is : " + count);
            position++;
            if (count < 21) {
                //keep going
            } else if (count == 21) {
                System.out.println("You have a Black Jack you win !!!");
                return true;
            } else if (count > 21) {
                System.out.println("Bust! You lose!");
                return true;
            }
            System.out.print("Please enter what you want to do : ");
            action = sc.next().charAt(0);
            if (action == 's' || action == 'S') {
                System.out.println("Your final count is : " + count);
                return true;
            }
        }
        if (action == 's' || action == 'S') {
            System.out.println("Your final count is : " + count);
            return true;
        }
        return false;
    }
}
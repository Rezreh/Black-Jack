import java.util.Scanner;

import Deck.*;


public class Main {
    public static void main(String[] args) {
        char action = ' ';
        int Count = 0;
        int position = 1;
        boolean bust = false;
        boolean stop = false;
        Scanner sc = new Scanner(System.in);

        Deck deck = new Deck();
        //deck.shuffle(deck);
        System.out.println("Actions are H = Hit; S = Stay");
        // Deck.printDeck(deck);
      /*  System.out.println("Your First Deck.Card is :" + deck.draw(position,deck));
        Count = Count + deck.draw(position,deck).getFace();
        System.out.println("Your Second Deck.Card is :" + deck.draw(position,deck));
        Count = Count + deck.draw(position,deck).getFace();
        System.out.println("Your Count is :" + Count);
        System.out.println("Please enter what you want to do : ");
        */

        action = sc.next().charAt(0);


        if (action == 'h') {

            while (!stop && !bust) {
                //Count = Count + deck.draw(position,deck).getFace();
                if (Count < 21) {
                    //keep going
                } else if (Count == 21) {
                    stop = true;
                    //Balckjack
                } else if (Count > 21) {
                    bust = true;
                    //Bust
                }
                System.out.println("Please enter what you want to do : ");
                action = sc.next().charAt(0);
                if (action == 's') {
                    stop = true;
                }
            }
        }
        if (action == 's') {
            stop = true;
        }

    }


}
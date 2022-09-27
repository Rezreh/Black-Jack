package Deck;

public class Deck {
    private final Card[] cards;
    private int index = 0;

    public Deck() {
        this.cards = new Card[52];
        for (int suit = 0; suit <= 3; suit++) {
            for (int face = 1; face <= 13; face++) {
                this.cards[index] = new Card(face, suit);
                index++;
            }
        }
    }

    /* public Deck shuffle(Deck D) {
         int random1;
         int random2;
         Card c;
         for (int i = 0; i < 500; i++) {
             random1 = (int) Math.ceil(Math.random() * 52);
             random2 = (int) Math.ceil(Math.random() * 52);
             c = D[random1];
             D[random1] = D[random2];
             D[random2] = c;
         }
         return D;
     }
     */
    /* public Card draw(int index, Deck D) {
         return D[index];
     }
 */
    public Card cardAt(Deck D, int position) {
        Card c = this.cards[position];
        return c;
    }

    public void printDeck(Deck D) {
        for (int i = 0; i < 52; i++) {
            System.out.println(this.cards[i].toString());
        }

    }

}


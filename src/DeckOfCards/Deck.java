package DeckOfCards;

public class Deck {
    private Card[] cards;
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

    public Deck shuffle(Deck D) {
        int random1;
        int random2;
        Card c;
        for (int i = 0; i < 1000; i++) {
            random1 = (int) Math.ceil(Math.random() * 51);
            random2 = (int) Math.ceil(Math.random() * 51);
            c = D.cards[random1];
            D.cards[random1] = D.cards[random2];
            D.cards[random2] = c;
        }
        return D;
    }

    public Card drawFromDeck(int index, Deck D) {
        return D.cards[index];
    }

    public Card cardAt(Deck D, int position) {
        Card c = this.cards[position];
        return c;
    }

    public void printDeck(Deck D) {
        for (int i = 0; i < 52; i++) {
            System.out.println(D.cards[i].toString());
        }

    }

}


package Deck;

public class Card {
    private int face;
    private int suit;


    public Card(int face, int suit) {
        this.face = face;
        this.suit = suit;
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public String toString() {
        String[] face = {null, "Ace", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String s = face[this.face] + " of " + suit[this.suit];
        return s;
    }
}

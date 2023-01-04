package Deckofcards;

import java.util.ArrayList;
import java.util.Arrays;

public class Deck extends Card {
    
    // attributes 
    private ArrayList<Card> cards = new ArrayList<>();
    private int[] values = {1,2,3,4,5,6,7,8,9,10,10,10,10}; 
    private String[] suits = {"Club","Spade","Diamond","Heart"}; 
    //added
    private String[] names = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    // constructors, no passing in of values for deck
    public Deck() {
        // add cards one by one into the deck
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < values.length; j++) {
                this.cards.add(new Card(suits[i], values[j], names[j])); 
            }
        }
    }
    // getter for cards deck
    public ArrayList<Card> getCards() {
        return cards;
    }
    
    public int[] getValues() {
        return values;
    }
    // main entry point; 
    public static void main(String[] args) {
        
        // instantiate deck and since cards are private, you use getters 
        Deck deck = new Deck(); 
        ArrayList<Card> cards = deck.getCards(); 

        // print out cards 
        for (Card card: cards) {
            System.out.println(card);
        }
        
        // System.out.println(Arrays.toString(deck.getValues()));s
    }
}

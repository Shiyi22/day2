package Deckofcards;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ProfDeck {

    private List<Card> deck; 

    public ProfDeck() {
        this.deck = new LinkedList<>(); 
        for (int i = 0; i < Constants.SUIT.length; i++) {
            String suit = Constants.SUIT[i];

            for (int j = 0; j < Constants.VALUES.length; j++) {
                Integer value = Constants.VALUES[j]; 
                String name = Constants.NAMES[j]; 
                Card card = new Card(suit, value, name); 
                deck.add(card); 
            }
        }
        System.out.println("The new deck"); 
        System.out.println(deck); 
    }

    public void shuffle() {
        
        //start with deck[0], pick a random index position, swap with that card -> repeat down the deck 
        // probability of picking its own index again is 1/52. It doesnt gurantee shuffle, but the prob of shuffle is high 
        Random rand = new SecureRandom(); 
        
        for (int curr = 0; curr < deck.size(); curr++) {
            
            int toSwap = rand.nextInt(deck.size()); 
            Card c = deck.get(curr); 
            Card d = deck.get(toSwap); 
            deck.set(curr, d); 
            deck.set(toSwap, c);  
        }
    }

    @Override
    public String toString() {
        return "ProfDeck [deck=" + deck + "]";
    }
    
}
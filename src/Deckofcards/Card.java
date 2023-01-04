package Deckofcards;

public class Card {
    
    //attributes 
    private String suit; 
    private Integer value; 
    // prof added names for the card too
    private String name; 

    // constructors 
    public Card (String suit, Integer value, String name) {
        this.suit = suit; 
        this.value = value; 
        this.name = name;
    }
    public Card() { }
    
    // getters and setters
    public String getSuit() {return suit;}
    // no setters needed: public void setSuit(String suit) {this.suit = suit;}
    public Integer getValue() {return value;}
    // no setter needed: public void setValue(String value) {this.value = value;}
    public String getName() {return name;}

    // to string
    @Override
    public String toString() {
        return "Card{name = %s, suit = %s, value = %d}"
                .formatted(this.name, this.suit, this.value); 
    }
}

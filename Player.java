import java.util.ArrayList;
import java.util.Collections;


public class Player 
{
    private String name;
    private ArrayList<Card> deck;
    private ArrayList<Card> discard;
    private ArrayList<Card> tieCards;
    
    public Player(String n, int a)
    {
        name = n;
        deck = new ArrayList<Card>();
        discard = new ArrayList<Card>();
        tieCards = new ArrayList<Card>();
        double r = 0;
        int c = 0;
        
        while(deck.size() < a)
        {
            r = Math.random();
            c = (int)(Math.random() * 81);
            if(Card.rarities[c] == 'c' || (Card.rarities[c] == 'r' && r < 0.3) || (Card.rarities[c] == 'e' && r < 0.1) || (Card.rarities[c] == 'l' && r < 0.02))
                deck.add(new Card(c));
        }
    }

    
    
    public String getName()
    {
        return name;
    }
    
    public int deckSize()
    {
        return deck.size();
    }
    
    public void shuffle()
    {
        Collections.shuffle(deck);
        System.out.println();
        System.out.println(name + " shuffles his/her deck.");
    }
    
    public Card draw()
    {
        Card a = deck.remove(deck.size() - 1);
        System.out.println(name + " pulls " + a.toString() + ".");
        return a;
    }
    
    public void discard(Card a)
    {
        discard.add(a);
    }
    
    public void transfer()
    {
        while(discard.size() > 0)
            deck.add(discard.remove(0));
    }
    
    public void discardTieCardsWin()
    {
        while(tieCards.size() > 0)
        {
            discard.add(tieCards.remove(0));
        }
    }
    public void discardTieCardsLose()
    {
        while(tieCards.size() > 0)
        {
            tieCards.remove(0);
        }
    }
    
    
    public static void tie(Player a, Player b, Card c, Card d)
    {
        a.tieCards.add(c);
        b.tieCards.add(d);
        if(a.deckSize() > 0 && b.deckSize() > 0)
            GameRunner.turn(a,b);
    }
}

import java.util.ArrayList;


public class GameRunner 
{
    public static void turn(Player a, Player b)
    {
        System.out.println();
        Card c = a.draw();
        Card d = b.draw();
        int e = c.compareTo(d);
        
        
        if(e > 0)
        {
            a.discard(c);
            a.discardTieCardsWin();
            b.discardTieCardsLose();
        }
        else if(e < 0)
        {
            b.discard(d);
            b.discardTieCardsWin();
            a.discardTieCardsLose();
        }
        else
        {
            Player.tie(a,b,c,d);
        }
        
        
        if(a.deckSize() == 0)
        {
            a.transfer();
            a.shuffle();
        }
        if(b.deckSize() == 0)
        {
            b.transfer();
            b.shuffle();
        }
    }
    
    
    public static void main(String[] args)
    {
        Player A = new Player("Red", 729);
        Player B = new Player("Blue", 729);
        
        while(A.deckSize() > 0 && B.deckSize() > 0)
        {
            turn(A,B);
        }
        if(A.deckSize() == 0 && B.deckSize() == 0)
            System.out.println(A.getName() + " AND " + B.getName() + " TIE!");
        if(A.deckSize() > 0)
            System.out.println(A.getName() + " WINS!!");
        if(B.deckSize() > 0)
            System.out.println(B.getName() + " WINS!!");
    }
}

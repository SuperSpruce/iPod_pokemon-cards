public class Card 
{
    public static final String[] names = {
        "Day Tripper", "Never Coming Down", "Clash Royale: Drumroll", "Clash of Clans: Builder Base Battle", "Crepuscule with Nellie", "Mozart Opera Questo", "Pokemon G1 Follow Me", "Pokemon G5 Alternate Wild Battle", "Pokemon G5' Final Pokemon",  //1-9
    "Mario Kart 7 Final Lap", "Harry Potter Theme 1", "Pokemon G7 Rival", "Pokemon G3' Route 101", "Pokemon G2' Wild Battle in Kanto", "Mario Power Up", "Kahoot 5 seconds 3", "Jazz Joint Jump", "Pokemon G5' Legendary",
    "Clash of Clans Win", "Bomba", "Beethoven A minor III", "Sneaky Snitch", "Pokemon G4 Team Galactic 2", "Pokemon G5 N", "My Heart", "We can work it out", "Pokemon Yellow Missingno Cry 2",  //19-27
    "Turn Around", "Measures of Success 1.26", "Goldberg Variation 11", "I am a MegaStorm", "Pokemon G3' Elite Four", "Clash Royale Battle 3", "Clutterfunk", "Clash Royale new 3 minute Overtime", "Beethoven G major I",
    "Pokemon G6 Team Flare 2", "Track 16", "Can't buy me love", "Pokemon G1'' Trainer", "Goldberg Variation 17", "Pokemon G3 Team Magma and Aqua 2", "Pokemon G5' Team Plasma", "Mozart Opera Acosto", "Kahoot 30 seconds 2", "Mozart Opera Per Questo",
    "Election of 1800", "Something", "Measures of Success 1.15", "Clicker Heroes 2 All Soundtracks", "Pokemon G1 Win Wild Battle", "Amoeba Hop", "Can-Can", "Goldberg Variation 8",
    "Measures of Success 2.18", "Meet Me Inside", "OH MY GOD!", "Blue Thing", "Mario Kart 7 Rainbow Road", "Helpless", "Wanda, Whatcha Wanna Do", "Pokemon G4 bike", "Pokemon G1 Champion",
    "Measures of Success 1.16", "Pokemon G1 Casino", "Sonic Blaster", "Crab Rave", "Let It Go", "Dry Out", "Run Amok", "Pokemon G2' Encounter Team Rocket", "Pokemon G4 Mystery Zone",  //64-72
    "Pokemon G3' Team Magma and Aqua 1", "Epistrophy", "Beethoven Spring IV", "Goldberg Variation 28", "Yee", "Pokemon G3 Team Magma and Aqua 1", "Pokemon G1 Surf", "8 days a week", "Triple Kill",
    
    "Track 22"
    };
    
    
    
    
    public static final String[] types = {
        "fire", "dragon", "item", "metal", "unknown", "leaf", "item", "normal", "normal",
    "item", "water", "normal", "normal", "normal", "item", "electric", "unknown", "normal",
    "item", "dragon", "leaf", "electric", "normal", "normal", "dragon", "fire", "glitch",
    "fire", "dark", "leaf", "electric", "normal", "metal", "metal", "metal", "leaf",
    "normal", "water", "fire", "normal", "leaf", "normal", "normal", "leaf", "electric",
    "leaf", "fighting", "fire", "dark", "metal", "normal", "unknown", "leaf", "leaf",
    "dark", "fighting", "item", "item", "metal", "fighting", "dark", "normal", "normal",
    "dark", "normal", "dragon", "dragon", "water", "metal", "electric", "normal", "normal",
    "normal", "unknown", "leaf", "leaf", "item", "normal", "normal", "fire", "item",
    
    "water"
    };
    
    
    
    
    public static final char[] rarities = {
        'r', 'e', 'n', 'c', 'c', 'c', 'n', 'r', 'e',
    'n', 'r', 'r', 'c', 'c', 'n', 'c', 'c', 'l',
    'n', 'l', 'r', 'c', 'r', 'r', 'r', 'c', 'l',
    'e', 'c', 'c', 'l', 'e', 'c', 'r', 'c', 'r',
    'r', 'c', 'c', 'r', 'c', 'r', 'r', 'c', 'r',
    'c', 'c', 'c', 'c', 'i', 'c', 'r', 'e', 'c',
    'c', 'c', 'n', 'n', 'r', 'c', 'r', 'c', 'e',
    'c', 'r', 'c', 'l', 'r', 'c', 'c', 'r', 'e',
    'r', 'r', 'r', 'c', 'n', 'c', 'c', 'c', 'n',
    
    'c'
    };
    
    
    
    
    public static final int[] hpValues = {
        90, 130, 20, 90, 50, 50, 40, 70, 140,
    30, 80, 100, 50, 60, 20, 40, 70, 190,
    20, 160, 110, 60, 100, 110, 120, 70, 140,
    130, 60, 60, 170, 150, 60, 80, 80, 60,
    120, 50, 70, 70, 60, 100, 90, 60, 100,
    70, 80, 80, 50, 150, -40, 70, 140, 60,
    60, 40, 30, 50, 110, 80, 30, 70, 120,
    50, 70, 80, 160, 90, 60, 60, 80, 120,
    100, 80, 120, 60, 50, 70, 50, 70, 30,
    
    40
    };
    
    
    
    
    
    
    
    
    
    private String name;
    private String type;
    private char rarity;
    private int hpValue;
    
    public Card(int a)
    {
        name = names[a];
        type = types[a];
        rarity = rarities[a];
        hpValue = hpValues[a];
    }
    
    
    
    
    public String getName()
    {
        return name;
    }
    public String getType()
    {
        return type;
    }
    public char getRarity()
    {
        return rarity;
    }
    public int getHP()
    {
        return hpValue;
    }
    public int getHPValue()
    {
        return hpValue;
    }
    
    public String toString()
    {
        return name + ", a " + type + " type card, with " + hpValue + " HP";
    }
    
    
    
    public int compareTo(Card other)
    {
        int a = this.getHP();
        int b = other.getHP();
        String c = this.getType();
        String d = other.getType();
        
        if(c.equals("normal"))
        {
            if(d.equals("fighting") || d.equals("glitch"))
                a /= 2;
        }
        else if(c.equals("leaf"))
        {
            if(d.equals("fire") || d.equals("unknown"))
                a /= 2;
            else if(d.equals("water"))
                b /= 2;
        }
        else if(c.equals("fire"))
        {
            if(d.equals("water"))
                a /= 2;
            else if(d.equals("leaf") || d.equals("metal"))
                b /= 2;
        }
        else if(c.equals("water"))
        {
            if(d.equals("leaf") || d.equals("electric"))
                a /= 2;
            else if(d.equals("fire") || d.equals("fighting"))
                b /= 2;
        }
        else if(c.equals("electric"))
        {
            if(d.equals("fighting"))
                a /= 2;
            else if(d.equals("water"))
                b /= 2;
        }
        else if(c.equals("metal"))
        {
            if(d.equals("fire"))
                a /= 2;
            else if(d.equals("fairy"))
                b /= 2;
        }
        else if(c.equals("fairy"))
        {
            if(d.equals("metal"))
                a /= 2;
            else if(d.equals("dark") || d.equals("dragon"))
                b /= 2;
        }
        else if(c.equals("dragon"))
        {
            if(d.equals("fairy"))
                a /= 2;
        }
        else if(c.equals("dark"))
        {
            if(d.equals("fairy"))
                a /= 2;
            else if(d.equals("unknown"))
                b /= 2;
        }
        else if(c.equals("unknown"))
        {
            if(d.equals("dark"))
                a /= 2;
            else if(d.equals("leaf") || d.equals("fighting"))
                b /= 2;
        }
        else if(c.equals("fighting"))
        {
            if(d.equals("unknown") || d.equals("water"))
                a /= 2;
            else if(d.equals("normal") || d.equals("electric"))
                b /= 2;
        }
        else if(c.equals("glitch"))
        {
            if(d.equals("normal"))
                b /= 2;
        }
        
        
        int e = a - b;
        if(e > 0)
            System.out.println(this.name + " wins by " + e + " points!");
        else if(e < 0)
            System.out.println(other.name + " wins by " + -e + " points!");
        else
            System.out.println("tie!");
        
        return e;
    }
}
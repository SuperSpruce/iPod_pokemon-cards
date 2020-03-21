public class Card 
{
    public static final String[] names = {
        "Day Tripper", "Never Coming Down", "Clash Royale: Drumroll", "Clash of Clans: Builder Base Battle", "Crepuscule with Nellie", "Mozart Opera Questo", "Pokemon G1 Follow Me", "Pokemon G5 Alternate Wild Battle", "Pokemon G5' Final Pokemon",  //1-9
    "Mario Kart 7 Final Lap", "Harry Potter Theme 1", "Pokemon G7 Rival", "Pokemon G3' Route 101", "Pokemon G2' Wild Battle in Kanto", "Mario Power Up", "Kahoot 5 seconds 3", "Jazz Joint Jump", "Pokemon G5' Legendary",
    "Clash of Clans Win", "Bomba", "Beethoven A minor III", "Sneaky Snitch", "Pokemon G4 Team Galactic 2", "Pokemon G5 N", "My Heart", "We can work it out", "Pokemon Yellow Missingno Cry 2",  //19-27
    "Turn Around", "Measures of Success 1.26", "Goldberg Variation 11", "I am a MegaStorm", "Pokemon G3' Elite Four", "Clash Royale Battle 3", "Clutterfunk", "Clash Royale new 3 minute Overtime", "Beethoven G major I",
    "Pokemon G6 Team Flare 2", "Track 16", "Can't buy me love", "Pokemon G1'' Trainer", "Goldberg Variation 17", "Pokemon G3 Team Magma and Aqua 2", "Pokemon G5' Team Plasma", "Mozart Opera Acosto", "Kahoot 30 seconds 2",
    "Mozart Opera Per Questo", "Election of 1800", "Something", "Measures of Success 1.15", "Clicker Heroes 2 All Soundtracks", "Pokemon G1 Win Wild Battle", "Amoeba Hop", "Can-Can", "Goldberg Variation 8",
    "Measures of Success 2.18", "Meet Me Inside", "OH MY GOD!", "Blue Thing", "Mario Kart 7 Rainbow Road", "Helpless", "Wanda, Whatcha Wanna Do", "Pokemon G4 bike", "Pokemon G1 Champion",
    "Measures of Success 1.16", "Pokemon G1 Casino", "Sonic Blaster", "Crab Rave", "Let It Go", "Dry Out", "Run Amok", "Pokemon G2' Encounter Team Rocket", "Pokemon G4 Mystery Zone",  //64-72
    "Pokemon G3' Team Magma and Aqua 1", "Epistrophy", "Beethoven Spring IV", "Goldberg Variation 28", "Yee", "Pokemon G3 Team Magma and Aqua 1", "Pokemon G1 Surf", "8 days a week", "Triple Kill",
    
    "Track 22", "Who lives, who dies, who tells your story", "Pokemon G2' Wild Battle in Johto", "Pokemon G5' Team Plasma 2: Colress", "Goldberg Variation 16", "Cycles", "Pokemon G2' Team Rocket", "Time Lapse", "Pokemon G3' Legendary 1: Groudon/Kyogre",
    "Goldberg Variation 21", "Pop Sound Effect", "Kahoot 10 seconds 2", "Clash Royale 30 seconds left", "Stay Alive Reprise", "Pokemon G5' Champion", "You'll be back", "Krebs Cycle", "Illuminati Confirmed",
    "Pokemon G3 R", "From me to you", "Track 23", "Let It Go (G)", "Meatball Parade", "Stereo Madness", "Pokemon G1 Inside Gym", "Measures of Success 3.7", "Measures of Success 1.1",
    "Pokemon G4 Legendary 1: Uxie/Azelf/Mespirit", "Pokemon G7' Wild", "D: HWV430.4", "In C, beginning", "Explosion Sound Effect", "Kahoot 20 seconds 2", "Measures of Success 3.9", "Clicker Heroes Sounds", "Kahoot 10 seconds 1",
    "Measures of Success 1.30", "New Periodic Table Song", "Mozart Opera Publici", "D: HWV430.1", "Do you want to build a snowman", "Clash Royale Legendary Card Old", "Clash Royale old 1 minute Overtime", "Pokemon G2' Trainer Battle in Johto", "D: K27",
    "Goldberg Variation 19", "Clash Royale Lose Sound Effect", "Mitosis", "Non-Stop", "Pokemon G2' Gym Battle in Kanto", "Yesterday", "Mozart Opera Si Redando", "'Round Midnight", "Yorktown",
    "Mario Lose a Life Sound Effect", "Pokemon G2' Team Rocket Radio Tower", "Clubstep", "The Maze of Mayonaise", "Mozart Opera Lacrime", "The World's Address", "Pokemon G5' Rival", "Despicable Me", "I know him",
    "Back on Track", "Measures of Success 1.6", "Best of Wives and Best of Women", "Pokemon G1 Viridian Forest", "Pokemon G3' Inside Gym", "Pokemon G1 Mt. Moon", "Metal Gear Alert", "Measures of Success 1.19", "Measures of Success 3.8",
    "Polargeist", "Paperback Writer", "Pokemon G3' Route 110", "Measures of Success 2.9", "I am the Walrus", "Pokemon G1 Cinnabar Island", "Pokemon G6 Legendary", "Clash of Clans Clan War", "Let It Go (A-flat)",
    
    "Track 21", "DNA", "Goldberg Variation 1", "Clicker Heroes 2: Zone 100", "Pokemon G1 Evolution", "Pokemon G3' Team Magma and Aqua 2", "Hellcat", "Pokemon G7 Trainer", "Pokemon G5 Team Plasma 3: Ghetsis",
    "Measures of Success 1.4", "Pokemon G1 Wild", "Pokemon G1' Trainer", "Fixer Upper", "Bomba But It's Bass Boosted Attempt 2", "Santa's Beard", "Measures of Success 2.1", "Measures of Success Introduction", "xStep",
    "Pokemon G5 Champion", "Pokemon G1 Capture Pokemon", "Cabinet Battle 1", "Clash of Clans All Builder Base Soundtracks", "Bemsha Swing", "D: K247", "Pokemon G2' Route 38", "Pokemon G3 Gym Battle", "D: K491",
    "We Know", "Track 14", "Goldberg Variation 26", "King Taco", "Investigations", "Measures of Success 1.9", "Pokemon G5' Wild", "Mozart Opera Impero", "Pokemon G2 Team Rocket Battle",
    "I want to hold your hand", "More than meets the eye", "Nobody Quite as Hip", "Pokemon G5 Wild", "Measures of Success 2.17", "The Elements", "Piece of Dirt", "Number Two", "4 4's True Cry",
    "Star Wars Imperial March Trap Remix", "Cowtown", "Track 10", "Pokemon G3' Wild", "D: HWV 430.2", "Hey Jude", "Pokemon G2' Hall of Fame", "War Game", "Goldberg Variation 29",
    "Pokemon G1'' Wild", "Cable Kid", "Pokemon G3' Champion", "Measures of Success 1.20", "They'll need a crane", "D: HWV428.5", "Measures of Success 1.5", "Snuggle Puppy", "Straight, No Chaser",
    "Vivaldi Summer I", "Goldberg Variation Aria De Capo", "Measures of Success 2.22", "Measures of Success Interpretation Station 1", "At the Speed of Light", "Pokemon G1 Encounter Trainer 1", "Boker Tov", "Fly Away", "Ruby, my Dear",
    "The Price is Right Losing Horn", "Goldberg Varation 30", "PACER TEST", "Snowball in Hell", "Pokemon G7 Totem", "Track 13", "Wake Up Call", "D: K537", "Vivaldi Winter I",
    
    "In C", "Measures of Success 2.31", "Mozart Opera Credi", "Measures of Success 1.29", "Pokemon G2' Route 26", "Measures of Success 2.19", "Pokemon G4 Lengedary 4: Arceus", "Pokemon G1 Celadon City", "Mario Power Down Sound Effect",
    "Theory of Everything 2", "Beethoven Spring I", "Measures of Success 2.7", "The Reynolds Pamphlet", "It's Over 9000!!! [short]", "Can't Let Go", "I Don't Like", "Mozart Opera Avede", "Goldberg Variation 15",
    "Pokemon G2 R", "The Schuyler Sisters", "Different Trains III: After the War", "Pokemon G4 Champion", "Beethoven Kreutzer I", "Beethoven Kreutzer II", "Guns and Ships", "Love is an Open Door", "Your Obediant Servant",
    "Clash Royale Epic Card", "Pokemon G1 Encounter Trainer 2", "Yay Sound Effect", "Clash Royale Legendary Card New", "D: HWV427.3", "Pokemon G1 Team Rocket Hideout", "Goldberg Variation 10", "Clash of Clans: Clouds", "Goldberg Variation 3",
    "Track 25", "Don't Ask Me Why", "Electrodynamix", "You'll Miss Me", "Joshua Bell Interview", "To Be Continued Sound Effect", "Satisfied", "Washington On Your Side", "Give Me Candy",
    "Pokemon G3 Champion", "Goldberg Variation 6", "Michael, Row the Boat Ashore", "Mozart Opera Flori", "Goldberg Variation 4", "Unity", "Measures of Success 2/24", "Beethoven G Major II", "Ten Duel Commandments",
    "Goldberg Variation 5", "Lady Madonna", "Pokemon G3' Gym Battle", "Spazzmatica Polka", "Marvin Suggs and his Muppaphone", "Goldberg Variation 12", "All You Need is Love", "Beethoven Spring II", "Mozart Opera Pieta",
    "Measures of Success 3.10", "Expecto Patronum", "Africa (noob)", "Pokemon G2' Title Screen", "Pokemon G1 Encounter Rival", "Infinite Power", "Mario Stage Clear", "Clash Roayle: Draw", "Measures of Success 2.15",
    "Measures of Success 2.23", "Harry Potter Theme Song 2", "Crab Rave But It's Bass Boosted", "Goldberg Variation 20", "Xenogenesis", "History Has It's Eyes on You", "The Builder", "Measures of Success 1.18", "Measures of Success 1.24",
    
    "Pokemon G4 Trainer"
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
    
    "water", "fighting", "normal", "normal", "leaf", "metal", "normal", "dragon", "normal",
    "leaf", "item", "electric", "metal", "fighting", "normal", "fighting", "unknown", "item",
    "normal", "fire", "water", "water", "electric", "metal", "normal", "dark", "dark",
    "normal", "normal", "leaf", "fairy", "item", "electric", "dark", "metal", "electric",
    "dark", "unknown", "leaf", "leaf", "water", "item", "metal", "normal", "leaf",
    "leaf", "item", "unknown", "fighting", "normal", "fire", "leaf", "unknown", "fighting",
    "item", "normal", "metal", "dragon", "leaf", "fire", "normal", "unknown", "fighting",
    "metal", "dark", "fighting", "normal", "normal", "normal", "item", "dark", "dark",
    "metal", "fire", "normal", "dark", "fire", "normal", "normal", "metal", "water",
    
    "water", "unknown", "leaf", "metal", "normal", "normal", "dragon", "normal", "normal",
    "dark", "normal", "normal", "water", "metal", "fire", "dark", "dark", "metal",
    "normal", "item", "fighting", "metal", "unknown", "leaf", "normal", "normal", "leaf",
    "fighting", "water", "leaf", "dragon", "electric", "dark", "normal", "leaf", "normal",
    "fire", "unknown", "unknown", "normal", "dark", "unknown", "fire", "fire", "glitch",
    "dragon", "fire", "water", "normal", "leaf", "fire", "normal", "dragon", "leaf",
    "normal", "dragon", "normal", "dark", "fire", "leaf", "dark", "unknown", "unknown",
    "leaf", "leaf", "dark", "dark", "dragon", "normal", "unknown", "dragon", "unknown",
    "item", "leaf", "dark", "fire", "normal", "water", "fire", "leaf", "leaf",
    
    "fairy", "dark", "leaf", "dark", "normal", "dark", "normal", "normal", "item",
    "metal", "leaf", "dark", "fighting", "item", "metal", "unknown", "leaf", "leaf",
    "normal", "fighting", "fairy", "normal", "leaf", "leaf", "fighting", "water", "fighting",
    "item", "normal", "item", "item", "leaf", "normal", "leaf", "metal", "leaf",
    "water", "fire", "metal", "fire", "leaf", "item", "fighting", "fighting", "dragon",
    "normal", "leaf", "unknown", "leaf", "leaf", "dragon", "dark", "leaf", "fighting",
    "leaf", "fire", "normal", "electric", "unknown", "leaf", "fire", "leaf", "leaf",
    "dark", "dragon", "fire", "normal", "normal", "dragon", "item", "item", "dark",
    "dark", "water", "dragon", "leaf", "dragon", "fighting", "electric", "dark", "dark",
    
    "normal"
    };
    
    
    
    
    public static final char[] rarities = {
        'r', 'e', 'c', 'c', 'c', 'c', 'r', 'r', 'e',
    'c', 'r', 'r', 'c', 'c', 'c', 'c', 'c', 'l',
    'c', 'l', 'r', 'c', 'r', 'r', 'r', 'c', 'l',
    'e', 'c', 'c', 'l', 'e', 'c', 'r', 'c', 'r',
    'r', 'c', 'c', 'r', 'c', 'r', 'r', 'c', 'r',
    'c', 'c', 'c', 'c', 'i', 'c', 'r', 'e', 'c',
    'c', 'c', 'r', 'e', 'r', 'c', 'r', 'c', 'e',
    'c', 'r', 'c', 'l', 'r', 'c', 'c', 'r', 'e',
    'r', 'r', 'r', 'c', 'e', 'c', 'c', 'c', 'r',
    
    'c', 'r', 'c', 'e', 'c', 'c', 'c', 'c', 'e',
    'c', 'c', 'c', 'c', 'c', 'e', 'c', 'c', 'e',
    'c', 'c', 'c', 'r', 'c', 'c', 'c', 'c', 'c',
    'r', 'c', 'c', 'r', 'c', 'c', 'c', 'e', 'c',
    'c', 'r', 'c', 'c', 'r', 'l', 'c', 'c', 'c',
    'c', 'c', 'c', 'r', 'e', 'c', 'r', 'r', 'r',
    'c', 'e', 'r', 'c', 'c', 'r', 'r', 'r', 'c',
    'c', 'c', 'c', 'c', 'r', 'c', 'c', 'c', 'c',
    'c', 'c', 'c', 'c', 'r', 'c', 'e', 'c', 'r',
    
    'c', 'c', 'c', 'l', 'r', 'e', 'e', 'c', 'l',
    'c', 'c', 'c', 'r', 'l', 'r', 'c', 'r', 'c',
    'e', 'e', 'c', 'i', 'r', 'c', 'c', 'r', 'c',
    'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c',
    'c', 'c', 'c', 'c', 'c', 'r', 'r', 'r', 'l',
    'c', 'r', 'r', 'c', 'c', 'c', 'e', 'e', 'c',
    'c', 'e', 'l', 'c', 'r', 'c', 'c', 'c', 'c',
    'r', 'r', 'c', 'c', 'r', 'c', 'c', 'r', 'c',
    'r', 'c', 'e', 'r', 'l', 'c', 'e', 'c', 'r',
    
    'l', 'c', 'r', 'c', 'c', 'c', 'l', 'c', 'c',
    'r', 'e', 'c', 'c', 'e', 'c', 'r', 'c', 'c',
    'r', 'c', 'r', 'l', 'c', 'c', 'r', 'r', 'c',
    'e', 'c', 'r', 'l', 'c', 'r', 'c', 'c', 'c',
    'c', 'r', 'r', 'r', 'r', 'r', 'c', 'c', 'r',
    'e', 'c', 'r', 'c', 'c', 'c', 'c', 'r', 'c',
    'c', 'c', 'r', 'c', 'r', 'c', 'c', 'r', 'c',
    'c', 'r', 'e', 'r', 'c', 'c', 'r', 'c', 'c',
    'c', 'r', 'l', 'c', 'c', 'c', 'c', 'c', 'c',
    
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
    
    40, 70, 50, 130, 60, 60, 70, 100, 140,
    60, 10, 90, 90, 60, 150, 70, 60, 40,
    60, 50, 50, 80, 80, 30, 60, 50, 40,
    110, 70, 50, 100, 20, 80, 50, 60, 60,
    70, 90, 60, 50, 80, 50, 60, 60, 60,
    60, -20, 70, 100, 130, 70, 80, 90, 90,
    -20, 100, 50, 90, 60, 100, 100, 70, 50,
    40, 50, 40, 50, 80, 50, 10, 50, 50,
    60, 60, 60, 50, 100, 60, 140, 50, 60,
    
    40, 60, 70, 200, 70, 130, 140, 70, 160,
    50, 30, 60, 90, 90, 70, 50, 60, 50,
    120, 40, 80, 120, 80, 60, 60, 90, 60,
    50, 50, 60, 90, 60, 50, 60, 70, 60,
    70, 60, 60, 50, 60, 80, 80, 50, 100,
    90, 90, 70, 50, 50, 70, 130, 140, 60,
    60, 150, 160, 50, 70, 50, 50, 30, 60,
    80, 60, 60, 40, 140, 30, 40, 110, 60,
    40, 60, 60, 80, 180, 50, 90, 60, 70,
    
    200, 60, 70, 60, 60, 60, 170, 50, -10,
    90, 150, 50, 60, 40, 90, 70, 50, 60,
    80, 80, 90, 170, 70, 70, 100, 90, 60,
    40, 30, 30, 50, 50, 70, 60, 40, 70,
    50, 80, 70, 60, 30, 30, 70, 70, 120,
    150, 60, 70, 70, 60, 100, 50, 60, 70,
    60, 60, 120, 60, 50, 60, 80, 100, 70,
    50, 100, 120, 80, 40, 100, 30, 0, 60,
    50, 100, 200, 60, 90, 70, 70, 50, 60,
    
    70,
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
    
    
    
    public int compareTo(Card other, int f, int g)
    {
        int a = this.getHP() + f;
        int b = other.getHP() + g;
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

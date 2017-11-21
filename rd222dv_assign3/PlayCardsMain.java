package rd222dv_assign3;
public class PlayCardsMain {
	
	public static void main(String[] args) { //in case of plagiarism: I published my whole code on Stackoverflow because I had questions
		Deck deck = new Deck();
		int allCards=52;
		
		deck.print();
        deck.Shuffle();
        System.out.println("\nPrinting the shuffled deck: ");
        deck.print();
        System.out.println("\nDealing a card: ");
        System.out.println(deck.dealCard().toString());
        System.out.println("Remaining cards in Deck after dealing one card: "+(allCards-1));
        deck.Shuffle();
        System.out.println("\nShuffling the Deck with all "+(allCards)+" cards in Deck");
        System.out.println("Dealing a card: ");
        System.out.println(deck.dealCard().toString());
        System.out.println("Remaining cards in Deck after dealing one card: "+(allCards-1));
        deck.Shuffle();
        System.out.println("\nShuffling the Deck with all "+(allCards)+" cards in Deck");
        System.out.println("Dealing a card: ");
        System.out.println(deck.dealCard().toString());
        System.out.println("Remaining cards in Deck after dealing one card: "+(allCards-1));
        
}
}
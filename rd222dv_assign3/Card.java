package rd222dv_assign3;

public class Card { // in case of plagiarism: I published my whole code on
					// Stackoverflow because I had questions
	enum Suite {
		HEARTS, CLUBS, SPADES, DIAMONDS
	}

	enum Rank {
		Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
	}

	public Card(Suite suite, Rank rank) {
		this.rank = rank;
		this.suite = suite;
	}

	private Rank rank;

	public Rank getRank() {
		return rank;
	}

	private Suite suite;

	public Suite getSuite() {
		return suite;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public void setSuite(Suite suite) {
		this.suite = suite;
	}

	public String toString() {
		String str = rank + " of " + suite;
		return str;
	}

}
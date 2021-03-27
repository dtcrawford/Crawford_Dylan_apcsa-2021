package activity9;
/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card

{

	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",

			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};



	//instance variables

	private String suit;

	private String rank;

	private int face;

	private int pointValue;



  	//constructors
	public Card() {
		rank = "";
		suit = "";
		pointValue = 0;
	}

	public Card(String suitIn, int faceIn) 

	{

		setCard(suitIn, faceIn);

	}

	

	public Card(String rankIn, String suitIn, int pointValIn) 

	{

		setSuit(suitIn);

		setRank(rankIn);

		setPointValue(pointValIn);

	}



	

	// modifiers

	public void setCard(String suitIn, int faceIn)

	{

		suit = suitIn;

		face = faceIn;

	}

	

	public void setSuit(String suitIn)

	{

		suit = suitIn;

	}

	

	public void setFace(int faceIn)

	{

		face = faceIn;

	}

	

	public void setRank(String rankIn)

	{

		rank = rankIn;

	}

	

	public void setPointValue(int pointValIn) {

		pointValue = pointValIn;

	}



	

  	//accessors

	public String getSuit() 

	{

		return this.suit;

	}

	

	public String getRank() {

		return rank;

	}

	

	public int getFace()

	{

		return face;

	}

	

	public int getPointValue() {

		return pointValue;

	}
	public boolean match(Card card) {
		if(card.getSuit().equals(this.getSuit()) && card.getRank().equals(this.getRank()) && card.getPointValue() == this.getPointValue()) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		String output = "";
		output = FACES[getPointValue()] + " of " + getSuit();
		return output;
	}
}
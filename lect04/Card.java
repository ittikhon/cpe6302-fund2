public class Card {

public enum Rank {
  ACE,
  TWO,
  THREE,
  FOUR,
  FIVE,
  SIX,
  SEVEN,
  EIGHT,
  NINE,
  TEN,
  JACK,
  QUEEN,
  KING
}

public enum Suit {
  CLUBS,
  DIAMOND,
  HEARTS,
  SPADES
}

  private final int rank;
  private final int suit;


  public Card(RANK rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }
  public String toString() {
    String s = this.rank + " of " + this.suit;
    return s;
  }
  public boolean equals(Card that) {
    return this.rank == that.rank && this.suit == that.suit;
  }
  public int compareTo(Card that) {
    int cmp_suit = this.suit.compareTo(that.suit);
    int cmp_rank = this.rank.compareTo(that.rank);

    if ((cmp_suit == 0) && (cmp_rank == 0)) {
      return 0;
    }
    if (cmp_suit != 0) {
      return cmp_suit;
    } else {
      return cmp_rank;
    }
  }
  public int getRank() {
    return this.rank;
  }
  public int getSuit() {
    return this.suit;
  }
}

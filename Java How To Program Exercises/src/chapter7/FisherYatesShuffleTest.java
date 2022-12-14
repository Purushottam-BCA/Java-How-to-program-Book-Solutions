// Grzegorz Ko?czak, 12.07.2016
// Exercise number 7.35 page 350
// Exercise from Java:How to program 10th edition

package chapter7;

public class FisherYatesShuffleTest {

	// execute application
	   public static void main(String[] args)
	   {
		   FisherYatesShuffle myDeckOfCards = new FisherYatesShuffle();
	      myDeckOfCards.shuffle(); // place Cards in random order
	      
	      // print all 52 Cards in the order in which they are dealt
	      for (int i = 1; i <= 52; i++)
	      {
	         // deal and display a Card
	         System.out.printf("%-19s", myDeckOfCards.dealCard());

			 if (i % 4 == 0) // output a newline after every fourth card
			    System.out.println();
	      } 
	   } 
}

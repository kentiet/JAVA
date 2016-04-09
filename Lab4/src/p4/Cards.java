/**
 * 
 */
package p4;

/**
 *<p> Cards application gets the the value of the cards which included 
 *in the enumerate type. This application also get the name 
 *of the cards and add the face value of two hands cards</p>
 *
 * @author KenTiet
 * @version 1.0
 */
public class Cards {
    /**
     * Enumerate value.
     * @author KenTiet
     *
     */
    enum Rank {
        /**
         * twelve values of the enumerate.
         */
        ace, two, three, four, five, six, seven, 
        eight, nine, ten, jack, queen, king }

    /**
     * The main method which drive the program.
     * @param args unused
     */
    public static void main(String[] args) {
        
        //Variable type rank
        Rank highCard; 
        Rank faceCard;
        Rank card1;
        Rank card2;
        
        //Value of card 1
        int card1Val; 
        
        //Value of card 2
        int card2Val;
        
        //Assign the value to the variable
        highCard = Rank.ace;
        faceCard = Rank.jack;
        card1 = Rank.king;
        card2 = Rank.queen;

        //Get the ordinal value of card 1 and card 2
        card1Val = card1.ordinal();
        card2Val = card2.ordinal();
        
        //Print out the result
        System.out.println("A blackjack hand: " + highCard.name() 
                    + " and " + faceCard.name());
        System.out.println();
        System.out.println("A two card hand: " + card1Val + " and " + card2Val);
        System.out.println();
        System.out.println("Hand value: " + (card1Val + card2Val));
    }
}

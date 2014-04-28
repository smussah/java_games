package WarGame_final_class_Project_Sadik_M;

import javax.swing.*;

/**
 * Created by sadik
 * mussah on 4/20/14.
 * final class project
 */
class CardGame {
    private int SuitS;// hold suits

    private int CardS;//hold card #no

    //constructor
    public CardGame(int suit, int card) {
        super( );
        this.SuitS = suit;
        this.CardS = card;

    }

    /**
     *
     * @return cards
     */
    public int getCardS() {
        return CardS;
    }


    public void setCardS(int cardS) {
        this.CardS = cardS;
    }

    @Override
    public String toString( ) {

        StringBuilder result = new StringBuilder( );//String builder for cards and suits
        /**
         * switch between cards
         */
        switch (CardS) {
            case 11 :
                result.append( "Jack" );
                break;
            case 12 :
                result.append( "Queen" );
                break;
            case 13 :
                result.append( "King" );

                break;
            case 14 :
                result.append( "Ace" );

                break;
            default :
                result.append(CardS);
        }
     result.append( " of " );// this line join suits and cards
        /**
         * switch between suits
         */
        switch (SuitS) {
            case 0 :
                result.append( "hearts" );

                break;
            case 1 :
                result.append( "diamonds" );
                break;
            case 2 :
                result.append( "clubs" );
                break;
            case 3 :
                result.append( "spades" );
                break;
        }
        return result.toString( );// this line return string including suits and cards joined by "of"

    }
    public ImageIcon getImage() {
        ImageIcon cardIcon = new ImageIcon("6diamonds.jpg");

        return cardIcon;
    }

}

public class rollDie
{
    // 1) Instance variables
    boolean wantRoll;
    int side;
    int howManyRoll;

    // 2) Constructors
    public rollDie()
    {
        side = 2;
        howManyRoll = 1;
        wantRoll = false;
    } //end default constructor

    public rollDie(boolean newWantRoll, int newSide, int newHowManyRoll)
    {
        wantRoll = newWantRoll;
        howManyRoll = newHowManyRoll;
        side = newSide;
    } //end multi constructor

    // 3) Getters
    public boolean getWantRoll()
    {
        return wantRoll;
    }//end wantRoll getter

    public int getSide()
    {
        return side;
    }//end side getter

    public int getHowManyRoll()
    {
        return howManyRoll;
    }
} //end class rollDie
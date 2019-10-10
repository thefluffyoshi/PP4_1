public class rollDie
{
    // 1) Instance variables
    boolean wantRoll;
    int side;
    int howManyRoll;
    int numRoll;

    // 2) Constructors
    public rollDie()
    {
        side = 2;
        howManyRoll = 1;
        numRoll = 1;
        wantRoll = false;
    } //end default constructor

    public rollDie(boolean newWantRoll, int newSide, int newHowManyRoll, int newNumRoll)
    {
        wantRoll = newWantRoll;
        howManyRoll = newHowManyRoll;
        side = checkSide(newSide);
        numRoll = newNumRoll;
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
    }//end howManyRoll getter

    // 4) Setters
    public void setSide(int newSide)
    {
        side = newSide;
    }//end side setter


    // 5) toString
    public String toString()
    {
        String output = "";
        output += "If rolls are wanted: " + wantRoll;
        output += "\nNumber of rolls: " + howManyRoll;
        output += "\nSide: " + side;
        return output;
    }//end toString

    // 6) Brain Method
    private int checkSide(int newSide)
    {
        int tempSide = newSide;
        if (tempSide > 2)
        {
            tempSide = newSide;
        }//end if
        else if (tempSide < 2)
        {
            tempSide = 3;
        }//end else if
        return tempSide;
    }//end validating that it's actually rollable checkSide
} //end class rollDie

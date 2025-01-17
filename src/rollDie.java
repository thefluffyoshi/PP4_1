import java.lang.Math;
public class rollDie
{
    // 1) Instance variables
    boolean wantRoll;
    int side;
    int howManyRoll;
    double numRoll;


    // 2) Constructors
    public rollDie()
    {
        side = 2;
        howManyRoll = 1;
        numRoll = 1;
        wantRoll = false;
    } //end default constructor

    public rollDie(boolean newWantRoll, int newSide, int newHowManyRoll)
    {
        wantRoll = newWantRoll;
        howManyRoll = newHowManyRoll;
        side = checkSide(newSide);
        //numRoll = newNumRoll;
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

    public void setWantRoll(boolean newWantRoll)
    {
        wantRoll = newWantRoll;
    }

    public void setHowManyRoll(int newHowManyRoll)
    {
        howManyRoll = newHowManyRoll;
    }


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

    private int checkWantRoll()
    {
    }//end validating if they actually want to roll


    // 7) Brain Method
    //output number that die rolled
    
    
} //end class rollDie

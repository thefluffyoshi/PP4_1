public class RollDieDriver
{
    public static void main (String args[])
    {
        // 1. Create dies
        rollDie die1 = new rollDie(true, 1, 2, 3);

        // 2. Print it out
        System.out.println(die1);

        // 3. Test getters
        //System.out.println(die1.getSide());

        // 4. Test setters
        System.out.println("\n" + die1);
        die1.setWantRoll(true);
        die1.setSide(5);
        die1.setHowManyRoll(4);

        // 5. Check methods and properties if applicable
    } //end main
} //end class RollDieDriver

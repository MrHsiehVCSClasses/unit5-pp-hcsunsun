package u5pp;

public class Dice {
    
    //variables for a dice
    private int sides;
    private String diceColor;
    private int currentSide = 1;

    //dice constructors
    public Dice(){
        sides = 6;
        diceColor = "green";
        currentSide = 1;
    }

    public Dice(int numSides){
        sides = numSides;
        diceColor = "green";
        currentSide = 1;
    }

    public Dice(int numSides, int startingSide){
        sides = numSides;
        diceColor = "green";
        this.changeSide(startingSide);
    }

    public Dice(int numSides, int startingSide, String color){
        sides = numSides;
        diceColor = color;
        this.changeSide(startingSide);
    }

    //methods
    public int getSides()
    {
        return sides;
    }

    public int getCurrentSide()
    {
        return currentSide;
    }

    public String getColor()
    {
        return diceColor;
    } 

    public String toString()
    {
        return  "The " + getColor() + " " + getSides() + "-sided dice is showing " + getCurrentSide();
    } 

    public boolean equals(Dice d)
    {
        if (d.getCurrentSide() == this.getCurrentSide())
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    //void funcrtions
    public int roll()
    {
        currentSide = (int)(Math.random() * sides + 1);
        return currentSide;
    }

    public void changeNumSides(int i)
    {
        sides = i;
    }

    public void changeSide(int num)
    {
        if (num >= 1 && num <= sides)
        {
            currentSide = num;
        }
    }

    public void changeColor (String color)
    {
        diceColor = color;
    }
}


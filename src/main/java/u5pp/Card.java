package u5pp;

public class Card
{
    //variables
    private String value = "";
    private String suit = "";

    //constructor
    Card()
    {
        value = "2";
        suit = "clubs";
    }

    Card(String suitInput)
    {
        value = "2";
        changeSuit(suitInput);
    }

    Card(String suitInput, String valueInput)
    {
        changeValue(valueInput);
        changeSuit(suitInput);
    }

    //methods
    public String getValue()
    {
        return value;
    }

    public String getSuit()
    {
        return suit;
    }

    public String toString()
    {
        return "The " + value + " of " + suit;
    }

    public boolean equals(Card c)
    {
        return ( (this.getValue()).equals(c.getValue()) && (this.getSuit()).equals(c.getSuit()));
    }

    //void method
    public void changeSuit(String suitInput)
    {
        String suitEntered = suitInput.toLowerCase();
        if(suitEntered.equals("clubs") || suitEntered.equals("spades") || suitEntered.equals("hearts") || suitEntered.equals("diamonds"))
        {
            suit = suitEntered;
        }
    }

    public void changeValue(String valueInput)
    {
        String valueEntered = valueInput.toLowerCase();
        if(valueEntered.equals("ace") || valueEntered.equals("2") || valueEntered.equals("3") || valueEntered.equals("4") || valueEntered.equals("5") || valueEntered.equals("6") || valueEntered.equals("7") || valueEntered.equals("8") || valueEntered.equals("9") || valueEntered.equals("10") || valueEntered.equals("jack") || valueEntered.equals("queen") || valueEntered.equals("king"))
        {
            value = valueEntered;
        }
    }




}
//(suitEntered.equals("clubs") || suitEntered.equals("spades") ||suitEntered.equals("hearts") ||suitEntered.equals("diamonds"))
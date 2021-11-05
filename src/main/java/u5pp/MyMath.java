package u5pp;

public class MyMath
{
    public static int abs(int x)
    {
        if(x < 0)
        {
            return 0 - x;
        }
        else
        {
            return x;
        }
    }   

    public static double abs(double x)
    {
        if(x < 0)
        {
            return 0 - x;
        }
        else
        {
            return x;
        }
    }   

    public static double pow(double base, int exponent) 
    {
        return Math.pow(base, exponent);
    }

    public static int perfectSqrt(int x)
    {
        int have = -1;
        if(x >= 0)
        {
            for(int i = x; i >= 0; i--)
            {
                if(Math.sqrt(x) == i)
                {
                    have = i;
                    
                }
            }
    
        }
        return have;
    }
}

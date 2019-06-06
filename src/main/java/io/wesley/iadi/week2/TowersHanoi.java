package io.wesley.iadi.week2;

/**
 * @author wesley
 */
public class TowersHanoi
{
    public static void main (String [] args)
    {
        hanoi (3, 1, 2, 3);
    }


    private static void hanoi (int iteratie, int bronPaal, int doelPaal, int c)
    {
        if (iteratie > 0)
        {
            hanoi (iteratie - 1, bronPaal, c, doelPaal);
            System.out.println(iteratie + " schijf van " + bronPaal + " naar " + doelPaal);
            hanoi (iteratie - 1, c, doelPaal, bronPaal);
        }
    }
}

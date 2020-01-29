package JRodriguez.JMath.Basic;

import java.util.Random;

/**
 *
 * @author Michael Rodriguez
 */
public class Functions {
   
    /**
     * Method that round an math expression
     * @param quantity that must be rounded
     * @return a decimal amount rounded
     */
    public static Double RoundtoDouble(double quantity)
    {
        double roundquantity = quantity;

        roundquantity = roundquantity*100; 
        roundquantity = Math.floor(roundquantity);

        if(roundquantity%10 > 5 && roundquantity%10 < 9)
        {
              roundquantity += 1;
        }
        roundquantity = roundquantity/100;

        return roundquantity;
    }
  
    /**
     *  This Method round any amount double to an integer
     * @param quantity
     * @return an integer amount rounded
     */
    public static int RoundtoInt(double quantity)
    {
      return RoundtoDouble(quantity).intValue();
    
    }
    
    public  boolean isNumber(String cadena)
    {
        try 
        {
            Double.parseDouble(cadena.replace(",", ""));
        } 
        catch (NumberFormatException nfe)
        {
            String newCadena = cadena.replace(".", "").replace(',', '.');
            try
            {
                Double.parseDouble(newCadena);
            } 
            catch (NumberFormatException nfe2)
            {
                return false;
            }
        }
        return true;
    }
    
    /**
     *
     * @param aStart : Limite inicial del rango
     * @param aEnd : limite final del rango     
     * @return
     */
    public static int RandomInteger(int aStart, int aEnd ){
         Random random = new Random();
        if (aStart > aEnd) {
            throw new IllegalArgumentException("Start cannot exceed End.");
        }
        //get the range, casting to long to avoid overflow problems
        long range = (long)aEnd - (long)aStart + 1;
        // compute a fraction of the range, 0 <= frac < range
        long fraction = (long)(range * random.nextDouble());
        return (int)(fraction + aStart);    
       
  }
}

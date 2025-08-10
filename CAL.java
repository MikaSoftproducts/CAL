
/**
 * Berechnit mir die Kalorien von produkten weil die es nicht anzeigen genau ohne rechnung
 * 
 * @Mika 
 * @0.1.0
 */
public class CAL
{
    private int limit;
    double[] daily = new double[20];
    double sum;
    
    CAL(int plimit)
    {   
        limit = plimit;
    }
    
    void add(double g,double caloriesper100)
    {
         double penis = rechnung_from_100_to_all(g,caloriesper100);
        
         for(int i=0 ; i<daily.length;i++)
         {
         if(daily[i] == 0)
         {
             daily[i] = penis;
             i=99;
         }
         else{}
        }
       
        if(sumierer() > limit)
        {
            System.out.println("510 Food Overload");
            System.out.println("Limit Für Heute:"+""+limit+"Cal");
            System.out.println("heute Gegessen:"+""+sumierer()+"Cal");
        }
    }
    
    
    void printHowMuchICanEat()
    {
        System.out.println("you Can Still eat:"+""+_How_much_i_can_Eat()+"Cal");
    }
    double _How_much_i_can_Eat()
    {
        double rest = 0;
        rest = limit-sumierer();
        return rest;
    }
    
    double sumierer()
    {  
        for(int i =daily.length-1;i>=0;i--)
        {
            if(i==daily.length-1)
            {
                sum = daily[i];
            }
            else{
                sum = daily[i]+daily[i+1];
            }
            
        }
    
           return sum;
    }
    double rechnung_from_100_to_all(double g,double caloriesper100)
    { double temp;
        temp = (g * caloriesper100)/100;
        return temp;
        
    }
    int getLimit()
    {
        return limit;
    }
    double[] getDaily()
    {
        return daily;
    }
    
}

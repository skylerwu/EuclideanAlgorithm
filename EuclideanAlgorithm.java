
/**
 * Write a description of class EuclideanAlgorithm here.
 * Efficiently finds the Greatest Common Divisor and Least Common Multiple of two positive integers a and b.
 * @author (Skyler Wu)
 * @version (1.0)
 */
import chn.util.*;
public class EuclideanAlgorithm
{
    
    public static void main()
    {
        int a, b, deltaA, deltaB, q, r, gcd, lcm;
        
        ConsoleIO inputs = new ConsoleIO();
        System.out.println("Please think of two positive integers 'a' and 'b'.");
        
        System.out.println("Please input 'a'.");
        a = inputs.readInt();
        
        System.out.println("Please input 'b'.");
        b = inputs.readInt();
        
        deltaA = a;
        deltaB = b;
        
        do
        {
            r = deltaA%deltaB;
            q= (deltaA - r)/deltaB;
            
            if(r==0) 
            {
                gcd = deltaB;
                lcm = a * b/gcd;
                System.out.println("The greatest common divisor of " + a + " and " + b + " is " + gcd + ".");
                System.out.println("The least common multiple of " + a + " and " + b + " is " + lcm + ".");
            } 
            else 
            {
                deltaA = deltaB;
                deltaB = r;
                if (deltaA == deltaB) 
                {
                    gcd = deltaB;
                    lcm = a * b/gcd;
                    System.out.println("The greatest common divisor of " + a + " and " + b + " is " + deltaB + ".");
                    System.out.println("Theleast common multiple of " + a + " and " + b + " is " + lcm + ".");
                }
            }
                
        } 
        while(r!=0);
}
}

    


        
        
        
        
        
    
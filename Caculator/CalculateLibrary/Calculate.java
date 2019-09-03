package CalculateLibrary;

public class Calculate 
{
    public static int square(int input)
    {
    	return (input * input);
    }

    public static int cube(int input)
    {
    	return (input * input * input);
    }

    public static double average(double inputOne, double inputTwo)
    {
    	return ((inputOne + inputTwo) / 2.0);
    }    

    public static double average(double inputOne, double inputTwo, double inputThree)
    {
    	return ((inputOne + inputTwo + inputThree) / 3);
    }

    public static double toDegrees(double input)
    {
    	return (input * (57.2958279088));
    }

    public static double toRadians(double input){
    	return (input * (0.01745327777));
    }

    public static double discriminant(double inputOne, double inputTwo, double inputThree)
    {
    	return ((inputTwo * inputTwo) - (4 * inputOne * inputThree));
    }

    public static String toImproperFrac(int inputOne, int inputTwo, int inputThree) 
    {
    	return (((inputOne * inputThree) + inputTwo) + "/" + inputThree);
    }

    public static String toMixedNum(int inputOne, int inputTwo) 
    {
    	return ((inputOne / inputTwo) + "_" + (inputOne % inputTwo) + "/" + inputTwo);
    }

    public static String foil(int inputOne, int inputTwo, int inputThree, int inputFour, String variable) 
    {
    	return((inputOne * inputThree) + "n^2 + " + ((inputOne * inputFour) + (inputTwo * inputThree)) + "n + " + (inputTwo * inputFour));
    }
    public static boolean isDivisibleBy(int inputOne, int inputTwo) 
    {
    	return((inputOne % inputTwo) == 0);
    }
    
}

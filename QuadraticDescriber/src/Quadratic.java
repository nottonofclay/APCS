/*
Clayton Lau
APCS 3rd Period
 */

public class Quadratic
{
    public static void quadrDescriber(double a, double b, double c)
    {
        //graph description
        System.out.println("\nDescription of the graph of: \n" +
                "y = " + a + "x^2 + " + b + "x + " + c + "\n");
        //opens up or down
        if (a < 0.0)
        {
            System.out.println("Opens: Down");
        }
        else
        {
            System.out.println("Opens: Up");
        }

        //properties of graph
        double axisOfSym = -b / (2.0 * a) + 0.0;
        System.out.println("Axis of Symmetry: " + round2(axisOfSym));
        double axisOfSymY = axisOfSym * axisOfSym * a + b * axisOfSym + c;
        System.out.println("Vertex: (" + round2(axisOfSym) + ", " +
                round2(axisOfSymY) + ")");
        String roots = quadForm(a, b, c);
        if (roots.equals("no real roots"))
        {
            System.out.println("no x-intercepts");
        }
        else
        {
            System.out.println("x-intercepts: " + roots);
        }
        System.out.println("y-intercept: " + c);
    }
    public static boolean notNumber(String checkThis)
    {
        boolean returner = false;
        try
        {
            double test = Double.parseDouble(String.valueOf(checkThis));
        }
        catch(NumberFormatException nfe)
        {
            returner = true;
        }
        return returner;
    }

    public static double round2(double inputOne)
    {
        if (((int) (inputOne * 1000)) %  10 >= 5)
        {
            inputOne += 0.01;
        }
        inputOne = (int) (inputOne * 100);
        return inputOne /= 100;
    }

    public static double sqrt(double squareRoot)
    {
        if (squareRoot < 0)
        {
            throw new IllegalArgumentException("Exponent is negative");
        }
        double originalNum = squareRoot;
        double attempt = squareRoot / 3;
        while (true)
        {
            squareRoot = 0.5 * (originalNum / attempt + attempt);
            if ((squareRoot * squareRoot) - originalNum <= 0.05)
            {
                return round2(squareRoot);
            }
            attempt = squareRoot;
        }
    }

    public static double discriminant(double a, double b, double c)
    {
        return ((b * b) - (4 * a * c));
    }

    public static String quadForm(double a, double b, double c)
    {
        double dis = discriminant(a, b, c);
        if (dis  < 0)
        {
            return ("no real roots");
        }
        double root1 = round2((-b + sqrt(dis)) / 2*a);
        if(dis == 0)
        {
            return root1 + "";
        }
        double root2 = round2(((-b - sqrt(dis)) / 2*a));
        return root1 + " and " + root2;
    }
}

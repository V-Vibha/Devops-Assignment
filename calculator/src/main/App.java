package calculator.src.main;

import java.util.Scanner;

// import javax.lang.model.util.ElementScanner6;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Enter the input:");
        Scanner sc= new Scanner(System.in);
        String eq = sc.nextLine();
        String x =String.valueOf(eq.charAt(0));
        String y = String.valueOf(eq.charAt(2));
        char symb = eq.charAt(1);
        int flag_var;
        int res=0;
        System.out.println("x= "+x+" y= "+y);
        if(Character.isDigit(eq.charAt(0)) && Character.isDigit(eq.charAt(2)))
        {
        switch(symb)
        {
            case '+': res=Integer.parseInt(x)+Integer.parseInt(y);
                        break;
            case '-': res=Integer.parseInt(x)-Integer.parseInt(y);
                        break;
            case '*': res=Integer.parseInt(x)*Integer.parseInt(y);
                        break;
            case '/' : if(Integer.parseInt(y)!=0)
                            res=Integer.parseInt(x)/Integer.parseInt(y);
                        else
                        {
                            System.out.println("Invalid value for y");
                            System.exit(2);
                        }
                        break;
            default : System.out.println("Invalid input");
                      System.exit(1);
        }
        System.out.println(res);
    }
    else
    System.out.println("Invalid input");
    }
}

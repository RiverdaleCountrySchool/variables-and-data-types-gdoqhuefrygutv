public class DoubleDiscount {
    public static void main(String[] args) {
//int = integer, long = long number, double = decimal values, boolean = true or false, char = 16-bit unicode character//
        /*
        + = Addition
        - = Subtraction
        * = Multiplication
        / = Division
        % = Remainder
        () = Grouping (follows PEMDAS)
        FOR EXAMPLE: int numlights = numlightshacket+numlightsmow
         */
        // BOOLEAN OPERATORS: RETURNS "TRUE" VALUE IF
        // a&&b = a and b are true values: and (conjunction)
        // a||b = a or b is true: or (disconjunction)
        // !a = a is false
        /*
        PARSING STRINGSL
        Convert string s to an int, double, long, or booleanL
        Integer.valueOf(s)
        Double.value.Of(s)
        Long.value.Of(s)
        Boolean.value.Of(s)
        Get character number n from string s:
        s.chartAt(n)
         */
       double price=Double.valueOf(args[0]);
       double discount=Double.valueOf(args[1]);
       System.out.println(price*(1-discount));
    }

}
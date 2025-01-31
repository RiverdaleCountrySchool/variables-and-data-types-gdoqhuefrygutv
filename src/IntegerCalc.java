public class IntegerCalc {
    public static void main(String[] args) {
        // Declare variables num1 and num2 and assign them
        // initial values of 11 and 5.
        int num1 = Integer.valueOf(args[0]);
        int num2 = Integer.valueOf(args[1]);
System.out.println(num1+num2);
System.out.println(num1*num2);
System.out.println(num1/num2);
System.out.println(num1%num2);

    }
}

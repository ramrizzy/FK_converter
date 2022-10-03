import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a degree in Fahrenheit: ");
        float temp_f = in.nextFloat();
        System.out.println(temp_f + " degrees Fahrenheit is " + Math.round(((273.15f + ((temp_f - 32.0f) * 5.0f/9.0f)))*100.0)/100.0 + " Kelvin");
    }
}
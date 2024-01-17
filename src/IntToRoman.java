import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Logger;

public class IntToRoman {
    private final static Logger logger=Logger.getLogger(IntToRoman.class.getName());
    private final static TreeMap<Integer, String> romanNumbers=new TreeMap<>();

    static{
    romanNumbers.put(1,"I");
    romanNumbers.put(4,"IV");
    romanNumbers.put(5,"V");
    romanNumbers.put(9,"IX");
    romanNumbers.put(10, "X");
    romanNumbers.put(40, "XL");
    romanNumbers.put(50, "L");
    romanNumbers.put(90, "XC");
    romanNumbers.put(100, "C");
    romanNumbers.put(400, "CD");
    romanNumbers.put(500, "D");
    romanNumbers.put(900, "CM");
    romanNumbers.put(1000, "M");
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        logger.info("Enter the value to convert:");
        String input=scan.nextLine();
        if(input.matches("\\d+")){
            int num=Integer.parseInt(input);
            String roman=integerToRomanNumber(num);
            logger.info(num + " in Roman numerals: " + roman);
        }else{
            int integer = romanToInt(input);
            logger.info(input + " as integer: " + integer);
        }

    }

    private static int romanToInt(String input) {
        return 0;
    }

    private static String integerToRomanNumber(int num) {
        int floorValue=romanNumbers.floorKey(num);
        if(num==floorValue){
            return romanNumbers.get(num);
        }
        return romanNumbers.get(floorValue)+integerToRomanNumber(num-floorValue);
    }
}

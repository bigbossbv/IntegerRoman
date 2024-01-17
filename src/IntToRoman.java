import java.util.Scanner;
import java.util.logging.Logger;

public class IntToRoman {
    private final static Logger logger=Logger.getLogger(IntToRoman.class.getName());
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        logger.info("Enter the value to convert:");
        String input=scan.nextLine();
        if(input.matches("\\d+")){
            int num=Integer.parseInt(input);
            String roman=integerToRomanNumber(num);
            logger.info(num + " in Roman numerals: " + roman);
        }else{
            
        }

    }

    private static String integerToRomanNumber(int num) {
        return null;
    }
}

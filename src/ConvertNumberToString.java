import java.util.Scanner;

public class ConvertNumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Can't Convert");
        } else if (number <= 20) {
            String result = "";
            switch (number) {
                case 0:
                    result = "zero";
                    break;
                case 1:
                    result = "one";
                    break;
                case 2:
                    result = "two";
                    break;
                case 3:
                    result = "three";
                    break;
                case 4:
                    result = "four";
                    break;
                case 5:
                    result = "five";
                    break;
                case 6:
                    result = "six";
                    break;
                case 7:
                    result = "seven";
                    break;
                case 8:
                    result = "eight";
                    break;
                case 9:
                    result = "nine";
                    break;
                case 10:
                    result = "ten";
                    break;
                case 11:
                    result = "eleven";
                    break;
                case 12:
                    result = "twelve";
                    break;
                case 13:
                    result = "thirteen";
                    break;
                case 14:
                    result = "fourteen";
                    break;
                case 15:
                    result = "fifteen";
                    break;
                case 16:
                    result = "sixteen";
                    break;
                case 17:
                    result = "seventeen";
                    break;
                case 18:
                    result = "eighteen";
                    break;
                case 19:
                    result = "nineteen";
                    break;
                case 20:
                    result = "twenty";
                    break;
            }
            System.out.println(result);
        } else if (number < 100) {
            int ones = number % 10;
            int tens = number - ones;
            String result = "";
            switch (tens) {
                case 2:
                    result += "twenty";
                    break;
                case 3:
                    result += "thirty";
                    break;
                case 4:
                    result += "fourty";
                    break;
                case 5:
                    result += "fifty";
                    break;
                case 6:
                    result += "sixty";
                    break;
                case 7:
                    result += "seventy";
                    break;
                case 8:
                    result += "eighty";
                    break;
                case 9:
                    result += "ninety";
                    break;
            }
            switch (ones) {
                case 1:
                    result += " one";
                    break;
                case 2:
                    result += " two";
                    break;
                case 3:
                    result += " three";
                    break;
                case 4:
                    result += " four";
                    break;
                case 5:
                    result += " five";
                    break;
                case 6:
                    result += " six";
                    break;
                case 7:
                    result += " seven";
                    break;
                case 8:
                    result += " eight";
                    break;
                case 9:
                    result += " nine";
                    break;
            }
            System.out.println(result);
        } else if (number < 1000) {
            int ones = number % 10;
            int tens = (number - ones) % 10;
            int hundreds = (number - tens*10 - ones) / 100;
            String result = "";
            switch (hundreds){
                case 1:
                    result += "one";
                    break;
                case 2:
                    result += "two";
                    break;
                case 3:
                    result += "three";
                    break;
                case 4:
                    result += "four";
                    break;
                case 5:
                    result += "five";
                    break;
                case 6:
                    result += "six";
                    break;
                case 7:
                    result += "seven";
                    break;
                case 8:
                    result += "eight";
                    break;
                case 9:
                    result += "nine";
                    break;
            }
            result += " hundred";
            switch (tens){
                case 1:
                    switch (ones){
                        case 0:
                            result += " ten";
                            break;
                        case 1:
                            result += " eleven";
                            break;
                        case 2:
                            result += " twelve";
                            break;
                        case 3:
                            result += " thirteen";
                            break;
                        case 4:
                            result += " fourteen";
                            break;
                        case 5:
                            result += " fifteen";
                            break;
                        case 6:
                            result += " sixteen";
                            break;
                        case 7:
                            result += " seventeen";
                            break;
                        case 8:
                            result += " eighteen";
                            break;
                        case 9:
                            result += " nineteen";
                            break;
                    }
                case 2:
                    result += "twenty";
                    break;
                case 3:
                    result += "thirty";
                    break;
                case 4:
                    result += "fourty";
                    break;
                case 5:
                    result += "fifty";
                    break;
                case 6:
                    result += "sixty";
                    break;
                case 7:
                    result += "seventy";
                    break;
                case 8:
                    result += "eighty";
                    break;
                case 9:
                    result += "ninety";
                    break;
            }
            switch (ones){
                case 1:
                    result += " one";
                    break;
                case 2:
                    result += " two";
                    break;
                case 3:
                    result += " three";
                    break;
                case 4:
                    result += " four";
                    break;
                case 5:
                    result += " five";
                    break;
                case 6:
                    result += " six";
                    break;
                case 7:
                    result += " seven";
                    break;
                case 8:
                    result += " eight";
                    break;
                case 9:
                    result += " nine";
                    break;
            }
            System.out.println(result);
        }
    }
}

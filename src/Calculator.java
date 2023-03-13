import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in); //ввод данных пользователем

        System.out.println(calc(input.nextLine())); //выводим результат на экран

    }

    public static String calc(String input) throws Exception {


        String[] blocks = input.split(" "); //разбиваем введеную строку на 3 блока (массива) строк: 1-е число, опратор, 2-е число


        if (blocks.length != 3) {
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        char operator = blocks[1].charAt(0); //блок(массив) содержащий оператор, преобразуем в char
        String a = blocks[0];
        String b = blocks[2];


        if (RomanNumeral.isRomanCheck(a, b)) {
            return RomanNumeral.romanSolution(RomanNumeral.calculatedRoman(a, b, operator)); //результат для римских чисел
        }


        return Integer.toString(ArabianNumeral.calculatedArabian(a, b, operator)); //результат для арабских чисел


    }

}




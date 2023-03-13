import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class RomanNumeral {
    public static String romanSolution(int arabNumeral) {
        //метод для конвертации ответа из арабского счисления, в римское ("0" мы прописываем в массивеб для того что бы счет работал правильно)

        String[] romanAnswer = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV",
                "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV",
                "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV",
                "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII",
                "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String s = romanAnswer[arabNumeral];
        return s;
    }

    public static int romanToArabic(String roman) throws Exception{
        //метод для конвертации введеных чисел из римского счисления, в арабское

        return switch (roman) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> throw new Exception("Калькулятор может принимать на вход только числа от 1 до 10 включительно!") ;
        };
    }

    public static int calculatedRoman(String a, String b, char operator) throws Exception {

        int num1 = romanToArabic(a);
        int num2 = romanToArabic(b);

        int resultDecimal = switch (operator) {
            case '+' -> num1 + num2; //прописываем сложение

            case '-' -> num1 - num2; //прописываем вычитание

            case '*' -> num1 * num2; //прописываем умножение

            case '/' -> num1 / num2; //прописываем деление
            default -> throw new Exception("Неверный знак операции!");

        };

        if (resultDecimal <= 0) {
            throw new Exception("Результатом работы калькулятора с римскими числами могут быть только положительные числа!");
        }

        return resultDecimal;
    }

    public static boolean isRomanCheck(String a, String b) throws Exception {
        //метод для проверки, являются ли вводимые числа римскими

        List<String> romanInput = new ArrayList<>();
        Collections.addAll(romanInput, "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV",
                "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV",
                "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV",
                "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII",
                "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C");

        boolean isRoman = false;
        boolean isRomanA = false;
        boolean isRomanB = false;

        if (romanInput.contains(a)) {
            isRomanA = true;
        }
        if (romanInput.contains(b)) {

            isRomanB = true;
        }
        if (isRomanA & isRomanB) {
            isRoman = true;
        } else if ((!isRomanA & isRomanB) | (isRomanA & !isRomanB)) {
            throw new Exception("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно!");

        }
        return isRoman;
    }
}

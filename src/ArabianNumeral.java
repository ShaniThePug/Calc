class ArabianNumeral {

    public static int calculatedArabian(String a, String b, char operator) throws Exception {

        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        if (num1 > 10 || num1 < 1 || num2 > 10 || num2 < 1) {
            throw new Exception("Калькулятор может принимать на вход только числа от 1 до 10 включительно!");
        }

        int resultDecimal = switch (operator) {
            case '+' -> num1 + num2; //прописываем сложение

            case '-' -> num1 - num2; //прописываем вычитание

            case '*' -> num1 * num2; //прописываем умножение

            case '/' -> num1 / num2; //прописываем деление
            default -> throw new Exception("Неверный знак операции!");

        };
        return resultDecimal;
    }
}

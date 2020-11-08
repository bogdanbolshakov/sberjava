package ru.sber;

public class SimpleOperations {
    /**
     * Возвращает сумму двух чисел (byte + short)
     *
     * @param _byte  byte
     * @param _short short
     * @return byte
     */
    private static byte sum(byte _byte, short _short) {
        return (byte) (_byte + _short);
    }

    /**
     * Возвращает произведение двух чисел (int * long)
     *
     * @param _int  int
     * @param _long long
     * @return int
     */
    private static int composition(int _int, long _long) {
        return (int) (_int * _long);
    }

    /**
     * Возвращает максимальное число из двух чисел
     *
     * @param a int
     * @param b int
     * @return int
     */
    private static int getMaxNumber(int a, int b) {
        return a > b ? a : b;
    }

    /**
     * Возвращает true, если символ 'A', иначе false
     *
     * @param c char
     * @return bool
     */
    private static boolean isCharA(char c) {
        return c == 'A';
    }

    /**
     * Возвращает true, если символ - цифра, иначе false
     *
     * @param c char
     * @return bool
     */
    private static boolean isCharNumber(char c) {
        return Character.isDigit(c);
    }

    /**
     * Метод выводит в консоль бинарное представление чисел от 0 до 30 включительно
     */
    private static void showBinaryRepresentation() {
        int i = 0;
        while (i <= 30) System.out.println(Integer.toBinaryString(i++));
    }

    /**
     * Метод выводит в консоль числа Integer.MAX_VALUE и Integer.MAX_VALUE + 1
     * в бинарном представлении
     */
    private static void integerMaxValuePlusOne() {
        System.out.printf("%s\n%s%n",
                Integer.toBinaryString(Integer.MAX_VALUE),
                Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }

    /**
     * +
     * Метод возвращает числовое представление символа
     *
     * @param c char
     * @return int c
     */
    private static int charToInt(char c) {
        return c;
    }

    /**
     * Метод возвращает символьное представление числа
     *
     * @param a int
     * @return char a
     */
    private static char intToChar(int a) {
        return (char) a;
    }
}

package ru.netology.homework6.sqr;

public class SQRService {
    public static int calculSqr(int firstValue, int lastValue) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= firstValue) {
                if (i * i <= lastValue) {
                    counter = counter + 1;
                }
            }
        }
        System.out.println("Количество квадратов попадающих в диапазон " + "от " + firstValue + " до " + lastValue + " = "   +  counter);
        return counter;
    }
}


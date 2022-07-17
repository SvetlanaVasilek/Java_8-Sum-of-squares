package ru.netology.homework6.sqr;

public class SQRService {
    public static int calculSqr(int firstValue, int lastValue) {
        int quantityIncludedInTheNumber = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= firstValue) {
                if (i * i <= lastValue) {
                    quantityIncludedInTheNumber = quantityIncludedInTheNumber + 1;
                }
            }
        }
        System.out.println("Количество квадратов попадающих в диапазон " + "от " + firstValue + " до " + lastValue + " = "   +  quantityIncludedInTheNumber);
        return quantityIncludedInTheNumber;
    }
}


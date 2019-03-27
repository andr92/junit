package com.example;

import java.util.Scanner;
import java.util.Arrays;

public class Sorting {

    public int[] sorting(int[] arr) {
        int i = 0;                              //начинаем Gnome sorting
        while (i < arr.length) {                  //пока в границах массива
            if (i == 0) {                          //начинаем со 2 элемента
                i = 1;
            }
            if (arr[i - 1] <= arr[i]) {                 //сравниваем первый и второй эл-ты
                i++;                            //если порядок нормальный то идем вправо
            } else {                              //иначе меняем местами и идем влево
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                i--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Sorting arr = new Sorting();
        Scanner type = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = type.nextInt();
        int m[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int j = 0; j < size; j++) {
            m[j] = type.nextInt();
        }
        System.out.print("Массив отсортирован:" + Arrays.toString(arr.sorting(m)));

    }
}
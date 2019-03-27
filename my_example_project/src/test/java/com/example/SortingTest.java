package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortingTest {
    Sorting var;

    @Before
    public void start() {
        var = new Sorting();
    }

    /*
     * Сортировка обычного массива. Подаем min/max of int
     */
    @Test
    public void testSortingRandom() {
        int[] array = {2147483647, -2147483648, 0, 1};
        int[] act = var.sorting(array);
        int[] exp = {-2147483648, 0, 1, 2147483647};
        Assert.assertArrayEquals(act, exp);
    }

    /*
     * Проверка пустого массива
     */
    @Test
    public void testSortingEmpty() {
        int[] array = {};
        int[] act = var.sorting(array);
        int[] exp = {};
        Assert.assertArrayEquals(act, exp);
    }

    /*
     * Проверка отсортированного массива
     */
    @Test
    public void testSortingSorted() {
        int[] array = {1, 2, 3};
        int[] act = var.sorting(array);
        int[] exp = {1, 2, 3};
        Assert.assertArrayEquals(act, exp);
    }

    /*
     * Подадим массив неверного размера. Пусть нужный размер = 2
     */
    @Test
    public void testSortingWrongLength() {
        int[] array = {1, 2, 3};
        int[] act = var.sorting(array);
        int[] exp = {1, 2};
        MatcherAssert.assertThat("Неверный размер массива", act.equals(exp));
    }

    /*
     * Проверка массива одинаковых символов
     */
    @Test
    public void testSortingSameElements() {
        int[] array = {0, 0, 0};
        int[] act = var.sorting(array);
        int[] exp = {0, 0, 0};
        Assert.assertArrayEquals(act, exp);
    }
}
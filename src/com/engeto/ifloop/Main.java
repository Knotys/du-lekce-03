package com.engeto.ifloop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    //region Demo
    /**
     * Ukázka použítí metody {@link Support#safeReadInt()}
     *
     * Tato metoda použije metodu {@link Support#safeReadInt() k načtení
     * jednoho čísla od uživatele a vypsání tohoto čísla na výstup.
     *
     * Podobně můžeš používat metodu {@link Support#safeReadInt()}
     * i v dalších metodách.
     */
    public static void readOneIntFromInputAndPrintIt() {
        int input = Support.safeReadInt();
        System.out.println("You entered: "+input);
    }
    //endregion

    //region Úlohy na cykly
    /** Úkol 1
     * Čte čísla, která zadává uživatel a vypisuje je na výstup.
     * Metoda pokračuje ve čtení opakovaně tak dlouho, dokud uživatel zadává kladná čísla či nulu.
     * 
     * Jakmile uživatel zadá záporné číslo, metoda skončí.
     */
    public static void readIntsFromInputAndPrintItUntilNegative() {
        int input = Support.safeReadInt();
        while (input > 0) {
            System.out.println("Číslo je kladné: "+input);
            input = Support.safeReadInt();
        }
    }

    /** Úkol 2
     * Čte čísla ze vstupu tak dlouho, dokud uživatel nezadá záporné číslo.
     * Jako návratovou hodnotu vrátí součet zadaných čísel (záporné číslo by nemělo být zahrnuto).
     * 
     * @return Součet všech zadaných čísel (záporné číslo ukončující vstup není zahrnuto).
     */
    public static int sumAllInputUntilNegative() {
        int input = Support.safeReadInt();
        int sum = 0;
        while (input > 0) {
            sum += input;
            System.out.println("Číslo je kladné: "+input);
            System.out.println("Součet: "+sum);
            input = Support.safeReadInt();
        }
        return sum;
    }

    /** Úkol 3
     * Čte čísla ze vstupu tak dlouho, dokud uživatel nezadá záporné číslo.
     * Všechna načtená čísla uloží do listu, který vrátí jako návratovou hodnotu.
     * 
     * @return List načtených hodnot (záporná hodnota není zahrnuta v listu)
     */
    public static List<Integer> storeAllInputInArrayListUntilNegative() {
        List<Integer> results = new ArrayList<>();
        int input = Support.safeReadInt();
        while (input > 0) {
            results.add(input);
            input = Support.safeReadInt();
        }
        return results;
    }

    /** Úkol 4
     * Dostane jako parametr list čísel. Vypíše čísla na obrazovku. Každé číslo vypiš na samostatný řádek.
     * @param list List čísel, která se mají vypsat.
     */
    public static void printAllIntegersFromList(List<Integer> list) {
        List<Integer> number = new ArrayList<>();
        int input = Support.safeReadInt();
        while (input > 0) {
            number.add(input);
            input = Support.safeReadInt();

        }
        System.out.println(number);
    }

    /** Úkol 5
     * Sečte hodnoty z listu a vrátí výsledek jako návratovou hodnotu.
     * @param list List čísel, která chceme sečíst.
     * @return Součet všech čísel v listu.
     */
    public static Integer sumAllIntegersFromList(List<Integer> list) {
        List<Integer> numbers = new ArrayList<>();
        int input = Support.safeReadInt();
        int sum = 0;
        while (input > 0) {
            numbers.add(input);
            sum += input;
            input = Support.safeReadInt();
        }
        return sum;
    }
    //endregion

    //region Podmínky
    /** Úkol 6
     * Vypíše čísla ze seznamu, která jsou menší než zadaný limit.
     * @param list Seznam čísel, která máme zkontrolovat.
     * @param limit Limit - vypsána budou pouze čísla z listu, která jsou menší než limit
     */
    public static void printIntegersUnderLimit(List<Integer> list, int limit) {
        List<Integer> listOfNumbers = new ArrayList<>();
        int input = Support.safeReadInt();
        limit = 5;
        while (input > 0) {
            listOfNumbers.add(input);
            input = Support.safeReadInt();
//            if (input < limit && input > 0) {
//                System.out.println(listOfNumbers);
//            }
        }
        for (int n : listOfNumbers) {
            if (n < limit) {
                System.out.println(n);
            }
        }

    }

    /** Úkol 7
     * Vypíše čísla ze zadaného listu.
     * Při výpisu ale nahradí:
     * - číslo 1 slovem "one", 
     * - číslo 2 slovem "two", 
     * - číslo 3 slovem "three"
     * Ostatní čísla vypíše jako číselnou hodnotu.
     * Například pokud dostane jako parametr seznam [5, 3, 1, 48, 2], 
     * vypíše: 5, three, one, 48, two. 
     * @param list Seznam čísel, která se mají vypsat.
     */
    public static void printIntegersWithReplace(List<Integer> list) {
        List<String> results = new ArrayList<>();
        int input = Support.safeReadInt();
        String one = "one";
        String two = "two";
        String three = "three";
        while (input > 0) {
            if (input == 1) {
                results.add(one);
            } else if (input == 2) {
                results.add(two);
            } else if (input == 3) {
                results.add(three);
            } else {
                results.add(String.valueOf(input));
                input = Support.safeReadInt();
            }
        }
        System.out.println(results);
    }
    //endregion

    public static void main(String[] args) {
        // Příklad:
        System.out.println("--- Example - read and print one integer ---");
        readOneIntFromInputAndPrintIt();
        // ---
        System.out.println("--- Task 1 - read and print integers until negative ---");
        readIntsFromInputAndPrintItUntilNegative();
        // ---
        System.out.println("--- Task 2 - sum all integers until negative ---");
        System.out.println("Total sum: " + sumAllInputUntilNegative());
        // ---
        System.out.println("--- Task 3 - read integers to list until negative ---");
        List<Integer> list = storeAllInputInArrayListUntilNegative();
        System.out.println(list);
        // ---
        System.out.println("--- Task 4 - print all integers from list ---");
        printAllIntegersFromList(list);
        // ---
        System.out.println("--- Task 5 - sum all integers in list ---");
        System.out.println("Total sum: " + sumAllIntegersFromList(list));
        // ---
        System.out.println("--- Task 6 - print integers under 5 from list ---");
        printIntegersUnderLimit(list, 5);
        // ---
        System.out.println("--- Task 7 - print integers - replace: 1 => \"one\", 2 => \"two\", 3 => \"three\" ---");
        printIntegersWithReplace(list);
    }
}

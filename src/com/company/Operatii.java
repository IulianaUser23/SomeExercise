package com.company;

import java.util.*;

/**
 * Created by iulianafestila on 7/30/2018.
 */
public class Operatii {
//Given two numbers, see which one is the greatest and print it

    public int compareNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else return secondNumber;
    }

    // Given a text input, if it is “Evozon”, then print “Learning text comparison”. If not, print
//“Got to try some more”
    public String containText(String text) {
        if (text.equals("Evozon")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    //Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number

    public int equalsTo(int number) {
        if (number >= 2 && number <= 8) {
            return number;
        } else {
            return 0;
        }
    }

    //Given a text input and a number input, if the text is equal to “Evozon” AND the number is equal to or lower than
    // 3, print the text and the number. If the text is not “Evozon” AND    the number is equal to or higher than 4,
    // print the number and the text, in this order.

    public String numberAndText(int myNumber, String myText) {
        if (myText.equals("Evozon") && myNumber <= 3) {
            return myText + myNumber;
        } else if (!myText.equals("Evozon") && myNumber >= 4) {
            return myNumber + myText;
        }
        return "Not Valid";
    }


    //  4.Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. Also compute and
    // display the average

    public String average() {
        int sum = 0;
        double average = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
            System.out.println(sum);
        }
        //  System.out.println("The sum is: " + sum);

        average = sum / 100d;
        return ("The average is: " + average);
    }

    // 1.Modify previous ex 4. to use “while-do” loop instead of “for” loop
    public String averageWhile() {
        int sum = 0;
        double average = 0;
        int i = 1;

        while (i <= 100) {
            sum += i;
            i++;
            System.out.println(sum);
        }

        average = sum / 100d;
        System.out.println("The average is: " + average);
        return ("The average is: " + average);

    }

    //2.Modify the program to use a "do-while" loop.

    public String averageDoWhile() {
        int sum = 0;
        double average = 0;
        int i = 1;

        do {
            sum += i;
            i++;
            System.out.println(sum);
        } while (i <= 100);

        average = sum / 100d;
        System.out.println("The average is: " + average);
        return ("The average is: " + average);
    }

//3.Modify the program to sum from 111 to 8899, and compute the average. Introduce an int variable called count 
    //  to count the numbers in the specified range.

    public String averageWithCount() {
        int sum = 0;
        double average = 0;
        int i = 111;
        int count = 0;

        while (i <= 8899) {
            sum += i;
            i++;
            System.out.println(sum);
            count += 1;
        }

        average = sum / count;
        System.out.println("The average is: " + average);
        System.out.println("Counting: " + count);
        return ("The count is: " + count);
    }

    // 4.Write a program to sum only the odd numbers from 1 to 100, and compute the average.
    public String averageWithOdd() {

        int sum = 0;
        int i = 1;
        double average = 0;
        double counter = 0;

        while (i <= 100) {
            if (i % 2 != 0) {
                sum += i;
                average += 1;
                System.out.println(i);
            }
            i++;
        }
        average = sum / average;
        System.out.println("Counting: " + counter);
        System.out.println("The average is: " + average);
        return ("The average is: " + average);
    }
// 5.Write a program to sum those numbers from 1 to 100 that is divisible by 7, and compute the average.

    public String averageDivisible() {
        int i = 1;
        int sum = 0;
        double average = 0;
        int counter = 0;

        while (i <= 100) {
            if (i % 7 == 0) {
                sum += i;
                counter += 1;
                System.out.println(i);
            }
            i++;
        }

        average = sum / counter;
        System.out.println("Average is: " + average);
        return ("Average is: " + average);
    }

    // 1.Define and write the values of an array indices, so that the values of the arrays should start
//   from 1 and count to 100; Print the progress in the console;
    public void array() {
        int[] myArray = new int[100];
        for (int i = 1; i <= myArray.length; i++){
            System.out.println(i);
        }

    }

    //2. Write a Java program to calculate the average value of array elements.
    public void calculateAverageInArray() {
        int sum = 0;
        double average = 0;
        double counter = 0;

        int[] myArray = new int[100];
        //int[] myArray = {1, 21, 7, 9, 11, 5, 12, 24, 15, 17};

        for (int i = 1; i <= myArray.length; i++) {
            sum += i;
            counter += 1;
        }

        average = sum / counter;
        System.out.println("Average:" + average);
        System.out.println("The average is: " + average);
    }

    // 3.Write a Java program to test if an array contains a specific value.
    public boolean arrayHasValue(int nr) {
        int[] myArray = {1, 21, 7, 9, 11, 5, 12, 24, 15, 17};

        for (int i : myArray) {
            if (nr == i) {
                return true;
            }
        }
        return false;
    }

    // 4.Write a Java program to find the index of an array element.
    public void arrayHasIndex(int nr) {

        int[] myArray = {1, 21, 7, 9, 11, 5, 12, 24, 15, 17};

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] == nr) {
                System.out.println(i);
            }
        }
    }

    // 5.Write a Java program to remove a specific element from an array.

    public void removeElemFromArray(int elem) {
        int[] initialArray = {1, 2, 5, 12, 7, 3, 22, 54, 12, 62, 21, 8};
        int[] newArray = null;

        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] == elem) {
                newArray = new int[initialArray.length - 1];
                for (int index = 0; index < i; index++) {
                    newArray[index] = initialArray[index];
                }
                for (int j = i; j < initialArray.length - 1; j++) {
                    newArray[j] = initialArray[j + 1];
                }
                break;
            }
        }
        System.out.println("Elements after deletion: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(" " + newArray[i]);
        }
    }

    // 6.Write a Java program to find the second smallest element in an array.

    public void findSecondMinValue() {
        int[] myArray = {1, 21, 7, 9, 11, 5, 12, 24, 15, 17};
        int min = 100;
        int secondMin = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                secondMin = min;
                min = myArray[i];
            }
            if (myArray[i] < secondMin && myArray[i] != min) {
                secondMin = myArray[i];
            }
        }
        System.out.println("Second minimum value is: " + secondMin);
    }


    //1.Given a list of numbers, check which one is the highest and print it.
    public void listMax() {
        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(2);
        myList.add(8);
        myList.add(12);
        myList.add(7);
        myList.add(17);
        myList.add(32);
        myList.add(24);
        myList.add(21);
        myList.add(11);

        int max = myList.get(0);

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) > max) {
                max = myList.get(i);
            }
        }
        System.out.println("The maximum value is: " + max);
    }

// 2.Given a list of numbers, determine all of the even ones
    public void listEvenNumbers() {

            List<Integer> myList = new ArrayList<>();

            myList.add(1);
            myList.add(3);
            myList.add(6);
            myList.add(10);
            myList.add(13);
            myList.add(18);
            myList.add(21);
            myList.add(26);
            myList.add(29);
            myList.add(4);

            for (int i = 0; i < myList.size(); i++) {
                if (myList.get(i) % 2 == 0) {
                    System.out.println(myList.get(i));
                }
            }
        }
// 3.Write a Java program to iterate through all elements in a loop starting at the specified position
    public void iterateListFromPosition(int nr) {

            List<Integer> myList = new ArrayList<>();

            myList.add(2);
            myList.add(5);
            myList.add(8);
            myList.add(12);
            myList.add(17);
            myList.add(21);
            myList.add(32);
            myList.add(41);
            myList.add(39);
            myList.add(72);

            for (int i = nr; i < myList.size(); i++) {
                System.out.println(myList.get(i));
            }
    }

// 4.Write a Java program to sort an array or a list

    public void sortList() {
        List<Integer> numbers = Arrays.asList(6, 12, 83, 26, 5, 7, 22, 2, 1, 4, 9);
        System.out.println(numbers);

        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);
    }



    //return (Comparator<T> & Serializable)
    //    (c1, c2) -> keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));



//10. Sa se calculeze factorialul unui numar a . factorialul este definit asa: factorial  = 1*2*3*4….*a
//de ex pentru a = 4, factorialul este 1*2*3*4
    public static int factorial(int numar) {
        int fact = 1;
        for (int i = 1; i <= numar; i++) {
            fact = i * fact;
        }return fact;
    }

    public static void printMeniu() {
        System.out.println("1. Citire date");
        System.out.println("2. Afisare rezultate");
        System.out.println("x. Iesire");
    }

//   2. Se da un numar a. Se se afiseze numarul invers de ex int a = 476, se va obtine  int invers =674

    public void nrOnReverse(int number) {
        
    }

//3. Se da un numar a. Sa se determine daca numarul este palindrom ori nu.
//Un numar este palindrom dca este egal cu numarul inversat de ex int a = 12344321 este palindrom

        public static int testPalindrom(List<Integer> sir) {
        boolean switchTest = true;
        int i = 0;
        while (switchTest != false && (i != sir.size() / 2)) {
            for (i = 0; i < sir.size() / 2; i++) {
                if (sir.get(i) == sir.get(sir.size() - 1 - i)) {
                } else {
                    switchTest = false;
                }
            }
        }
        if (switchTest == true) {
            System.out.println("Lista este palindrom!");
        } else {
            System.out.println("Lista NU este palindrom!");

        }
        return 0;
    }


}



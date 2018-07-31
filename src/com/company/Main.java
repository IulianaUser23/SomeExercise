package com.company;

//import static com.company.Main.adunare;

;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Operatii op = new Operatii();


        //        System.out.println("Enter first number: ");
//        int first = scan.nextInt();
//        System.out.println("Enter second number: ");
//        int second = scan.nextInt();

//        Calcule calculator = new Calcule();
//        // calculator.adunare(3,4);
//        System.out.println("Rezultatul adunarii este: " + calculator.adunare(3, 4));
//        System.out.println("Rezultatul scaderii este: " + calculator.scadere(7, 4));
//        System.out.println("Rezultatul inmultirii este: " + calculator.inmultire(7, 4));
//        System.out.println("Rezultatul impartirii este: " + calculator.impartire(7, 4));
//        System.out.println("Restul impartirii este: " + calculator.modulo(7, 4));
//        System.out.println("Ridicare la putere este: " + calculator.ridicareLaPutere(3, 3));
//        System.out.println("Radicalul este: " + calculator.radical(16));

        //Given two numbers, see which one is the greatest and print it

//        Operatii op = new Operatii();
//        System.out.println("Maximum number is: " + op.compareNumbers(first, second));

/*Given a number input, if it is higher than 8 OR equal to 6, print “The amount of snow this winter was(cm):” and
the given number. Else print “The forecast snow is(cm):”*/

//        System.out.println("Enter a number: ");
//        int meteoNumber = scan.nextInt();
//        if (meteoNumber > 8 || meteoNumber == 6) {
//            System.out.println("The amount of snow this winter was(cm): " + meteoNumber);
//        } else {
//            System.out.println("The forecast snow is(cm): " + meteoNumber);
//        }

/* Given a number input, if the number is greater than 3 but not equal to 4, print “The number is greater than 3 and
not equal to 4”. Else if the number is equal to 4 print ”The number is equal to 4”. Else if the number is
lower than 3 print “The number is lower than 3”*/

//        System.out.println("Enter a number: ");
//        int number1 = scan.nextInt();
//
//        if (number1 == 4) {
//            System.out.println("The number is equal to 4");
//        } else if (number1 < 3) {
//            System.out.println("The number is lower than 3");
//        } else System.out.println("The number is greater than 3 and not equal to 4");


        //If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed, otherwise,
        // program will show "Not allowed”. (use a switch case for this)

//        System.out.println("Enter a number from 0 to 9");
//        int number = scan.nextInt();
//
//                String numar;
//                switch (number) {
//                    case 0: numar = "Numarul introdus este: 0";
//                        break;
//                    case 1:  numar = "Numarul introdus este: 1";
//                        break;
//                    case 2:  numar = "Numarul introdus este: 2";
//                        break;
//                    case 3:  numar = "Numarul introdus este: 3";
//                        break;
//                    case 4:  numar = "Numarul introdus este: 4";
//                        break;
//                    case 5:  numar = "5";
//                        break;
//                    case 6:  numar = "6";
//                        break;
//                    case 7:  numar = "7";
//                        break;
//                    case 8:  numar = "8";
//                        break;
//                    case 9:  numar = "9";
//                        break;
//
//                    default: numar = "Invalid number";
//                        break;
//                }
//                System.out.println(numar);

        //Write a Java program to determine whether an input number is an even number (even = par)

//        System.out.println("Enter a number: ");
//        int number = scan.nextInt();
//        if ((number % 2) == 0){
//            System.out.println("Numarul este par");
//        }
//        else{ System.out.println("Numarul este impar");
//        }

        //Write Java program to allow the user to input his/her age. Then the program will show if the person is
        // eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old.

//        System.out.println("Enter your age: ");
//        int number = scan.nextInt();
//        if (number >= 18) {
//            System.out.println("You are alowed to vote");
//        } else {
//            System.out.println("You are not allowed to vote");
//        }


        //1.Given a number, while the number is equal to or lower than 100, print the number;
//        System.out.println("Enter a number ");
//        int number = scan.nextInt();
//        if (number <= 100){
//            System.out.println("Number is:" + number);
//        } else {
//            System.out.println("Number is greater than 100");
//        }

        //2.Write a java program to count backwards from a given number to a lower given number

//        System.out.println("Enter first number: ");
//        int first = scan.nextInt();
//        System.out.println("Enter second number: ");
//        int second = scan.nextInt();
//        for (int i=first; i>=second; i--){
//            System.out.println(i);
//        }

//        3.Write a Java program by using two for loops to produce the output shown below:
//        *******
//        ******
//        *****
//        ****
//        ***
//        **
//        *
//
//        int i, j;
//        for (i = 7; i >= 1; i--) {
//            for (j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();


//  4.Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100.
// Also compute and display the average

        //op.average();

//1.Modify previous ex 4. to use “while-do” loop instead of “for” loop
        // op.averageWhile();


//2.Modify the program to use a "do-while" loop.

        // op.averageDoWhile();

//3.Modify the program to sum from 111 to 8899, and compute the average. Introduce an int variable called count 
        //  to count the numbers in the specified range.

        // op.averageWithCount();


// 4.Write a program to sum only the odd numbers from 1 to 100, and compute the average.
        //  op.averageWithOdd();

// 5.Write a program to sum those numbers from 1 to 100 that is divisible by 7, and compute the average.

        //op.averageDivisible();

// 6.Write the program do display the first 20 Fibonacci numbers

//        int n1=0, n2=1, n3, i, count=20;
//        System.out.print(n1 + " " + n2);//printing 0 and 1
//
//        for(i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
//        {
//            n3 = n1 + n2;
//            System.out.print(" " + n3);
//            n1 = n2;
//            n2 = n3;
//        }


//7.Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line.
//The program shall print "Coza" in place of the numbers which are multiples of 3,
//"Loza" for multiples of 5,
//"Woza" for multiples of 7,
//"CozaLoza" for multiples of 3 and 5, and so on.
//The output shall look like: 1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11  Coza 13
//Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22  23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza ......
//
//        int max = 110;
//        for (int i=1; i<=max; i++)
//        {
//            if (i%3==0)
//                System.out.print(" Coza ");
//            else if (i%5==0)
//                System.out.print (" Loza ");
//            else if (i%7==0)
//                System.out.print(" Woza ");
//            else if (i%3!=0 || i%5!=0 || i%7!=0)
//                System.out.print(" " + i + " ");
//            if(i%11==0)
//                System.out.println(" ");
//        }


// 1.Define and write the values of an array indices, so that the values of the arrays should start
//   from 1 and count to 100; Print the progress in the console;
        // op.array();


//  2.Write a Java program to calculate the average value of array elements.
        //op.calculateAverageInArray();

// 3.Write a Java program to test if an array contains a specific value.
        //System.out.println(op.arrayHasValue(12));

// 4.Write a Java program to find the index of an array element.
        // op.arrayHasIndex(15);

// 5.Write a Java program to remove a specific element from an array.

        //  op.removeElemFromArray(22);


// 6.Write a Java program to find the second smallest element in an array.
        // op.findSecondMinValue();


// 1.Given a list of numbers, check which one is the highest and print it.
        // op.listMax();

// 2.Given a list of numbers, determine all of the even ones
        //op.listEvenNumbers();

// 3.Write a Java program to iterate through all elements in a loop starting at the specified position
        //  op.iterateListFromPosition(5);

// 4.Write a Java program to sort an array or a list
        //  op.sortList();


/*
1. Se da un numar natural a, de exemplu int a = 64321
a) Sa se calculeze suma cifrelor numarului cat si produsul lor de ex pentru numarul de mai sus vom avea
suma = 6+4+3+2+1 produsul = 6*4*3*2*1
b) sa se precizeze cate cifre are numarul citit de ex pentru numarul de mai sus cifre=5
c) sa se precizeze cifra maxima si minima a numarului a
d) sa se precizeze cifra de control a numarului a: se calculeaza suma cifrelor, s  apoi suma cifrelor sumei s ,
si tot asa pana ramane o singura cifra care se numeste cifra de control
Se va folosi notiunea din matematica conform careia restul impartirii la 10 il reprezinta ultima cifra a numarului
iar catul numarul fara ultima cifra asadar un posibil pseudocod ar fi:

declar cifra a si ii atribui o valorea
cat timp a diferit de zero
    cifra = a % 10
    //aici fac o prelucrarea , cerintele
   a = a/10
end cat timp
*/
        int nr;
        int suma = 0;
        int produs = 1;
        System.out.println("introduceti numarul");
        nr = scan.nextInt();
        int min = 9;
        int max = 0;
        int cifra;
        int count = 0;

        /*% 10 */
        while (nr != 0) {
            cifra = nr % 10;
            suma = suma + (nr % 10);
            produs = produs * (nr % 10);
            ++count;
            if (cifra > max) {
                max = cifra;
            }
            if (cifra < min) {
                min = cifra;
            }
            nr = nr / 10;
        }

        //d
        while (nr >9) {
                suma = 0;
                while (nr!=0) {
                    suma = suma + (nr % 10);
                    nr = nr / 10;
                }  nr = suma;
        }
        System.out.println ("Cifra de control este: " + suma);
        //a
        System.out.println("Suma numerelor este: " + suma);
        System.out.println("produsul numerelor este: " + produs);
        //b
        System.out.println("Numarul este format din: " + count + " cifre");
        //c
        System.out.println("Minimul este: " + min + "Maximul este: " + max);
    }

//2. Se da un numar a. Se se afiseze numarul invers de ex int a = 476, se va obtine  int invers =674

    // op.nrOnReverse(4789);


//3. Se da un numar a. Sa se determine daca numarul este palindrom ori nu.
//Un numar este palindrom daca este egal cu numarul inversat de ex int a = 12344321 este palindrom

//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        myList.add(4);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        op.testPalindrom(myList);


//4 Se da un numar a. Se se afiseze un numar b format doar din numerele impare ale numarului a, si un numar c format
//din patratul numerelor pare ale numarului a.
    // int a = 6253787;

    // op.twoFromOneNumber(6253787);

//5. Se da un sir de numere ordonate crescator. Se va determina daca un numar n exista in sir, si daca exista se va afisa
    //pozitia pe care s-a gasit, altfel se va afisa -1. Cu ce difera algoritmul cand sirul este ordonat crescator de
    //cazul cand sirul este neordonat. sirul va fi definit asa, numerele sunt de exemplu.
//        int[] list = {1,3,4,6,7,8,10,12,14,23};
//        System.out.println("index of 12 is "
//                + Arrays.binarySearch(list, 12));
//        System.out.println(op.binarySearch1(list, 5));
//        System.out.println(op.binarySearch1(list, 14));


//6. Se se calculeze suma primelor n numere naturale, unde n este declarat ca si int n = 20; sau o alta valoare
    //   op.sumaNrNaturale(20);


//7. Se da un sir de numere naturale, ideal de peste doua cifre. Sa se determine cea mai mare valoare din sir
//care are suma de control sub 3. Suma de control a fost definita mai sus. de ex int[] sir ={12, 34,35, 11,34};


//8. Se da un numar. se se afiseze true daca numarul apartine intervalului [9,24] , altfel sa se afiseze false.

//        int n;
//        System.out.println("Introduceti numarul:");
//        n = scan.nextInt();
//        if (n>=9 & n<=24) {
//            {System.out.println("True. Numarul apartine intervalului 9-24");}
//        }
//            else {System.out.println("False. Numarul nu apartine intervalului 9-24");}
//        }

//9. se dau doua numere a si n. sa se afiseze numarul a la puterea n . de ex a =3 b = 2 se va calcula 3*3
//a = 3 b = 5 se va calcula 3*3*3*3*3
//        int a, n;
//        System.out.println("Numarul este: ");
//        a= scan.nextInt();
//        System.out.println("Numarul se ridica la puterea: ");
//        n = scan.nextInt();
//        int Putere = a;
//        if (n==0) {System.out.println(" Numarul ridicat la puterea 0 este 1");}
//        for (int i=1; i<=n-1; i++)
//        {Putere *=a; }
//        System.out.println("rezultatul este:" + Putere);


//10. Sa se calculeze factorialul unui numar a . factorialul este definit asa: factorial  = 1*2*3*4….*a
//de ex pentru a = 4, factorialul este 1*2*3*4
//        System.out.println("Introduceti numarul si apasati enter:");
//        int numar = scan.nextInt();
//        System.out.println("Factorialul este:" + op.factorial(numar));


//11. Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea.
//de ex pt 11 13 9 8 16 se va afisa   13 9 , 9 8

//        int[] list = {11, 13, 9, 8, 16};
//        List<Integer> newList = new ArrayList<>();
//        int i;
//        int min = list[0];
//        for (i = 0; i < list.length; i++) {
//            if (list[i] < min) {
//                System.out.println(list[i-1] + " , " + list[i]);
//            }
//        }
//    }


//12. Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
//suma = 1+x+x la puterea 2 + x la puterea 3 + ….+ x la puterea n .
//        double x, n, sum;
//        System.out.println("Introduceti un numar intreg:");
//        x = scan.nextInt();
//        System.out.println("Introduceri puterea:");
//        n = scan.nextInt();
//        sum = 1;
//        for (int i = 0; i <= n; i++) {
//            sum = sum + Math.pow(x, n);
//            System.out.println("suma este:" + sum);


//13. Se da un sir. Sa se verifice daca sirul este ordonat crescator , iar daca nu este sa se ordoneze si sa se
//afiseze in ordine crescatoare de ex pt sirul {2,3,4} se va afisa “crescator” iar pt sirul {3,2,4}
// si va ordina si afisa {2,3,4}

//        int[] myList = {3, 2, 4, 7, 8, 1, 5};
//        for (int sir : myList) {
//            System.out.print(sir);
//        }
//        for (int i = 0; i <= myList.length; i++)
//            if (myList[i] < myList[i + 1]) {
//                System.out.print(" " + " crescator ");
//                break;
//            } else {
//                Arrays.sort(myList, 0, myList.length);
//                System.out.print(" " + "Sirul cu valori sortate: ");
//                for (int sir : myList) {
//                    System.out.print(sir);
//                }
//            }


//14. Se da un sir. Pentru prima jumatate a sirului sa se afiseze numerele dublate, iar pentru a doua jumatate sa se
//afseze numerele triplate daca sunt impare si numerele asa cum sunt in sir daca sunt pare.


//15. Se da un sir. Sa se extraga toate numerele intre doua valori si sa se puna intr-un alt sir care apoi sa se afiseze.

//        ArrayList myList = new ArrayList();
//        ArrayList newList = new ArrayList();
//        myList.add(0, 15);
//        myList.add(1, 10);
//        myList.add(2, 8);
//        myList.add(3, 22);
//        myList.add(4, 19);
//        myList.add(5, 13);
//        myList.add(6, 1);
//        myList.add(7, 5);
//        myList.add(8, 9);
//
//        System.out.println(myList);
//
//        System.out.println("Introduceti primul numar:");
//        int first = scan.nextInt();
//        System.out.println("Introduceti al doilea  numar:");
//        int second = scan.nextInt();
//        for (int i = first; i <= second; i++){
//
//        }
//    }


/*16. Sa se citeasca numere de la tastauta pana la introducerea valorii 0 (numerele sa fie salvate intr-o lista - ArrayList)
 - Sa se steaga al doilea numar din lista
 - Sa se adauge un numar in lista (la finalil listei)
 - Sa se modifice penultimul numar din lista
*/
//        ArrayList myList = new ArrayList();
//        System.out.println ("NUMBERS:");
//        int input = scan.nextInt();


}



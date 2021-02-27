package lr.lrTwo;

import java.util.Scanner;

public class lr2 {
    public static void main(String[] args) {
        Scanner inPut;
        int numOfEntries = 0, i, middleSize = 0;
        String[] str;
        int[] stringsSize;
        System.out.println("Entere count of strings");
        inPut = new Scanner(System.in);
        try {// здесь проверяется исключение попадания символа в переменную типа int
        numOfEntries = inPut.nextInt(); 
    } catch (java.util.InputMismatchException e) {//вывод 
        System.out.println("Was entered not a number");
    }
    str = new String[numOfEntries];      //обЪявление 
    stringsSize = new int [numOfEntries];//2 массивов
    for (i = 0; i < numOfEntries; i++) {//ввод строк и подсчёт их средней длины
        System.out.println("Entere string " + (i + 1) + ":");
        inPut = new Scanner(System.in);
        str[i] = inPut.nextLine();
        stringsSize[i] = str[i].length();
        middleSize += str[i].length();  
    }
    inPut.close();
    middleSize /= numOfEntries;
    System.out.println("middle length:" + middleSize);
    for (i = 0; i < numOfEntries; i++){//вывод строк, длинна которых меньше либо равна средней
        if (str[i].length() <= middleSize){
            System.out.println(str[i] + " | length:" + stringsSize[i]);
        }
    }
}
}

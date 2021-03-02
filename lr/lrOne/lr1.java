package lr.lrOne;

import java.util.Scanner;

public class lr1 {
    public static void main(String[] args) {
        String str;
        Scanner inPut;
        int[] countArray;
        int i = 0, tag = 0, j = 0, k = 0;
        inPut = new Scanner(System.in);
        System.out.println("Enter a line:");
        str = inPut.nextLine();
        inPut.close();
        String[] words = str.split("[^a-zA-z]+");
        countArray = new int[words.length + 1];
        String[] checkArray = new String[words.length + 1];
        for (String word : words) { //по очереди берём каждое слово и прогоняем по дальнейшему циклу
            k++;
            tag = 0;

            for (j = 0; tag == 0 && j < checkArray.length - 1; j++) { //здесь проверяем, находиться ли слово в спец массиве для уже пробитых слов
                
                if (word.equalsIgnoreCase(checkArray[j])) {
                    tag++;
                }
            }
            
            if (tag == 0) { //эта часть выполняется, если слово ещё не проверялось
                checkArray[k] = word;
                
                for (i = 0; (i < (words.length)); i++) {
                    
                    if (word.equalsIgnoreCase(words[i])) {
                        countArray[k]++;
                    }
                }
            }
        }
        
        for (i = 0; i < checkArray.length; i++) { //выводим информацию о словах
            
            if (checkArray[i] != null) {
                System.out.println("word " + checkArray[i] + " met " + countArray[i] + " times");
            }
        }
    }
}

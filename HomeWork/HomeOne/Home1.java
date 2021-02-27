package HomeWork.HomeOne;

import java.util.Scanner;

public class Home1 {
    public static void main(String[] args) {
        StringBuilder strBuffer = new StringBuilder("");
        StringBuilder spaceNum = new StringBuilder("");
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        str = in.nextLine();
        char[] sepArray = str.toCharArray();
        for (int i = 0; i < sepArray.length; i++) {
            strBuffer.append(sepArray[i] + "\n");
            spaceNum.append(" ");
            strBuffer.append(spaceNum);
        }
        System.out.print(strBuffer);
        in.close();
    }
}
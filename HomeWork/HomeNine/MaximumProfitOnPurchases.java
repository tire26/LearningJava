package homework.HomeNine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumProfitOnPurchases {

    public static void main(String[] args) {

        String firstRegex = "[\\Q ,[]\\E]", secondRegex = "[0-9]+";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter yours coasts");
        String bufferString = scanner.nextLine();
        String[] sepBufferString = bufferString.split(firstRegex);
        ArrayList<Integer> coastsOfProducts = new ArrayList<>();
        for (String s : sepBufferString) {

            if (s.matches(secondRegex)) { // все числа кладутся с список

                coastsOfProducts.add(Integer.parseInt(s));
            }
        }

        System.out.println("Enter count of purchases");
        int linkSize = coastsOfProducts.size();
        int countOfDeals = 0;
        boolean check = false;
        while (!check) {

            if (scanner.hasNextInt()) {

                countOfDeals = scanner.nextInt();
                if (countOfDeals >= 0 && countOfDeals <= linkSize / 2) {

                    check = true;
                } else {

                    System.out.println("Was entered number less than 0 and twice the count of entered numbers, try again: ");
                    scanner.nextLine();
                    check = false;
                }
            } else {

                System.out.println("Was entered not a number, try again: ");
                scanner.nextLine();
                check = false;
            }
        }
        int finalSum = 0;
        int countOfCheckedElements = 2;
        for (int i = 1; i < countOfDeals; i++) {
            Integer boughtProduct =  coastsOfProducts.get(0); // первая цена - цена покупки
            Integer soldProduct = coastsOfProducts.get(1); // вторая цена - цена продажи

            for (int k = countOfCheckedElements; k < coastsOfProducts.size() - countOfDeals; k++) { // проход по всем остальным ценам

                int bufferProduct = coastsOfProducts.get(k);
                if (bufferProduct < boughtProduct) {

                    soldProduct = boughtProduct;
                } else if (bufferProduct > soldProduct ) {

                    soldProduct = bufferProduct;
                }
            }
            countOfCheckedElements =
            finalSum += soldProduct - boughtProduct;
            coastsOfProducts.remove(boughtProduct);
            coastsOfProducts.remove(soldProduct);
        }
        System.out.println(finalSum);
    }
}

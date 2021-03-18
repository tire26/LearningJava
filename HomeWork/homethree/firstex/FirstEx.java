package homework.homethree.firstex;

import java.util.Scanner;

/*
а) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
б) Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
в) Создать класс Basket, содержащий массив купленных товаров.
г) Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.
*/

public class FirstEx {
    public static void main(String[] args) {
        Category[] categories;
        Product[] products, purchasedProducts;
        Scanner input = new Scanner(System.in);
        int countOfCategories = 0, countOfProducts = 0, j = 0, coastOfProduct = 0, ratingOfProduct = 0, countOfProductsInBasket = 0, coastOfProductInBasket = 0, ratingOfProductInBasket = 0;
        boolean check = false;
        String nameOfCategory = new String(), nameOfProduct = new String(), username = new String(), password = new String(), nameOfProductInBasket = new String();
        Basket basket;

        System.out.println("How many categories you want to add? ");
        while (!check) {

            if (input.hasNextInt()) {

                countOfCategories = Integer.parseInt(input.nextLine());
                check = true;
            } else {

                System.out.println("Was entered not a number, try again: ");
                input.nextLine();
                check = false;
            }
        }
        categories = new Category[countOfCategories];
        for (int i = 0; i < countOfCategories; i++) {

            check = false;
            System.out.print("Entere name of category: ");
            nameOfCategory = input.nextLine();
            System.out.print("Entere how many products you want add: ");
            while (!check) {

                if (input.hasNextInt()) {

                    countOfProducts = Integer.parseInt(input.nextLine());
                    check = true;
                } else {

                    System.out.println("Was entered not a number, try again: ");
                    input.nextLine();
                    check = false;
                }
            }
            products = new Product[countOfProducts];
            for (j = 0; j < countOfProducts; ++j) {
                check = false;
                System.out.print("Entere name of product: ");
                nameOfProduct = input.nextLine();
                System.out.print("Entere coast of product: ");
                while (!check) {

                    if (input.hasNextInt()) {
    
                        coastOfProduct = Integer.parseInt(input.nextLine());
                        check = true;
                    } else {
    
                        System.out.println("Was entered not a number, try again: ");
                        input.nextLine();
                        check = false;
                    }
                }
                System.out.print("Entere rating of product: ");
                check = false;
                
                while (!check) {

                    if (input.hasNextInt()) {
    
                        ratingOfProduct = Integer.parseInt(input.nextLine());
                        check = true;
                    } else {
    
                        System.out.println("Was entered not a number, try again: ");
                        input.nextLine();
                        check = false;
                    }
                }
                products[j] = new Product(nameOfProduct, coastOfProduct, ratingOfProduct);
            }
            categories[i] = new Category(nameOfCategory, products);
        }
        System.out.print("Entere username: ");
        username = input.nextLine();
        System.out.print("Entere password: ");
        password = input.nextLine();
        System.out.print("Entere count of products in basket: ");
        check = false;
        while (!check) {

            if (input.hasNextInt()) {

                countOfProductsInBasket = Integer.parseInt(input.nextLine());
                check = true;
            } else {

                System.out.println("Was entered not a number, try again: ");
                input.nextLine();
                check = false;
            }
        }
        purchasedProducts = new Product[countOfProductsInBasket];
        for (int i = 0; i < countOfProductsInBasket; ++i) {
            check = false;
                System.out.print("Entere name of product: ");
                nameOfProductInBasket = input.nextLine();
                System.out.print("Entere coast of product: ");
                while (!check) {

                    if (input.hasNextInt()) {
    
                        coastOfProductInBasket = Integer.parseInt(input.nextLine());
                        check = true;
                    } else {
    
                        System.out.println("Was entered not a number, try again: ");
                        input.nextLine();
                        check = false;
                    }
                }
                System.out.print("Entere rating of product: ");
                check = false;
                
                while (!check) {

                    if (input.hasNextInt()) {
    
                        ratingOfProductInBasket = Integer.parseInt(input.nextLine());
                        check = true;
                    } else {
    
                        System.out.println("Was entered not a number, try again: ");
                        input.nextLine();
                        check = false;
                    }
                }
                purchasedProducts[i] = new Product(nameOfProductInBasket, coastOfProductInBasket, ratingOfProductInBasket);
        }
    }
}
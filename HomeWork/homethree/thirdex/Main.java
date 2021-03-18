package homework.homethree.thirdex;

import java.util.Scanner;

/*
Создайте супер класс Shape и его наследники Circle, Rectangle. 
Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет. 
Классы Circle, Rectangle содержат координаты точек. 
Создать массив содержащий эти фигуры. 
В цикле нарисовать их (вызвать метод draw). 
Добавить метод equals() для классов Shape, Circle, Rectangle.
*/
public class Main {
    public static void main(String[] args) {

        String color = new String();
        Scanner input = new Scanner(System.in);
        Shape[] shape;
        Rectangle rectangles;
        Circle circle;

        System.out.print("Entere color of shapes: ");
        color = input.nextLine();
        input.close();
        rectangles = new Rectangle(color, 2, 3, 4, 1);
        circle = new Circle(color, 2, 2, 20);
        shape = new Shape[] {rectangles, circle};
        for (int i = 0; i < shape.length; ++i) {
            shape[i].draw();
        }
        
    }
}

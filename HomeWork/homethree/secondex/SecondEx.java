//package homework.homethree.secondex;
//
//import java.util.Scanner;
//
//public class SecondEx {
//    public static void main(String[] args) {
//        final int countOfMarks = 5, minSumForExcellent = 45, maxSumForExcellent = 50;
//        Student[] students;
//        int sizeArrayStudents = 0;
//        Scanner input = new Scanner(System.in);
//        boolean check = false;
//        String surname, numberOfGroup;
//        int[] marks = new int[countOfMarks], sumMarks;
//        int i = 0;
//        System.out.print("Entere count of students: ");
//        while (!check) {
//
//            if (input.hasNextInt()) {
//                sizeArrayStudents = Integer.parseInt(input.nextLine());
//                check = true;
//            } else {
//                System.out.println("Was entered not a number, try again: ");
//                input.nextLine();
//                check = false;
//            }
//        }
//        students = new Student[sizeArrayStudents];
//        sumMarks = new int[sizeArrayStudents];
//
//        for (i = 0; i < students.length; ++i) {
//
//            System.out.print("Entere surname and initals of the student(" + i + ") : ");
//            surname = input.nextLine();
//            System.out.print("Entere number of group of the student(" + i + ") : ");
//            numberOfGroup = input.nextLine();
//            System.out.println("Entere marks of the student(" + i + ") : ");
//            for (int j = 0; j < countOfMarks; ++j) {
//                check = false;
//                System.out.format("Mark(%d): ", j);
//
//                while (!check) {
//
//                    if (input.hasNextInt()) {
//                        marks[j] = Integer.parseInt(input.nextLine());
//                        sumMarks[i] += marks[j];
//                        check = true;
//                    } else {
//                        check = false;
//                        System.out.println("Was entered not a number, try again: ");
//                        input.nextLine();
//                    }
//                }
//            }
//            students[i] = new Student(surname, numberOfGroup, marks);
//        }
//        System.out.print("Want to output data about students?, push button true, if yes, else false: ");
//        check = input.nextBoolean();
//
//        if (check) {
//
//            for (i = 0; i < sizeArrayStudents; ++i) {
//
//                if (sumMarks[i] >= minSumForExcellent & sumMarks[i] <= maxSumForExcellent) {
//                    System.out.println("Surname and initals of the student: " + students[i].surname);
//                    System.out.println("Number of group of the student: " + students[i].numberOfGroup);
//                }
//            }
//        }
//        input.close();
//    }
//}

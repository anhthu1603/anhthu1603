package javabasicbai3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainScreen {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        String continueOption = "Y";

        while (continueOption.equals("Y")) {
            Student student = new Student();

            System.out.print("Enter full name: ");
            student.setFullName(scanner.nextLine());

            System.out.print("Enter address: ");
            student.setAddress(scanner.nextLine());

            System.out.print("Enter date of birth (dd/mm/yyyy): ");
            student.setDOB(scanner.nextLine());

            System.out.print("Enter gender: ");
            student.setGender(scanner.nextLine());

            System.out.print("Enter final grade: ");
            student.setFinalGrade(scanner.nextFloat());

            students.add(student);

            System.out.print("Do you want to continue (Y/N)? ");
            continueOption = scanner.next();
            scanner.nextLine(); 
        }

        System.out.println("\nList of students:");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            String result = "";

            if (student.getFinalGrade() < 4.0) {
                result = "học lực kém";
            } else if (student.getFinalGrade() < 5.0) {
                result = "học lực yếu";
            } else if (student.getFinalGrade() < 5.5) {
                result = "học lực trung bình yếu";
            } else if (student.getFinalGrade() < 6.5) {
                result = "học lực trung bình";
            } else if (student.getFinalGrade() < 7.0) {
                result = "học lực trung bình khá";
            } else if (student.getFinalGrade() < 8.0) {
                result = "học lực khá";
            } else if (student.getFinalGrade() < 8.5) {
                result = "học lực khá giỏi";
            } else {
                result = "học lực giỏi";
            }

            System.out.println("Student " + (i + 1) + ":");
            System.out.println("FullName: " + student.getFullName());
            System.out.println("Address: " + student.getAddress());
            System.out.println("DOB: " + student.getDOB());
            System.out.println("Gender: " + student.getGender());
            System.out.println("FinalGrade: " + student.getFinalGrade());
            System.out.println("Result: Học sinh " + student.getFullName() + " " + result + "\n");
        }

        float sum = 0;
        for (Student student : students) {
            sum += student.getFinalGrade();
        }

        float average = sum / students.size();
        System.out.println("Average final grade: " + average);

        scanner.close();
    }

}

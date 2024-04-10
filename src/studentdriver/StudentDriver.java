/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdriver;

import java.util.*;
import java.io.*;

/**
 *
 * @author dianar
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Project02");
        // Make array
        StudentFees[] students = new StudentFees[12];

        // open a file to be able to read from it
        File inputFile = new File("input.csv");
        //Read form the opened file
        Scanner stuInput = new Scanner(inputFile);

        System.out.print("Enter the no of UG students: ");
        int numOfUGStu = input.nextInt();

        System.out.print("Enter the no of Graduate students: ");
        int numOfGStu = input.nextInt();

        System.out.print("Enter the no of online students: ");
        int numOfOStu = input.nextInt();

//        String line = stuInput.nextLine();
//        System.out.println(line);
        //Loop to get num og students
        //int count = 0;
        int UgStus = 0;
        int GStus = 0;
        int OStus = 0;

        for (int i = 0; i < students.length; i++) {
            if (UgStus == 0) {
                System.out.println("**********Undergraduate students list**********");
            }
            while (UgStus < numOfUGStu) {
                String line = stuInput.nextLine();
                String[] stuArr = line.split(",");
                for (int s = 0; s < stuArr.length; s++) {
                    students[s] = new UGStudent(stuArr[1], Integer.parseInt(stuArr[0]), Boolean.parseBoolean(stuArr[2]), Boolean.parseBoolean(stuArr[4]), Double.parseDouble(stuArr[5]), Integer.parseInt(stuArr[3]));
                    System.out.println(students[s]);
                }

                UgStus++;
            }

            if (GStus == 0) {
                System.out.println("**********Graduate students list**********");
            }
            while (GStus < numOfGStu) {
                String line = stuInput.nextLine();
                String[] stuArr = line.split(",");
                for (int s = 0; s < stuArr.length; s++) {
                    students[s] = new GraduateStudent(stuArr[1], Integer.parseInt(stuArr[0]), Boolean.parseBoolean(stuArr[2]), Boolean.parseBoolean(stuArr[4]), stuArr[5], Integer.parseInt(stuArr[3]));
                    System.out.println(students[s]);
                }

                GStus++;
            }

            if (OStus == 0) {
                System.out.println("**********Online students list**********");
            }
            while (OStus < numOfOStu) {
                String line = stuInput.nextLine();
                System.out.println(line);
                OStus++;
            }
        }

        input.close();

    }

}

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
        int count = 0;
        int UgStus = 0;
        int GStus = 0;
        int OStus = 0;

        for (int i = 0; i < students.length; i++) {
            System.out.println("**********Undergraduate students list**********");
            while (UgStus < numOfUGStu) {
                String line = stuInput.nextLine();
                System.out.println(line);
                UgStus++;
            }

//            System.out.println("\n**********Undergraduate students list**********");
//
//            while (GStus < numOfGStu) {
//                String line = stuInput.nextLine();
//                System.out.println(line);
//                UgStus++;
//            }
//
//            System.out.println("**********Undergraduate students list**********");
//            while (OStus < numOfOStu) {
//                String line = stuInput.nextLine();
//                System.out.println(line);
//                UgStus++;
//            }
        }

        input.close();

    }

}

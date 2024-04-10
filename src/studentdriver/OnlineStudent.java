/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author s563769
 */
public class OnlineStudent extends StudentFees {

    private int noOfMonths;
    private double MONTHLY_FEE = 1245.25;

    public OnlineStudent(String studentName, int studentID, boolean isEnrolled, int noOfMonths, double MONTHLY_FEE) {
        super(studentName, studentID, isEnrolled);
    }

    public String toString() {
        return ";";
    }

    double getPayableAmount() {
        return 0;

    }

}

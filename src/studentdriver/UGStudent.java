/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author s563769
 */
public class UGStudent extends StudentFees {

    private double scholarshipAmount;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private double ADDITIONAL_FEE = 820.70;

    public UGStudent(String studentName, int studentID, boolean isEnrolled,
            boolean hasScholarship, double scholarshipAmount, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.hasScholarship = hasScholarship;
        this.scholarshipAmount = scholarshipAmount;
        this.coursesEnrolled = coursesEnrolled;
    }

    @Override
    double getPayableAmount() {
        if (super.isIsEnrolled()) {
            if (!hasScholarship) {
                scholarshipAmount = 0;
            }
            return coursesEnrolled * super.getCREDITS_PER_COURSE() * super.getPER_CREDIT_FEE() - scholarshipAmount + ADDITIONAL_FEE;
        } else {
            return 0;
        }
    }

    public String toString() {
        return super.toString() + String.format(", Has scholarship: %-5" + "\nScholarship amount: " + "%-4s, courses enrolled: %1d, payable amount: %-7.2f", hasScholarship, scholarshipAmount, getPayableAmount());
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author s563769
 */
public class GraduateStudent extends StudentFees {

    private int coursesEnrolled;
    boolean isGraduateAssistant;
    String graduateAssistantType;
    double ADDITIONAL_FEES = 654.45;

    public GraduateStudent(String studentName, int studentID, boolean isEnrolled,
            boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
    }

    public GraduateStudent(String studentName, int studentID, boolean isEnrolled,
            boolean isGraduateAssistant, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
    }

    public boolean isIsGraduateAssistant() {
        return isGraduateAssistant;
    }

    public int getCoursesEnrolled() {
        return coursesEnrolled;
    }

    double getPayableAmount() {

    }

    public String toString() {
        return ";";
    }

    /**
     * @return the coursesEnrolled
     */
}

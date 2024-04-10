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
    double ADDITIONAL_FEE = 654.45;

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

    @Override
    double getPayableAmount() {

        if (super.isIsEnrolled()) {
            double tuition = coursesEnrolled * super.getCREDITS_PER_COURSE() * super.getPER_CREDIT_FEE();
            if(isGraduateAssistant){

                if(graduateAssistantType.equals("full")){
                return tuition = 0;
            }   
            
                else if(graduateAssistantType.equals("half")){
                    tuition = tuition/2;
            }
            }
            return tuition + ADDITIONAL_FEE;
        }
        else{
            return 0;
        }

    }

    public String toString() {
        return super.toString() + String.format("Graduate Assistant: %-5", +"\ngraduateAssi");
    }

}

import java.util.Scanner;

public class StudentMarks {
    public String checkGrade(int[] studentGrades){
        int numOfStud = studentGrades.length;
        if((numOfStud==0))
            return null;
        int flag=1;
        for(int i=0;i<numOfStud;i++){
            if(studentGrades[i]>=0 && studentGrades[i]<=100)
                continue;
            else{
                flag=0;
                break;
            }
        }
        if(flag==1)
            return "Marks are in range 0-100.";
        else
            return "Error!";
    }

    public static void main(String[] args){
        StudentMarks obj = new StudentMarks();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students: ");
        int numOfStudents = sc.nextInt();
        int[] stuGrades = new int[numOfStudents];
        System.out.println("Enter Student grades: ");
        for(int i=0;i<numOfStudents;i++){
            stuGrades[i]=sc.nextInt();
        }
        System.out.println(obj.checkGrade(stuGrades));
    }
}

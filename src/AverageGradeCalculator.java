import java.util.Scanner;

public class AverageGradeCalculator {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        double mathGrade,physicsGrade,turkishGrade,historyGrade,musicGrade;
        String feedback;

        System.out.println("****** Please Enter Your Grades ******\n");
        System.out.print("--> Mathematics: ");
        mathGrade = keyboard.nextDouble();
        feedback = (mathGrade>100 || mathGrade<0) ? "Wrong Input":"Saved";
        System.out.println(feedback);

        System.out.print("--> Physics: ");
        physicsGrade = keyboard.nextDouble();
        feedback = (physicsGrade>100 || physicsGrade<0) ? "Wrong Input":"Saved";
        System.out.println(feedback);

        System.out.print("--> Turkish: ");
        turkishGrade = keyboard.nextDouble();
        feedback = (turkishGrade>100 || turkishGrade<0) ? "Wrong Input":"Saved";
        System.out.println(feedback);

        System.out.print("--> History: ");
        historyGrade = keyboard.nextDouble();
        feedback = (historyGrade>100 || historyGrade<0) ? "Wrong Input":"Saved";
        System.out.println(feedback);

        System.out.print("--> Music: ");
        musicGrade = keyboard.nextDouble();
        feedback = (musicGrade>100 || musicGrade<0) ? "Wrong Input":"Saved";
        System.out.println(feedback);


        double average = (mathGrade+physicsGrade+turkishGrade+historyGrade+musicGrade) / 5;

        System.out.println("\n************ Grades Table ************");
        System.out.println("--------------------------------------");
        System.out.println("|\t\t\tMath    : " + mathGrade + "\t\t\t |");
        System.out.println("|\t\t\tPhysics : " + physicsGrade + "\t\t\t |");
        System.out.println("|\t\t\tTurkish : " + turkishGrade + "\t\t\t |");
        System.out.println("|\t\t\tHistory : " + historyGrade + "\t\t\t |");
        System.out.println("|\t\t\tMusic   : " + musicGrade + "\t\t\t |");
        System.out.println("--------------------------------------");
        System.out.println("|\t\t\tAverage : " + average + "\t\t\t |");
        System.out.println("--------------------------------------");

        String passOrFailMessage = (average > 60) ? "    You passed    ":"    You failed    ";

        System.out.println("**************************************");
        System.out.println("**********" + passOrFailMessage + "**********");
        System.out.println("**************************************");


    }
}

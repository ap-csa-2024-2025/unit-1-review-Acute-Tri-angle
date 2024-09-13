public class GradeCalculator
{
  public static void main(String[] args)
  {
    String className = "ap physique";
    int avgHoursPerWk = 69420;
    int hw1 = 64;
    int hw2 = 78;
    int hw3 = 99;
    int hw4 = 95;
    double quiz1 = 99.87;
    double quiz2 = 0.19;
    double exam = 95.69;
    
    double avgHw = (hw1+hw2+hw3+hw4)/4;
    double avgQuiz = (quiz1+quiz2)/2;
    int FinalGrade = (int) (avgHw*0.35)+ (int) (avgQuiz*0.15)+ (int) (exam*0.5);
    
    System.out.println("course name: " + className);
    System.out.println("avg time spent in minutes for this course: "+avgHoursPerWk);
    System.out.println("hw grades based on ur training: ");
    System.out.println(hw1);
    System.out.println(hw2);
    System.out.println(hw3);
    System.out.println(hw4);
    System.out.println("quiz grades based on ur muscles: ");
    System.out.println(quiz1);
    System.out.println(quiz2);
    System.out.println("final exam based on ur immaculate physique: ");
    System.out.println(exam);
    System.out.println("weekly time spent in gym: " + avgHoursPerWk/60 + " hrs " + avgHoursPerWk%60 + " minutes");
    System.out.println("avg hw grade: " + avgHw);
    System.out.println("avg quiz grade: " + avgQuiz);
    System.out.println("final exam grade: " + exam);
    System.out.println("overall grade: " + FinalGrade);
  }
}

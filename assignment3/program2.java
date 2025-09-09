public class program2 {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        int totalSubjects = 3;

        int totalMarks = maths + physics + chemistry;

        double average = (double) totalMarks / totalSubjects;

        System.out.println("Sam's average percentage in PCM is: " + average + "%");
    }
}

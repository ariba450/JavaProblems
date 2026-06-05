public class CGPACalculation {
    public static void main(String[] args) {

        int students = 5;
        int subjects = 5;

    
        double[][] gradePoints = {
            {3.2, 3.3, 3.4, 3.6, 3.7},
            {3.0, 3.25, 3.1, 3.3, 3.4},
            {3.9, 4.0, 3.84, 3.7, 3.9},
            {2.81, 3.03, 3.2, 3.1, 3.0},
            {3.64, 3.5, 3.7, 3.8, 3.6}
        };

        
        int[] credits = {3, 3, 3, 3, 2};

        for (int i = 0; i < students; i++) {
            double totalPoints = 0;
            int totalCredits = 0;

            for (int j = 0; j < subjects; j++) {
                totalPoints += gradePoints[i][j] * credits[j];
                totalCredits += credits[j];
            }

            double cgpa = totalPoints / totalCredits;

            System.out.println("Student " + (i + 1) + " CGPA: " + cgpa);
        }
    }
}
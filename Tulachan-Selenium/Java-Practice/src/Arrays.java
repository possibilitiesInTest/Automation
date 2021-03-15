public class Arrays {
    public static void main (String args[] ) {
        String[] studentNames = new String[] {"Alan", "Bob", "Cathy"};
        int[] strudentAge = new int[] {10, 12, 13, 15};
        double[] studentGrade = new double[] {4.0, 3.5, 2.2};
        String[] studentSubjects = new String[5];

        studentSubjects[0] = "History";
        studentSubjects[4] = "Math";
        studentSubjects[3] = "Science";

        System.out.println(studentSubjects[4]);
    }

}

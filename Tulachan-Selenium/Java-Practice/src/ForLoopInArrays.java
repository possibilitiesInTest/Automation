public class ForLoopInArrays {

    public static void main(String args[]) {
        double[] numList = new double[]{121.9, 200.9, 304.4, 312.4};

        // Print all array elms
        for (double num : numList) {
            System.out.println(num);
        }

        // Print sum of array
        double sum = 0;
        for (double num : numList) {
            sum = sum + num;
        }
        System.out.println("Sum: " + sum);

        // Find the largest elm of array
        double max = numList[0];
        for (double num: numList){
            if(num > max) {
                max = num;
            }
        } System.out.println("Max is: " + max);
    }
}

public class AverageArrays {
    public static void main(String[] input) {
        // store marks of n students and calculate their average

        int size = Integer.parseInt(input[0]);

        int marks[] = new int[size];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = Integer.parseInt(input[i + 1]);
        }

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        // avg = total sum / no of observation

        double avg = sum / size;

        System.out.println("Average is: " + avg);
    }
}

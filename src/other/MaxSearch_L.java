package other;

public class MaxSearch_L {
    // maine -> main
    // String -> String[]
    public static void main(String[] args) {

        // 4.5 -> 4
        int[] values = {13, 8, 23, 4, 1, 8, 6, 23, 48, 39};
        int maxValue = values[0];

        // integer -> int
        // missing ;
        int i = 1;

        int n = values.length;

        while (i < n) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }

            // i + 1 -> i = i + 1
            // missing ;
            i = i + 1;
        }

        // System.println -> System.out.println
        System.out.println(maxValue);

        final int months = 12;

        // / 0 -> / months
        int maxValuePerMonth = maxValue / months;

        // missing +
        System.out.println("Max. value per month: " + maxValuePerMonth);

    }   // closing curly braces of main method and class
}


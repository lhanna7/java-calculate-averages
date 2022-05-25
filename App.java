import java.util.Arrays;

class App {
    public static void main(String args[]) {

        int[] testScores = { 72, 95, 91, 85, 87, 51, 65, 72, 75, 89 };
        App.sortArray(testScores);
        App.calculateMedian(testScores);
        App.calculateMean(testScores);
        App.findHighest(testScores);
        App.findLowest(testScores);
    }

    private static void sortArray(int[] testScores) {
        Arrays.sort(testScores);
        for (int testScore : testScores) {
            System.out.println(testScore);
        }
    }

    private static void calculateMedian(int[] testScores) {
        int scoreLength = testScores.length;
        int sumMiddleNumbers = testScores[scoreLength / 2] + testScores[scoreLength / 2 - 1];
        double median = ((double) sumMiddleNumbers) / 2;
        System.out.println(median);
    }

    private static void calculateMean(int[] testScores) {
        int scoreLength = testScores.length;
        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        double mean = sum / scoreLength;
        System.out.println(mean);
    }

    private static void findHighest(int[] testScores) {
        int max = Arrays.stream(testScores).max().getAsInt();
        System.out.println(max);
    }

    private static void findLowest(int[] testScores) {
        int min = Arrays.stream(testScores).min().getAsInt();
        System.out.println(min);
    }

}

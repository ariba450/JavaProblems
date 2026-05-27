
public class SeriesOfSum {
    public static void main(String[] args) {

        int evenSum = 0;
        int oddSum = 0;

        
        for (int i = 2; i <= 20; i += 2) {
            evenSum += i;
        }

        
        for (int i = 1; i < 20; i += 2) {
            oddSum += i;
        }

        System.out.println("Sum of even series: " + evenSum);
        System.out.println("Sum of odd series: " + oddSum);
    }
}

public class DigitSum {
    public static void main(String[] args) {
        int number = 123456;

     
        int evenSum = String.valueOf(number).chars()
                .map(Character::getNumericValue)
                .filter(digit -> digit % 2 == 0)
                .sum();

        
        int oddSum = String.valueOf(number).chars()
                .map(Character::getNumericValue)
                .filter(digit -> digit % 2 != 0)
                .sum();

        System.out.println("Even digits sum: " + evenSum);
        System.out.println("Odd digits sum: " + oddSum);
    }
}
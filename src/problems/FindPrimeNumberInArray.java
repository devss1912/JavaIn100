package problems;
public class FindPrimeNumberInArray {
    public static void main(String[] args) {
        int intArray[] = {1, 2, 3, 4};
        int primeCnt = 0, nonPrimeCnt = 0;

        for (int i = 0; i < intArray.length; i++) {
            boolean isPrime = true;
            int number = intArray[i];

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(number); j++) {
                    if (number % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                primeCnt++;
            } else {
                nonPrimeCnt++;
            }
        }

        System.out.println("Prime Number Count is " + primeCnt + " Non-Prime Number Count is " + nonPrimeCnt);
    }
}

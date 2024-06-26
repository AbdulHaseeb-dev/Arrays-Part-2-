public class MaxSubArrayKadanes {
    public static void kadanes (int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i<numbers.length; i++ ) {
            currSum = currSum + numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum );
        }
        System.out.println("our max subarray sum is :" + maxSum);
    }

    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
        kadanes(numbers);
    }
}

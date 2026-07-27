class Solution {
    public int countEven(int num) {
        int temp = num;
        int sum = 0;
        
        // Compute the digit sum of `num`
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        // If digit sum of `num` is even, result is num / 2; else (num - 1) / 2
        return (sum % 2 == 0) ? num / 2 : (num - 1) / 2;
    }
}

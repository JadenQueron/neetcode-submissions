class Solution {
    public int[] twoSum(int[] numbers, int target) {
    // 1. Initialize two pointers at opposite ends
    int left = 0;
    int right = numbers.length - 1;

    // 2. Loop until they meet or cross
    while (left < right) {
        
        // 3. Process data or evaluate conditions
        if ((numbers[left] + numbers[right]) < target) {
            left++;
        } else if ((numbers[left] + numbers[right]) > target) {
            right--;
        } else {
            return new int[]{left + 1, right + 1};
        }  
        }
        return new int[]{};
    }
}

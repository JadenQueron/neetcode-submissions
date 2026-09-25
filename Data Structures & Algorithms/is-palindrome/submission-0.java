class Solution {
    public boolean isPalindrome(String s) {
    // 1. Initialize two pointers at opposite ends
    
    char[] myArray = s.toCharArray();

    int left = 0;
    int right = myArray.length - 1;

    // 2. Loop until they meet or cross
    while (left < right) {
        
        // 3. Process data or evaluate conditions
        if (!Character.isLetterOrDigit(myArray[left])) {
            left++;
        } else if (!Character.isLetterOrDigit(myArray[right])) {
            right--;
        } else if (Character.toLowerCase(myArray[left]) == Character.toLowerCase(myArray[right])) {
            left++;
            right--;
        } else {
            return false;
        }
    }
    return true;

}
}
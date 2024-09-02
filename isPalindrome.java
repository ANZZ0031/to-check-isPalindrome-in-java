class Solution {
    public boolean isPalindrome(int x) {
      
       if (x < 0) {
           return false; // Negative numbers are not palindromes
       }

       int rev = 0;
       int temp = x;
       
       while (temp != 0) { // Use temp instead of x in the loop
           int br = temp % 10;
           rev = rev * 10 + br;
           temp = temp / 10;
       }

       return (rev == x); // Compare the reversed number with the original value of x
    }
}

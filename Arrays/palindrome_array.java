public class palindrome_array {
    public boolean isPalindrome(String word)
    {
        char[] word_to_array = word.toCharArray();
        int start = 0;
        int end = word_to_array.length-1;
        while(start<end)
        {
            if(word_to_array[start] != word_to_array[end])
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        palindrome_array test = new palindrome_array();
        System.out.println(test.isPalindrome("madam"));
    }
}

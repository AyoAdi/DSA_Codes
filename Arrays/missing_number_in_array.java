
public class missing_number_in_array {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,7,8};
        int n = arr.length;
        int total_values = n+1;
        int total_supposed_sum = (total_values*(total_values+1))/2;
        //System.out.println("The supposed value is: " + total_supposed_sum);

        int sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }
        //System.out.println("The total sum of the values in the array are: " + sum);
        int missing_value = total_supposed_sum - sum;
        System.out.println("The missing value is: " + missing_value);
    }
}

public class Removing_even_values_frm_Array {

    public static void main(String[] args)
    {
        int[] arr = {5,9,3,2,7};
        int oddcount = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] % 2 != 0)
            {
                oddcount++;
            }
        }
        System.out.println("The total number of odd values are: " + oddcount);
        int[] oddValues = new int[oddcount];
        int idx = 0;
        for(int i = 0; i<oddcount; i++)
        {
            if(arr[i] % 2 != 0)
            {
                oddValues[idx] = arr[i];
                idx++;
            }
        }
        //System.out.println(oddValues[oddcount])

        for(int i = 0; i< oddcount; i++)
        {
            System.out.println("The odd values are: " + oddValues[i]);
        }
  
    }
}

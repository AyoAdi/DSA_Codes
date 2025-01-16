

public class Move_all_zeroes_to_end_of_array {
    public void moveZeroes(int[] arr)
    {
        int j = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++)
        {
            if(arr[i]!= 0 && arr[j]==0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if(arr[j] != 0)
            {
                j++;
            }
        }
        for(int i = 0; i<n; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }    
    public static void main(String[] args)
    {
        int[] arr = {1,3,0,2,9};
        Move_all_zeroes_to_end_of_array test = new Move_all_zeroes_to_end_of_array();
        test.moveZeroes(arr);
    }

}

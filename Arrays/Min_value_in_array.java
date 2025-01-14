

public class Min_value_in_array {
    public int minValue(int[] arr)
    {
        if(arr==null || arr.length==0)
        {
            throw new IllegalArgumentException("Illegal start");
        }
        int min = arr[0];
        for(int i = 1; i<arr.length; i++)
        {
            if(arr[i]< min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args)
    {
        int[] arra= {1,5,3,8,0,-6};
        Min_value_in_array ma = new Min_value_in_array();
        System.out.println(ma.minValue(arra));
    }
}

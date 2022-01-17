public class  array_1D
{
    public static void main(String[] args)
    {
        int arr[] = new int[10] ;
        
        int i ;
        
        for(i = 0 ; i < arr.length ; i++)
        {
            arr[i] = i+1 ;
        }
        
        for(i = 0 ; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
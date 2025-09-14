public class LargestArr {
    public static void main(String[] args) {
        int arr[] = {44,66,2,55,154,1,9,66,5};
        int max = -100;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
            else{
                continue;
            }
        }
        System.out.println(max);
    }
    
}

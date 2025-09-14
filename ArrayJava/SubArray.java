public class SubArray {
    public static void main(String args[])
    {
        int cs;
        int arr[] = {-2,4,6,8,-10};
        int ms = arr[0];
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                cs=0;
                for(int k=start;k<=end;k++){
                    cs = cs + arr[k];
                }
                if(ms<cs){
                    ms=cs;
                }
                System.out.print(cs +" ");
            }
            System.out.println();
        }
        System.out.println(ms);
    }
}

public class ReverseArr {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int arrnew[] = new int[arr.length]; 
        for(int i=0;i<arr.length;i++){
                arrnew[i] = arr[arr.length-i-1];
        }
        for(int i=0;i<arrnew.length;i++){
                System.out.print(arrnew[i]);
            }
    }
}

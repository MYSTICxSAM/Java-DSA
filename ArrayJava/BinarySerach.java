import java.util.*;
public class BinarySerach {
    public static void main(String args[]){
        int arr[] = {22,45,43,66,21,7,3,991};
        Arrays.sort(arr);
        int toFind = 991;
        int start = 0;
        int mid = arr.length/2;
        int end = arr.length-1;
        for(int i=start;i<end;i++){
            if(arr[start] == toFind || arr[end] == toFind){
                System.out.println("Element found");
                break;
            }
            else if(arr[mid]==toFind){
                System.out.println("Fount in array and numebr is: " + arr[mid]);
                break;
            }
            else if(arr[mid]<toFind){
                start = mid;
                mid = (start+end)/2;
            }
            else{
                end = mid;
                mid = (start+end)/2;
            }
        }
    }
}

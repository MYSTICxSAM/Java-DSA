import java.util.*;
public class ArrayPrint {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        for(int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
        }
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }   
    }   
}

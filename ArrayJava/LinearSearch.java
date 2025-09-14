public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {31,22,0,9,44,66,3,5,77,45};
        int toFind = 6;
        boolean x = false;
        for(int i=0;i<arr.length;i++){
            if(toFind == arr[i])
            {
                System.out.println("Posotion of number in array is: " + i);
                x = true;
                break;
            }
            
            else{
                continue;
            }
        }
        if(x == false){
            System.out.println("Numebr not Found");
        }

    }
}

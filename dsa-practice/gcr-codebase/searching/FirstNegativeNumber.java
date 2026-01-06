import java.util.*;
public class FirstNegativeNumber {

    public static int findFirstNegative(int[]arr){
        if(arr.length<=0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of element : ");
        int n=sc.nextInt();
        int [] arr=new int[n];

        System.out.println("Enter the value of "+n+" Elements");
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int idx=findFirstNegative(arr);
        if(idx==-1){
            System.out.println("There is no negative number in the array");
        }else{
            System.out.println("The first negative number in array is "+arr[idx]);
        }
    }
    
}

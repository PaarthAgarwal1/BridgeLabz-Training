public class SecondMaxElement {
    public static void main(String[] args) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int [] arr ={1,3,6,-45,3,5,7,-56,9,87,54,0,-3,12,5,90,1,-8};
        // int [] arr={3,4,1,5,2};
        for(int i=0;i<arr.length;i++){   // 3 4 5
            if(arr[i]>first){           // - 3 4
                second=first;
                first=arr[i];
            }
            else if(arr[i]<first && arr[i]>second){
                second=arr[i];
            }
        }
        System.out.println(second);
    }
    
}




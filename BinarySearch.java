public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-2,0,2,4,5,6,8,10,12,14,15,16,40};
        int target=16 ;
                int ans=binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;

        while(start<=end){
//            int mid=(start+end)/2; it is possible that the (start+end) might exceed the value of int variable in java
            int mid=start+(end-start)/2;

            if(target< arr[mid]){
                end=mid-1;

            }else if(target>arr[mid]){
                start=mid+1;
            }else{

                return mid;
            }
        }
        return -1;
    }
}

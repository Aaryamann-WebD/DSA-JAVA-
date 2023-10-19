public class LinearSearch {
    public static void main(String[] args) {
        int[] arr2={1,2,3,4,34,78,74};
        int target=34;
        System.out.println(linearS(arr2,target));
    }
    static int linearS(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

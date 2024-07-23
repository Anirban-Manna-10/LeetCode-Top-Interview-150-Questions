public class Solutoion {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1)
            return 1;
        int  q = 1;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[q-1] != nums[i]){
                nums[q] = nums[i];
                q++;
            }
        }
        return q;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,3,4,5};
        int k = removeDuplicates(arr);
        for(int i =0 ; i<k ;i++){
            System.out.print(arr[i] + ", ");
        }
    }
}

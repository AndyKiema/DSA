public class Binarysearch {
    public static void main(String[] args) {
        int nums[]={5,7,9,11,13};
        int target=13;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                System.out.println("The target is at index "+mid);
                break;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        
    }
}

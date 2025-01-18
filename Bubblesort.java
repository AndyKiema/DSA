import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bubblesort {
    public static void main(String[] args) {
        int nums[]={5,3,7,1,9};
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    int z=nums[j];
                    nums[j]=nums[i];
                    nums[i]= z;
                }
            }
        }
        Integer[] newArray = {}; 
        List<Integer> list = new ArrayList<>(Arrays.asList(newArray));
        for(int x:nums){
            list.add(x);
        }
        System.out.println(list);

    }
}

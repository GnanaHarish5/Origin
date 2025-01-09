public class Day7{
    //contains duplicats
    //[1,4,5,6,7]
    //[2,3,5,4,4]
    //yess true
    //else false
    public void findDuplicates(int[] nums){
        System.out.println("duplicates in the given array is: ");
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    System.out.println(nums[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Day7 solution = new Day7();
        int[] nums = {2,3,4,2,5,4,7,3};
        solution.findDuplicates(nums);
    }
}
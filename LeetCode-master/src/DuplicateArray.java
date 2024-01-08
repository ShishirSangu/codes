public class DuplicateArray {
	
	static int removeDuplicates(int[] nums) {
//        if (nums.length == 0) {
//            return 0;
//        }
        
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }
        
        return index+1;
    }

	public static void main(String[] args) {
		int nums[] = {2, 2, 2, 3, 4, 4, 5, 6, 6, 7};
		
		System.out.println("Original array:");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		
		int k = removeDuplicates(nums);
		
		System.out.println("\nArray after removing duplicates:");
		for (int i = 0; i < k; i++) {
			System.out.print(nums[i] + " ");
		}
		
		System.out.println("\nNumber of unique elements: " + k);
	}
}

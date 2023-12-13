public class Sort {
    public static void main(String[] args) {
        int nums[] = {6, 5, 2, 8, 9, 4};

        System.out.println("Before sorting: ");
        for (int num : nums){
            System.out.print(num + " ");
        }

        //bubbleSort(nums);
        selectionSort(nums);

        System.out.println("\nAfter sorting: ");
        for (int num : nums){
            System.out.print(num + " ");
        }
    }

    public static void  selectionSort(int[] nums){
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        for (int i = 0; i < size-1; i++){
            minIndex = i;
            for (int j = i+1; j < size; j++){
                if (nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }

    public static void bubbleSort(int[] nums){
        int size = nums.length;
        int temp = 0;

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size-i-1; j++){
                if (nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }


}

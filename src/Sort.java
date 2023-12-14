public class Sort {
    public static void main(String[] args) {
        int nums[] = {6, 5, 2, 8, 9, 4};

        System.out.println("Before sorting: ");
        for (int num : nums){
            System.out.print(num + " ");
        }

        //bubbleSort(nums);
        //selectionSort(nums);
        //insertionSort(nums);
        quickSort(nums, 0, nums.length-1);

        System.out.println("\nAfter sorting: ");
        for (int num : nums){
            System.out.print(num + " ");
        }
    }

    public static void  quickSort(int[] nums, int low, int high){
        if (low < high){
            int pi = partition(nums, low, high);

            quickSort(nums, low, pi - 1);
            quickSort(nums, pi + 1, high);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pi = nums[high];
        int i = low - 1;

        for (int j = low; j<= high; j++){
            if (nums[j] < pi){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[i+1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;
    }

    public static void insertionSort(int[] nums){
        int size = nums.length;
        for (int i = 1; i < size; i++){
            int key = nums[i];
            int j = i - 1;

            while (j>= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
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

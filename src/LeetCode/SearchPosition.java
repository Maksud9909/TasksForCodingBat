package LeetCode;

public class SearchPosition {

    public  int searchInsert(int[] nums, int target) {
        // Пройдем по элементам массива
        for (int i = 0; i < nums.length; i++) {
            // Если нашли элемент, равный целевому числу, вернем его индекс
            if (nums[i] == target) {
                return i;
            }
            // Если текущий элемент больше целевого числа, вернем индекс текущего элемента
            if (nums[i] > target) {
                return i;
            }
        }
        // Если не нашли место для вставки, то вернем индекс, равный длине массива
        return nums.length;
    }

}

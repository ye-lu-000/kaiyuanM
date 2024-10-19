import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

/**
 * @author 叶璐
 * @version 1.0
 */

public class L2022211974_13_Test {
    @Test
    void testSortColors() {
        Solution solution = new Solution();

        // Test case 1: Normal case with mixed colors
        // Input: nums = [2,0,2,1,1,0]
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums1);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums1);

        // Test case 2: All zeros
        // Input: nums = [0, 0, 0, 0, 0]
        int[] nums2 = {0, 0, 0, 0, 0};
        solution.sortColors(nums2);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, nums2);

        // Test case 3: All ones
        // Input: nums = [1, 1, 1, 1, 1]
        int[] nums3 = {1, 1, 1, 1, 1};
        solution.sortColors(nums3);
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, nums3);

        // Test case 4: All twos
        // Input: nums = [2, 2, 2, 2, 2]
        int[] nums4 = {2, 2, 2, 2, 2};
        solution.sortColors(nums4);
        assertArrayEquals(new int[]{2, 2, 2, 2, 2}, nums4);

        // Test case 5: Empty array
        // Input: nums = []
        int[] nums5 = {};
        solution.sortColors(nums5);
        assertArrayEquals(new int[]{}, nums5);

        // Test case 6: Single element array
        // Input: nums = [1]
        int[] nums6 = {1};
        solution.sortColors(nums6);
        assertArrayEquals(new int[]{1}, nums6);


    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        /**
         * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
         * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
         * 你可以按任意顺序返回答案。
         * 示例 1：
         * 输入：nums = [2,7,11,15], target = 9
         * 输出：[0,1]
         * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
         */
        int[] nums = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            if (map.containsKey(nums[i])) {
                indexs[1] = i;
                indexs[0] = map.get(nums[i]);
                return indexs;
            }
            map.put(target - nums[i], i);
        }
        return indexs;
    }
}


import java.util.HashSet;
import java.util.*;

public class ContainsDuplicate {

      //using HashSet
      // public static boolean containsDuplicate(int nums[]) {
      //       HashSet<Integer> seen = new HashSet<>();
      //       for (int num : nums) {
      //             if (seen.contains(num)) {
      //                   return true;
      //             }
      //             seen.add(num);
      //       }
      //       return false;
      // }

      //using Sorting
      // public static boolean containsDuplicate(int nums[]) {
      //      Arrays.sort(nums);
      //       for (int i = 1; i < nums.length; i++) {
      //             if (nums[i] == nums[i - 1]) {
      //                   return true;
      //             }
      //       }
      //       return false;
      // }
      //using brute force
      public static boolean containsDuplicate(int nums[])
      {
            for (int i = 0; i < nums.length; i++) {
                  for (int j = i + 1; j < nums.length; j++) {
                        if (nums[i] == nums[j]) {
                              return true;
                        }
                  }
            }
            return false;
      }

      public static void main(String[] args) {
            int arr[] = { 1, 2, 3, 1 };
            System.out.println(containsDuplicate(arr));
      }
}

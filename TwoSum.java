public class TwoSum {
      public static void twoSum(int arr[], int target){
            for (int i = 0; i < arr.length; i++) {
                  for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] + arr[j] == target) {
                              System.out.println("Pair found: " + arr[i] + " and " + arr[j]);
                              return;
                        }
                  }
            }
            System.out.println("No pair found that sums to " + target);
      }
      public static void main(String[] args) {
            int arr[] = { 2, 7, 11, 15 };
            int target = 9;
            twoSum(arr, target);
      }

}

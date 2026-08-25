
class Solution {

    public static int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {

                    return new int[]{numbers[i], numbers[j]};
                }
            }
        }

        return new int[]{};
    }

    // public static void main(String[] args) {

    //     int numbers[] = {1, 2, 3, 4};
    //     int target = 3;

    //     System.out.println(Arrays.toString(twoSum(numbers, target)));
    // }
}
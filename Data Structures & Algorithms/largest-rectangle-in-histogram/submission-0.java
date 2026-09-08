class Solution {
    public int largestRectangleArea(int[] heights) {

        int max = 0;

        for (int i = 0; i < heights.length; i++) {

            int min = heights[i];

            for (int j = i; j < heights.length; j++) {

                min = Math.min(min, heights[j]);

                int width = j - i + 1;

                int area = min * width;

                max = Math.max(max, area);
            }
        }

        return max;
    }
}
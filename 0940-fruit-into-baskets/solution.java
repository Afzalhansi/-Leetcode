class Solution {
    public int totalFruit(int[] fruits) {

        int left = 0;
        int right = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        int maxlength = 0;

        while (right < fruits.length) {

            // Add current fruit
            map.put(
                fruits[right],
                map.getOrDefault(fruits[right], 0) + 1
            );

            // Shrink window if we have more than 2 fruit types
            while (map.size() > 2) {

                int fruit = fruits[left];

                map.put(fruit, map.get(fruit) - 1);

                if (map.get(fruit) == 0) {
                    map.remove(fruit);
                }

                left++;
            }

            // Current window is valid
            maxlength = Math.max(maxlength, right - left + 1);

            right++;
        }

        return maxlength;
    }
}


class Solution {

    public int minDays(int[] bloomDay, int m, int k) {

        // Total flowers required
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Find minimum and maximum day
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        // Binary Search on days
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canMake(bloomDay, m, k, mid)) {

                // mid days are enough
                // Try fewer days
                high = mid - 1;

            } else {

                // mid days are not enough
                // Need more days
                low = mid + 1;
            }
        }

        return low;
    }


    // Can we make m bouquets within 'day' days?
    private boolean canMake(int[] bloomDay, int m, int k, int day) {

        int flowers = 0;
        int bouquets = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {

                // Flower has bloomed
                flowers++;

                // Enough adjacent flowers for one bouquet
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }

            } else {

                // Adjacency broken
                flowers = 0;
            }

            // Already made enough bouquets
            if (bouquets >= m) {
                return true;
            }
        }

        return false;
    }
}


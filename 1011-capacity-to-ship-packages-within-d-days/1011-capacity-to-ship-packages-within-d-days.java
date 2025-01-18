/*class Solution {
    //rang=maxelement-sumofarray
    public int shipWithinDays(int[] weights, int d) {
    int lo = getMax(weights);
    int hi = getSum(weights);
    while (lo < hi) {
        int capacity = (lo + hi) >>> 1; // avoid overflow. same as (lo + hi) / 2
        int requiredDays = getRequiredDays(weights, capacity);

        if (requiredDays > d) {
            lo = capacity + 1;
        } else {
            hi = capacity;
        }
    }
    return lo;
}

private int getRequiredDays(int[] weights, int maxCapacity) {
    int requiredDays = 1;
    int capacity = 0;
    for (int weight : weights) {
        capacity += weight;
        if (capacity > maxCapacity) {
            requiredDays++;
            capacity = weight;
        }
    }
    return requiredDays;
}

private int getSum(int[] arr) {
    int sum = 0;
    for (int val : arr) {
        sum += val;
    }
    return sum;
}

private int getMax(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int val : arr) {
        max = Math.max(max, val);
    }
    return max;
}
}*/
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight = -1, totalWeight = 0;
        for (int weight : weights) {
            maxWeight = Math.max(maxWeight, weight);
            totalWeight += weight;
        }
        int left = maxWeight, right = totalWeight;
        while (left < right) {
            int mid = (left + right) / 2;
            int daysNeeded = 1, currWeight = 0;
            for (int weight : weights) {
                if (currWeight + weight > mid) {
                    daysNeeded++;
                    currWeight = 0;
                }
                currWeight += weight;
            }
            if (daysNeeded > days) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
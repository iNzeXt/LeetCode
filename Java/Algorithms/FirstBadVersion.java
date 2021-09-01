package leetcode.algorithms;

import java.util.Random;

/**
 * 	@problemNumber 278
 *  @source https://leetcode.com/problems/first-bad-version/
 *  @difficulty easy
 *  @author iNzeXt
 *  @date 31/08/2021
 */
public class FirstBadVersion {

    private int versionsRandNumber;

    public FirstBadVersion(int versionsRandNumber) {
        this.versionsRandNumber = new Random().nextInt(versionsRandNumber) + 1;
    }

    /**
     * You are a product manager and currently leading a team to develop a new product.
     * Unfortunately, the latest version of your product fails the quality check.
     * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
     *
     * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
     *
     * You are given an API bool isBadVersion(version) which returns whether version is bad.
     * Implement a function to find the first bad version. You should minimize the number of calls to the API.
     *
     */
    public int firstBadVersion(int n) {
        int first = 1, mid;
            while (n > first) {
                mid = (n - first) / 2 + first;
                if (isBadVersion(mid)) {
                    n = mid;
                } else if (!isBadVersion(mid)) {
                    first = mid + 1;
                }
            }

        return n;
    }

    public boolean isBadVersion(int version) {
        return version >= versionsRandNumber;
    }

    public int getVersionsRandNumber() {
        return this.versionsRandNumber;
    }

}

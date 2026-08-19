class Solution {
    public int[] productExceptSelf(int[] valuesArr) {
        int length = valuesArr.length;
        int[] resultArr = new int[length];

        resultArr[0] = 1;

        for (int idx = 1; idx < length; idx++) {
            resultArr[idx] = resultArr[idx - 1] * valuesArr[idx - 1];
        }

        int rightProduct = 1;

        for (int idx = length - 1; idx >= 0; idx--) {
            resultArr[idx] = resultArr[idx] * rightProduct;
            rightProduct = rightProduct * valuesArr[idx];
        }

        return resultArr;
    }
}
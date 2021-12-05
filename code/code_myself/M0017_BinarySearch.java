package code.code_myself;

public class M0017_BinarySearch {
    public static int binarySearch(int []array, int target) {
        // 查找范围起点、查找范围终点、查找范围中位数
        int start = 0, end = array.length-1, mid = 0;
        
        while(start < end) {
            mid = start + (end - start) / 2;
            if(array[mid] == target) {
                return mid;
            } else if(array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


    /************测试用例*************/
    public static void main(String[] args) {
        int[] array = {1,3,5,6,8,9,10,22,33,44};
        int index = binarySearch(array, 9);
        System.out.println(index);
    }
}

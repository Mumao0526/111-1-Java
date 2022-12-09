public class Test24_Search {
    public static void main(String[] args) {
        int[] Arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int number = 10;

        System.out.println("Find number>>" + number + "\nIndex>>" + FindIndex_binarySearch(Arr, number));
    }

    static int FindIndex_binarySearch(int[] array, int num) {
        int count = 0;
        if (array == null) return -1;

        int left = 0;   //min index
        int right = array.length - 1;   //max index

        while (left <= right) {
            int mid = (left + right) / 2;   //mid index

            if (num < array[mid]) {
                left = mid + 1;
            } else if (num > array[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }

            //debug
            System.out.printf("%d %d %d\n",left,mid,right);
            count++;
        }
        return -1;
    }
}
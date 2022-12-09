public class Test23_Sort {
    public static void main(String[] args) {
        int[] arr = {2,6,8,9,54,14,64,8,9,41,2,8,64,51};
        int[] result = Merge_sort(arr);
        for (int i:result) System.out.print(i+" ");

        System.out.println();

        result = CountSort(arr);
        for (int i:result)System.out.print(i+" ");
    }
    static int[] CountSort(int[] a){
        // From Wiki
        int b[] = new int[a.length];
        int max = a[0], min = a[0];
        for(int i : a){
            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }
        }
        //这里k的大小是要排序的数组中，元素大小的极值差+1
        int k = max - min + 1;
        int c[] = new int[k];
        for(int i = 0; i < a.length; i++){
            c[a[i]-min] += 1;//优化过的地方，减小了数组c的大小
        }
        for(int i = 1; i < c.length; i++){
            c[i] = c[i] + c[i-1];
        }
        for(int i = a.length-1; i >= 0; i--){
            b[--c[a[i]-min]] = a[i];//按存取的方式取出c的元素
        }
        return b;
    }
    static int[] Merge_sort(int arr[]){
        // Merge sort,from Wiki
        int[] orderedArr = new int[arr.length];
        for (int i = 2; i < arr.length * 2; i *= 2) {
            for (int j = 0; j < (arr.length + i - 1) / i; j++) {

                int left = i * j;
                int mid = left + i / 2 >= arr.length ? (arr.length - 1) : (left + i / 2);
                int right = i * (j + 1) - 1 >= arr.length ? (arr.length - 1) : (i * (j + 1) - 1);
                int start = left, l = left, m = mid;

                while (l < mid && m <= right) {
                    if (arr[l] < arr[m]) {
                        orderedArr[start++] = arr[l++];
                    } else {
                        orderedArr[start++] = arr[m++];
                    }
                }
                while (l < mid)
                    orderedArr[start++] = arr[l++];
                while (m <= right)
                    orderedArr[start++] = arr[m++];
                System.arraycopy(orderedArr, left, arr, left, right - left + 1);
            }
        }
        return arr;
    }
}

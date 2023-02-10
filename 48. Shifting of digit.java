public static void duplicateZeros(int[] arr) {
    int length = arr.length;
    for (int i = 0; i < length; i++) {
        if (arr[i] == 0) {
            System.arraycopy(arr, i, arr, i + 1, length - i - 1);
            ++i;
        }
    }
}

public static void main(String[] args) {
    int[] a = { 1, 0, 2, 3, 0, 4, 5, 0 };
    duplicateZeros(a);
    System.out.println(Arrays.toString(a));
}

public class AllOddInReverseDisplay {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};


        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
    }
}
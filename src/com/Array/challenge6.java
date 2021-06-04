public class challenge6 {

    public static void main(String[] args) {
        int a[] = {1,1,2,2};
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int c = 0;
            for (int j = 0; j <= i; j++) {
                if (a[i] != b[j])
                    c++;
            }
            if (c == i + 1)
                b[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0)
                System.out.println(b[i]);

        }
    }
}
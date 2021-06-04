public class selectionsort {

  public static void main(String[] args) {
    int a[] = { 19,8,6,13,2};
    int temp;
    for (int i = 0; i < a.length; i++) {
      int min = 999999;

      for (int k = i; k < a.length; k++) {
        if (min > a[k])
          min = a[k];
      }
      for (int j = 0; j < a.length; j++) {
        if (min == a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }

      }

    }
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}

public class Radix {

  public static int nth(int n, int col) {
    return ((Math.abs(n)/(int)Math.pow(10,col))%10);
  }

  public static int length (int n) {
    String str = Integer.toString(Math.abs(n));
    return (str.length());
  }

  public static void merge (SortableLinkedList original, SortableLinkedList[]buckets) {
    for (int i=0;i<buckets.length;i++) {
      original.extend(buckets[i]);
    }
  }

  public static void radixSortSimple(SortableLinkedList data) {
    int pass = 0;
    for (int i=0; i<data.size();i++) {
      pass = Math.max(length(data.get(i)), pass);
    }
    SortableLinkedList[] bucket = new SortableLinkedList[10];
    for (int i=0; i<10;i++) {
      bucket[i] = new SortableLinkedList();
      // make new lists for each of the 10 digits
    }
    for (int i=0; i<pass;i++) {
      while (data.size() != 0) {
        int num = data.get(0);
        int digit = nth(num, i);
        bucket[digit].add(num);
        data.remove(0);
      }
      merge (data, bucket);
    }
  }
}

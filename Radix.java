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
    int pass = 1;

    SortableLinkedList[] bucket = new SortableLinkedList[10];
    for (int i=0; i<10;i++) {
      bucket[i] = new SortableLinkedList();
      // make new lists for each of the 10 digits
    }
    for (int i=0; i<pass;i++) {
      if (i==0) {
        while (data.size()>0) {
          if (length(data.get(0))>pass) {
            pass = length(data.get(0));
          }
          bucket[0].add(data.get(0));
          data.remove(0);
        }
        merge(data, bucket);
      }
    }
    for (int i=0; i<pass;i++) {
      while (data.size() != 0) {
        int num = data.get(0);
        int digit = nth(num, i);
        bucket[digit].add(num);
        data.remove(0);
        //remove until list is empty, removing from the front
      }
      merge (data, bucket);
    }
  }

  public static void radixSort(SortableLinkedList data) {
    SortableLinkedList[] pos = new SortableLinkedList[10];
    for (int i=0;i<10;i++) {
      pos[i] = new SortableLinkedList();
    }
    SortableLinkedList[] neg = new SortableLinkedList[10];
    for (int i=0;i<10;i++) {
      neg[i] = new SortableLinkedList();
    }
    int pass = 0;
    for (int i=0; i<data.size();i++) {
      pass = Math.max(length(data.get(i)),pass);
    }
    for (int i=0; i<pass;i++) {
      while (data.size() != 0) {
        int num = data.get(0);
        int digit = nth(num, i);
        if (num <0) {
          neg[10-digit-1].add(num);
        }
        else {
          pos[digit].add(num);
        }
        data.remove(0);
      }
      merge (data, neg);
      merge (data, pos);
    }
  }
}

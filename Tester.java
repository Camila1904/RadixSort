public class Tester {
  public static void main (String[]args) {
    System.out.println("Nth place function:");

    int n = Radix.nth(132,1);
    int n1 = Radix.nth(132,0);
    int n2 = Radix.nth(132,2);

    if ((n==3) && (n1==2) && (n2 == 1)) {
      System.out.println("working!");
    }

    System.out.println();

    System.out.println("Length function:");
    int n3 = Radix.length(132);
    if (n3==3) {
      System.out.println("working!");
      System.out.println();
    }

    SortableLinkedList a = new SortableLinkedList();
    SortableLinkedList b = new SortableLinkedList();
    SortableLinkedList c = new SortableLinkedList();
    for(int i = 0; i < 15; i++){
      if (i < 5){
        a.add(i);
      } else if (i >= 5 && i < 10) {
        b.add(i);
      } else {
        c.add(i);
      }
    }
    SortableLinkedList[] test = {a, b, c};
    SortableLinkedList mix = new SortableLinkedList();
    mix.add(101);
    Radix.merge(mix, test);
    System.out.println("Merge Function:");
    System.out.println(mix);
    System.out.println();

    System.out.println("radixSimpleSort function:");
    SortableLinkedList sortSimple = new SortableLinkedList();
    sortSimple.add(12);   sortSimple.add(34);   sortSimple.add(42);
    sortSimple.add(32);   sortSimple.add(44);   sortSimple.add(41);
    sortSimple.add(34);   sortSimple.add(11);   sortSimple.add(32);
    sortSimple.add(23);   sortSimple.add(87);   sortSimple.add(50);
    sortSimple.add(77);   sortSimple.add(58);   sortSimple.add(8);
    System.out.println(sortSimple);
    Radix.radixSortSimple(sortSimple);
    System.out.println(sortSimple);
    if (sortSimple.toString().equals("[8, 11, 12, 23, 32, 32, 34, 34, 41, 42, 44, 50, 58, 77, 87]")) {
      System.out.println("working!!");
    } else {
      System.out.println("uh oh, you have done something very wrong");
    }
    System.out.println();
    System.out.println("radixSort function:");
    SortableLinkedList sort = new SortableLinkedList();
    sort.add(10);    sort.add(52);
    sort.add(5);     sort.add(209);
    sort.add(19);    sort.add(44);
    System.out.println(sort);
    Radix.radixSort(sort);
    System.out.println(sort);
    if (sort.toString().equals("[5, 10, 19, 44, 52, 209]")) {
      System.out.println("working!!");
    } else {
      System.out.println("uh oh, you have done something very wrong");
    }
    System.out.println();

    SortableLinkedList sortInt = new SortableLinkedList();
    sortInt.add(28);    sortInt.add(-39);    sortInt.add(-101);
    sortInt.add(2);     sortInt.add(201);    sortInt.add(-14);
    sortInt.add(-26);   sortInt.add(-3);     sortInt.add(0);
    sortInt.add(14);    sortInt.add(-28);    sortInt.add(-143);
    System.out.println(sortInt);
    Radix.radixSort(sortInt);
    System.out.println(sortInt);
    if (sortInt.toString().equals("[-143, -101, -39, -28, -26, -14, -3, 0, 2, 14, 28, 201]")) {
      System.out.println("working!! (again!)");
    } else {
      System.out.println("uh oh, you have done something very wrong (again)");
    }

  }
}

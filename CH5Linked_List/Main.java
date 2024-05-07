


public class Main {
  public static void main(String[] args) {

    LinkedList theList = new LinkedList();

    System.out.println(theList.isEmpty());

    theList.isertFrist(0, 10.1);
    theList.isertFrist(0, 20.2);
    theList.isertFrist(30, 30.3);
    theList.isertFrist(40, 40.4);   // 4

    theList.display();

    System.out.println(theList.deleteFirst());

    theList.display();

    System.out.println(theList.isEmpty());

    System.out.println(theList.find(30));

    theList.sumList();

    theList.CountZeroList();

  }
}

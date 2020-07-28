package CollectionsLessons.LinkedListLesson;


public class Test {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(6));

        myLinkedList.remove(1);
        System.out.println(myLinkedList);

    }
}

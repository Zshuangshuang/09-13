/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-13
 * Time:19:08
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(10);
        myLinkedList.addLast(20);
        myLinkedList.addLast(30);
        myLinkedList.display();
        myLinkedList.addFirst(99);
        myLinkedList.display();
        myLinkedList.addIndex(2,88);
        myLinkedList.display();
        myLinkedList.remove(30);
        myLinkedList.display();
    }
}

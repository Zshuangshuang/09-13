/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-13
 * Time:19:07
 **/

class Node{
    private int data;
    private Node next;
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {
    public Node head;

    public MyLinkedList() {
        this.head = head;
    }
    public void addFirst(int data){
        Node node = new Node(data);
        if (this.head == null){
            this.head = node;
            return;
        }
        node.setNext(this.head);
        this.head = node;
    }
    public void display(){
        Node cur = this.head;

        while(cur != null){
            System.out.print(cur.getData()+"  ");
            cur = cur.getNext();
        }
        System.out.println();
    }
    public void addLast(int data){
        Node node = new Node(data);
        Node cur = this.head;
        if (this.head == null){
            this.head = node;
            return;
        }
        while(cur.getNext() != null){
            cur = cur.getNext();
        }
        cur.setNext(node);
    }
    public int size(){
        Node cur = this.head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.getNext();
        }
        return count;
    }
    private boolean checkPos(int pos){
        if (pos < 0 || pos > size()){
            return true;
        }
        return false;
    }
    private Node findIndex(int pos){
        Node prev = this.head;
        while(pos-1 > 0 ){
            prev = prev.getNext();
            pos--;
        }
        return prev;
    }
    public void addIndex(int pos,int data){
        boolean ret = checkPos(pos);
        if (ret){
            System.out.println("pos不合法");
            return;
        }
        if (pos == 0){
            addFirst(data);
            return;
        }
        if (pos == size()){
            addLast(data);
            return;
        }
        Node prev = findIndex(pos);
        Node node = new Node(data);
        node.setNext(prev.getNext());
        prev.setNext(node);
    }
    private Node findToRemove(int key){
        Node toRemove = this.head;
        while(toRemove.getNext() != null){
            if (toRemove.getNext().getData() == key){
                return toRemove;
            }
          toRemove = toRemove.getNext();
        }
        return null;
    }
    public void remove(int key){
        if (findToRemove(key) == null){
            System.out.println("没有你要删除的节点");
            return;
        }
        if (this.head.getData() == key){
            this.head = this.head.getNext();
            return;
        }
        Node temp = findToRemove(key);
        Node del = temp.getNext();
        temp.setNext(del.getNext());
    }
}

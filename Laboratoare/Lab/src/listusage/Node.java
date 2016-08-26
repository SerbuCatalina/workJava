package listusage;

/**
 * List that holds int.
 */
public class Node {
    private int value;

    private Node next;

    public Node() {
    }

    public boolean hasNext(){
        if(next!=null){
            return true;
        }
        return false;
    }

    public boolean isFirst(){
        if(null==next){
            return true;
        }
        return false;
    }
    public Node getNext(){
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

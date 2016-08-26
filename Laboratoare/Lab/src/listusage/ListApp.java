package listusage;

/**
 * LAB4_ex4
 */
public class ListApp {
    public static void main(String[] args){
        Node firstNode = new Node();
        firstNode.setValue(3);

        Node secondNode = new Node();
        secondNode.setValue(4);

        Node thirdNode = new Node();
        thirdNode.setValue(5);

        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        thirdNode.setNext(null);

        Node i = firstNode;
        do{
            System.out.println(i.getValue());
        }while((i=i.getNext())!=null);


    }
}

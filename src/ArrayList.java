import java.lang.IndexOutOfBoundsException;
public class ArrayList<T>{

    private T obj;
    private Nodes firstNode;
    private Nodes lastNode;
    private int length;

    public ArrayList() {}
    public boolean add(T data) {}

    public void add(int i, T data) {}

    public T remove(int i) {}

    public Object get(int i) {
        //Check whether i is in bounds
        if (i > length) {
            throw new ArrayIndexOutOfBoundsException("Requested index out of bounds.");
        } else {
            //Loop through using .getChild to get target node
            Nodes tempNode = firstNode;
            for (int x = 0; x < i; x++) {
                firstNode.getChild();
            }
            return tempNode.getObj();
        }
    }

    public T set(int i, T data) {}

    public int size() {}
}
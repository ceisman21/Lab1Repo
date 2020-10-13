public class ArrayList{

    private Nodes firstNode;
    private Nodes lastNode;
    private int length;

    public ArrayList() {
        firstNode = new Nodes();
        lastNode = firstNode;
        length = 1;
    }
    public boolean add(T data) {}

    public void add(int i, T data) {}

    public T remove(int i) {}

    public T get(int i) {}

    public T set(int i, T data) {}

    public int size() {
        return length;
    }
}
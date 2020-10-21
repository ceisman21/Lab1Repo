/*
Dhruv Sharma
10/13/2020
10/13/2020
This redefines the ArrayList class using nodes.
 */

public class ArrayList<T>{

    private T obj;
    private Nodes firstNode;
    private Nodes lastNode;
    private int length;

    public ArrayList() {}
    public boolean add(T data) {}

    public void add(int i, T data) {}

    public T remove(int i) { //removes a node and sets surrounding nodes as parent and child
        Nodes tempChild = new Nodes();
        Nodes tempParent = new Nodes();
        Nodes tempReg = new Nodes();

        tempReg = firstNode;
            for(int j = 0; j < i; j ++) //access the node to be removed
            {
                tempReg = tempReg.getChild();
            }

        tempChild = tempReg.getChild();
        tempParent = tempReg.getParent();

        //connect parent and child
        tempParent.setChild(tempChild);
        tempChild.setChild(tempParent);

        return tempReg.getObj(); //return removed node
    }

    private  counting

    public T get(int i) {}

    public T set(int i, T data) {}

    public int size() {}
}
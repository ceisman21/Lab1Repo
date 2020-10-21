
import java.lang.IndexOutOfBoundsException;
public class ArrayList<T>{

    private T obj;
    private Nodes firstNode;
    private Nodes lastNode;
    private int length;

    public ArrayList() {
        firstNode = new Nodes();
        lastNode = firstNode;
        length = 1;
    }

    public boolean add(T data) {
        try {
            Nodes temp = new Nodes();
            temp.setObj(data);
            lastNode.setChild(temp);
            lastNode = temp;
            length++;
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    public void add(int i, T data) {
        Nodes temp = new Nodes();
        temp.setObj(data);
        Nodes running = firstNode;
        Nodes counting = firstNode;
        if(i == 0){
            firstNode.setParent(temp);
            firstNode = temp;
            length++;
        }
        if(i == length-1){
            lastNode.setChild(temp);
            lastNode = temp;
            length++;
        }
        else{
            for(int j = 0; j < i; j++){
                running = running.getChild();
            }
            for(int j = 0; j <= i; j++){
                counting = counting.getChild();
            }
            running.setChild(temp);
            counting.setParent(temp);
            temp.setParent(running);
            temp.setChild(counting);
        }
    }
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

        return (T)(tempReg.getObj()); //return removed node
    }
    public Object get(int i) {
        //Check whether i is in bounds
        if (i > length -1 || i < 0) {
            throw new ArrayIndexOutOfBoundsException("Requested index out of bounds.");
        } else {
            //Loop through using .getChild to get target node
            Nodes tempNode = firstNode;
            for (int x = 0; x < i; x++) {
                tempNode = tempNode.getChild();
            }
            return tempNode.getObj();
        }
    }

    public void set(int i, T data) {
        //Check whether i is in bounds
        if (i > length) {
            throw new ArrayIndexOutOfBoundsException("Requested index out of bounds.");
        } else {
            //Loop through using .getChild to get target node
            Nodes tempNode = firstNode;
            for (int x = 0; x < i; x++) {
                tempNode = tempNode.getChild();
            }
            tempNode.setObj(data);
        }
    }

    public int size() {
        return length;
    }
}

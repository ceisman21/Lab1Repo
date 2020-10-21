public class ArrayList<T>{

    private T obj;
    private Nodes firstNode;
    private Nodes lastNode;
    private int length;

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
}

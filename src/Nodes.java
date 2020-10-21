/*
Jim Fahey
9/28/20
10/1/20
This is a node data structure class. Everything is tested in main.
 */
public class Nodes<T> {
    private T obj;
    private Nodes p;
    private Nodes c;

    Nodes(){
    }
    public void Nodes(T obj, Nodes p, Nodes c){
        this.obj = obj;
        this.p = p;
        this.c = c;
    }
    public void Nodes(T obj){
        this.obj = obj;
    }
    public T getObj(){
        return this.obj;
    }
    public Nodes getParent(){
        return this.p;
    }

    public Nodes getChild(){
        return this.c;
    }

    public void setObj(T obj){
        this.obj = obj;
    }

    public void setParent(Nodes n){
        this.p = n;
    }

    public void setChild(Nodes n){
        this.c = n;
    }

    public String toString(){
        String s = "Node-type: " + this.getObj().getClass().getName() + "\nNode-Value: " + this.getObj();
        return s;
    }
    public boolean nodeEquals(Nodes a, Nodes b){
        if(a.getObj().equals(b.getObj())){
            return true;
        }
        else {
            return false;
        }
    }
}
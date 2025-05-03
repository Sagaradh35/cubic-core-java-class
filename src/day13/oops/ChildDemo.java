package day13.oops;

public class ChildDemo extends ParentDemo{

    public ChildDemo(){
        super(6);
        System.out.println(" Hello from Child default Constructor.");
    }
    public ChildDemo(int a){
        super();
        System.out.println(" Hello from Child parameterlized Constructor.");
    }

}

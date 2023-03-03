package Generic;

public class Box {
    Object container;
    public Box(Object container){
        this.container = container;
    }

    public Object getValue(){
        return this.container;
    }
}

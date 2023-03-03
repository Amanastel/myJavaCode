package Generic;

public class Box<T> {
    T container;
    public Box(T container){
        this.container = container;
    }
    public void perFormSomeTask(){
        if(container instanceof String){
            System.out.println("length of "+ container+ " is " + (((String)this.container).length()));
        } else if (container instanceof Integer) {
            System.out.println("this is a integer value "+ container);
        }
    }
    public Object getValue(){
        return this.container;
    }
}

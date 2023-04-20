package com.masai;

public class Travel {

    private Vehicle v;
    private int numberOFPerson;

    public Travel() {
    }

    public Travel(Vehicle v, int numberOFPerson) {
        super();
        this.v = v;
        this.numberOFPerson = numberOFPerson;
    }

    public void setV(Vehicle v) {
        this.v = v;
    }

    public void setNumberOFPerson(int numberOFPerson) {
        this.numberOFPerson = numberOFPerson;
    }

    public void journey(){
        v.go();
        System.out.println("Jounrney started...");

        System.out.println("number of person are :"+numberOFPerson);
    }
}

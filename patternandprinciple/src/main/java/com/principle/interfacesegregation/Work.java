package com.principle.interfacesegregation;

interface Workable{
    void work();
}

interface Eatable{
    void eat();
}

class HumanWorker implements Workable, Eatable{

    @Override
    public void work() {
        System.out.println("Human work");
    }

    @Override
    public void eat() {
        System.out.println("Human eat");
    }
}

class RobotWorker implements Workable{

    @Override
    public void work() {
        System.out.println("Robot work");
    }
}

public class Work {
    public static void main(String[] args) {
        HumanWorker humanWorker = new HumanWorker();
        humanWorker.work();
        humanWorker.eat();
        RobotWorker robotWorker = new RobotWorker();
        robotWorker.work();
    }
}

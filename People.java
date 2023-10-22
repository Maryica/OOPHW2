
interface PeopleBehaviour {
    void setMakeOrder();

    void setTakeOrder();

    boolean isMakeOrder = false;
    boolean isTakeOrder = false;
}

abstract class People implements PeopleBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public People(String name) {
        this.name = name;
        isMakeOrder = false;
        isTakeOrder = false;
    }

    public String getName() {
        return name;
    }

    public abstract void setMakeOrder(boolean b);

    public abstract void setTakeOrder(boolean b);
}

class Human extends People {
    public Human(String name) {
        super(name);
    }

    @Override
    public void setMakeOrder(boolean b) {
        this.isMakeOrder = b;
    }

    @Override
    public void setTakeOrder(boolean b) {
        this.isTakeOrder = b;
    }

    @Override
    public void setMakeOrder() {

    }

    @Override
    public void setTakeOrder() {

    }
}

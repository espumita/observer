package command;

public class ReceiverClass {
    private Integer count = 0;

    public Integer count() {
        return count;
    }

    public void action1() {
        this.count += 10;
    }

    public void action2() {
        this.count += 500;
    }

    public void unDoAction1() {
        this.count -= 10;
    }

    public void unDoAction2() {
        this.count -= 500;
    }
}

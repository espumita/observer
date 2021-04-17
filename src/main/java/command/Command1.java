package command;

public class Command1 implements Command{

    private ReceiverClass receiver;

    public Command1(ReceiverClass receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action1();
    }

    @Override
    public void unExecute() {
        receiver.unDoAction1();
    }
}

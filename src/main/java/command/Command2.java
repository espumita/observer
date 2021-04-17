package command;

public class Command2 implements Command {

    private ReceiverClass receiver;

    public Command2(ReceiverClass receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action2();
    }

    @Override
    public void unExecute() {
        receiver.unDoAction2();
    }
}

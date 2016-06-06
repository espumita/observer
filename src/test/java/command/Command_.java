package command;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Command_ {

    private InvokerClass invoker;
    private ReceiverClass receiver;
    private Command1 command1;
    private Command2 command2;

    @Before
    public void setUp() throws Exception {
        invoker = new InvokerClass();
        receiver = new ReceiverClass();
        command1 = new Command1(receiver);
        command2 = new Command2(receiver);
    }

    @Test
    public void when_we_use_two_commands_we_get_a_command_history_with_two_entries() throws Exception {
        invoker.storeAndExecute(command1);
        invoker.storeAndExecute(command2);

        assertThat(invoker.historySize(),is(2));
    }

    @Test
    public void when_we_use_two_commands_and_then_we_undo_the_last_one_the_result_should_not_be_modified() throws Exception {
        invoker.storeAndExecute(command1);
        invoker.storeAndExecute(command2);
        invoker.unExecuteLastCommand();

        assertThat(receiver.count(),is(10));
    }

}

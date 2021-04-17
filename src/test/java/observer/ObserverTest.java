package observer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ObserverTest {

    @Mock Observer1 observer1;
    @Mock Observer2 observer2;

    @Test
    public void when_add_one_single_item_observers_should_be_notified() {
        ObservedClass observedClass = new ObservedClass();
        observedClass.addObserver(observer1);
        observedClass.addObserver(observer2);

        observedClass.change("A change");

        verify(observer1).update("A change");
        verify(observer2).update("A change");
    }
}
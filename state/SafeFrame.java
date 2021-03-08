package state;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);
    private Button buttonUse = new Button("use safe");
    private Button buttonAlarm = new Button("emergency bell");
    private Button buttonPhone = new Button("ordinary call");
    private Button buttonExit = new Button("done");

    private State state = DayState.getInstance();

    public SafeFrame(String title) {

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    @Override
    public void setClock(int hour) {

    }

    @Override
    public void changeState(State state) {

    }

    @Override
    public void callSecurityCenter(String msg) {

    }

    @Override
    public void recordLog(String msg) {

    }
}

package state;

public class NightState implements State {
    private static NightState singleton = new NightState();

    private NightState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {

    }

    @Override
    public void doUse(Context context) {

    }

    @Override
    public void doAlarm(Context context) {

    }

    @Override
    public void doPhone(Context context) {

    }
}

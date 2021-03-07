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
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("Emergency: safe use at night!");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Emergency Bell (night)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("night call recording");
    }

    public String toString() {
        return "[night]";
    }
}

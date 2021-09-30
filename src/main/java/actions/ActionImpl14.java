package actions;

public class ActionImpl14 implements Action {
    @Override
    public void perform() {
        new Thread(() -> {
            try {
                // intense calculation
                Thread.sleep(15000);
            } catch (InterruptedException ignored) { }
        }).run();
    }
}

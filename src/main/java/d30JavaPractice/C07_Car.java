package d30JavaPractice;

public class C07_Car implements C07_Vehicle {

    @Override
    public void start() {
        System.out.println("Car has started");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }
}

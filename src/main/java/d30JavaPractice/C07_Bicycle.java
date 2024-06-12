package d30JavaPractice;

public class C07_Bicycle implements C07_Vehicle {

    public void start() {
        System.out.println("Bicycle has started");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle has stopped");
    }


}

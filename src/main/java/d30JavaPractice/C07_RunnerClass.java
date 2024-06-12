package d30JavaPractice;

public class C07_RunnerClass {
    public static void main(String[] args) {
        C07_Car car = new C07_Car();
        C07_Bicycle cycle = new C07_Bicycle();

        car.start();
        car.stop();

        cycle.start();
        cycle.stop();
    }

}

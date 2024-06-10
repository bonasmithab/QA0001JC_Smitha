package AbstractinPractice;

public class TestChild extends TestAbs02 {


   /* @Override
    public void abs2() {
        System.out.println("true = " + true);

    } */

    @Override
    public void abs1() {
        System.out.println(true + "Child");
        super.abs1();
        super.abs2();
    }
}

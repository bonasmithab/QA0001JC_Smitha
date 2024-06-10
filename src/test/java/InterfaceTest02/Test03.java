package InterfaceTest02;

public class Test03 {
    public static void main(String[] args) {
        E b = new E() {
            @Override
            public int methodB(int i) {
                return 0;
            }
        };
        System.out.println(b.methodB(5));
    }
}
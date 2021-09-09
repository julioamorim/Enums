public class TestClass {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> System.out.println("running..."));

        thread.start();


        Priority pMin = Priority.MIN;
        Priority pMax = Priority.MAX;

        System.out.println(pMin.ordinal());
        System.out.println(pMax.ordinal());

        System.out.println(pMin.getValue());



        System.out.println(Day.MONDAY);

    }
}

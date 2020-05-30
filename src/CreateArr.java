
public class CreateArr implements Runnable {
    static final int SIZE = 10000000;
    static final int h = SIZE / 2;

    @Override
    public void run() {
        float[] arr = new float[SIZE];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            System.currentTimeMillis();
        }
        float t = (System.currentTimeMillis() - a) / 1000.0f;
        System.out.println("Время создания массива составило: " + t + " Секунд");


    }
}

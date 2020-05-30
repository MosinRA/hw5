import java.util.Arrays;

public class DubArr implements Runnable {
    static final int SIZE = 10000000;
    static final int h = SIZE / 2;
    @Override
    public void run() {
        float[] arr = new float[SIZE];
        long b = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1.0f;
        }


        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

        }


        float[] a1 = new float[h];
        float[] a2 = new float[h];

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);


        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        float t = (System.currentTimeMillis() - b) / 1000.0f;
        System.out.println("Время выполнения создания деления и обратной склейки составило: " + t + " Секунд");

    }
}

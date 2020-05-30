public class Main {


    public static void main(String[] args) {
        CreateArr createArr = new CreateArr();
        DubArr dubArr = new DubArr();
        new Thread(createArr).start();
        new Thread(dubArr).start();

    }
}



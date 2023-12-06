import java.io.FileOutputStream;

public class HookTest {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("out.txt");
            fos.write("hook 테스트".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

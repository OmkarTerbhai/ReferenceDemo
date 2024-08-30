import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Main {
    public static void main(String[] args) {

        String str = new String("Hello");
        String str2 = new String("Bye");

        WeakReference<String> weakReference = new WeakReference<>(str);
        SoftReference<String> softReference = new SoftReference<>(str2);

        str = null;
        str2 = null;
        System.gc();

        System.out.println(weakReference.get());
        System.out.println(softReference.get());
    }
}
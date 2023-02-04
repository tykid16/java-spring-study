import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) throws IOException {
        try (
                var soc = new Socket("localhost", 1600);
                OutputStream is = soc.getOutputStream()
        ) {
            is.write(234);
        }
    }
}

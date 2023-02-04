import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        // ポート番号の指定
        var server = new ServerSocket(1600);
        System.out.println("warnig...!");
        Socket soc = server.accept();
        System.out.println("connect from  " + soc.getInetAddress());

        // データの受信
        InputStream input = soc.getInputStream();
        System.out.println(input.read());
        input.close();

        // ソケットを閉じる
        soc.close();
    }
}

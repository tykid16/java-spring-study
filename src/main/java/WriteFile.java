import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Collections;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        try {
            var message = """
                    test
                    message
                    """;
            var p = Path.of("test.txt");
            Files.write(p, Collections.singleton(message));
        } catch (NoSuchFileException e) {
            System.out.println(":" + e.getFile());
        }
    }
}

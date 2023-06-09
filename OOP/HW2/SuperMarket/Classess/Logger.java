package OOP.HW2.SuperMarket.Classess;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private File logger = new File("log.txt");
    private static FileWriter writer;

    public static void textLog(String text){
        try{
            writer = new FileWriter("log.txt", true);
            writer.write(text);
            writer.write(": " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            writer.write("\n");
            writer.close();
        }
        catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    private static DateTimeFormatter DateTimeFormatter(String string) {
        return null;
    }
}

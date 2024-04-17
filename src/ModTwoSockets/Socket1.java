package ModTwoSockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Socket1 {
    public static void main(String[] args) throws IOException {
        String host = "localHost";
        int port = 12345;
        Socket socket = new Socket(host, port);                       //подсключаемся к серверу

        boolean isChatActive= true;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //объект для считываеия даннызх в буфер с сервера
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);                   // объект для отправки данных(ответа)
//        printWriter.println("Hello from client 1 ");                                                   // autoFlush - сброс данных с буфера в основной поток

        Scanner scanner = new Scanner(System.in);
        while (isChatActive){
            printWriter.println(scanner.nextLine());
            String str =bufferedReader.readLine();
            System.out.println("From server: " + str  );

            if ("STOP".equalsIgnoreCase(str)){
                isChatActive=false;
            }
        }


//        String str = bufferedReader.readLine();                             //  save данные
//        System.out.println("response from server: "+ str);
        socket.close();
    }

}

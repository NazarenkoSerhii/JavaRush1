package ModTwoSockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServerMain {                                           // ServerSocket class
    public static void main(String[] args) throws IOException {
        int port = 12345;                                                              //порт на котором стартует сервер
        ServerSocket serverSocket = new ServerSocket(port);                         // создаем сервер

        Socket socket1 = serverSocket.accept();                              // подключение Socket
        System.out.println("Socket1 connected!");

        boolean isChatActive = true;

        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReaderFromSocket1 = new BufferedReader(new InputStreamReader(socket1.getInputStream())); //объект для считываеия даннызх с Socket
        PrintWriter printWriterFromSocket1 = new PrintWriter(socket1.getOutputStream(), true);                  // объект для отправки данных(ответа)
//        printWriterFromSocket1.println("Hello,client 1");                                                              // autoFlush - сброс данных с буфера в основной поток


        while (isChatActive) {

            String s = bufferedReaderFromSocket1.readLine();
            System.out.println("response from client 1 : " + s);

            if ("stop".equalsIgnoreCase(s)) {
                isChatActive = false;
            }
            printWriterFromSocket1.println(scanner.nextLine());
        }

//        String s = bufferedReaderFromSocket1.readLine();
//        System.out.println("response from client : "+ s);
        socket1.close();
        serverSocket.close();
    }
}



import java.io.*;
import java.net.Socket;
import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args)
    {

    try(Socket socket = new Socket("127.0.0.1", 8000);
                BufferedWriter writer =
                            new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream()));
                BufferedReader reader =
                            new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()));
                ){

                System.out.println("preved");
                String request="volgograd";
                System.out.println("request: " + request);
                writer.write(request);
                writer.newLine();
                writer.flush();
    }

     catch (IOException e)
    {
        e.printStackTrace();
    }
}}

package ua.zp.brain.labs.oop.basics.work_with_the_network;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
// create server socket
        try (ServerSocket serverSocket = new ServerSocket(8888);
             Socket clientSocket = serverSocket.accept();
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);) {
            String input;
            String output;
            System.out.println("Wait for messages");
            while ((input = in.readLine()) != null) {
                if (input.equalsIgnoreCase("exit")) break;
                out.println("Response ::: " + "echo ->" + input);
                System.out.println(input);
            }
        } catch (IOException e) {
            System.out.println("Error on server");
            System.exit(-1);
        }
    }
}

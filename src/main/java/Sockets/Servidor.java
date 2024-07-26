//No modificar

package Sockets;

import java.io.*;
import java.net.*;

public class Servidor {
    private ServerSocket servidorSocket;

    public void start(int puerto) {
        try {
            servidorSocket = new ServerSocket(puerto);
            System.out.println("Servidor iniciado en el puerto " + puerto);
            while (true) {
                new gesti_Cliente(servidorSocket.accept()).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void detener() {
        try {
            servidorSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class gesti_Cliente extends Thread {
        private Socket clienteSocket;
        private PrintWriter salida;
        private BufferedReader entrada;

        public gesti_Cliente(Socket socket) {
            this.clienteSocket = socket;
        }

        public void run() {
            try {
                salida = new PrintWriter(clienteSocket.getOutputStream(), true);
                entrada = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));

                System.out.println("Nuevo cliente conectado: " + clienteSocket.getInetAddress().getHostAddress());

                String inputLine;
                while ((inputLine = entrada.readLine()) != null) {
                    System.out.println("Mensaje recibido del cliente: " + inputLine);
                    salida.println("Echo: " + inputLine);
                }

                entrada.close();
                salida.close();
                clienteSocket.close();
                System.out.println("Cliente desconectado: " + clienteSocket.getInetAddress().getHostAddress());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Servidor servidor = new Servidor();
        servidor.start(12345); // Puerto 
    }
}

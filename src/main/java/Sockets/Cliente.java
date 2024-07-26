//No modificar

package Sockets;

import java.io.*;
import java.net.*;

public class Cliente {
    
    private Socket clienteSocket;
    private PrintWriter salida;
    private BufferedReader entrada;

    public void iniConexion(String ip, int puerto) {
        try {
            clienteSocket = new Socket(ip, puerto);
            salida = new PrintWriter(clienteSocket.getOutputStream(), true);
            entrada = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String enviar(String msg) {
        salida.println(msg);
        String resp = null;
        try {
            resp = entrada.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resp;
    }

    public void detenerConexion() {
        try {
            entrada.close();
            salida.close();
            clienteSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.iniConexion("192.168.1.105", 12345); // Conectar al servidor en 192.168.1.105//12345
        String response = cliente.enviar("Hola, servidor. Nuevo cliente conectado.");
        System.out.println(response);
        cliente.detenerConexion();
    }
}

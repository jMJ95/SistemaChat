import java.net.Socket;
import java.net.ServerSocket;
import java.io.*;
import java.net.*;
import java.util.Scanner;


public class Chat {
    ServerSocket server;
    Socket socket;
    DataOutputStream salida;
    BufferedReader entrada;
    int puerto = 8080;
    public void Entrada(){
    try{
        System.out.println("Esperando la conexion ......");
       
        server = new  ServerSocket(puerto);
        
        
        socket = new Socket();
        socket = server.accept();
        entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("\nSea conectado un nuevo usuario....");
        String mensaje = entrada.readLine();
        System.out.println(mensaje);
        salida = new DataOutputStream(socket.getOutputStream());
        salida.writeUTF("\nEl mensaje sea enviado correctamente :)");
        socket.close();
        
        
    
    }catch(Throwable e){
    
    }
    
    
    }
}



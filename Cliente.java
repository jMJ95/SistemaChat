import java.util.Scanner;
import java.io.*;
import java.net.*;
public class Cliente {
    Socket cliente;
    BufferedReader entrada,teclado;
    PrintStream salida;
    String ip = "172.12.4.65";
    int puerto = 8080 ;

    public void Inicio (){
        try{
            System.out.println("\nBienvenido a mi sala de chat");
            
            cliente = new Socket(ip,puerto);
            
            
            entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            teclado = new BufferedReader(new InputStreamReader(System.in));
            String tl = teclado.readLine();
            
            salida = new PrintStream(cliente.getOutputStream());
            
            salida.println(tl);
            String msg = entrada.readLine();
            System.out.println(msg);
            entrada.close();
            salida.close();
            teclado.close();
            cliente.close();




        }catch(Throwable e){



        }


    }
    
}

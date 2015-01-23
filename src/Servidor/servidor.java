import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
public class servidor{
	public static void main (String []q){
	int x,y,suma,resta,factor,division;
	String a,b,c,con;
	boolean seguir = true;
	ServerSocket ss;
	try{
		ss = new ServerSocket(5051);
		Socket s1 = ss.accept();
		InputStream is = s1.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		while(seguir = true)
		{
		System.out.println("Esperando un numero...");
		a = dis.readUTF();
		System.out.println("Numero recibido: "+a);
		System.out.println("Esperando 2do numero...");
		b = dis.readUTF();
		System.out.println("Numero recibido: "+b);
		c = dis.readUTF();
		System.out.println("Operacion: "+c);
		char operacion = c.charAt(0);
		switch(operacion)
			{
			case '1':
				x = Integer.parseInt(a);
				y = Integer.parseInt(b);
				suma = x + y;
				System.out.println("El resultado es: "+suma);
				break;
			case '2':
				x = Integer.parseInt(a);
				y = Integer.parseInt(b);
				resta = x - y;
				System.out.println("El resultado es: "+resta);
				break;
			case '3':
				x = Integer.parseInt(a);
				y = Integer.parseInt(b);
				factor = x * y;
				System.out.println("El resultado es: "+factor);
				break;
			case '4':
				x = Integer.parseInt(a);
				y = Integer.parseInt(b);
				division = x / y;
				System.out.println("El resultado es: "+division);
				break;
			}
		con = dis.readUTF();
		if(con == "si")
			seguir = true;
		else
			seguir = false;
		}
		s1.close();
		dis.close();
		}
	catch(IOException e){
		System.out.println("Error");
		}
	}
}
		
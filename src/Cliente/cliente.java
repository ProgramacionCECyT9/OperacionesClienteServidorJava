import java.net.Socket;
import java.io.*;
public class cliente{
	public static void main (String []q){
		String c1,c2,c3,c4;
		boolean seguir = true;
		try{
			Socket s1 = new Socket("localhost",5051);
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader bf = new BufferedReader(isr);
			OutputStream os = s1.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			while(seguir = true)
				{
			System.out.println("Escribe un numero para enviar");
			c1 = bf.readLine();
			dos.writeUTF(c1);
			dos.flush();
			System.out.println("Escribe otro numero para enviar");
			c2 = bf.readLine();
			dos.writeUTF(c2);
			dos.flush();
			System.out.println("Escoge una opcion");
			System.out.println("1)Suma\n2)Resta\n3)Multiplicacion\n4)Division");
			c3 = bf.readLine();
			dos.writeUTF(c3);
			dos.flush();
			System.out.println("Hacer mas operaciones?(si/no)");
			c4 = bf.readLine();
			dos.writeUTF(c4);
			dos.flush();
			if(c4 == "si")
				seguir = true;
			else
				seguir = false;
				}
			s1.close();
			dos.close();
			}
		catch(IOException e){
			System.out.println("No se encontro el servidor");
			}
		}
	}
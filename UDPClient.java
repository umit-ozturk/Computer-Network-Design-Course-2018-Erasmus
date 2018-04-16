//UDPClient.java

import java.net.*;
import java.io.*;

class UDPClient 
{
   public static void main(String args[]) throws Exception
   {
   	  
   	  byte[] send_data = new byte[1024];
   	  
      BufferedReader infromuser = 
                        new BufferedReader(new InputStreamReader(System.in));
                        
      DatagramSocket client_socket = new DatagramSocket();
      
      InetAddress IPAddress =  InetAddress.getByName("127.0.0.1");
           
       
      client_socket.close();
   }
}

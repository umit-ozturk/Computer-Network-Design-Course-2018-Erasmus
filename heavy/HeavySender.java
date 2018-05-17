//UDPClient.java

import java.net.*;
import java.io.*;

class HeavySender 
{
   public static void main(String args[]) throws Exception
   {
      
      byte[] send_data = new byte[1024];
      
      BufferedReader infromuser = 
                        new BufferedReader(new InputStreamReader(System.in));
                        
      DatagramSocket client_socket = new DatagramSocket();
      
      InetAddress IPAddress =  InetAddress.getByName("127.0.0.1");
      
      while (true)
      {        
        String data = "000000";
           
        send_data = data.getBytes();
      
        DatagramPacket send_packet = new DatagramPacket(send_data,
                                                        send_data.length, 
                                                        IPAddress, 5000);
                                                      
        client_socket.send(send_packet);
        
        System.out.println("\u001B[32mdata : \u001B[31m" + send_packet + "\u001B[0m");

       
      }       
       
    
   }
}

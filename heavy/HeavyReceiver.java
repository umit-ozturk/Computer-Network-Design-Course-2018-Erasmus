//UDPServer.java

import java.net.*;
import java.io.*;


class HeavyReceiver 
{
   public static void main(String args[]) throws Exception
      {
      	
      	 byte[] receive_data = new byte[1024];
         byte[] send_data = new byte[1024];
         
         int recv_port;
         
         DatagramSocket server_socket = new DatagramSocket(6000);
         
         System.out.println ("UDPServer Waiting for client on port 5000");
         
              
         while(true)
         {
          
          DatagramPacket receive_packet = new DatagramPacket(receive_data,
                                              receive_data.length);
                                              
                  server_socket.receive(receive_packet);
                  
                  String data = new String(receive_packet.getData(),0,0
                                           ,receive_packet.getLength());
                  
                  InetAddress IPAddress = receive_packet.getAddress();
                  
                  recv_port = receive_packet.getPort();
                  
                  
                  System.out.println("( " + IPAddress + " , " + recv_port 
                  + " ) said :" + data );
                  
                  
         }
      }
}

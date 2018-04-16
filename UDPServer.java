//UDPServer.java

import java.net.*;
import java.io.*;


class UDPServer 
{
   public static void main(String args[]) throws Exception
      {
      	
      	 byte[] receive_data = new byte[1024];
         byte[] send_data = new byte[1024];
         
         int recv_port;
         
         DatagramSocket server_socket = new DatagramSocket(5000);
         
         System.out.println ("UDPServer Waiting for client on port 5000");
         
      }
}

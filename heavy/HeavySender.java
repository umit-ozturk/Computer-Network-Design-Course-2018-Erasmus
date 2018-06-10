import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class HeavySender {
   
   public HeavySender() {}

   static public void main(String args[]) throws Exception {
      // first parameter is destination host/IP
      InetAddress target = InetAddress.getByName("127.0.0.1");
      // second parameter is the destination port
      int port = Integer.parseInt(args[0]);
      // socket for sending UDP
      DatagramSocket socket = new DatagramSocket();
      // this tries to tune up the sending process by allocating upfront a large enough buffer
      // note: on some OS this tune-up may be useless or even harmful. Check the JVM and try-try-try
      socket.setSendBufferSize(0x10000);
      // use a large buffer, to maximize bytes on the wire per CPU effort. There is an upper limit.
      // filling the buffer with anything is pointless. Data is data even if it's all zero.
      byte[] buffer = new byte[0xFF00];
      long totalBytes = 0;
      long refTimeMS = System.currentTimeMillis();
      while (true) {
         // send the bytes
         DatagramPacket pkt = new DatagramPacket(buffer, buffer.length, target, port);
         socket.send(pkt);
         totalBytes += buffer.length;
         long elapsed = System.currentTimeMillis() - refTimeMS;
         if (elapsed >= 1000) {
            // (about) one second has elapsed
            long kbps = totalBytes * 8 / elapsed;  // elapsed is msec so result is kbps
            System.out.println(kbps + " kbps");
            totalBytes = 0;
            refTimeMS = System.currentTimeMillis();
         }
      }
   }
}
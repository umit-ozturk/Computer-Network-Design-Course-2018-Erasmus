**Work**

On Linux there is a command called netcat which can function either as client or as server, using either TCP or UDP protocols. Open a SSH connection to the Linux test server and identify the manual page for the netcat command. Compose the proper command which sends a UDP packet to port 12345 of your Windows workstation.
Note: port 12345 is special in the network laboratory workstations because it is treated as an exception in Windows firewall configuration. 

**Usage**

On Terminal;


```
	java UDPServer
```


An Other Terminal;

```
	java UDPClient
```

![Tcpdump Packet Catching](/images/tcpdump.png)



In the above picture, the right terminal is UDPClient, the left terminal is UDPServer, the following terminal is the tcpdump program.
The packet sent from the client program falls on the screen of the server program. Look at Tcpdump in detail.


In the picture below, we are monitoring the interface lo0 with wireshark. (lo0 interface for macOS systems).All details about the interface being sniffed are visible.

![Wireshark Sniffing](/images/wireshark.png)


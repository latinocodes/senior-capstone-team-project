/*  
 *  ConnectionMgr.java
 *  This class provides connection deleagetion for new socket
 * 
 *  Date: Jan 17, 2016
 *  CS493 - Senior Capstone
 *  @author Jose Lara
 * 
 */

package server.business;


import java.net.ServerSocket;
import java.net.Socket;


public class ConnectionMgr{
    
    public Socket socket = null;
    
    public void listen() {
        
        try{
            
            ServerSocket server = new ServerSocket(8000, 100);
            
            while(true){
                
                System.out.println("Server is Running!");
            
                socket = server.accept();

                Runnable socketThread = (Runnable) new SocketMgr(socket);

                new Thread(socketThread).start();
         
        }
            
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
    
    
    }
    
}
    
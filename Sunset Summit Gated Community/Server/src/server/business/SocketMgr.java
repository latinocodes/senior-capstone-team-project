/*  
 *  SocketMgr.java
 *  This class provides create the new socket request
 * 
 *  Date: Jan 17, 2016
 *  CS493 - Senior Capstone
 *  @author Jose Lara
 *  
 */

package server.business;

import sunset.domain.Login;
import java.io.*;
import java.net.*;

public class SocketMgr implements Runnable{
    
   private final String username = "root";
   private final String password = "admin";
   private Socket clientSocket;

public SocketMgr(Socket clientSocket) {
    this.clientSocket = clientSocket;

}
 
public void run(){

      ObjectInputStream in = null;
      ObjectOutputStream out = null;
      boolean success = false;

      try {

          in = new ObjectInputStream(clientSocket.getInputStream());
          out = new ObjectOutputStream(clientSocket.getOutputStream());
          Login login = (Login) in.readObject();

              if (login.getUsername().equalsIgnoreCase(username) && login.getPassword().equals(password)) {
                 success = true;
                 System.out.println("hello " + username + ". You are now Connected.");
                 out.writeObject(success);
              }
              else{
                  out.writeObject(success);
              }

              in.close();
              out.close();
              clientSocket.close();

      }catch(Exception e){
          e.printStackTrace();
      }

        
}

}


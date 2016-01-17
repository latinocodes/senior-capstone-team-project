    /*  
 *  
 *  This class provides business layer for server application
 * 
 *  Date: Jan 17, 2016
 *  CS493 - Senior Capstone
 *  @author Jose Lara
 *  
 */
package server.business;

public class AuthenticationServer {
    
    public AuthenticationServer(){
             
               
    };
    
    
    public static void main(String [] arg){
        
        ConnectionMgr myConnection = new ConnectionMgr();
        
        myConnection.listen();
        
        
    }
    
}

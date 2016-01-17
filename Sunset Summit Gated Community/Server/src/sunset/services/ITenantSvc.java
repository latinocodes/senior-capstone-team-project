/*  
 *  IBookSvc.java
 *  This interface stores the signature of the BookSvcSerializedOIImpl implementation
 * 
 *  Date: July 30, 2015
 *  CS434 - Object Oriented Programming Using Java
 *  @author Jose Lara
 *  @version 1
 */
package sunset.services;
import sunset.domain.*;

public interface ITenantSvc {
    
    public Tenant add(Tenant tenant) throws Exception;
    public Tenant find(Tenant tenant) throws Exception;

}
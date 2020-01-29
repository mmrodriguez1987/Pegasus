package JRodriguez.sql.db.usa;

import JRodriguez.sql.SqlHelper;
import JRodriguez.sql.SqlHelper.TypeManager;
import java.sql.*;

public class USA {
    SqlHelper sql;

    public USA() {
        // sql = new SqlHelper("SERVER","USA","sa","Pa$$w0rd");        
        //alm_expautos_expuser - informacion de los dealers
        //alm_expautos_images - informacion de los dealers        
        //database: autozone
        //user: azads
        //pass: 4d5au+o@z0n392
        sql = new SqlHelper(TypeManager.MySql,"184.168.70.128","pegasus","usrpegasus","Pa$$w0rd");         
        //sql = new SqlHelper(TypeManager.MySql,"184.168.70.128","autozone","azads","4d5au+o@z0n392");  
    }
    
    /**
     *
     * @param sFilter : Serch Filter in the View
     * @return
     */
    public ResultSet GetDealersInformation(String sFilter) {
        String str = "SELECT D.nNumDealer, D.cCodDealer, D.cNameDealer,D.cZonas , D.cCodVendedor,V.cNombreVendedor, V.cTelefono AS cTelefonoVendedor, V.cMail AS cMailVendedor,D.cCodState , S.cName AS cStateName ";                 
        str += " FROM tblCatDealer D INNER JOIN tblCatVendedor V ON V.cCodVendedor=D.cCodVendedor INNER JOIN tblCatState S on S.cCodState=D.cCodState WHERE ";
        ResultSet Resp = null; 
        try {
            if (sFilter == null || sFilter.length() <= 0) {
                str +=" 1=1 ORDER BY D.cNameDealer;";            
            } else {
                 str += sFilter + " ORDER BY D.cNameDealer;";            
            }
                
          
            Resp = sql.ExecuteSQL(str);            
        } catch( Exception e) {
            System.out.println("ResultSet GetDealersInformation; Se ha generado el siguiente error" + e.toString());
        }
        return Resp;
    }
    
    public ResultSet GetVendedores(String pWhere) {
        String str;
        ResultSet Resp = null; 
        try {
            str = "SELECT * FROM tblCatVendedores;";            
            Resp = sql.ExecuteSQL(str);            
        } catch( Exception e) {
            System.out.println("ResultSet GetVendedores; Se ha generado el siguiente error" + e.toString());        
        }
        return Resp;
    }
    
    public void InsertTarea(Long nNumDealer, String cCodSemana, String cCodSourceSrv, String cCodTipoAct, String cTipoEnvio, String cDescripcion, 
                            String cAdsMessage,String cAdsLink, String cExcelFile, 
                            String cAdsFile, String cUsr)
    {
        String stst="INSERT INTO tblDatActivity VALUES (" +nNumDealer + ",'" + cCodSemana  + "','" +cCodSourceSrv+ "','" +  cCodTipoAct + "','" +  cTipoEnvio + "','" +  cDescripcion + "','" +  cAdsMessage + "','" +  cAdsLink + "','" +  cExcelFile + "','" +  cAdsFile + "','" +  cUsr+ "','" +  cUsr + "',NOW(),NOW(),1);"; 
        try
        {                        
            sql.ExecuteSQL(stst);
        } catch(Exception e) {
            System.out.println("Se ha generado el siguiente error" + e.toString());        
        }
    }
    
    public void Update(){
        
    }
        
}

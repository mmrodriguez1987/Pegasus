package pegasus.reports;

/**
 *
 * @author Michael Rodriguez
 * This class manage the Technical Report of JMMS Module
 */
public class TechnicalReports {
    
    public TechnicalReports() 
    {
        strReportTec = null;
    }
    
    private String pDealerName,strReportTec, pImgAdsAttached, pImgLgDealerAds, pDealerAddress, pDealerPhone, pDealerLocation, pEngine, pDataBase, pQuant, pDirExcelFile, pDirImageFile, pExecutive, pTexto;
    private String[][] matriz;

    /**
     * Initialize the variables of the report to obtain the respective report
     * @param pDealerName : Dealer Name
     * @param pImgAdsAttached : root image file attached
     * @param pImgLgDealerAds : Dropbox link logo Dealer image file 
     * @param pDealerAddress : Dealer Address 
     * @param pDealerPhone : Dealer Phone 
     * @param pDealerLocation : Dealer Location (Zone)
     * @param pEngine : Engine used in the Campaign 
     * @param pDataBase : Database used in this Campaign 
     * @param pQuant : Quantity  of Numbers Phone  used in this campaign
     * @param pDirExcelFile : string root Excel File 
     * @param pDirImageFile : string root Image File 
     * @param pExecutive : Executive Name
     * @param pTexto : Text sent 
     * @param matriz : Cellphone matrix
     */
    public TechnicalReports(String pDealerName, String pImgAdsAttached, String pImgLgDealerAds, String pDealerAddress, String pDealerPhone, String pDealerLocation, String pEngine, String pDataBase, String pQuant, String pDirExcelFile, String pDirImageFile, String pExecutive, String pTexto, String[][] matriz) {
        this.pDealerName = pDealerName;
        this.strReportTec = null;
        this.pImgAdsAttached = pImgAdsAttached;
        this.pImgLgDealerAds = pImgLgDealerAds;
        this.pDealerAddress = pDealerAddress;
        this.pDealerPhone = pDealerPhone;
        this.pDealerLocation = pDealerLocation;
        this.pEngine = pEngine;
        this.pDataBase = pDataBase;
        this.pQuant = pQuant;
        this.pDirExcelFile = pDirExcelFile;
        this.pDirImageFile = pDirImageFile;
        this.pExecutive = pExecutive;
        this.pTexto = pTexto;
        this.matriz = matriz;
    }
    
    
    /**
     *
     * @return The HTML variable that contains the Report
     */
    public String GetHTML() 
    {
        strReportTec = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"><HTML xmlns=\"http://www.w3.org/1999/xhtml\"><HEAD><META http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /><TITLE>Reporte Tecnico</TITLE><STYLE type=\"text/css\">";
        strReportTec += ".TituloDos{text-align: center; font-family: \"Times New Roman\"; font-size: 25px; color: #EE1920; font-weight: bold;} ";
        strReportTec += ".Titulo3{font-size: 18px; text-align: center; font-family: \"Times New Roman\"; color: #EE1920; font-style: italic;}";
        strReportTec += ".Sutitulo{ font-size: 12px; text-align: left; font-family: \"Times New Roman\"; color: #000; font-style: italic; font-weight: bold;}";
        strReportTec += ".Dealer{font-family: \"Times New Roman\"; font-size: 30px; font-weight: 900; color: #005DA3; text-align: left; vertical-align: middle;}";
        strReportTec += ".DealerAddress{ font-family: \"Times New Roman\"; font-size: 15px; font-weight: 900; color: #005DA3; text-align: left; vertical-align: middle; border-bottom-style: double; border-bottom-color: #000;}";
        strReportTec += ".Letra{font-family: \"Times New Roman\"; font-size: 12px; font-weight: 900; color: #005DA3; text-align: left;}";
        strReportTec += ".TablaEncabezado { border: 4px  double #005DA3;}";
        strReportTec += ".TablaEncabezado td { border: 2x solid; }";
        strReportTec += ".fieldversion{font-family: \"Times New Roman\"; font-size: 10pt; color: blue; text-decoration: underline; font-weight: bold;}";
        strReportTec += ".Sutitulop{font-family: \"Times New Roman\";font-size: 14px;color: black;font-style: italic;text-align: left;}";
        strReportTec += "</STYLE></HEAD><BODY bgcolor=\"#C1D3EE\">";
        strReportTec += "<TABLE border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">";
        strReportTec += "<TR><TD colspan=\"5\" align=\"center\"><IMG src=\"https://dl.dropboxusercontent.com/s/wyfcryn3c8dg50z/Autolatino.png?dl=0\" ></TD></TR>";
        strReportTec += "<TR><TD colspan=\"5\" class=\"TituloDos\"  style=\"border-bottom-style: double; border-bottom-color: #000; vertical-align:bottom;\">Technical Report Mass Messaging</TD></TR>";
        
        strReportTec += "<TR><TD colspan=\"5\" class=\"Dealer\" style=\"border-bottom-style: double; border-bottom-color: #000; vertical-align:bottom;\">";
        strReportTec += "<P class=\"Dealer\">" + pDealerName + "</P><P class=\"Sutitulop\">" + pDealerAddress + "</P></TD></TR>";
        
        strReportTec += "<TR><TD colspan=\"5\" class=\"Titulo3\"></TD></TR><TR><TD colspan=\"5\" class=\"Titulo3\">Pegasus - Expert Marketing Media System</TD></TR>";
        strReportTec += "<TR><TD height=\"30\" colspan=\"5\" class=\"Titulo3\"></TD></TR><TR><TD colspan=\"5\" class=\"Titulo3\"></TD></TR>";
        strReportTec += "<TR><TD colspan=\"5\"><TABLE align=\"left\" cellpadding=\"0\" cellspacing=\"1\" class=\"TablaEncabezado\">";
        strReportTec += "<TR><TD width=\"150\" class=\"Sutitulo\">Sender Engine</TD><TD width=\"250\" class=\"Letra\">" + pEngine + "</TD>";
        strReportTec += "<TD width=\"150\" class=\"Sutitulo\">Location</TD><td width=\"220\" class=\"Letra\">" + pDealerLocation + "</TD>";
        strReportTec += "<TD width=\"150\" class=\"Sutitulo\">Database</TD><td class=\"Letra\">" + pDataBase + "</TD>";
        strReportTec += "</TR><TR><TD width=\"150\" class=\"Sutitulo\">Dealer Phone</TD><TD width=\"250\" class=\"Letra\">"+ pDealerPhone +"</TD>";
        strReportTec += "<TD width=\"150\" class=\"Sutitulo\">Autolatino Executive</TD><TD width=\"220\" class=\"Letra\">" + pExecutive + "</TD>";
        strReportTec += "<TD width=\"150\" class=\"Sutitulo\">Sender Quanttity</TD>";
        strReportTec += "<TD class=\"Letra\">" + pQuant + "</TD></TR>";
        strReportTec += "<TR><td width=\"150\" class=\"Sutitulo\">Excel File</TD>";
        strReportTec += "<TD class=\"Letra\" colspan=\"5\">"+ pDirExcelFile +"</TD>";
        strReportTec += "</TR><TR><td width=\"150\" class=\"Sutitulo\">Image File</TD>";
        strReportTec += "<TD class=\"Letra\" colspan=\"5\">"+ pDirImageFile +"</TD>";
        strReportTec += "</TR></table></TD></TR><TR><td colspan=\"5\"></TD></TR><TR><TD height=\"30\" colspan=\"5\"></TD></TR><TR><TD colspan=\"5\">";
        strReportTec += "<TABLE align=\"left\" class=\"TablaEncabezado\"><TR><td width=\"100\" class=\"Sutitulo\" >Texto</TD>";
        strReportTec += "<TD width=\"130\" class=\"Letra\">" + this.pTexto;
        strReportTec += "</TD><td width=\"100\" class=\"Sutitulo\">Image File</TD><td ><IMG src=\"file://localhost/"+ pImgAdsAttached +"\" width=\"180\" height=\"180\"></TD>";
        strReportTec += "</TR></TABLE></TD></TR><TR><TD height=\"30\" colspan=\"5\"></TD></TR><TR><TD colspan=\"5\">";        

        strReportTec += "<TABLE align=\"left\" class=\"TablaEncabezado\"><TR>";
    	strReportTec += "<TD width=\"200\" class=\"Sutitulo\">CellPhone Number</TD>";
        strReportTec += "<TD width=\"200\" class=\"Sutitulo\">Progress</TD>";
	strReportTec += "<TD width=\"200\" class=\"Sutitulo\">Date Send</TD></TR>";    
      
        for (int r=0; r < matriz.length-1 ; r++) { 
            strReportTec += "<TR>";
            strReportTec += "<TD width=\"200\" class=\"Letra\">" + matriz[r][0] + "</TD>";
            strReportTec += "<TD width=\"200\" class=\"Letra\">" + matriz[r][1] + "</TD>";
            strReportTec += "<TD width=\"200\" class=\"Letra\">00:00:00</TD>";
            strReportTec += "</TR>";
        }            
        strReportTec += "</TABLE></TD></TR><TR><TD height=\"30\" colspan=\"5\"></TD></TR><TR><TD colspan=\"5\"  align=\"center\" >";
        strReportTec += "<IMG src=\"https://dl.dropboxusercontent.com/s/olm9jcsuyu53l8r/PoweredByCarZoneAds.png?dl=0\"></TD></TR><TR><TD colspan=\"5\" align=\"center\" class=\"fieldversion\">";
        strReportTec += "|| Copyrigth Autolatino Magazine © 2015-2018 All Rigth reserved || Designed By Michael Rodriguez || Powered by CarZONEAds.com ||</TD>";
        strReportTec += "</TR><TR><TD></TD><TD></TD><TD></TD><TD></TD><TD></TD></TR></TABLE></BODY></HTML>";
        
        return strReportTec;
    }

    
}

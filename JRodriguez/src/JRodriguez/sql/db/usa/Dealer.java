package JRodriguez.sql.db.usa;

public class Dealer {    
    private final long p_nNumDealer;
    private String  p_cCodDealer, p_cNameDealer, p_cZonas , p_cCodVendedor,p_cNombreVendedor,p_cTelefonoVendedor, p_cMailVendedor, p_cCodState , p_cStateName;

    public void setCodDealer(String p_cCodDealer) {
        this.p_cCodDealer = p_cCodDealer;
    }

    public void setNameDealer(String p_cNameDealer) {
        this.p_cNameDealer = p_cNameDealer;
    }

    public void setZonas(String p_cZonas) {
        this.p_cZonas = p_cZonas;
    }

    public void setCodVendedor(String p_cCodVendedor) {
        this.p_cCodVendedor = p_cCodVendedor;
    }

    public void setNombreVendedor(String p_cNombreVendedor) {
        this.p_cNombreVendedor = p_cNombreVendedor;
    }

    public void setTelefonoVendedor(String p_cTelefonoVendedor) {
        this.p_cTelefonoVendedor = p_cTelefonoVendedor;
    }

    public void setMailVendedor(String p_cMailVendedor) {
        this.p_cMailVendedor = p_cMailVendedor;
    }

    public void setCodState(String p_cCodState) {
        this.p_cCodState = p_cCodState;
    }

    public void setStateName(String p_cStateName) {
        this.p_cStateName = p_cStateName;
    }

    public long getNumDealer() {
        return p_nNumDealer;
    }

    public String getCodDealer() {
        return p_cCodDealer;
    }

    public String getNameDealer() {
        return p_cNameDealer;
    }

    public String getZonas() {
        return p_cZonas;
    }

    public String getCodVendedor() {
        return p_cCodVendedor;
    }

    public String getNombreVendedor() {
        return p_cNombreVendedor;
    }

    public String getTelefonoVendedor() {
        return p_cTelefonoVendedor;
    }

    public String getMailVendedor() {
        return p_cMailVendedor;
    }

    public String getCodState() {
        return p_cCodState;
    }

    public String getStateName() {
        return p_cStateName;
    }
   
    
    public Dealer() {
        this.p_nNumDealer = 0;
        this.p_cCodDealer = null;
        this.p_cNameDealer = null;
        this.p_cZonas = null;
        this.p_cCodVendedor = null;
        this.p_cNombreVendedor = null;
        this.p_cTelefonoVendedor = null;
        this.p_cMailVendedor = null;
        this.p_cCodState = null;
        this.p_cStateName = null;
    }

    public Dealer(long p_nNumDealer, String p_cCodDealer, String p_cNameDealer, String p_cZonas, String p_cCodVendedor, String p_cNombreVendedor, String p_cTelefonoVendedor, String p_cMailVendedor, String p_cCodState, String p_cStateName) {
        this.p_nNumDealer = p_nNumDealer;
        this.p_cCodDealer = p_cCodDealer;
        this.p_cNameDealer = p_cNameDealer;
        this.p_cZonas = p_cZonas;
        this.p_cCodVendedor = p_cCodVendedor;
        this.p_cNombreVendedor = p_cNombreVendedor;
        this.p_cTelefonoVendedor = p_cTelefonoVendedor;
        this.p_cMailVendedor = p_cMailVendedor;
        this.p_cCodState = p_cCodState;
        this.p_cStateName = p_cStateName;
    }
  
}

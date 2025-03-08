package pk01;
public class Paquete {

    private String destino;
    private double peso;
    private int codeSeguimiento;
    private String status;

    public Paquete() {
    }

    public void setCodeSeguimiento(int codeSeguimiento) {
        this.codeSeguimiento = codeSeguimiento;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCodeSeguimiento() {
        return codeSeguimiento;
    }

    public String getDestino() {
        return destino;
    }

    public double getPeso() {
        return peso;
    }

    public String getStatus() {
        return status;
    }

    public boolean validateDestino(Paquete paquete) {

        switch (paquete.getDestino().toUpperCase()) {

            case "CALI":
                return true;

            case "CIUDAD DE CALI":
                return true;

            case "SANTIAGO DE CALI":
                return true;

            default:
                return false;
        }
    }
}


















    


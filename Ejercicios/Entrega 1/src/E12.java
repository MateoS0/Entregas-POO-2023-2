public class E12 {
    public static void main(String[] args) {
        double hTrabajo, pHora, porRetencion, sBruto, rFuente, sNeto;
        hTrabajo = 48;
        pHora = 5000;
        porRetencion = 0.125;
        sBruto = hTrabajo*pHora;
        rFuente = sBruto*porRetencion;
        sNeto = sBruto-rFuente;
        System.out.println("Salario bruto: $"+sBruto+"\nRetención en la fuente: $"+rFuente+"\nSalario neto: $"+sNeto);
    }
}

package bol13;

/**
 *
 * @author jalvarezbarciela
 */
public class Xogador extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Xogador() {
        super();
    }

    public Xogador(int dorsal, String demarcacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }

    @Override
    public void Concentrarse() {
        System.out.println("O xogador concentrase");
    }

    @Override
    public void Viaxar() {
        System.out.println("O xogador viaxa");
    }

    public void xogarPartido() {
        System.out.println("O xogador xoga partido");
    }

    public void entrenar() {
        System.out.println("O xogador entrena");
    }

}

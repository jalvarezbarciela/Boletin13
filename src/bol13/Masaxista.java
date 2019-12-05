package bol13;
/**
 *
 * @author jalvarezbarciela
 */
public class Masaxista extends SeleccionFutbol{
    private String titulacion;
    private int anosExperiencia;

    public Masaxista(String titulacion, int anosExperiencia, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public Masaxista() {
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString()+ ", titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia;
    }
    
    public void darMasaxes(){
        System.out.println("O masaxista da masaxes");
    }
    
     public void Concentrarse() {
        System.out.println("O masaxista concentrase");
    }
      public void Viaxar() {
        System.out.println("O masaxista viaxa");
    }
}

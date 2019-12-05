package bol13;
/**
 *
 * @author jalvarezbarciela
 */
public class Bol13 {
    public static void main(String[] args) {
        SeleccionFutbol s=new SeleccionFutbol();
        Xogador x= new Xogador(1,"aaa",1,"Luis","Vilariño",18);
        Adestrador a=new Adestrador("Entrenador1",180,"Luis Enrique","Martinez",49);
        Masaxista m=new Masaxista("Fisioterapeuta",14,350,"Alfredo","Gomez",40);
        s.Concentrarse();
        x.Concentrarse();
        a.Concentrarse();
        m.Concentrarse();
        s.Viaxar();
        x.Viaxar();
        a.Viaxar();
        m.Viaxar();
    }
    
}

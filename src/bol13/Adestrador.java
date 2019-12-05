/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol13;

/**
 *
 * @author jalvarezbarciela
 */
public class Adestrador extends SeleccionFutbol {
    private String idFederacion;

    public Adestrador() {
    }

    public Adestrador(String idFederacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return super.toString()+", idFederacion=" + idFederacion;
    }
    
    public void dirixirPartido(){
        System.out.println("O adestrador dirixe o partido");
    }
    
    public void dirixirAdestramento(){
        System.out.println("O adestrador dirixe o adestramento");
    }
    
    public void Viaxar(){
        System.out.println("O adestrador viaxa");
    }
     
    public void Concentrarse() {
        System.out.println("O adestrador concentrase");
    }
}

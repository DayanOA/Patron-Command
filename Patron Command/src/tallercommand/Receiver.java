/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallercommand;

/**
 *
 * @author Tonny
 */
public class Receiver {
        protected String Texto;
    
    public Receiver(String Texto){
        this.Texto = Texto;
    }    
    
    public void ActualizarTexto(String Texto){
        this.Texto = Texto;
    }

    public void MostrarTexto(){
        System.out.println(Texto);
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallercommand;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tonny
 */
public class RedoCommand implements Command{
    
    protected List<Receiver> TextoenCola = new ArrayList<Receiver>();
    protected String TextoRedo;
    
    public RedoCommand(String Texto){
        this.TextoRedo = Texto;
    }
    
    @Override
    public void modificarTexto() {
        for (Receiver Texto : TextoenCola ){
            String NuevoTexto = Texto.Texto.concat(TextoRedo);
            Texto.ActualizarTexto(NuevoTexto);
        }
    }

    @Override
    public void borrarTexto() {
        for (Receiver Texto : TextoenCola ){
            String NuevoTexto = Texto.Texto.replace(TextoRedo, "");
            Texto.Texto = NuevoTexto;
            }
    }

    @Override
    public void AgregarTexto(List<Receiver> Textos) {
        TextoenCola.clear();
        for (Receiver Texto : Textos ){
            TextoenCola.add(Texto);
        }
        
        for (Receiver Texto : TextoenCola ){
            String NuevoTexto = Texto.Texto.concat(TextoRedo);
            Texto.ActualizarTexto(NuevoTexto);
        }
    }
    
    
}

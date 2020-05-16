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
public class UndoCommand implements Command{
    
    protected List<Receiver> TextoenCola = new ArrayList<Receiver>();
    protected String TextoUndo;
    
    public UndoCommand(String Texto){
        this.TextoUndo = Texto;
    }
    
    @Override
    public void modificarTexto() {
        for (Receiver Texto : TextoenCola ){
            if(Texto.Texto.equals("")){
                System.out.println("No puedes deshacer");
            }else{
                String NuevoTexto = Texto.Texto.replace(TextoUndo, "");
                Texto.ActualizarTexto(NuevoTexto);
            }
        }
    }

    @Override
    public void borrarTexto() {
        for (Receiver Texto : TextoenCola ){
            String NuevoTexto = Texto.Texto.concat(TextoUndo);
            Texto.ActualizarTexto(NuevoTexto);
            }
    }

    @Override
    public void AgregarTexto(List<Receiver> Textos) {
        TextoenCola.clear();
        for (Receiver Texto : Textos ){
            TextoenCola.add(Texto);
        }
        
        for (Receiver Texto : TextoenCola ){
            if(Texto.Texto.equals("")){
                System.out.println("No puedes deshacer");
            }else{
                String NuevoTexto = Texto.Texto.replace(TextoUndo, "");
                Texto.ActualizarTexto(NuevoTexto);
            }
        }
    }
    
}

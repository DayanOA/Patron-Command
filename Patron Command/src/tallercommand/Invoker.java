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
public class Invoker {
    
    protected List<Receiver> TextoenCola = new ArrayList<Receiver>();
    protected List<UndoCommand> UndoCommands = new ArrayList<UndoCommand>();
    protected List<RedoCommand> RedoCommands = new ArrayList<RedoCommand>();
    
    public void EjecutarComando(Command VCommand){
        
        if(VCommand instanceof RedoCommand){
            RedoCommands.add(0, (RedoCommand) VCommand);
            VCommand.AgregarTexto(TextoenCola);
        }else if (VCommand instanceof UndoCommand){
            UndoCommands.add(0, (UndoCommand) VCommand);
            VCommand.AgregarTexto(TextoenCola);
        }else{
            System.out.println(VCommand.toString() + "mando no es valido");
        }
    }
    
    public void CancelarComando(int Index, char VCommand){
        switch (VCommand) {
            case 'R':
                RedoCommands.get(Index).borrarTexto();
                break;
            case 'U':
                UndoCommands.get(Index).borrarTexto();
                break;
            default:
                System.out.println(VCommand + " mando no es valido");
                break;
        }
    }
    
    public void RestaurarComando(int Index, char VCommand){
        switch (VCommand) {
            case 'R':
                RedoCommands.get(Index).modificarTexto();
                break;
            case 'U':
                UndoCommands.get(Index).modificarTexto();
                break;
            default:
                System.out.println(VCommand + " mando no es valido");
                break;
        }
    }
    
    public void AgregarTexto(Receiver Texto){
        TextoenCola.add(Texto);
    }
    
    public void Mostrar(){
        for (Receiver Texto : TextoenCola){
            Texto.MostrarTexto();
        }
    }
    
}

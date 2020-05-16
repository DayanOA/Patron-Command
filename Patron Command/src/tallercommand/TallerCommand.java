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
public class TallerCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Receiver Texto1 = new Receiver("Hola mi nombre es DOA");
        Receiver Texto2 = new Receiver("soy estudiante de la FUKL");
        Receiver Texto3 = new Receiver("estudio ingeniera de sistemas");

        Invoker Editor = new Invoker();
        
 
        Editor.AgregarTexto(Texto1);
        Editor.AgregarTexto(Texto2);
        Editor.AgregarTexto(Texto3);
        Editor.Mostrar();
        System.out.println();
        
  
        System.out.println("/********Deshacer ultimo cambio*********/"); //Deshacer ultimo cambio
        UndoCommand deshacer = new UndoCommand("estudio ingeniera de sistemas");
        Editor.EjecutarComando(deshacer);
        Editor.Mostrar();
        System.out.println();
        
        System.out.println("/*********Rehacer el ultimo cambio******/");//Rehacer el ultimo cambio
        RedoCommand rehacer = new RedoCommand("estudio ingeniera de sistemas");
        Editor.EjecutarComando(rehacer);
        Editor.CancelarComando(0, 'R');
        Editor.EjecutarComando(rehacer);
        Editor.Mostrar();
        System.out.println();
        
        System.out.println("/********Deshacer ultimo cambio*********/"); //Deshacer ultimo cambio
        Editor.EjecutarComando(deshacer);
        Editor.Mostrar();
        
        
    }
    
}

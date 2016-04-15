
package fifa14;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Torneo 
{
    public static int cantidadJugadores;
    public static int tipoTorneo;
    public static int tipoModalidad;
    public static String seleccionPrincipal;
    
    //creamos un array list para guardar cada equipo global
    public static ArrayList<Equipo> equipos = new ArrayList<Equipo>();
                          //tipo
    public static ArrayList<Partido> partidos = new ArrayList<Partido>();

    public Torneo() {
        
   
    }
    
   
    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public int getTipoTorneo() {
        return tipoTorneo;
    }

    public void setTipoTorneo(int tipoTorneo) {
        this.tipoTorneo = tipoTorneo;
    }

    public int getTipoModalidad() {
        return tipoModalidad;
    }

    public void setTipoModalidad(int tipoModalidad) {
        this.tipoModalidad = tipoModalidad;
    }

    public String getSeleccionPrincipal() {
        return seleccionPrincipal;
    }

    public void setSeleccionPrincipal(String seleccionPrincipal) {
        this.seleccionPrincipal = seleccionPrincipal;
    }
    
    // todos contra todos
    public void llenarTorneoTCT()
    {
        for(int equiCasa=0; equiCasa<cantidadJugadores;equiCasa++){
            for(int equiVisita=0;equiVisita<cantidadJugadores; equiVisita++ ){
                if (equiCasa!=equiVisita){
                    
                    
                    Equipo nuevoId= new Equipo();//creamos el objeto llamado nuevoId
                    
                    // obtener id equipo, acceder a arraylist de equipos.get
                   nuevoId.getId();
                    
                    // agregar en arraylist de partidos, envía id equipo visita id equipo casa
                    
                   equipos.get(equiCasa).getNombre();
                   equipos.get(equiVisita).getNombre();
                   
                    
                  JOptionPane.showMessageDialog(null, equipos.get(equiCasa).getNombre()+" vs "+equipos.get(equiVisita).getNombre());
                }
                  
            }
        }
    
    }
    
    public boolean VerificarEquipo(String nombreEquipo)
    {
        String nombreEquArray;//guarde el nombre del equipo en cada posicion del arraylist
        for(int pos=0; pos< equipos.size(); pos++){// recorra el tamaño del array
            
            nombreEquArray=equipos.get(pos).getNombre();//Obtiene la posicion de nombre
           if(nombreEquipo.equalsIgnoreCase(nombreEquArray)) // si es igual al del array
           {
               return true;
           }
        }
        return false;
        
    }
    
    //eliminacion directa
    public void llenarTorneoElimDirecta()
    {
        String nombreEqu;
        for(int pos=0; pos<equipos.size();pos++){
            nombreEqu= equipos.get(pos).getNombre();
            if(nombreEqu.equalsIgnoreCase(nombreEqu)){
                
            }else{
                
            }
        }
    }
    
    
}  

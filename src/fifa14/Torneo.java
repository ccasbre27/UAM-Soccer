
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
        Partido partido = new Partido();
        int idEquipoCasa;
        int idEquipoVisita;
        
        for(int equiCasa=0; equiCasa<cantidadJugadores;equiCasa++){
            for(int equiVisita=0;equiVisita<cantidadJugadores; equiVisita++ ){
                if (equiCasa!=equiVisita){
                    
                    // obtenemos el id del equipo casa
                    idEquipoCasa = equipos.get(equiCasa).getId();
                    
                    // obtenemos el id del equipo visita
                    idEquipoVisita = equipos.get(equiVisita).getId();
                    
                    // establecemos el equipo casa y visita en el objeto partido
                    partido.setIdEquipoCasa(idEquipoCasa);
                    partido.setIdEquipoVisita(idEquipoVisita);
                    
                    // se agrega en el arraylist de partidos
                    partidos.add(partido);
                    
                     
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

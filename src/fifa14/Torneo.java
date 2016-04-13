
package fifa14;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Torneo 
{
    private int cantidadJugadores;
    private int tipoTorneo;
    private int tipoModalidad;
    private String seleccionPrincipal;
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;

    public Torneo() {
        
        equipos = new ArrayList<Equipo>();
        partidos = new ArrayList<Partido>();
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
                    JOptionPane.showMessageDialog(null, equiCasa+" vs "+ equiVisita);
                }
            }
        }
    
    }
    
    
}  

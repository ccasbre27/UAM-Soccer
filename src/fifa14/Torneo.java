
package fifa14;

import java.util.ArrayList;

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
        Partido partido;
        for (int i = 0; i < cantidadJugadores; i++) {
            
            for (int j = 0; j < cantidadJugadores; j++) {
                
                if (i != j) {
                    
                    // recibe el id equipo casa, visita,goles 
                    partido = new Partido(i, j,0,0);
                    
                    partidos.add(partido);
                }
                
            }
            
        }
    }
    
}  

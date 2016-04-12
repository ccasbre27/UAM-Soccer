
package fifa14;

//clase que nos informa los resultados de cada equipo jugador
public class Partido {
    //creamos las variables
    private int idEquipoCasa;
    private int idEquipoVisita;
    private int golesCasa;
    private int golesVisita;
// se crea el constructor
    public Partido(int idEquipoCasa, int idEquipoVisita, int golesCasa, int golesVisita) {
    }
// los getters and setters
    public int getIdEquipoCasa() {
        return idEquipoCasa;
    }

    public void setIdEquipoCasa(int idEquipoCasa) {
        this.idEquipoCasa = idEquipoCasa;
    }

    public int getIdEquipoVisita() {
        return idEquipoVisita;
    }

    public void setIdEquipoVisita(int idEquipoVisita) {
        this.idEquipoVisita = idEquipoVisita;
    }

    public int getGolesCasa() {
        return golesCasa;
    }

    public void setGolesCasa(int golesCasa) {
        this.golesCasa = golesCasa;
    }

    public int getGolesVisita() {
        return golesVisita;
    }

    public void setGolesVisita(int golesVisita) {
        this.golesVisita = golesVisita;
    }
    
}

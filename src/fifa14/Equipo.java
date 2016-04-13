
package fifa14;


public class Equipo {
    //se crean las variables
    private int id;
    private String nombre;
    private String alias;
    private int golesFavor;
    private int golesContra;
    private int golesDif;
    private int partJugados;
    private int partGanados;
    private int partPerdidos;
    private int partEmpatados;
    private int puntosObt;
    //Se crea el constructor con sus parametros
    public Equipo(int id, String nombre,String alias, int golesFavor, int golesContra, int golesDif, int partJugados, int partGanados, int partPerdidos, int partEmpatados, int puntosObt) {
    }

    public Equipo() {
       
    }
    
    
    // se generan los metodos get y set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
        public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getGolesDif() {
        return golesDif;
    }

    public void setGolesDif(int golesDif) {
        this.golesDif = golesDif;
    }

    public int getPartJugados() {
        return partJugados;
    }

    public void setPartJugados(int partJugados) {
        this.partJugados = partJugados;
    }

    public int getPartGanados() {
        return partGanados;
    }

    public void setPartGanados(int partGanados) {
        this.partGanados = partGanados;
    }

    public int getPartPerdidos() {
        return partPerdidos;
    }

    public void setPartPerdidos(int partPerdidos) {
        this.partPerdidos = partPerdidos;
    }

    public int getPartEmpatados() {
        return partEmpatados;
    }

    public void setPartEmpatados(int partEmpatados) {
        this.partEmpatados = partEmpatados;
    }

    public int getPuntosObt() {
        return puntosObt;
    }

    public void setPuntosObt(int puntosObt) {
        this.puntosObt = puntosObt;
    }


    
    
    
    
}

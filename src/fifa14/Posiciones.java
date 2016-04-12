
package fifa14;


public abstract class Posiciones {
    Posiciones Pjugados;
    Posiciones Pganados;
    Posiciones Pperdidos;
    Posiciones Pempatados;
    Posiciones Gfavor;
    Posiciones Gcontra;
    Posiciones Gdiferencia;
    Posiciones PtosObt;
    
    //Insertamos el constructor
    public Posiciones(Posiciones Pjugados, Posiciones Pganados,Posiciones Pempatados, Posiciones Pperdidos, Posiciones Gfavor, Posiciones Gcontra, Posiciones Gdiferencia, Posiciones PtosObt){
        this.Pjugados=Pjugados;
        this.Pganados=Pganados;
        this.Pperdidos=Pperdidos;
        this.Pempatados=Pempatados;
        this.Gfavor=Gfavor;
        this.Gcontra=Gcontra;
        this.Gdiferencia=Gdiferencia;
        this.PtosObt=PtosObt;
    
}
    //insertamos getter and setter

    public Posiciones getPjugados() {
        return Pjugados;
    }

    public void setPjugados(Posiciones Pjugados) {
        this.Pjugados = Pjugados;
    }

    public Posiciones getPganados() {
        return Pganados;
    }

    public void setPganados(Posiciones Pganados) {
        this.Pganados = Pganados;
    }

    public Posiciones getPperdidos() {
        return Pperdidos;
    }

    public void setPperdidos(Posiciones Pperdidos) {
        this.Pperdidos = Pperdidos;
    }

    public Posiciones getPempatados() {
        return Pempatados;
    }

    public void setPempatados(Posiciones Pempatados) {
        this.Pempatados = Pempatados;
    }

    public Posiciones getGfavor() {
        return Gfavor;
    }

    public void setGfavor(Posiciones Gfavor) {
        this.Gfavor = Gfavor;
    }

    public Posiciones getGcontra() {
        return Gcontra;
    }

    public void setGcontra(Posiciones Gcontra) {
        this.Gcontra = Gcontra;
    }

    public Posiciones getGdiferencia() {
        return Gdiferencia;
    }

    public void setGdiferencia(Posiciones Gdiferencia) {
        this.Gdiferencia = Gdiferencia;
    }

    public Posiciones getPtosObt() {
        return PtosObt;
    }

    public void setPtosObt(Posiciones PtosObt) {
        this.PtosObt = PtosObt;
    }
    
    // Ingresamos los metodos que vamos a utilizar
    
    public abstract void IngresarPjugados(int Pjugados);
    public abstract void IngresarPganados (int Pganados);
    public abstract void IngresarPperdidos (int Pperdidos);
    public abstract void IngresarPempatados (int Pempatados);
    public abstract void IngresarGfavor (int Gfavor);
    public abstract void IngresarGcontra (int Gcontra);
    public abstract void CalcularPtosObt (int PtosObt);
}

package fifa14;

//public class Torneo extends Posiciones {

    public Torneo(Posiciones Pjugados, Posiciones Pganados, Posiciones Pempatados, Posiciones Pperdidos, Posiciones Gfavor, Posiciones Gcontra, Posiciones Gdiferencia, Posiciones PtosObt) {
        super(Pjugados, Pganados, Pempatados, Pperdidos, Gfavor, Gcontra, Gdiferencia, PtosObt);
    }
//Extendemos a la clase padre Torneo e insertamos el constructor
  //  @Override
  //  public int IngresarPjugados(int Pjugados) {
      //  int cont=0;
        
        //super.Pjugados.add(Pjugados);
        
        
    }

    @Override
    public void IngresarPganados(int Pganados) {
        super.Pganados.add(Pganados);
    }

    @Override
    public void IngresarPperdidos(int Pperdidos) {
        super.Pperdidos.add(Pperdidos);
    }

    @Override
    public void IngresarPempatados(int Pempatados) {
        super.Pempatados.add(Pempatados);
    }

    @Override
    public void IngresarGfavor(int Gfavor) {
        super.Gfavor.add(Gfavor);
    }

    @Override
    public void IngresarGcontra(int Gcontra) {
        super.Gcontra.add(Gcontra);
    }
    
   @Override
    public int CalcularGdiferencia(int Gdiferencia){
        int golDif=0;
        
        golDif= getGfavor()-getGcontra();
        
        return golDif;
    }

    @Override
    public int CalcularPtosObt(int PtosObt) {
       PtosObt= (Pganados*3)+(Pempatados * 1);
       return PtosObt;
    }
    
}

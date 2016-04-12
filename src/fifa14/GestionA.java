
package fifa14;
import java.io.*;//paquete que me permite trabajar con flujos de entrada y de salida
import javax.swing.JOptionPane;

public class GestionA
{// creamos 3 variables
    FileInputStream entrada;//variable para el flujo de entrada de bites
    FileOutputStream salida;//varialbe para el flujo de salida de bites
    File archivo; //Que va a ser el fichero
    
    //Creamos el constructor 
    public GestionA()
    {
    }
    String modalidad="";
    String jugador="";
    String tipoTorneo="";
    //Creamos metodo para abrir un archivo de texto
    public String AbrirATexto(File archivo)//recibe un parametro de tipo file
    {
       String contenido="";//devuelve el contenido que va dentro del textArea
        try {// try/catch para instanciar el flujo de entrada
            entrada =new FileInputStream(archivo);//recibe el archivo que se va a mandar a este metodo
            int ascci; //creamos una variable tipo int con el nombre ascci
            while((ascci =entrada.read())!=-1)//en la entrada estamos leyendo el flujo de bites que va a recibir desde archivo y 
                //devuelve -1 cuando llegue al final del archivo
            {
                char caracter = (char)ascci;//creamos variable char y convertir el num ascci que devuelve entrada.read,a su caracter
                contenido += caracter ;//concatenamos en el contenido  con c/caracter que se recupera del flujo de entrada.
            }
        } catch (Exception e) {
        }
       return contenido;        
    }
    
    //Guardar archivo de texto
    public String GuardarATexto(File archivo, String contenido)//devuelve string con la nota que se guardo el archivo en test area
    {
        String respuesta=null;
        try {// para instnciar la salida
          salida=new FileOutputStream(archivo);
          byte[]bytesTxt=contenido.getBytes();
          salida.write(bytesTxt);
          respuesta="El archivo se guardó con éxito";// en caso contrario devuelve un valor nulo
        } catch (Exception e) {
        }
        return respuesta;
    }
    
    //Abrir una imagen
    public byte[]AbrirAImagen(File archivo)
    {
        byte[]bytesImg= new byte[1024*100];//inicializamos en 100 megas
        try {
            entrada =new FileInputStream(archivo);
            entrada.read(bytesImg);
        } catch (Exception e) {
        }
        return bytesImg;
    }
    
    //Guardar imagen
    public String GuardarAImagen(File archivo, byte[]bytesImg )
    {
        String respuesta=null;
        try {
            salida= new FileOutputStream(archivo);
            salida.write(bytesImg);
            respuesta="la imagen se guardo con exito";
        } catch (Exception e) {
        }
        return respuesta;
    }
    public void getModalidad(String radio){
        modalidad=radio;
    }
    public void getJugadores(String boxJugador){
        jugador=boxJugador;
    }
    public void getTipoTorneo(String boxTorneo){
        tipoTorneo=boxTorneo;
    }
    
    public void mostrardatos(){
        JOptionPane.showMessageDialog(null,"La modalidad seleccionada es: "+modalidad);
        JOptionPane.showMessageDialog(null,"La cantidad de jugadores seleccionada es de: "+jugador);
        JOptionPane.showMessageDialog(null,"El tipo de torneo es: "+tipoTorneo);
    }
    
}

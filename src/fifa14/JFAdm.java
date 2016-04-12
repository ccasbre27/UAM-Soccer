/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifa14;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.*;
/**
 *
 * @author Cristina Hernández
 */
public class JFAdm extends javax.swing.JFrame {
JFileChooser seleccionado= new JFileChooser();
File archivo;// un fichero
byte[] bytesImg;
GestionA gestion=new GestionA();
    /**
     * Creates new form JFAdm
     */
    public JFAdm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        modalidad = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbxJugador = new javax.swing.JComboBox();
        cboTipoTorneo = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        rbtnTvsT = new javax.swing.JRadioButton();
        rbtnClasif = new javax.swing.JRadioButton();
        rbtnElimDirecta = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstItems = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnGuardarTorneo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lblImagen = new javax.swing.JLabel();
        btnGuardarImagen = new javax.swing.JButton();
        btnAbrirArchivo = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");
        jScrollPane1.setViewportView(jLabel1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FIFA 14");
        setBackground(new java.awt.Color(51, 255, 204));
        setForeground(new java.awt.Color(102, 255, 204));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("                                                                                     FIFA 14");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Instrucciones:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Para crear un nuevo torneo seleccione la cantidad de jugadores, la modalidad y el Club o la Seleccion.  Guarde la configuración.");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel2.setText("Creación de partidos");

        cbxJugador.setBackground(new java.awt.Color(153, 255, 255));
        cbxJugador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "6", "8", "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32" }));
        cbxJugador.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        cbxJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxJugadorActionPerformed(evt);
            }
        });

        cboTipoTorneo.setBackground(new java.awt.Color(153, 255, 255));
        cboTipoTorneo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciones", "Clubes" }));
        cboTipoTorneo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        cboTipoTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoTorneoActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Seleccione la modalidad:");

        modalidad.add(rbtnTvsT);
        rbtnTvsT.setText("Todos vs Todos");
        rbtnTvsT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnTvsTMouseClicked(evt);
            }
        });
        rbtnTvsT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTvsTActionPerformed(evt);
            }
        });

        modalidad.add(rbtnClasif);
        rbtnClasif.setText("Clasificación");
        rbtnClasif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnClasifMouseClicked(evt);
            }
        });
        rbtnClasif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnClasifActionPerformed(evt);
            }
        });

        modalidad.add(rbtnElimDirecta);
        rbtnElimDirecta.setText("Eliminación Directa");
        rbtnElimDirecta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnElimDirectaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(rbtnTvsT)
                .addGap(18, 18, 18)
                .addComponent(rbtnClasif)
                .addGap(18, 18, 18)
                .addComponent(rbtnElimDirecta)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rbtnTvsT)
                    .addComponent(rbtnClasif)
                    .addComponent(rbtnElimDirecta))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Seleccione la cantidad de jugadores");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Seleccione el tipo de torneo");

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        lstItems.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstItems.setName("lstvItem"); // NOI18N
        jScrollPane2.setViewportView(lstItems);

        jLabel3.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel3.setText("Elija una  selección o un Club");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jButton1.setText("Editar Torneo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar Torneo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnGuardarTorneo.setText("Guardar ");
        btnGuardarTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTorneoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboTipoTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addGap(60, 60, 60)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarTorneo)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbxJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipoTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnGuardarTorneo)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        lblImagen.setBackground(new java.awt.Color(153, 255, 153));
        lblImagen.setForeground(new java.awt.Color(153, 153, 255));
        jScrollPane3.setViewportView(lblImagen);
        lblImagen.getAccessibleContext().setAccessibleName("lblImagen");

        btnGuardarImagen.setForeground(new java.awt.Color(51, 51, 255));
        btnGuardarImagen.setText("GUARDAR IMAGEN");
        btnGuardarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarImagenActionPerformed(evt);
            }
        });

        btnAbrirArchivo.setForeground(new java.awt.Color(0, 0, 255));
        btnAbrirArchivo.setText("Abrir archivo");
        btnAbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirArchivoActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAbrirArchivo)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardarImagen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(304, 304, 304))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegresar)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnAbrirArchivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardarImagen))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirArchivoActionPerformed
        if(seleccionado.showDialog(null, "ABRIR ARCHIVO")==JFileChooser.APPROVE_OPTION)//se hago lo sigite
        {
            archivo=seleccionado.getSelectedFile();//archivo le damos el valor getSelectFile
            if(archivo.canRead()){
                if(archivo.getName().endsWith("txt")){
                    String contenido= gestion.AbrirATexto(archivo);
                       
                    //txtAreaTexto.setText(contenido);
                }else{
                    if(archivo.getName().endsWith("jpg")||archivo.getName().endsWith("png")||archivo.getName().endsWith("gif")){
                        bytesImg= gestion.AbrirAImagen(archivo);
                        lblImagen.setIcon(new ImageIcon(bytesImg));
                    }else{
                        JOptionPane.showMessageDialog(null, "Porfavor seleccione un archivo de texto o de imagen");
                    }
                }
            }
          
        }
    }//GEN-LAST:event_btnAbrirArchivoActionPerformed

    private void btnGuardarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarImagenActionPerformed
        if(seleccionado.showDialog(null, "GUARDAR IMAGEN")==JFileChooser.APPROVE_OPTION)
        {
            archivo=seleccionado.getSelectedFile();
        }
       if (archivo.getName().endsWith("jpg")||archivo.getName().endsWith("png")||archivo.getName().endsWith("gif")){
           String respuesta = gestion.GuardarAImagen(archivo,bytesImg);
           if(respuesta!=null){
             JOptionPane.showMessageDialog(null, respuesta);
           }else{
               JOptionPane.showMessageDialog(null, "Error al guardar imagen");
           }
       }else{
           JOptionPane.showMessageDialog(null, "La imagen se debe guardar en formato de imagen");
       }
 
    }//GEN-LAST:event_btnGuardarImagenActionPerformed

    private void btnGuardarTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTorneoActionPerformed

        // establecer las propiedad tipotorneo, seleccionPrincipal, cantidadJugadores
       //Principal.torneo.setTipoTorneo();
        
        
        /*
        String linea="";
      String cantJug="";
      String tipoTorneo="";
      String TvsT="";
              
              try
{//Se abre el archivo y se prepara el mismo para la escritura de lineas en el
BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\ArchivoTXT\\Agenda.txt"));
//se extrae la cantidad de jugadores e informacion
if(cbxJugador.isSelected())
{
    cantJug="Cantidad de Jugadores: ";
}
else if(cboTipoTorneo.isSelected())
{
    tipoTorneo="Tipo de Torneo: ";
}
else if(rbtnTvsT.isSelected())
{
    TvsT="Trabajo";
}
//se extrae la informacion ingresada mediante los textfield y se crea una sola linea de texto
linea=txtNombre.getText()+" "+txtPrimerApellido.getText()+" "+txtSegApellido1.getText()+" "+txtNumerocont.getText()+" "+tipoNum+"\n";

//se toma la variable "linea" que contiene toda la informacion digitada y se escribe en el archivo
bw.write(linea);
//se le indica al archivo de texto que se crea una nueva linea en blanco y queda listo para grgar mas informacion
bw.newLine();
//se cierra la coneccion con el archivo de texto
bw.close();
JOptionPane.showMessageDialog(null,"El archivo se ha guardado correctamente","Informacion",
JOptionPane.INFORMATION_MESSAGE);
}
catch (Exception e)
{
    JOptionPane.showMessageDialog(null, "Se produjo el siguiente error en la generacion del archivo"+e,"Error",JOptionPane.INFORMATION_MESSAGE);
}

              */
    }//GEN-LAST:event_btnGuardarTorneoActionPerformed

    

    
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        this.dispose();//se oculta la ventana
        
        Principal frame = new Principal();
        frame.setVisible (true);
        
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cboTipoTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoTorneoActionPerformed
        // TODO add your handling code here:
        
        // obtener el nombre del torneo que el usuaio seleccionó
        String tipoTorneo = cboTipoTorneo.getSelectedItem().toString();
        
        if(tipoTorneo.equals("Selecciones")) 
        {
           cargarArchivo("C:\\Users\\Isabel Cristina\\Desktop\\selecciones\\selecciones.txt");
            
        }
        else
        {
            // cargamos los clubes
            cargarArchivo("C:\\Users\\Isabel Cristina\\Desktop\\selecciones\\Clubes de FIFA\\Clubes.txt");
        }
        
        
      
    }//GEN-LAST:event_cboTipoTorneoActionPerformed

    private void cbxJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxJugadorActionPerformed

    private void rbtnTvsTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTvsTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnTvsTActionPerformed

    private void rbtnClasifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnClasifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnClasifActionPerformed

    private void rbtnTvsTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnTvsTMouseClicked
        // codigo del radio todos vs todos
       gestion.getModalidad(this.rbtnTvsT.getLabel());//guarda el laber del todos vs todos
    }//GEN-LAST:event_rbtnTvsTMouseClicked

    private void rbtnClasifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnClasifMouseClicked
        // codigo del radio clasificacion
        gestion.getModalidad(this.rbtnClasif.getLabel());
    }//GEN-LAST:event_rbtnClasifMouseClicked

    private void rbtnElimDirectaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnElimDirectaMouseClicked
        // codigo del radio Eliminacion Directa
        gestion.getModalidad(this.rbtnElimDirecta.getLabel());
    }//GEN-LAST:event_rbtnElimDirectaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cargarArchivo(String nombreArchivo)
    {
        // cargamos las selecciones 
            try
            {
                // modelo que representa la lista, lo creamos para agregar los items en él
                DefaultListModel listModel = new DefaultListModel();
                
                // leemos lo que está en el txt
                BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
                
                // el string builder nos ofrece una mejor opción para concatenar 
                StringBuilder stringBuilder = new StringBuilder();
                
                // leemos la primer línea
                String linea = br.readLine();

                // verificamos si la línea es diferente de null
                while (linea != null) {
                    // concatenamos la línea
                    stringBuilder.append(linea);
                    
                    // concatenamos un salto de línea, un salto de línea
                    stringBuilder.append(System.lineSeparator());
                    
                    // agregamos la línea leída en el modelo de la lista
                    listModel.addElement(linea);
                    
                    // leemos la siguiente línea
                    linea = br.readLine();
                    
                }
                
                // establecemos el modelo de la lista
                lstItems.setModel(listModel);
                
               
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.toString());
            }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirArchivo;
    private javax.swing.JButton btnGuardarImagen;
    private javax.swing.JButton btnGuardarTorneo;
    private javax.swing.JButton btnRegresar;
    public static javax.swing.JComboBox cboTipoTorneo;
    public static javax.swing.JComboBox cbxJugador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JList lstItems;
    public static javax.swing.ButtonGroup modalidad;
    private javax.swing.JRadioButton rbtnClasif;
    private javax.swing.JRadioButton rbtnElimDirecta;
    private javax.swing.JRadioButton rbtnTvsT;
    // End of variables declaration//GEN-END:variables
}

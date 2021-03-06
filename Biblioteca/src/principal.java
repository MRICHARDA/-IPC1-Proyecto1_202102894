import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.table.DefaultTableModel;

 public class principal extends javax.swing.JFrame {
     
        private static  Usuarios[] listaUsuario = new Usuarios[2];
        static DefaultTableModel dtt=new DefaultTableModel ();
        
        public principal() {
        initComponents();
        initComponents2();
        String[] titulo=new String[]{"ID:", "Nombres", "Apellidos","User","Rol","Clave"};
        dtt.setColumnIdentifiers (titulo);
        Datos.setModel (dtt);
        
        }
        
        private void initComponents2(){
        this.setTitle("Biblioteca 2022");
            setLocationRelativeTo(null);
            
     }
        private Usuarios[] redimensionalArreglo(Usuarios[] arreglo){
            Usuarios[] temporal = new Usuarios[arreglo.length + 1];
            for (int i = 0; i < arreglo.length; i++) {
                temporal[i] = arreglo[i];
            }
            return temporal;
        }
        
        private Boolean hayespacio(Usuarios[] arreglo) {
            Boolean espacio = false;
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] == null) {
                    espacio = true;
                    break;
                }
                
            }
            return espacio;
            
        } 
        void agregar (){
        dtt.addRow(new Object[]{
        IDUsu.getText(), NombreUsu.getText(), ApellidoUsu.getText(), UserUsu.getText(), RolUsu.getText(), ClaveUsu.getText()
            });
        
        }
        void eliminar () {
        int fila=Datos.getSelectedRow ();
        dtt.removeRow (fila);
        }
        void actualizar () {
        int fila=Datos.getSelectedRow ();
        dtt.setValueAt (IDUsu.getText (), fila, 0);
        dtt.setValueAt (NombreUsu.getText (), fila, 1);
        dtt.setValueAt (ApellidoUsu.getText(), fila, 2);
        dtt.setValueAt (UserUsu. getText (), fila, 3);
        dtt.setValueAt (RolUsu. getText (), fila, 4);
        dtt.setValueAt (CancelarUsu. getText (), fila, 5);
        }
        void limpiarTabla () {
        int filas=dtt.getRowCount ();
        for (int i=0;i<filas;i++) {
        dtt.removeRow (0);
        
        }
        }
 
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        IDUsu = new javax.swing.JTextField();
        NombreUsu = new javax.swing.JTextField();
        ApellidoUsu = new javax.swing.JTextField();
        UserUsu = new javax.swing.JTextField();
        RolUsu = new javax.swing.JTextField();
        ClaveUsu = new javax.swing.JTextField();
        ClaveUsu2 = new javax.swing.JTextField();
        CancelarUsu = new javax.swing.JButton();
        refrescar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Datos = new javax.swing.JTable();
        actualizar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablausu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(IDUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 160, 30));
        jPanel2.add(NombreUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 160, 30));
        jPanel2.add(ApellidoUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 160, 30));
        jPanel2.add(UserUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 160, 30));
        jPanel2.add(RolUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 160, 30));

        ClaveUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClaveUsuActionPerformed(evt);
            }
        });
        jPanel2.add(ClaveUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 160, 30));
        jPanel2.add(ClaveUsu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 160, 30));

        CancelarUsu.setText("Regresar");
        CancelarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarUsuActionPerformed(evt);
            }
        });
        jPanel2.add(CancelarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 110, 30));

        refrescar.setText("Enviar Usuario");
        refrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refrescarActionPerformed(evt);
            }
        });
        jPanel2.add(refrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 110, 30));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel2.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, 110, 30));

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel2.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 630, 80, 30));

        Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Datos);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, -1, 90));

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 100, 30));

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 630, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/craerrr.jpeg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 700));

        tablausu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablausu);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 430, 90));

        desktopPane.add(jPanel2);
        jPanel2.setBounds(0, 0, 1110, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1111, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClaveUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClaveUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClaveUsuActionPerformed

    private void CancelarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarUsuActionPerformed
            Administrador prin = new Administrador ();
            prin.setVisible(true);
            dispose();
    }//GEN-LAST:event_CancelarUsuActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        agregar ();
        if (!hayespacio(listaUsuario)) {
            System.out.println("Dimension:" + getListaUsuario().length);
            listaUsuario = redimensionalArreglo(getListaUsuario());
            System.out.println("Logitud:" + getListaUsuario().length);
            
        }
        
        for (int i = 0; i < getListaUsuario().length; i++) {
            if(getListaUsuario()[i] == null) {
                listaUsuario[i] = new Usuarios(IDUsu.getText(), NombreUsu.getText(), ApellidoUsu.getText(), UserUsu.getText(), RolUsu.getText(), ClaveUsu.getText());
                break;
            }
        }
        
        
         
        
    }//GEN-LAST:event_guardarActionPerformed

    private void refrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refrescarActionPerformed
       for (int i = 0; i < getListaUsuario().length; i++) {
            if(getListaUsuario()[i] != null) {
                System.out.println("**********************");
                System.out.println(getListaUsuario()[i].getID());
                System.out.println(getListaUsuario()[i].getNombre());
                System.out.println(getListaUsuario()[i].getApellido());
                System.out.println(getListaUsuario()[i].getUser());
                System.out.println(getListaUsuario()[i].getRol());
                System.out.println(getListaUsuario()[i].getClave());
                System.out.println("************************");
            }
        }
        
        String[][] matriz = new String[getListaUsuario().length][6];
         for (int i = 0; i <  getListaUsuario().length; i++) {
             if (getListaUsuario()[i] != null) {
             matriz[i][0] = getListaUsuario()[i].getID();
             matriz[i][1] = getListaUsuario()[i].getNombre();
             matriz[i][2] = getListaUsuario()[i].getApellido();
             matriz[i][3] = getListaUsuario()[i].getUser();
             matriz[i][4] = getListaUsuario()[i].getRol();
             matriz[i][5] = getListaUsuario()[i].getClave();
             
             
             }
        }
         
         String[] encabezado={"ID","Nombre","Apellido","User","Rol","Clave"};
         tablausu.setModel(new DefaultTableModel(
                matriz,
                encabezado
         ));
    }//GEN-LAST:event_refrescarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
       eliminar ();
        for (int i = 0; i < getListaUsuario().length; i++) {
            if(getListaUsuario()[i] != null) {
                if (getListaUsuario()[i].getID().equals(IDUsu.getText())){
                    getListaUsuario()[i] = null;
                    
                }
            }
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        actualizar ();
    }//GEN-LAST:event_actualizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        IDUsu.setText("");
        NombreUsu.setText("");
        ApellidoUsu.setText("");
        UserUsu.setText("");
        RolUsu.setText("");
        ClaveUsu.setText("");
        ClaveUsu2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoUsu;
    private javax.swing.JButton CancelarUsu;
    private javax.swing.JTextField ClaveUsu;
    private javax.swing.JTextField ClaveUsu2;
    private javax.swing.JTable Datos;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField IDUsu;
    private javax.swing.JTextField NombreUsu;
    private javax.swing.JTextField RolUsu;
    private javax.swing.JTextField UserUsu;
    private javax.swing.JButton actualizar;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refrescar;
    private javax.swing.JTable tablausu;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the listaUsuario
     */
    public static Usuarios[] getListaUsuario() {
        return listaUsuario;
    }

}


 

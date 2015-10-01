package Interfaz;

import javax.swing.ImageIcon;

public class MenuPrincipal extends javax.swing.JFrame {

  
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);//pantalla aparezca en el centro
        setTitle("Menu Principal");// nombre a la ventana
        setIconImage(new ImageIcon(getClass().getResource("/imagen/bellota.jpg")).getImage());
        dispose();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnSistema = new javax.swing.JMenu();
        mnCerrarSesion = new javax.swing.JMenuItem();
        mnVenta = new javax.swing.JMenu();
        mnBoleta = new javax.swing.JMenuItem();
        mnMantenimiento = new javax.swing.JMenu();
        mnCliente = new javax.swing.JMenuItem();
        mnProductos = new javax.swing.JMenuItem();
        mnVendedores = new javax.swing.JMenuItem();
        mnConsultas = new javax.swing.JMenu();
        mnBusquedaCliente = new javax.swing.JMenuItem();
        mnBusquedaProducto = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        CrearNuevoUsuario = new javax.swing.JMenuItem();
        CambiarClave = new javax.swing.JMenuItem();

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar3.add(jMenu9);

        jMenuItem5.setText("jMenuItem5");

        jMenu10.setText("jMenu10");

        jMenu11.setText("jMenu11");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar4.add(jMenu1);

        jMenu12.setText("Edit");
        jMenuBar4.add(jMenu12);

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setForeground(new java.awt.Color(0, 102, 153));

        mnSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/promotion.png"))); // NOI18N
        mnSistema.setText("Sistema");

        mnCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.ALT_MASK));
        mnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/unlock_2.png"))); // NOI18N
        mnCerrarSesion.setText("Cerrar sesion");
        mnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCerrarSesionActionPerformed(evt);
            }
        });
        mnSistema.add(mnCerrarSesion);

        jMenuBar1.add(mnSistema);

        mnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/folder.png"))); // NOI18N
        mnVenta.setText("Venta");

        mnBoleta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.ALT_MASK));
        mnBoleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/folderPEQ.png"))); // NOI18N
        mnBoleta.setText("Boleta");
        mnBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBoletaActionPerformed(evt);
            }
        });
        mnVenta.add(mnBoleta);

        jMenuBar1.add(mnVenta);

        mnMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/process.png"))); // NOI18N
        mnMantenimiento.setText("Mantenimiento");

        mnCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mantenimientoPEQ.png"))); // NOI18N
        mnCliente.setText("Mantenimiento de Cliente");
        mnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteActionPerformed(evt);
            }
        });
        mnMantenimiento.add(mnCliente);

        mnProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.ALT_MASK));
        mnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mantenimientoPEQ.png"))); // NOI18N
        mnProductos.setText("Mantenimiento de Productos");
        mnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnProductosActionPerformed(evt);
            }
        });
        mnMantenimiento.add(mnProductos);

        mnVendedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, java.awt.event.InputEvent.ALT_MASK));
        mnVendedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mantenimientoPEQ.png"))); // NOI18N
        mnVendedores.setText("Mantenimiento de Vendedores");
        mnVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVendedoresActionPerformed(evt);
            }
        });
        mnMantenimiento.add(mnVendedores);

        jMenuBar1.add(mnMantenimiento);

        mnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/search.png"))); // NOI18N
        mnConsultas.setText("Consultas");

        mnBusquedaCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, java.awt.event.InputEvent.ALT_MASK));
        mnBusquedaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/search_2.png"))); // NOI18N
        mnBusquedaCliente.setText("Busqueda de Cliente");
        mnBusquedaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBusquedaClienteActionPerformed(evt);
            }
        });
        mnConsultas.add(mnBusquedaCliente);

        mnBusquedaProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, java.awt.event.InputEvent.ALT_MASK));
        mnBusquedaProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/search_2.png"))); // NOI18N
        mnBusquedaProducto.setText("Busqueda de Producto");
        mnBusquedaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBusquedaProductoActionPerformed(evt);
            }
        });
        mnConsultas.add(mnBusquedaProducto);

        jMenuBar1.add(mnConsultas);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/refresh_1.png"))); // NOI18N
        jMenu13.setText("Administrador");

        CrearNuevoUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, java.awt.event.InputEvent.ALT_MASK));
        CrearNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/promotion_2.png"))); // NOI18N
        CrearNuevoUsuario.setText("Crear nuevo usuario");
        CrearNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearNuevoUsuarioActionPerformed(evt);
            }
        });
        jMenu13.add(CrearNuevoUsuario);

        CambiarClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/promotion_2.png"))); // NOI18N
        CambiarClave.setText("Cambiar clave");
        CambiarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarClaveActionPerformed(evt);
            }
        });
        jMenu13.add(CambiarClave);

        jMenuBar1.add(jMenu13);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 756, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProductosActionPerformed
       MantenimientoProductos dialog=new MantenimientoProductos(new javax.swing.JFrame(),true);
       dialog.setLocationRelativeTo(null);
       dialog.setVisible(true);
    }//GEN-LAST:event_mnProductosActionPerformed

    private void mnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClienteActionPerformed
       MantenimientoClientes dialog=new MantenimientoClientes(new javax.swing.JFrame(),true);
       dialog.setLocationRelativeTo(null);
       dialog.setVisible(true);     
    }//GEN-LAST:event_mnClienteActionPerformed

    private void mnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCerrarSesionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnCerrarSesionActionPerformed

    private void mnBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBoletaActionPerformed
       Boleta dialog=new Boleta(new javax.swing.JFrame(),true);
       dialog.setLocationRelativeTo(null);
       dialog.setVisible(true);
    }//GEN-LAST:event_mnBoletaActionPerformed

    private void mnVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVendedoresActionPerformed
       MantenimientoVendedores dialog=new MantenimientoVendedores(new javax.swing.JFrame(),true);
       dialog.setLocationRelativeTo(null);
       dialog.setVisible(true);
    }//GEN-LAST:event_mnVendedoresActionPerformed

    private void mnBusquedaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBusquedaClienteActionPerformed
       BusquedaCliente dialog=new BusquedaCliente(new javax.swing.JFrame(),true);
       dialog.setLocationRelativeTo(null);
       dialog.setVisible(true);
    }//GEN-LAST:event_mnBusquedaClienteActionPerformed

    private void mnBusquedaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBusquedaProductoActionPerformed
       BusquedaProducto dialog=new BusquedaProducto(new javax.swing.JFrame(),true);
       dialog.setLocationRelativeTo(null);
       dialog.setVisible(true);
    }//GEN-LAST:event_mnBusquedaProductoActionPerformed

    private void CrearNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearNuevoUsuarioActionPerformed
        CrearNuevoUsuario dialog=new CrearNuevoUsuario(new javax.swing.JFrame(),true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_CrearNuevoUsuarioActionPerformed

    private void CambiarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarClaveActionPerformed
        CambiarClave dialog=new CambiarClave(new javax.swing.JFrame(),true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);          
    }//GEN-LAST:event_CambiarClaveActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CambiarClave;
    private javax.swing.JMenuItem CrearNuevoUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem mnBoleta;
    private javax.swing.JMenuItem mnBusquedaCliente;
    private javax.swing.JMenuItem mnBusquedaProducto;
    private javax.swing.JMenuItem mnCerrarSesion;
    private javax.swing.JMenuItem mnCliente;
    private javax.swing.JMenu mnConsultas;
    private javax.swing.JMenu mnMantenimiento;
    private javax.swing.JMenuItem mnProductos;
    private javax.swing.JMenu mnSistema;
    private javax.swing.JMenuItem mnVendedores;
    private javax.swing.JMenu mnVenta;
    // End of variables declaration//GEN-END:variables
}

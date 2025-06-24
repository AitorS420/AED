
package ventanas;

import procesos.VectorCaracteres;
import procesos.MatrizNros;

public class FrmPrincipal extends javax.swing.JFrame
{
    VectorCaracteres vectorDeCiudades;
    MatrizNros matrizDePrecios;
    int n, i;
        
    public FrmPrincipal()
    {
        initComponents();
        setLocationRelativeTo(this);
        
        n = 5;
        vectorDeCiudades = new VectorCaracteres(n);
        matrizDePrecios = new MatrizNros(n, n);
        
        // Adicionando ciudades al Vector
        vectorDeCiudades.adicionar("Madríd");
        vectorDeCiudades.adicionar("Londres");
        vectorDeCiudades.adicionar("París");
        vectorDeCiudades.adicionar("Roma");
        vectorDeCiudades.adicionar("Berlín");

        cmbOrigen.addItem("<<Seleccionar>>");
        
        // Adicionando ciudades al ComboBox origen
        for (i = 0; i < vectorDeCiudades.getConta(); i=i+1)
            cmbOrigen.addItem(vectorDeCiudades.getElemento(i));
    }
    
    public void limpiar()
    {
        cmbOrigen.setSelectedIndex(0);
        txtPrecio.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cmbOrigen = new javax.swing.JComboBox<>();
        cmbDestino = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        btnGrabar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grafo con ciudades");

        jLabel2.setText("Ciudad origen");

        cmbOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrigenActionPerformed(evt);
            }
        });

        jLabel5.setText("Ciudad destino");

        jLabel4.setText("Precio (en euros)");

        txaResultado.setColumns(20);
        txaResultado.setRows(5);
        jScrollPane3.setViewportView(txaResultado);

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbDestino, 0, 131, Short.MAX_VALUE)
                                    .addComponent(cmbOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnGrabar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnMostrar))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        int j;
        txaResultado.setText("");

        for (i = 0; i < vectorDeCiudades.getConta(); i=i+1)
            for (j = 0; j < vectorDeCiudades.getConta(); j=j+1)
                if (matrizDePrecios.getElemento(i, j) != 0)
                    txaResultado.append(vectorDeCiudades.getElemento(i) + "\t" + vectorDeCiudades.getElemento(j) + "\t" + matrizDePrecios.getElemento(i, j) + "\n");
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        // TODO add your handling code here:
        String destino;
        double precio;
        int fil, col;
        
        fil = cmbOrigen.getSelectedIndex() - 1;             // posición en el Vector de la ciudad origen (fila)
        
        destino = cmbDestino.getSelectedItem().toString();
        col = vectorDeCiudades.buscar(destino);             // posición en el Vector de la ciudad destino (columna)
        
        precio = Double.parseDouble(txtPrecio.getText());
        matrizDePrecios.setElemento(precio, fil, col);

        limpiar();
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void cmbOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrigenActionPerformed
        // TODO add your handling code here:
        cmbDestino.removeAllItems();
        cmbDestino.addItem("<<Seleccionar>>");

        if (cmbOrigen.getSelectedIndex() == 0)
            return;

        // Adicionando ciudades al ComboBox destino

        for (i = 0; i < vectorDeCiudades.getConta(); i=i+1)
            if (cmbOrigen.getSelectedIndex() != i + 1)
                cmbDestino.addItem(vectorDeCiudades.getElemento(i));
    }//GEN-LAST:event_cmbOrigenActionPerformed
      
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox<String> cmbDestino;
    private javax.swing.JComboBox<String> cmbOrigen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txaResultado;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}

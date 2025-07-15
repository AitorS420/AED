
package ventanas;

import procesos.VectorNros;
import javax.swing.JOptionPane;

public class FrmPrincipal extends javax.swing.JFrame
{
    VectorNros vectorDeTemperaturas;
    int n;
    double prom;

    public FrmPrincipal()
    {
        initComponents();
        setLocationRelativeTo(this);
        
        n = 7;
        vectorDeTemperaturas = new VectorNros(n);
    }

    public void mostrar(int i)      // método recursivo
    {
        if (i>=0)
        {
            txaResultado.append(vectorDeTemperaturas.getElemento(i) + "\n");
            mostrar(i-1);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        btnGenerar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMostrarIterativo = new javax.swing.JButton();
        btnMostrarRecursivo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCalcularPromIterativo = new javax.swing.JButton();
        btnCalcularPromRecursivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vector con temperaturas");

        txaResultado.setColumns(20);
        txaResultado.setRows(5);
        jScrollPane1.setViewportView(txaResultado);

        btnGenerar.setText("Generar temperaturas");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jLabel1.setText("MOSTRAR");

        btnMostrarIterativo.setText("Iterativo");
        btnMostrarIterativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarIterativoActionPerformed(evt);
            }
        });

        btnMostrarRecursivo.setText("Recursivo");
        btnMostrarRecursivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRecursivoActionPerformed(evt);
            }
        });

        jLabel2.setText("PROMEDIO");

        btnCalcularPromIterativo.setText("Iterativo");
        btnCalcularPromIterativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularPromIterativoActionPerformed(evt);
            }
        });

        btnCalcularPromRecursivo.setText("Recursivo");
        btnCalcularPromRecursivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularPromRecursivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(btnMostrarRecursivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrarIterativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCalcularPromRecursivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCalcularPromIterativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGenerar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarIterativo)
                            .addComponent(btnCalcularPromIterativo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarRecursivo)
                            .addComponent(btnCalcularPromRecursivo)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        // TODO add your handling code here:
        int i, limInf=145, limSup=225;
        double aux;
        vectorDeTemperaturas.limpiar();
        
        for(i=1; i<=n; i=i+1)
        {
            aux = (int)(Math.random() * (limSup-limInf+1)) + limInf;
            aux = aux / 10.0;
            vectorDeTemperaturas.adicionar(aux);
        }
        JOptionPane.showMessageDialog(this, "Temperaturas almacendas en el Vector");
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnMostrarIterativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarIterativoActionPerformed
        // TODO add your handling code here:
        int i;
        txaResultado.setText("");
        
        for(i=0; i<n; i=i+1)
            txaResultado.append(vectorDeTemperaturas.getElemento(i) + "\n");
    }//GEN-LAST:event_btnMostrarIterativoActionPerformed
        
    private void btnMostrarRecursivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRecursivoActionPerformed
        // TODO add your handling code here:
        txaResultado.setText("");
        mostrar(n-1);
    }//GEN-LAST:event_btnMostrarRecursivoActionPerformed

    private void btnCalcularPromIterativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularPromIterativoActionPerformed
        // TODO add your handling code here:
        int i;
        double acum=0;
        
        for(i=0; i<n; i=i+1)
            acum = acum + vectorDeTemperaturas.getElemento(i);
        
        prom = acum / n;
        JOptionPane.showMessageDialog(this, "Promedio iterativo: " + prom);
    }//GEN-LAST:event_btnCalcularPromIterativoActionPerformed

    private void btnCalcularPromRecursivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularPromRecursivoActionPerformed
        // TODO add your handling code here:
        double s;
        
        s = vectorDeTemperaturas.sumar(n-1);
        prom = s / n;
        
        JOptionPane.showMessageDialog(this, "Promedio recursivo: " + prom);
    }//GEN-LAST:event_btnCalcularPromRecursivoActionPerformed

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
    private javax.swing.JButton btnCalcularPromIterativo;
    private javax.swing.JButton btnCalcularPromRecursivo;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnMostrarIterativo;
    private javax.swing.JButton btnMostrarRecursivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaResultado;
    // End of variables declaration//GEN-END:variables
}

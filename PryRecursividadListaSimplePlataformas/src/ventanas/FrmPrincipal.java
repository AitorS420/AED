
package ventanas;

import procesos.Nodo;
import procesos.ListaSimpleCaracteres;
import javax.swing.JOptionPane;

public class FrmPrincipal extends javax.swing.JFrame
{
    ListaSimpleCaracteres listaDePlataformas;

    public FrmPrincipal()
    {
        initComponents();
        setLocationRelativeTo(this);
        
        listaDePlataformas = new ListaSimpleCaracteres();
        
        listaDePlataformas.adicionar("Netflix");
        listaDePlataformas.adicionar("Amazon");
        listaDePlataformas.adicionar("HBO max");
        listaDePlataformas.adicionar("Disney+");
    }
    
    public void mostrar(Nodo p) // método recursivo
    {
        if (p != null)
        {
            txaResultado.append(p.info + "\n");
            mostrar(p.sgte);
            
            
        }  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        btnMostrarIterativo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMostrarRecursivo = new javax.swing.JButton();
        btnContarIterativo = new javax.swing.JButton();
        btnContarRecursivo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Plataformas");

        txaResultado.setColumns(20);
        txaResultado.setRows(5);
        jScrollPane1.setViewportView(txaResultado);

        btnMostrarIterativo.setText("Iterativo");
        btnMostrarIterativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarIterativoActionPerformed(evt);
            }
        });

        jLabel1.setText("MOSTRAR");

        btnMostrarRecursivo.setText("Recursivo");
        btnMostrarRecursivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarRecursivoActionPerformed(evt);
            }
        });

        btnContarIterativo.setText("Iterativo");
        btnContarIterativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarIterativoActionPerformed(evt);
            }
        });

        btnContarRecursivo.setText("Recursivo");
        btnContarRecursivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarRecursivoActionPerformed(evt);
            }
        });

        jLabel3.setText("CONTAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMostrarIterativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(btnMostrarRecursivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnContarIterativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContarRecursivo))
                    .addComponent(jLabel3))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarIterativo)
                            .addComponent(btnContarIterativo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarRecursivo)
                            .addComponent(btnContarRecursivo)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarIterativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarIterativoActionPerformed
        // TODO add your handling code here:
        Nodo p = listaDePlataformas.inicio;
        txaResultado.setText("");
        
        while(p != null)
        {
            txaResultado.append(p.info + "\n");
            p = p.sgte;
        }
    }//GEN-LAST:event_btnMostrarIterativoActionPerformed
   
    private void btnMostrarRecursivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarRecursivoActionPerformed
        // TODO add your handling code here:
        txaResultado.setText("");
        mostrar(listaDePlataformas.inicio);
    }//GEN-LAST:event_btnMostrarRecursivoActionPerformed

    private void btnContarIterativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarIterativoActionPerformed
        // TODO add your handling code here:
        int c;
        c = listaDePlataformas.contar();
        JOptionPane.showMessageDialog(this, "Conteo iterativo: " + c);
    }//GEN-LAST:event_btnContarIterativoActionPerformed

    private void btnContarRecursivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarRecursivoActionPerformed
        // TODO add your handling code here:
        int c;
        c = listaDePlataformas.contar(listaDePlataformas.inicio);
        JOptionPane.showMessageDialog(this, "Conteo recursivo: " + c);
    }//GEN-LAST:event_btnContarRecursivoActionPerformed

    public static void main(String args[])
    {
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
    private javax.swing.JButton btnContarIterativo;
    private javax.swing.JButton btnContarRecursivo;
    private javax.swing.JButton btnMostrarIterativo;
    private javax.swing.JButton btnMostrarRecursivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaResultado;
    // End of variables declaration//GEN-END:variables
}

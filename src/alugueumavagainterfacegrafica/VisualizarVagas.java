/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alugueumavagainterfacegrafica;

import Excecoes.ErroDeLeituraException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import dao.ControleArquivoVaga;
import models.Vaga;

/**
 *
 * @author Arthur Nunes
 */
public class VisualizarVagas extends javax.swing.JFrame {
    private ControleArquivoVaga lerArquivoVaga;

    /**
     * Creates new form VisualizarVagas
     */
    public VisualizarVagas() {
        this.lerArquivoVaga = new ControleArquivoVaga();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableVagas = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarNome = new javax.swing.JTextField();
        buscarPessoa = new javax.swing.JButton();
        btnVoltarVagas = new javax.swing.JButton();
        btnAlugar = new javax.swing.JButton();

        setTitle("Visualização de Vagas");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                tabelaVagas(evt);
            }
        });

        JTableVagas.setAutoCreateRowSorter(true);
        JTableVagas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dono", "Vaga", "Estado da Vaga", "Preço da Vaga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableVagas);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/door_out.png"))); // NOI18N
        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar por número");

        txtBuscarNome.setToolTipText("");
        txtBuscarNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarNomeKeyPressed(evt);
            }
        });

        buscarPessoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
        buscarPessoa.setText("Buscar");
        buscarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPessoaActionPerformed(evt);
            }
        });

        btnVoltarVagas.setText("Voltar");
        btnVoltarVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarVagasActionPerformed(evt);
            }
        });

        btnAlugar.setText("Alugar");
        btnAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltarVagas)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(txtBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscarPessoa)
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(btnVoltarVagas)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarPessoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaVagas(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_tabelaVagas
        DefaultTableModel cadastroVaga = (DefaultTableModel) JTableVagas.getModel();

        try {
            List<Vaga> vagas = lerArquivoVaga.read();

            for (Vaga vaga : vagas) {
                Object[] row = {
                    vaga.getNomeDono(),
                    vaga.getNumero(),
                    vaga.getEstado(),
                    vaga.getPreco(),
                };
                cadastroVaga.addRow(row);
            }
        } catch (ErroDeLeituraException ex) {
            Logger.getLogger(MenuVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tabelaVagas

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtBuscarNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNomeKeyPressed
       
    }//GEN-LAST:event_txtBuscarNomeKeyPressed

    private void buscarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPessoaActionPerformed
        
    }//GEN-LAST:event_buscarPessoaActionPerformed

    private void btnVoltarVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarVagasActionPerformed
        MenuVisualizar mv = new MenuVisualizar();
        mv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarVagasActionPerformed

    private void btnAlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlugarActionPerformed
        Object dono = this.JTableVagas.getModel().getValueAt(this.JTableVagas.getSelectedRow(), 0);
        Object num = this.JTableVagas.getModel().getValueAt(this.JTableVagas.getSelectedRow(), 1);
        Object valor = this.JTableVagas.getModel().getValueAt(this.JTableVagas.getSelectedRow(), 3);
        
        AlugarPainel alugarPainel = new AlugarPainel(dono.toString(),num.toString(),valor.toString());
        alugarPainel.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btnAlugarActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizarVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarVagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarVagas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableVagas;
    private javax.swing.JButton btnAlugar;
    private javax.swing.JButton btnVoltarVagas;
    private javax.swing.JButton buscarPessoa;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscarNome;
    // End of variables declaration//GEN-END:variables
}

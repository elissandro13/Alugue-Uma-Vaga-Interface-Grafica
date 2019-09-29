/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alugueumavagainterfacegrafica;

import Excecoes.ErroDeLeituraException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.LerArquivo;
import models.LerArquivoVaga;
import models.Pessoa;
import models.Vaga;

/**
 *
 * @author Arthur Nunes
 */
public class MenuVisualizar extends javax.swing.JFrame {

    public void buscarNome(String nome) {
        DefaultTableModel cadastroPessoa = (DefaultTableModel) jTableCadastrados.getModel();
        List<Pessoa> pessoas = null;
        try {
            pessoas = lerArquivo.read();
        } catch (ErroDeLeituraException ex) {
            Logger.getLogger(MenuVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa p = (Pessoa) pessoas.get(i);
            if (p.getNome().equals(nome)) {
                cadastroPessoa.setNumRows(0);
                    Object[] row = {
                        p.getNome(),
                        p.getCpf(),
                        p.getSexo(),
                        p.getSaldo(),};
                    cadastroPessoa.addRow(row);
            }
        }
        
    }
    
    public void preencherTabela(){
        DefaultTableModel cadastroPessoa = (DefaultTableModel) jTableCadastrados.getModel();

        try {
            List<Pessoa> pessoas = lerArquivo.read();

            for (Pessoa pessoa : pessoas) {
                Object[] row = {
                    pessoa.getNome(),
                    pessoa.getCpf(),
                    pessoa.getSexo(),
                    pessoa.getSaldo(),};
                cadastroPessoa.addRow(row);
            }
        } catch (ErroDeLeituraException ex) {
            Logger.getLogger(MenuVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private LerArquivo lerArquivo;

    /**
     * Creates new form MenuVisualizar
     */
    public MenuVisualizar() {
        this.lerArquivo = new LerArquivo();
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

        txtBuscarNome = new javax.swing.JTextField();
        buscarPessoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCadastrados = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualizar Informações");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                lerArquivo(evt);
            }
        });

        txtBuscarNome.setToolTipText("");

        buscarPessoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/zoom.png"))); // NOI18N
        buscarPessoa.setText("Buscar");
        buscarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPessoaActionPerformed(evt);
            }
        });

        jTableCadastrados.setAutoCreateRowSorter(true);
        jTableCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Sexo", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
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
        jTableCadastrados.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(jTableCadastrados);

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/door_out.png"))); // NOI18N
        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Visualizar Vagas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar por nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarPessoa)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jButton3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarPessoa))
                .addGap(10, 10, 10)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton2, jButton3});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    private void lerArquivo(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_lerArquivo
        preencherTabela();
    }//GEN-LAST:event_lerArquivo


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        VisualizarVagas vv = new VisualizarVagas();
        vv.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void buscarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPessoaActionPerformed
        DefaultTableModel cadastroPessoa = (DefaultTableModel) jTableCadastrados.getModel();
        cadastroPessoa.setNumRows(0);
        preencherTabela();
        buscarNome(txtBuscarNome.getText());
    }//GEN-LAST:event_buscarPessoaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuVisualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuVisualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuVisualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuVisualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuVisualizar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarPessoa;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCadastrados;
    private javax.swing.JTextField txtBuscarNome;
    // End of variables declaration//GEN-END:variables
}

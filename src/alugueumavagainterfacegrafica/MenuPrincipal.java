/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alugueumavagainterfacegrafica;

/**
 *
 * @author aluno
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MenuPrincipal() {
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

        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCadastrarVaga = new javax.swing.JButton();
        btnVisualizarVaga = new javax.swing.JButton();
        btnCadastrarPessoa = new javax.swing.JButton();
        btnPesquisarPessoa = new javax.swing.JButton();
        btnVisualizarPessoa = new javax.swing.JButton();
        btnPesquisarVaga = new javax.swing.JButton();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel1.setText("Vagas");

        jLabel2.setFont(new java.awt.Font("FreeMono", 1, 18)); // NOI18N
        jLabel2.setText("Pessoas");

        btnCadastrarVaga.setText("Cadastrar Vaga");
        btnCadastrarVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVagaActionPerformed(evt);
            }
        });

        btnVisualizarVaga.setText("Visualizar Vagas");
        btnVisualizarVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarVagaActionPerformed(evt);
            }
        });

        btnCadastrarPessoa.setText("Cadastrar Pessoa");
        btnCadastrarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPessoaActionPerformed(evt);
            }
        });

        btnPesquisarPessoa.setText("Pesquisar Pessoa");
        btnPesquisarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPessoaActionPerformed(evt);
            }
        });

        btnVisualizarPessoa.setText("Visualizar Pessoas");
        btnVisualizarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarPessoaActionPerformed(evt);
            }
        });

        btnPesquisarVaga.setText("Pesquisar Vaga");
        btnPesquisarVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarVagaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnVisualizarVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVisualizarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCadastrarVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPesquisarVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCadastrarPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(btnPesquisarPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisualizarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizarVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVagaActionPerformed
        MenuCadastrarVaga menuCadastrarVaga = new MenuCadastrarVaga();
        menuCadastrarVaga.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastrarVagaActionPerformed

    private void btnVisualizarVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarVagaActionPerformed
        MenuVisualizarPessoas menuVisualizarPessoas = new MenuVisualizarPessoas();
        menuVisualizarPessoas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVisualizarVagaActionPerformed

    private void btnCadastrarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPessoaActionPerformed
        MenuCadastrarPessoa menuCadastrarPessoa = new MenuCadastrarPessoa();
        menuCadastrarPessoa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastrarPessoaActionPerformed

    private void btnPesquisarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPessoaActionPerformed
        MenuPesquisarPessoa menuPesquisarPessoa = new MenuPesquisarPessoa();
        menuPesquisarPessoa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPesquisarPessoaActionPerformed

    private void btnVisualizarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarPessoaActionPerformed
        MenuVisualizarPessoas menuVisualizarPessoa = new MenuVisualizarPessoas();
        menuVisualizarPessoa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVisualizarPessoaActionPerformed

    private void btnPesquisarVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarVagaActionPerformed
        MenuPesquisarVaga menuPesquisarVaga = new MenuPesquisarVaga();
        menuPesquisarVaga.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPesquisarVagaActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarPessoa;
    private javax.swing.JButton btnCadastrarVaga;
    private javax.swing.JButton btnPesquisarPessoa;
    private javax.swing.JButton btnPesquisarVaga;
    private javax.swing.JButton btnVisualizarPessoa;
    private javax.swing.JButton btnVisualizarVaga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
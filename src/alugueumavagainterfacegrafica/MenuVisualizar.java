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
    private AlugarPainel alugarPainel;
    public MenuVisualizar(boolean habilitarSelecaoPessoa,boolean habilitarVisualizarVagas, AlugarPainel alugarPainel) {
        this.lerArquivo = new LerArquivo();
        initComponents();
        btnSelecionarPessoa.setVisible(habilitarSelecaoPessoa);
        btnVisualizarVagas.setVisible(habilitarVisualizarVagas);
        this.alugarPainel = alugarPainel;
    }
    
    public MenuVisualizar() {
        this.lerArquivo = new LerArquivo();
        initComponents();
        btnSelecionarPessoa.setVisible(false);
    }
    
    public void CompletarDadosPessoa(){
        Object nomeCliente = this.jTableCadastrados.getModel().getValueAt(this.jTableCadastrados.getSelectedRow(), 0);
        Object cpfCliente = this.jTableCadastrados.getModel().getValueAt(this.jTableCadastrados.getSelectedRow(), 1);
        this.alugarPainel.preencherDadosPessoa(nomeCliente.toString(), cpfCliente.toString());
    }
    
    public void botaoBuscar(){
        DefaultTableModel cadastroPessoa = (DefaultTableModel) jTableCadastrados.getModel();
        cadastroPessoa.setNumRows(0);
        preencherTabela();
        buscarNome(txtBuscarNome.getText());
    }

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
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        txtBuscarNome = new javax.swing.JTextField();
        buscarPessoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCadastrados = new javax.swing.JTable();
        voltarVisualizarPessoas = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnVisualizarVagas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSelecionarPessoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualizar Informações");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                lerArquivo(evt);
            }
        });

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
        jTableCadastrados.setColumnSelectionAllowed(false);
        jScrollPane1.setViewportView(jTableCadastrados);

        voltarVisualizarPessoas.setText("Voltar");
        voltarVisualizarPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarVisualizarPessoasActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/door_out.png"))); // NOI18N
        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnVisualizarVagas.setText("Visualizar Vagas");
        btnVisualizarVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarVagasActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar por nome:");

        btnSelecionarPessoa.setText("Selecionar Pessoa");
        btnSelecionarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarPessoaActionPerformed(evt);
            }
        });

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
                        .addComponent(voltarVisualizarPessoas))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSelecionarPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVisualizarVagas))
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

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton3, voltarVisualizarPessoas});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltarVisualizarPessoas)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarPessoa))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisualizarVagas)
                    .addComponent(btnSelecionarPessoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton3, voltarVisualizarPessoas});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void voltarVisualizarPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarVisualizarPessoasActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarVisualizarPessoasActionPerformed


    private void lerArquivo(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_lerArquivo
        preencherTabela();
    }//GEN-LAST:event_lerArquivo


    private void btnVisualizarVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarVagasActionPerformed
        VisualizarVagas vv = new VisualizarVagas();
        vv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVisualizarVagasActionPerformed

    private void buscarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPessoaActionPerformed
        botaoBuscar();
    }//GEN-LAST:event_buscarPessoaActionPerformed

    private void txtBuscarNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNomeKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
           botaoBuscar();
        }
    }//GEN-LAST:event_txtBuscarNomeKeyPressed

    private void btnSelecionarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarPessoaActionPerformed
        CompletarDadosPessoa();
        this.dispose();
    }//GEN-LAST:event_btnSelecionarPessoaActionPerformed

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
    private javax.swing.JButton btnSelecionarPessoa;
    private javax.swing.JButton btnVisualizarVagas;
    private javax.swing.JButton buscarPessoa;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTableCadastrados;
    private javax.swing.JTextField txtBuscarNome;
    private javax.swing.JButton voltarVisualizarPessoas;
    // End of variables declaration//GEN-END:variables
}

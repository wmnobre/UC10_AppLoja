/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author 181301765
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jdpPainel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuCidadeCadastrar = new javax.swing.JMenuItem();
        menuCidadeListar = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenu();
        menuClienteCadastrar = new javax.swing.JMenuItem();
        menuClienteListar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja N172");
        setPreferredSize(new java.awt.Dimension(1000, 950));

        javax.swing.GroupLayout jdpPainelLayout = new javax.swing.GroupLayout(jdpPainel);
        jdpPainel.setLayout(jdpPainelLayout);
        jdpPainelLayout.setHorizontalGroup(
            jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jdpPainelLayout.setVerticalGroup(
            jdpPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivo");

        btnSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jMenu1.add(btnSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cidade");

        menuCidadeCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menuCidadeCadastrar.setText("Cadastrar");
        menuCidadeCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCidadeCadastrarActionPerformed(evt);
            }
        });
        jMenu2.add(menuCidadeCadastrar);

        menuCidadeListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        menuCidadeListar.setText("Listar");
        menuCidadeListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCidadeListarActionPerformed(evt);
            }
        });
        jMenu2.add(menuCidadeListar);

        jMenuBar1.add(jMenu2);

        menuCliente.setText("Cliente");

        menuClienteCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        menuClienteCadastrar.setText("Cadastrar");
        menuClienteCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteCadastrarActionPerformed(evt);
            }
        });
        menuCliente.add(menuClienteCadastrar);

        menuClienteListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        menuClienteListar.setText("Listar");
        menuClienteListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteListarActionPerformed(evt);
            }
        });
        menuCliente.add(menuClienteListar);

        jMenuBar1.add(menuCliente);

        jMenu4.setText("Categoria");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Produtos");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPainel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpPainel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       
        
        TelaPrincipal.this.dispose();
        
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void menuCidadeListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCidadeListarActionPerformed
     
        ListCidades tela = new ListCidades(jdpPainel);
        jdpPainel.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_menuCidadeListarActionPerformed

    private void menuCidadeCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCidadeCadastrarActionPerformed
        
        FrmCidade tela = new FrmCidade();
        jdpPainel.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_menuCidadeCadastrarActionPerformed

    private void menuClienteCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteCadastrarActionPerformed

        
        FrmCliente tela = new FrmCliente();
        jdpPainel.add(tela);
        tela.setVisible(true);
    }//GEN-LAST:event_menuClienteCadastrarActionPerformed

    private void menuClienteListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteListarActionPerformed
         ListClientes tela = new ListClientes();
        jdpPainel.add(tela);
        tela.setVisible(true);
        
    }//GEN-LAST:event_menuClienteListarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpPainel;
    private javax.swing.JMenuItem menuCidadeCadastrar;
    private javax.swing.JMenuItem menuCidadeListar;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenuItem menuClienteCadastrar;
    private javax.swing.JMenuItem menuClienteListar;
    // End of variables declaration//GEN-END:variables
}

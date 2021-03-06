package view;

import dao.CidadeDAO;
import dao.EstadoDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cidade;
import model.Estado;

/**
 *
 * @author 181301765
 */
public class ListCidades extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListCidades
     */
    
    public JDesktopPane jdpTelainicial;
            
    public ListCidades(JDesktopPane jdpPainel) {
        initComponents();
        carregarEstados();
        carregarTabela();
        this.jdpTelainicial = jdpPainel;
    }
    
    
    private void carregarEstados(){       
               
        List<Estado> lista = EstadoDAO.getEstados();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        Estado fake = new Estado("Todas a cidades...");        
        fake.setCodigo(0);        
        model.addElement(fake);        
        for (Estado estado : lista) {
            model.addElement(estado);
            
        }
        cmbEstados.setModel(model);
    }
    
    
    public void carregarTabela(){
        
         Estado estadoSelecionado = (Estado) cmbEstados.getSelectedItem();
         
         List<Cidade> lista;
         int codigo = estadoSelecionado.getCodigo();
         if (codigo == 0){
             lista = CidadeDAO.getCidades();
         }else{             
             lista = CidadeDAO.getCidades(codigo);
         }
         
        DefaultTableModel model = new DefaultTableModel();
        String[] colunas = {"Código", "Nome da Cidade", "Estado"};
        model.setColumnIdentifiers(colunas);
        
        for (Cidade cid : lista){
            Object [] linha = {
              cid.getCodigo(),
              cid.getNome(),
              cid.getEstado().getNome()
            };
            model.addRow(linha);
            
        }
        
        tableCidades.setModel(model);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCidades = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbEstados = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Lista Cidades");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Lista de Cidades");

        tableCidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Alvorada"},
                {"25", "Canoas"},
                {"3", "Porto Alegre"}
            },
            new String [] {
                "Código", "Nome da Cidade"
            }
        ));
        jScrollPane1.setViewportView(tableCidades);

        btnEditar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Estado");

        cmbEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEstados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEstadosItemStateChanged(evt);
            }
        });
        cmbEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmbEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(225, 225, 225))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linha = tableCidades.getSelectedRow();
        if (linha < 0){
            JOptionPane.showMessageDialog(this," Você de selecionar uma cidade! ");
        }else{
            int codigo = (int)tableCidades.getValueAt(linha,0);
            FrmCidade tela = new FrmCidade(codigo);
            jdpTelainicial.add(tela);
            tela.setVisible(true);
        }
        
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tableCidades.getSelectedRow();
                if (linha < 0){
            JOptionPane.showMessageDialog(this, "Você deve selecionar uma cidade!");
            
        }else{
            int codigo = (int) tableCidades.getValueAt(linha, 0);
            String nome = (String)tableCidades.getValueAt(linha, 1);
            
                       
         
         int resposta = JOptionPane.showConfirmDialog(this,"Confirma a exclusão da cidade " + nome + "?", "Excluir Cidade", JOptionPane.YES_NO_OPTION);
         if (resposta == JOptionPane.YES_NO_OPTION){
             
                    
            
            Cidade cidade = new Cidade();
            cidade.setCodigo(codigo);
            CidadeDAO.excluir(cidade);
            carregarTabela();
         }
        }
        
        
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void cmbEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadosActionPerformed

    private void cmbEstadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEstadosItemStateChanged

        
        carregarTabela();
        
        
    }//GEN-LAST:event_cmbEstadosItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<String> cmbEstados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCidades;
    // End of variables declaration//GEN-END:variables
}

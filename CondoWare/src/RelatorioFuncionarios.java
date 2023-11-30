package CondoWare2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioFuncionarios extends javax.swing.JFrame {

    /**
     * Creates new form RelatorioFuncionarios
     */
    private RelatorioFuncionarios() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private static RelatorioFuncionarios relatorioFuncionariosUnic;
    public static RelatorioFuncionarios getRelatorioFuncionariosUnic() {
        if (relatorioFuncionariosUnic == null) {
            relatorioFuncionariosUnic= new RelatorioFuncionarios();
        }
        return relatorioFuncionariosUnic;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotNome = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabFuncionarios = new javax.swing.JTable();
        btBuscar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btMostrarTodos = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btApagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela de Funcionarios");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        rotNome.setText("Nome:");

        tabFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cargo", "Salario"
            }
        ));
        jScrollPane1.setViewportView(tabFuncionarios);

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btMostrarTodos.setText("Mostrar Todos");
        btMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarTodosActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btApagar.setText("Apagar");
        btApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rotNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btMostrarTodos)
                                .addGap(50, 50, 50)
                                .addComponent(btApagar))
                            .addComponent(btVoltar))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMostrarTodos)
                    .addComponent(btEditar)
                    .addComponent(btApagar))
                .addGap(18, 18, 18)
                .addComponent(btVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        if(tabFuncionarios.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(
                    null,
                    "Selecione algum funcionario na tabela!!",
                    "Atenção!!",
                    1);
        }
        else{
            int row = tabFuncionarios.getSelectedRow();
            EditFuncionario.getEditFuncionarioUnic().receberNomeSal((String)tabFuncionarios.getValueAt(row,0),(float)tabFuncionarios.getValueAt(row,2));
            EditFuncionario.getEditFuncionarioUnic().setVisible(true);
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarActionPerformed
         if(tabFuncionarios.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(
                    null,
                    "Selecione algum funcionario na tabela!!",
                    "Atenção!!",
                    1);
        }
        else{
             int row = tabFuncionarios.getSelectedRow();
            ApagarFuncionario.getApagarFuncionarioUnic().receberNomeSal((String)tabFuncionarios.getValueAt(row,0),(float)tabFuncionarios.getValueAt(row,2));
            ApagarFuncionario.getApagarFuncionarioUnic().setVisible(true);
         }
    }//GEN-LAST:event_btApagarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarAll();
    }//GEN-LAST:event_formWindowActivated

    private void btMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarTodosActionPerformed
        listarAll();
    }//GEN-LAST:event_btMostrarTodosActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        listarBusca();
        Conexao.getConexao().atualizaBancoFuncionario();
    }//GEN-LAST:event_btBuscarActionPerformed

    public void listarBusca() {
        Bancos.getBancos().getBdFuncionario().clear();
        Conexao.getConexao().executaBuscaFuncionario(cxNome.getText());
        DefaultTableModel tabModel = (DefaultTableModel) tabFuncionarios.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        for(Funcionario f : Bancos.getBancos().getBdFuncionario()) {
            tabModel.insertRow(posLin, new Object[]{f.getNome(),
                                                       f.getCargo(),
                                                       f.getSalario()});
            posLin++;
        }
    }
    
    public void listarAll() {
        Bancos.getBancos().getBdFuncionario().clear();
        Conexao.getConexao().atualizaBancoFuncionario();
        DefaultTableModel tabModel = (DefaultTableModel) tabFuncionarios.getModel();
        int posLin = 0;
        tabModel.setRowCount(posLin);
        for(Funcionario f : Bancos.getBancos().getBdFuncionario()) {
            tabModel.insertRow(posLin, new Object[]{f.getNome(),
                                                       f.getCargo(),
                                                       f.getSalario()});
            posLin++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btApagar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btMostrarTodos;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotNome;
    private javax.swing.JTable tabFuncionarios;
    // End of variables declaration//GEN-END:variables
}

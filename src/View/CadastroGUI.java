package View;

import Controller.LocalController;
import Model.Funcionario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Arthur
 */
public class CadastroGUI extends javax.swing.JFrame {

    private final Funcionario funcionario;

    public CadastroGUI(Funcionario funcionario) {
        this.funcionario = funcionario;
        initComponents();
        this.getTodosLocais();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanelFormularioCadastro = new javax.swing.JPanel();
        BotaoVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextEndereco = new javax.swing.JTextField();
        BotaoCadastrar = new javax.swing.JButton();
        jTextImagem = new javax.swing.JTextField();
        jFormattedTextFieldValor = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLocais = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Affittare - Cadastro de Locais");
        setResizable(false);

        jPanelBackground.setBackground(new java.awt.Color(139, 0, 139));

        jPanelFormularioCadastro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFormularioCadastro.setPreferredSize(new java.awt.Dimension(600, 300));

        BotaoVoltar.setBackground(new java.awt.Color(255, 0, 0));
        BotaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoVoltar.setText("VOLTAR");
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("Valor da Locação:");

        jLabel7.setFont(new java.awt.Font("Viner Hand ITC", 0, 36)); // NOI18N
        jLabel7.setText("CADASTRO DE LOCAIS");

        jLabel1.setText("Imagem:");

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        BotaoCadastrar.setBackground(new java.awt.Color(0, 204, 0));
        BotaoCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCadastrar.setText("CADASTRAR");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        jFormattedTextFieldValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jFormattedTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldValorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormularioCadastroLayout = new javax.swing.GroupLayout(jPanelFormularioCadastro);
        jPanelFormularioCadastro.setLayout(jPanelFormularioCadastroLayout);
        jPanelFormularioCadastroLayout.setHorizontalGroup(
            jPanelFormularioCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormularioCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFormularioCadastroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelFormularioCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelFormularioCadastroLayout.createSequentialGroup()
                        .addGroup(jPanelFormularioCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(BotaoVoltar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanelFormularioCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelFormularioCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jFormattedTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextImagem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoCadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))))
        );
        jPanelFormularioCadastroLayout.setVerticalGroup(
            jPanelFormularioCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanelFormularioCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormularioCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoVoltar)
                    .addComponent(BotaoCadastrar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/casaNoturnaBG.png"))); // NOI18N

        jTableLocais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableLocais = new javax.swing.JTable(){

            public boolean isCellEditable(int row, int col){

                return false;

            }

        };
        jTableLocais.setCellSelectionEnabled(true);
        jTableLocais.setFocusable(false);
        jScrollPane1.setViewportView(jTableLocais);

        javax.swing.GroupLayout jPanelTabelaLayout = new javax.swing.GroupLayout(jPanelTabela);
        jPanelTabela.setLayout(jPanelTabelaLayout);
        jPanelTabelaLayout.setHorizontalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTabelaLayout.setVerticalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTabelaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelFormularioCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jPanelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelFormularioCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void getTodosLocais(){
    
        LocalController local = new LocalController();
        JSONObject json = local.getTodosLocais(this.funcionario.getId());
                                  
        try {

            if(json.has("status")){
                
                DefaultTableModel modelo = new DefaultTableModel();
                
                modelo.addColumn("Status:");
                modelo.addColumn("Nome:");
                modelo.addColumn("Endereço:");
                modelo.addColumn("Valor:");
                modelo.addColumn("Funcionário:");
                modelo.addColumn("Ação:");
                
                jTableLocais.setModel(modelo);
                
                if((boolean)json.get("status") && json.has("conteudo")){
                                
                    JSONArray conteudo = json.getJSONArray("conteudo");
                                        
                    for(int i = 0; i < conteudo.length(); i++){
                    
                        Object []obj= new Object[6];
                        
                        obj[0] = ((boolean)conteudo.getJSONObject(i).get("status") == true) ? "Ativo" : "Desativado";
                        
                        obj[1] = conteudo.getJSONObject(i).get("nome");
                        obj[2] = conteudo.getJSONObject(i).get("endereco");
                        obj[3] = conteudo.getJSONObject(i).get("valor");
                        obj[4] = conteudo.getJSONObject(i).get("funcionario");
                        obj[5] = new JButton("EDITAR");                        
                        
                        modelo.addRow(obj);
                        
                    }
                   
                } else {
                    
                    JOptionPane.showMessageDialog(this, json.get("msg"));
                    
                }
                 
            } else {
                
                JOptionPane.showMessageDialog(this, json.get("msg"));
                
            }             

        } catch (JSONException ex) {

            Logger.getLogger(CadastroGUI.class.getName()).log(Level.SEVERE, null, ex);

        }          
        
        
    }
    
    private void limparFormulario(){
    
        jTextNome.setText("");
        jTextEndereco.setText("");
        jFormattedTextFieldValor.setText("");
        jTextImagem.setText("");;
        
    }
    
    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        
        if(jTextNome.getText().length() == 0){
            
            JOptionPane.showMessageDialog(this, "Informe o nome do local");
                    
        } else {
            
            if(jTextEndereco.getText().length() == 0){
            
                JOptionPane.showMessageDialog(this, "Informe o endereço");
            
            } else {
            
                if(jFormattedTextFieldValor.getText().length() == 0){
                
                    JOptionPane.showMessageDialog(this, "Informe o valor da locação");
                    
                } else {
                    
                    if(jTextImagem.getText().length() == 0){
                        
                        JOptionPane.showMessageDialog(this, "Informe o URL da imagem");
                    
                    } else {                        
                                  
                        LocalController localController = new LocalController();
                        JSONObject json = localController.novoLocal(jTextNome.getText(), jTextEndereco.getText(), jFormattedTextFieldValor.getText(), this.funcionario.getId(), jTextImagem.getText());
                        
                        if(json.has("status")){
                            
                            try {
                                
                                boolean status = (boolean)json.get("status");
                                
                                if(status){
                                    
                                    this.getTodosLocais();
                                    this.limparFormulario();                                    
                                
                                } 
                                
                                JOptionPane.showMessageDialog(this, json.get("msg"));
                                
                            } catch (JSONException ex) {
                                
                                Logger.getLogger(CadastroGUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        
                        } else {
                        
                            JOptionPane.showMessageDialog(this, "Não existe uma informação de status");
                            
                        }
                        
                    }
                    
                }
            
            }
                
        }
        
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed

        //verificar JOptionPane.showConfirmDialog(this, "Deseja realmente voltar?", null, WIDTH, WIDTH);

        PrincipalGUI principal = new PrincipalGUI(funcionario);
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jFormattedTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldValorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JFormattedTextField jFormattedTextFieldValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelFormularioCadastro;
    private javax.swing.JPanel jPanelTabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLocais;
    private javax.swing.JTextField jTextEndereco;
    private javax.swing.JTextField jTextImagem;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables
}

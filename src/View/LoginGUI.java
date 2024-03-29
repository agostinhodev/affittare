
package View;
import Controller.LoginController;
import Model.Funcionario;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Character.toUpperCase;
import javax.swing.JOptionPane;
import View.PrincipalGUI;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginGUI extends javax.swing.JFrame {
    
    public LoginGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        jPanelCaixaLogin = new javax.swing.JPanel();
        jLabelLogin = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        jLabelEmail = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jTextSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Affittare - Login");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(139, 0, 139));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBackground.setBackground(new java.awt.Color(139, 0, 139));

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/affitareLogoTransparent.png"))); // NOI18N

        jPanelCaixaLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCaixaLogin.setPreferredSize(new java.awt.Dimension(600, 300));

        jLabelLogin.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jLabelLogin.setText("Login");

        jButtonEntrar.setBackground(new java.awt.Color(0, 204, 0));
        jButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar.setText("ENTRAR");
        jButtonEntrar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButtonEntrarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        jButtonEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonEntrarKeyPressed(evt);
            }
        });

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEmail.setText("E-mail:");

        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });
        jTextEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextEmailKeyPressed(evt);
            }
        });

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSenha.setText("Senha:");

        jTextSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextSenhaKeyPressed(evt);
            }
        });

        jLabel1.setText("Não tem acesso?");

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CADASTRE-SE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCaixaLoginLayout = new javax.swing.GroupLayout(jPanelCaixaLogin);
        jPanelCaixaLogin.setLayout(jPanelCaixaLoginLayout);
        jPanelCaixaLoginLayout.setHorizontalGroup(
            jPanelCaixaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCaixaLoginLayout.createSequentialGroup()
                .addGroup(jPanelCaixaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCaixaLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCaixaLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelSenha))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCaixaLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelCaixaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(jTextSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(jLabelEmail)
                            .addComponent(jButtonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCaixaLoginLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabelLogin))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCaixaLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanelCaixaLoginLayout.setVerticalGroup(
            jPanelCaixaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCaixaLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(labelLogo)
                .addGap(18, 18, 18)
                .addComponent(jPanelCaixaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelCaixaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLogo))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
                 
        if(jTextEmail.getText().length() == 0){
            
            JOptionPane.showMessageDialog(this, "Informe o email");
            jTextEmail.requestFocus();
            
        } else {
            
            if(jTextSenha.getText().length() == 0){
            
                JOptionPane.showMessageDialog(this, "Informe a senha");
                jTextSenha.requestFocus();

            } else {

                LoginController loginController = new LoginController();
                
                JSONObject json = loginController.login(jTextEmail.getText(), jTextSenha.getText());
                
                if(json.has("status")){
                    
                    try {
                        
                        boolean status = (boolean)json.get("status");
                        
                        if(status){
                            
                            JSONObject conteudo = (JSONObject) json.get("conteudo");  
                            
                            int id = Integer.parseInt(conteudo.get("id").toString());
                            String nome = conteudo.get("nome").toString();
                            
                            Funcionario funcionario = new Funcionario(id, nome);
                            
                            PrincipalGUI principal = new PrincipalGUI(funcionario);
                            principal.setVisible(true);
                            
                            dispose();                            
                        
                        } else {
                        
                            JOptionPane.showMessageDialog(this, json.get("msg").toString());
                            
                        }
                         
                    } catch (JSONException ex) {
                        
                        Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
                        
                    }
                    
                } else {
                    
                    JOptionPane.showMessageDialog(this, "Não foi encontrada uma resposta de status");
                
                }

            }
            
        }        
                
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jButtonEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEntrarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEntrarKeyPressed

    private void jTextEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextEmailKeyPressed
        // TODO add your handling code here:
        
        int tecla = evt.getKeyCode();
        
        if(tecla == 10 && jTextEmail.getText().length() > 0){
        
            jTextSenha.requestFocus();
        
        }
        
    }//GEN-LAST:event_jTextEmailKeyPressed

    private void jTextSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSenhaKeyPressed
        // TODO add your handling code here:
        
        int tecla = evt.getKeyCode();
        
        if(tecla == 10 && jTextSenha.getText().length() > 0){
        
            jButtonEntrar.doClick();
        
        }
    }//GEN-LAST:event_jTextSenhaKeyPressed

    private void jButtonEntrarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButtonEntrarAncestorAdded
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButtonEntrarAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        SignUpGUI cadastro = new SignUpGUI();
        cadastro.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        
        LoginGUI login = new LoginGUI();
        login.setVisible(true);                
          
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelCaixaLogin;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JPasswordField jTextSenha;
    private javax.swing.JLabel labelLogo;
    // End of variables declaration//GEN-END:variables
}


import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class FormPorquinhoDaIndia extends javax.swing.JFrame {

    private ArrayList animais;
    
    public FormPorquinhoDaIndia() {
        initComponents();
        animais = new ArrayList <PorquinhoDaIndia>();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lab_Cadastro = new javax.swing.JLabel();
        jTex_nome = new javax.swing.JTextField();
        cb_cor = new javax.swing.JTextField();
        jText_raca = new javax.swing.JTextField();
        Btn_Salvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        painel = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Lab_Cadastro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Lab_Cadastro.setForeground(new java.awt.Color(51, 0, 255));
        Lab_Cadastro.setText("Cadastro");

        jTex_nome.setText("nome");
        jTex_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTex_nomeActionPerformed(evt);
            }
        });

        cb_cor.setText("cor");

        jText_raca.setText("raça");

        Btn_Salvar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Btn_Salvar.setForeground(new java.awt.Color(153, 0, 0));
        Btn_Salvar.setText("Salvar");
        Btn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalvarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(painel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Lab_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 122, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cb_cor))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jText_raca))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTex_nome)))
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Salvar)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Lab_Cadastro)
                .addGap(18, 18, 18)
                .addComponent(jTex_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jText_raca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Salvar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalvarActionPerformed
        // TODO add your handling code here:
        
        DefaultListModel lista = new DefaultListModel();
         String cor1 = cb_cor.getText();
         
         
         PorquinhoDaIndia roedor = new PorquinhoDaIndia(jText_raca.getText () ,cb_cor.getText());
           animais.add(roedor); 
           for(int i=0; i<animais.size(); i++) 
               
          {
            roedor = (PorquinhoDaIndia)animais.get(i);
            lista.addElement(roedor.getCor());
            
                        
          }
         
         painel.setModel(lista);
         
    }//GEN-LAST:event_Btn_SalvarActionPerformed

    private void jTex_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTex_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTex_nomeActionPerformed

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
            java.util.logging.Logger.getLogger(FormPorquinhoDaIndia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPorquinhoDaIndia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPorquinhoDaIndia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPorquinhoDaIndia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormPorquinhoDaIndia().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Salvar;
    private javax.swing.JLabel Lab_Cadastro;
    private javax.swing.JTextField cb_cor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTex_nome;
    private javax.swing.JTextField jText_raca;
    private javax.swing.JList<String> painel;
    // End of variables declaration//GEN-END:variables
}

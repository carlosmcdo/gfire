/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.UIManager;


/**
 *
 * @author Kelvin
 */
public class Principal extends javax.swing.JFrame implements ActionListener {

    UsuarioPrincipal u = null;
    ContaPrincipal c = null;
    ContaPrincipal h = null;
    Calendario cal = new Calendario();
    private javax.swing.Timer timer;
    
    public Principal() {
        initComponents();
        pCalendario.add(cal);
        cal.setSize(390, 420);
        disparaRelogio();
    }

    
    public void disparaRelogio() {
        if (timer == null) {
            timer = new javax.swing.Timer(1000, this);
            timer.setInitialDelay(0);
            timer.start();
        } else if (!timer.isRunning()) {
            timer.restart();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPrincipal = new javax.swing.JPanel();
        btUsuario = new javax.swing.JButton();
        btContas = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        lbDe1 = new javax.swing.JLabel();
        lbDe2 = new javax.swing.JLabel();
        lbDia = new javax.swing.JLabel();
        lbMes = new javax.swing.JLabel();
        lbAno = new javax.swing.JLabel();
        pCalendario = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        btUsuario.setText("Usuários");
        btUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuarioActionPerformed(evt);
            }
        });

        btContas.setText("Contas");
        btContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btContasActionPerformed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbTitulo.setText(" GFiRe - Gestor Financeiro de Repúblicas");

        lbDe1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbDe1.setText("de");

        lbDe2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbDe2.setText("de");

        lbDia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbDia.setText("<Dia>");

        lbMes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbMes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMes.setText("<Mês>");
        lbMes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbAno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbAno.setText("<Ano>");

        javax.swing.GroupLayout pCalendarioLayout = new javax.swing.GroupLayout(pCalendario);
        pCalendario.setLayout(pCalendarioLayout);
        pCalendarioLayout.setHorizontalGroup(
            pCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );
        pCalendarioLayout.setVerticalGroup(
            pCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pPrincipalLayout = new javax.swing.GroupLayout(pPrincipal);
        pPrincipal.setLayout(pPrincipalLayout);
        pPrincipalLayout.setHorizontalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                    .addGroup(pPrincipalLayout.createSequentialGroup()
                        .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btContas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pPrincipalLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbDia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbDe1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbDe2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pPrincipalLayout.setVerticalGroup(
            pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrincipalLayout.createSequentialGroup()
                        .addComponent(btUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btContas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDia)
                    .addComponent(lbDe1)
                    .addComponent(lbMes)
                    .addComponent(lbDe2)
                    .addComponent(lbAno))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(816, 652));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsuarioActionPerformed
        u = new UsuarioPrincipal(this, rootPaneCheckingEnabled);
        u.setResizable(false);
        u.setVisible(true);
    }//GEN-LAST:event_btUsuarioActionPerformed

    private void btContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btContasActionPerformed
        c = new ContaPrincipal(this, rootPaneCheckingEnabled);
        c.setResizable(false);
        c.setVisible(true);
    }//GEN-LAST:event_btContasActionPerformed

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
            UIManager.setLookAndFeel(new org.jvnet.substance.skin.SubstanceBusinessBlackSteelLookAndFeel());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btContas;
    private javax.swing.JButton btUsuario;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbDe1;
    private javax.swing.JLabel lbDe2;
    private javax.swing.JLabel lbDia;
    private javax.swing.JLabel lbMes;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pCalendario;
    private javax.swing.JPanel pPrincipal;
    // End of variables declaration//GEN-END:variables

    
    
 public void actionPerformed(ActionEvent e) {
        Date hora = new Date();
        SimpleDateFormat dia = new SimpleDateFormat("dd");
        SimpleDateFormat mes = new SimpleDateFormat("MM");
        SimpleDateFormat ano = new SimpleDateFormat("yyyy");

        lbDia.setText(dia.format(hora));
        lbAno.setText(ano.format(hora));

        if (mes.format(hora).equals("01")) {
            lbMes.setText("Janeiro");
        }
        if (mes.format(hora).equals("02")) {
            lbMes.setText("Fevereiro");
        }
        if (mes.format(hora).equals("03")) {
            lbMes.setText("Março");
        }
        if (mes.format(hora).equals("04")) {
            lbMes.setText("Abril");
        }
        if (mes.format(hora).equals("05")) {
            lbMes.setText("Maio");
        }
        if (mes.format(hora).equals("06")) {
            lbMes.setText("Junho");
        }
        if (mes.format(hora).equals("07")) {
            lbMes.setText("Julho");
        }
        if (mes.format(hora).equals("08")) {
            lbMes.setText("Agosto");
        }
        if (mes.format(hora).equals("09")) {
            lbMes.setText("Setembro");
        }
        if (mes.format(hora).equals("10")) {
            lbMes.setText("Outubro");
        }
        if (mes.format(hora).equals("11")) {
            lbMes.setText("Novembro");
        }
        if (mes.format(hora).equals("12")) {
            lbMes.setText("Dezembro");
        }
    }
}

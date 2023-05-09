/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Steven.Cardona
 */
public class OptionsGameView extends javax.swing.JPanel {

    /**
     * Creates new form OptionsGameView
     */
    public OptionsGameView(JPanel container) {
        initComponents();
        this.containerPanel = container;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOnePlayer = new javax.swing.JButton();
        btnTwoPlayers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnOneRound = new javax.swing.JButton();
        btnTwoRounds = new javax.swing.JButton();
        btnThreeRounds = new javax.swing.JButton();
        btnFourRounds = new javax.swing.JButton();
        btnGame = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 450));
        setMinimumSize(new java.awt.Dimension(800, 450));
        setPreferredSize(new java.awt.Dimension(800, 450));

        btnOnePlayer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnOnePlayer.setText("1 JUGADOR");
        btnOnePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnePlayerActionPerformed(evt);
            }
        });

        btnTwoPlayers.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnTwoPlayers.setText("2 JUGADORES");
        btnTwoPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoPlayersActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("RONDAS");

        btnOneRound.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnOneRound.setText("1");
        btnOneRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneRoundActionPerformed(evt);
            }
        });

        btnTwoRounds.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnTwoRounds.setText("2");
        btnTwoRounds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoRoundsActionPerformed(evt);
            }
        });

        btnThreeRounds.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnThreeRounds.setText("3");
        btnThreeRounds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeRoundsActionPerformed(evt);
            }
        });

        btnFourRounds.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnFourRounds.setText("4");
        btnFourRounds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourRoundsActionPerformed(evt);
            }
        });

        btnGame.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGame.setText("JUGAR");
        btnGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGameActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("VOLVER");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOneRound)
                                .addGap(122, 122, 122)
                                .addComponent(btnTwoRounds))
                            .addComponent(btnOnePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnThreeRounds)
                                .addGap(120, 120, 120)
                                .addComponent(btnFourRounds))
                            .addComponent(btnTwoPlayers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(100, 100, 100))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(btnGame, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOnePlayer)
                    .addComponent(btnTwoPlayers))
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnOneRound)
                        .addComponent(btnTwoRounds))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFourRounds)
                        .addComponent(btnThreeRounds)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGame, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTwoRoundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoRoundsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTwoRoundsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        WelcomeView view = new WelcomeView(containerPanel);
        view.setSize(800, 450);
        view.setLocation(0, 0);

        containerPanel.removeAll();
        containerPanel.add(view, BorderLayout.CENTER);
        containerPanel.revalidate();
        containerPanel.repaint();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGameActionPerformed
        // TODO add your handling code here:
        PlayerInfoView view = new PlayerInfoView(containerPanel);
        view.setSize(800, 450);
        view.setLocation(0, 0);

        containerPanel.removeAll();
        containerPanel.add(view, BorderLayout.CENTER);
        containerPanel.revalidate();
        containerPanel.repaint();
    }//GEN-LAST:event_btnGameActionPerformed

    private void btnOneRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneRoundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOneRoundActionPerformed

    private void btnThreeRoundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeRoundsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThreeRoundsActionPerformed

    private void btnFourRoundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourRoundsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFourRoundsActionPerformed

    private void btnOnePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnePlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOnePlayerActionPerformed

    private void btnTwoPlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoPlayersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTwoPlayersActionPerformed

    private JPanel containerPanel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFourRounds;
    private javax.swing.JButton btnGame;
    private javax.swing.JButton btnOnePlayer;
    private javax.swing.JButton btnOneRound;
    private javax.swing.JButton btnThreeRounds;
    private javax.swing.JButton btnTwoPlayers;
    private javax.swing.JButton btnTwoRounds;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tenis;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author MonniAzcunaga
 */
public class Tablero extends javax.swing.JFrame {
int puntos_jugador1;
int puntos_jugador2;
    /**
     * Creates new form Tablero
     */
    public Tablero() {
        
        
        super("Pantalla de marcador");
        initComponents();
    }
    
    
    
    private void reset(){
    
        puntaje.setText("");
        marcador.setText("");
        puntos_jugador1=0;
        puntos_jugador2=0;    
    }
    private void puntaje(){
    puntos_jugador1=0;
        puntos_jugador2=0; 
    
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_jugador1 = new javax.swing.JButton();
        boton_jugador2 = new javax.swing.JButton();
        puntaje = new javax.swing.JLabel();
        marcador = new javax.swing.JLabel();
        boton_reiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton_jugador1.setText("Jugador 1");
        boton_jugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_jugador1MouseClicked(evt);
            }
        });
        boton_jugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_jugador1ActionPerformed(evt);
            }
        });

        boton_jugador2.setText("Jugador 2");
        boton_jugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_jugador2MouseClicked(evt);
            }
        });
        boton_jugador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_jugador2ActionPerformed(evt);
            }
        });

        puntaje.setForeground(new java.awt.Color(0, 204, 51));
        puntaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        puntaje.setText("Love-All");

        marcador.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        marcador.setForeground(new java.awt.Color(255, 0, 0));
        marcador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        boton_reiniciar.setText("Reiniciar Juego");
        boton_reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(boton_jugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_jugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marcador, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boton_reiniciar)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_jugador1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(boton_jugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marcador, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_reiniciar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void boton_jugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_jugador1ActionPerformed
//Accion Boton jugador 1
        // TODO add your handling code here:
         
    }//GEN-LAST:event_boton_jugador1ActionPerformed

    private void boton_jugador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_jugador2ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_boton_jugador2ActionPerformed

    private void boton_jugador1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_jugador1MouseClicked
        // TODO add your handling code here:
   puntos_jugador1++;
    
     while (puntos_jugador1==7){
        
        boton_jugador1.setVisible(false);
        JOptionPane.showMessageDialog(rootPane, "juego finalizado");
        new Tablero().setVisible(true);
        reset();
    } 
    
       marcador.setText(puntos_jugador1+" - "+ puntos_jugador2);
        if (puntos_jugador1==1 && puntos_jugador2==0){
            puntaje.setText("Fifteen-Love");
            
        }else if(puntos_jugador1==2 && puntos_jugador2==0){
        puntaje.setText("Thirty-Love");
        
        } else if(puntos_jugador1==2 && puntos_jugador2==1){
        puntaje.setText("Thirty-fifteen");
        
          } else if(puntos_jugador1==2 && puntos_jugador2==2){
        puntaje.setText("Thirty-All");
        
          } else if(puntos_jugador1==3 && puntos_jugador2==0){
        puntaje.setText("Forty-love");
        
         } else if(puntos_jugador1==3 && puntos_jugador2==1){
        puntaje.setText("Forty-fifteen");
        
          } else if(puntos_jugador1==3 && puntos_jugador2==2){
        puntaje.setText("Forty-thirty");
        
        } else if(puntos_jugador1==3 && puntos_jugador2==3){
        puntaje.setText("Deuce");
        
        } else if(puntos_jugador1==4 && puntos_jugador2==3){
        puntaje.setText("Advantages Jugador 1");
        
        }else if(puntos_jugador1==4 && puntos_jugador2==4){
        puntaje.setText("Deuce");
        
        }else if(puntos_jugador1==5 && puntos_jugador2==4){
        puntaje.setText("Advance Jugador 1");
        
        
         }else if(puntos_jugador1==6 && puntos_jugador2==4){
         puntaje.setText("Jugador 1 gana");
          JOptionPane.showMessageDialog(rootPane, "juegador 1 gana");
       
        }
    }//GEN-LAST:event_boton_jugador1MouseClicked

    private void boton_jugador2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_jugador2MouseClicked
        // TODO add your handling code here:
        puntos_jugador2++;
         marcador.setText(puntos_jugador1+" - "+ puntos_jugador2);
        if (puntos_jugador1==0 && puntos_jugador2==1){
     
            puntaje.setText("Love_Fifteen");
        
     }else if(puntos_jugador1==0 && puntos_jugador2==2){
        puntaje.setText("Love-Thirty");
        
        } else if(puntos_jugador1==1 && puntos_jugador2==2){
        puntaje.setText("fifteen-Thirty");
        
        }else if (puntos_jugador1==2 && puntos_jugador2==2){
         puntaje.setText("All-Thirty");
         
           } else if(puntos_jugador1==2 && puntos_jugador2==3){
        puntaje.setText("Thirty-Forty");
        
          } else if(puntos_jugador1==3 && puntos_jugador2==3){
        puntaje.setText("Deuce");
        
         } else if(puntos_jugador1==3 && puntos_jugador2==4){
        puntaje.setText("Advantages Jugador 2");
        
       
         } else if(puntos_jugador1==4 && puntos_jugador2==4){
        puntaje.setText("Deuce");
        
          }else if(puntos_jugador1==4 && puntos_jugador2==5){
        puntaje.setText("Advance Jugador 2");
        
         }else if(puntos_jugador1==4 && puntos_jugador2==6){
        puntaje.setText("Jugador 2 Gana");
        
        
         }
    }//GEN-LAST:event_boton_jugador2MouseClicked

    private void boton_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reiniciarActionPerformed
       // TODO add your handling code here:
        
         puntaje.setText("Love-All");
        marcador.setText("");
        puntos_jugador1=0;
        puntos_jugador2=0;
    }//GEN-LAST:event_boton_reiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_jugador1;
    private javax.swing.JButton boton_jugador2;
    private javax.swing.JButton boton_reiniciar;
    private javax.swing.JLabel marcador;
    private javax.swing.JLabel puntaje;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;



/**
 *
 * @author tmichaud
 */
public class FenPrinc extends javax.swing.JFrame {

    /**
     * Creates new form FenPrinc
     */
    public FenPrinc() {
        initComponents();
        
        radioLinux.addActionListener(new EventBoutonRadio());
        radioMac.addActionListener(new EventBoutonRadio());
        radioWindows.addActionListener(new EventBoutonRadio());
        jMenuBar1.setOpaque(true);
        jMenuBar1.setBackground(Color.GREEN);
        comboEntree.setOpaque(true);
        comboEntree.setBackground(Color.RED);
        getContentPane().setBackground(Color.CYAN);
        listeOS.setBackground(Color.GREEN);
        
        
        
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        etiSaisieCode = new javax.swing.JLabel();
        zoneSaisie = new javax.swing.JTextField();
        etiChoixSE = new javax.swing.JLabel();
        comboEntree = new javax.swing.JComboBox<>();
        etiListeSE = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listeOS = new javax.swing.JList<>();
        checkBoxLin = new javax.swing.JCheckBox();
        checkBoxWin = new javax.swing.JCheckBox();
        checkBoxMac = new javax.swing.JCheckBox();
        radioLinux = new javax.swing.JRadioButton();
        radioWindows = new javax.swing.JRadioButton();
        radioMac = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        zoneMsgEvt = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemMenuC = new javax.swing.JMenuItem();
        itemMenuCpp = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemMenuPhp = new javax.swing.JMenuItem();
        itemMenuJavaScript = new javax.swing.JMenuItem();
        itemMenuJava = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("exemple d'IHM");
        setPreferredSize(new java.awt.Dimension(250, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        etiSaisieCode.setText("Entrez votre code");
        getContentPane().add(etiSaisieCode);
        etiSaisieCode.setBounds(10, 30, 130, 15);

        zoneSaisie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoneSaisieActionPerformed(evt);
            }
        });
        getContentPane().add(zoneSaisie);
        zoneSaisie.setBounds(140, 20, 50, 30);

        etiChoixSE.setText("choix");
        getContentPane().add(etiChoixSE);
        etiChoixSE.setBounds(30, 70, 36, 15);

        comboEntree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Linux", "Windows", "Unix", "Solaris" }));
        comboEntree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEntreeActionPerformed(evt);
            }
        });
        getContentPane().add(comboEntree);
        comboEntree.setBounds(110, 70, 71, 24);

        etiListeSE.setText("liste");
        getContentPane().add(etiListeSE);
        etiListeSE.setBounds(30, 130, 31, 15);

        listeOS.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Linux", "Windows", "Unix", "Solaris" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listeOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeOSMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listeOS);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(90, 110, 80, 90);

        checkBoxLin.setText("Linux");
        checkBoxLin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBoxLinMouseClicked(evt);
            }
        });
        getContentPane().add(checkBoxLin);
        checkBoxLin.setBounds(0, 220, 70, 23);

        checkBoxWin.setText("Windows");
        checkBoxWin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBoxWinMouseClicked(evt);
            }
        });
        checkBoxWin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxWinActionPerformed(evt);
            }
        });
        getContentPane().add(checkBoxWin);
        checkBoxWin.setBounds(70, 220, 90, 23);

        checkBoxMac.setText("Mac os");
        checkBoxMac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkBoxMacMouseClicked(evt);
            }
        });
        getContentPane().add(checkBoxMac);
        checkBoxMac.setBounds(170, 220, 80, 23);

        buttonGroup1.add(radioLinux);
        radioLinux.setText("Linux");
        radioLinux.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioLinuxMouseClicked(evt);
            }
        });
        radioLinux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLinuxActionPerformed(evt);
            }
        });
        getContentPane().add(radioLinux);
        radioLinux.setBounds(0, 260, 70, 23);

        buttonGroup1.add(radioWindows);
        radioWindows.setText("Windows");
        radioWindows.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioWindowsMouseClicked(evt);
            }
        });
        getContentPane().add(radioWindows);
        radioWindows.setBounds(70, 260, 90, 23);

        buttonGroup1.add(radioMac);
        radioMac.setText("Mac ...");
        radioMac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioMacMouseClicked(evt);
            }
        });
        getContentPane().add(radioMac);
        radioMac.setBounds(170, 260, 80, 23);

        jLabel4.setText("source de l'évenement :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 280, 180, 15);
        getContentPane().add(zoneMsgEvt);
        zoneMsgEvt.setBounds(0, 300, 250, 30);

        jMenu1.setText("Langages");

        itemMenuC.setText("C");
        itemMenuC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCActionPerformed(evt);
            }
        });
        jMenu1.add(itemMenuC);

        itemMenuCpp.setText("C++");
        jMenu1.add(itemMenuCpp);

        jMenu2.setText("web");

        itemMenuPhp.setText("php");
        itemMenuPhp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuPhpActionPerformed(evt);
            }
        });
        jMenu2.add(itemMenuPhp);

        itemMenuJavaScript.setText("javascript");
        jMenu2.add(itemMenuJavaScript);

        jMenu1.add(jMenu2);

        itemMenuJava.setText("java");
        jMenu1.add(itemMenuJava);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public class EventBoutonRadio implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e){
            if((e.getSource()) instanceof JRadioButton){
            System.out.println("Cliqué sur "+((JRadioButton) e.getSource()).getText());
            }
        }       
    }
    
    
    
    private void itemMenuCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemMenuCActionPerformed

    private void itemMenuPhpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuPhpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemMenuPhpActionPerformed

    private void zoneSaisieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoneSaisieActionPerformed
        System.out.println("Dans la zone de saisie => "+ zoneSaisie.getText());
        zoneMsgEvt.setText("Dans la zone de saisie => "+ zoneSaisie.getText());
    }//GEN-LAST:event_zoneSaisieActionPerformed

    private void checkBoxWinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxWinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxWinActionPerformed

    private void radioLinuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLinuxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioLinuxActionPerformed

    private void comboEntreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEntreeActionPerformed
        System.out.println("Dans la zone de saisie => "+ comboEntree.getSelectedItem());
        zoneMsgEvt.setText("Dans la zone de saisie => "+ comboEntree.getSelectedItem());
    }//GEN-LAST:event_comboEntreeActionPerformed

    private void listeOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeOSMouseClicked
        System.out.println("Dans la zone de saisie => "+ listeOS.getSelectedValue());
        zoneMsgEvt.setText("Dans la zone de saisie => "+ listeOS.getSelectedValue());
    }//GEN-LAST:event_listeOSMouseClicked

    private void checkBoxLinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBoxLinMouseClicked
        if(checkBoxLin.isSelected()){
            System.out.println("Dans la zone de saisie => "+ checkBoxLin.getActionCommand()+ " coché");
            zoneMsgEvt.setText("Dans la zone de saisie => "+ checkBoxLin.getActionCommand()+ " coché");
        }else{
            System.out.println("Dans la zone de saisie => "+ checkBoxLin.getActionCommand()+ " non coché");
            zoneMsgEvt.setText("Dans la zone de saisie => "+ checkBoxLin.getActionCommand()+ " non coché");
        }
    }//GEN-LAST:event_checkBoxLinMouseClicked

    private void checkBoxWinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBoxWinMouseClicked
        if(checkBoxWin.isSelected()){
            System.out.println("Dans la zone de saisie => "+ checkBoxWin.getActionCommand()+ " coché");
            zoneMsgEvt.setText("Dans la zone de saisie => "+ checkBoxWin.getActionCommand()+ " coché");
        }else{
            System.out.println("Dans la zone de saisie => "+ checkBoxWin.getActionCommand()+ " non coché");
            zoneMsgEvt.setText("Dans la zone de saisie => "+ checkBoxWin.getActionCommand()+ " non coché");
        }
    }//GEN-LAST:event_checkBoxWinMouseClicked

    private void checkBoxMacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkBoxMacMouseClicked
        if(checkBoxMac.isSelected()){
            System.out.println("Dans la zone de saisie => "+ checkBoxMac.getActionCommand()+ " coché");
            zoneMsgEvt.setText("Dans la zone de saisie => "+ checkBoxMac.getActionCommand()+ " coché");
        }else{
            System.out.println("Dans la zone de saisie => "+ checkBoxMac.getActionCommand()+ " non coché");
            zoneMsgEvt.setText("Dans la zone de saisie => "+ checkBoxMac.getActionCommand()+ " non coché");
        }
    }//GEN-LAST:event_checkBoxMacMouseClicked

    private void radioLinuxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioLinuxMouseClicked
        System.out.println("Dans la zone de saisie => "+ radioLinux.getActionCommand());
        zoneMsgEvt.setText("Dans la zone de saisie => "+ radioLinux.getActionCommand());
    }//GEN-LAST:event_radioLinuxMouseClicked

    private void radioWindowsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioWindowsMouseClicked
        System.out.println("Dans la zone de saisie => "+ radioWindows.getActionCommand());
        zoneMsgEvt.setText("Dans la zone de saisie => "+ radioWindows.getActionCommand());
    }//GEN-LAST:event_radioWindowsMouseClicked

    private void radioMacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioMacMouseClicked
        System.out.println("Dans la zone de saisie => "+ radioMac.getActionCommand());
        zoneMsgEvt.setText("Dans la zone de saisie => "+ radioMac.getActionCommand());
    }//GEN-LAST:event_radioMacMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(FenPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenPrinc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkBoxLin;
    private javax.swing.JCheckBox checkBoxMac;
    private javax.swing.JCheckBox checkBoxWin;
    private javax.swing.JComboBox<String> comboEntree;
    private javax.swing.JLabel etiChoixSE;
    private javax.swing.JLabel etiListeSE;
    private javax.swing.JLabel etiSaisieCode;
    private javax.swing.JMenuItem itemMenuC;
    private javax.swing.JMenuItem itemMenuCpp;
    private javax.swing.JMenuItem itemMenuJava;
    private javax.swing.JMenuItem itemMenuJavaScript;
    private javax.swing.JMenuItem itemMenuPhp;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listeOS;
    private javax.swing.JRadioButton radioLinux;
    private javax.swing.JRadioButton radioMac;
    private javax.swing.JRadioButton radioWindows;
    private javax.swing.JLabel zoneMsgEvt;
    private javax.swing.JTextField zoneSaisie;
    // End of variables declaration//GEN-END:variables



 



}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rpg;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Ralty
 */
public class SettingsPanel extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame3
     */
    public SettingsPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    int areaFontSize = 18;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        SettingsBackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ChangeNameButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        LoadButton = new javax.swing.JButton();
        NewGameButton = new javax.swing.JButton();
        QuitButton = new javax.swing.JButton();
        ChangeNameTextField = new javax.swing.JTextField();
        NameConfirmButton = new javax.swing.JButton();
        FontSize = new javax.swing.JButton();
        FontSizePlus = new javax.swing.JButton();
        FontSizeMinus = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ralty\\Downloads\\settings-icon-14951.png")); // NOI18N
        jButton1.setBorderPainted(false);

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setText(".getHealth");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1020, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 647, Short.MAX_VALUE))
        );

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(61, 55));

        SettingsBackButton.setBackground(new java.awt.Color(51, 51, 51));
        SettingsBackButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ralty\\Downloads\\Back-button.png")); // NOI18N
        SettingsBackButton.setBorder(null);
        SettingsBackButton.setBorderPainted(false);
        SettingsBackButton.setContentAreaFilled(false);
        SettingsBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(SettingsBackButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SettingsBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Settings");

        ChangeNameButton.setBackground(new java.awt.Color(51, 51, 51));
        ChangeNameButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ChangeNameButton.setForeground(new java.awt.Color(255, 255, 255));
        ChangeNameButton.setText("Change Name");
        ChangeNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeNameButtonActionPerformed(evt);
            }
        });

        SaveButton.setBackground(new java.awt.Color(51, 51, 51));
        SaveButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save-icon.png"))); // NOI18N
        SaveButton.setText(" Save Game");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        LoadButton.setBackground(new java.awt.Color(51, 51, 51));
        LoadButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LoadButton.setForeground(new java.awt.Color(255, 255, 255));
        LoadButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Load-icon.png"))); // NOI18N
        LoadButton.setText(" Load Game");

        NewGameButton.setBackground(new java.awt.Color(51, 51, 51));
        NewGameButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NewGameButton.setForeground(new java.awt.Color(255, 255, 255));
        NewGameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NewGame-icon.png"))); // NOI18N
        NewGameButton.setText(" New Game");

        QuitButton.setBackground(new java.awt.Color(51, 51, 51));
        QuitButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        QuitButton.setForeground(new java.awt.Color(255, 255, 255));
        QuitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Quit-icon.png"))); // NOI18N
        QuitButton.setText(" Quit Game");

        ChangeNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ChangeNameTextField.setText("      Enter New Name Here");
        ChangeNameTextField.setEnabled(false);
        ChangeNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeNameTextFieldActionPerformed(evt);
            }
        });

        NameConfirmButton.setText("Confirm");
        NameConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameConfirmButtonActionPerformed(evt);
            }
        });

        FontSize.setBackground(new java.awt.Color(51, 51, 51));
        FontSize.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FontSize.setForeground(new java.awt.Color(255, 255, 255));
        FontSize.setText("[" + areaFontSize + "]" + "  Font Size");
        FontSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontSizeActionPerformed(evt);
            }
        });

        FontSizePlus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FontSizePlus.setText("+");
        FontSizePlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontSizePlusActionPerformed(evt);
            }
        });

        FontSizeMinus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FontSizeMinus.setText("-");
        FontSizeMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontSizeMinusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1117, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(478, 478, 478)
                        .addComponent(ChangeNameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(ChangeNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(517, 517, 517)
                        .addComponent(NameConfirmButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(475, 475, 475)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(FontSizeMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(FontSizePlus, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LoadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NewGameButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(QuitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FontSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(457, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(97, 97, 97)
                .addComponent(ChangeNameButton)
                .addGap(18, 18, 18)
                .addComponent(ChangeNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NameConfirmButton)
                .addGap(18, 18, 18)
                .addComponent(FontSize)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FontSizePlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FontSizeMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(SaveButton)
                .addGap(45, 45, 45)
                .addComponent(LoadButton)
                .addGap(46, 46, 46)
                .addComponent(NewGameButton)
                .addGap(42, 42, 42)
                .addComponent(QuitButton)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            

    }                                           

    //Settings Menu Back Button
    private void SettingsBackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        
        //goes back to Main Screen
        this.setVisible(false);
        MainScreen mainsc = new MainScreen();
        mainsc.newFont(areaFontSize); //sends newFontSize value
        mainsc.setVisible(true);
    }                                                  

    //Settings Menu - Change Name Button
    private void ChangeNameButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        ChangeNameTextField.setEnabled(true);
        ChangeNameTextField.setText("");        
    }                                                

    private void ChangeNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        
    }                                                   

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        System.out.println("hello");
    }                                          

    private void NameConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        MainScreen mainsc1 = new MainScreen();
        ChangeNameTextField.addKeyListener(new KeyAdapter() {
        });

        mainsc1.newName(ChangeNameTextField.getText());
    }                                                 

    private void FontSizeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        

    private void FontSizePlusActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        //limited max font size to 50
        if(++areaFontSize <= 50){  
            FontSize.setText("[" + (areaFontSize) + "]" + "  Font Size");
        }
    }                                            

    private void FontSizeMinusActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
        //limited minimuz font size to 10
        if(--areaFontSize >= 10){
            FontSize.setText("[" + (areaFontSize) + "]" + "  Font Size");
        }
        
    }                                             

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
            java.util.logging.Logger.getLogger(SettingsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton ChangeNameButton;
    private javax.swing.JTextField ChangeNameTextField;
    private javax.swing.JButton FontSize;
    private javax.swing.JButton FontSizeMinus;
    private javax.swing.JButton FontSizePlus;
    private javax.swing.JButton LoadButton;
    private javax.swing.JButton NameConfirmButton;
    private javax.swing.JButton NewGameButton;
    private javax.swing.JButton QuitButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton SettingsBackButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}

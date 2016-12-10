/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.Business;
import business.DB4OUtil;
import business.enterprise.Enterprise;
import business.network.Network;
import business.parentnetwork.ParentNetwork;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import userinterface.customerrole.RegisterJPanel;

/**
 *
 * @author soumiyaroy
 */
public class MainJFrame extends javax.swing.JFrame {

    Business business;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        btnProfile.setVisible(false);
        btnLogout.setVisible(false);
        business = DB4OUtil.getInstance().retrieveSystem();
        passwordPassword.setText(null);
        populateCountryCombo();
    }
    
    public void populateCountryCombo(){
        JComboBox countryCombo = comboCountry;
        countryCombo.removeAllItems();
        int counter = 0;
        for(ParentNetwork parentNetwork : business.getParentNetworkDirectory().getParentNetworkList()){
            if(counter == 0){
                populateCityCombo(parentNetwork);
            }
            countryCombo.addItem(parentNetwork);
            counter++;
        }
        countryCombo.setEnabled(true);
    }
    
    public void populateCityCombo(ParentNetwork parentNetwork){
        JComboBox cityCombo = comboCity;
        cityCombo.removeAllItems();
        int counter = 0;
        for(ParentNetwork pn : business.getParentNetworkDirectory().getParentNetworkList()){
            if(parentNetwork.getId() == pn.getId()){
                for(Network network : pn.getNetworkDirectory().getNetworkList()){
                    if(counter == 0)
                        populateBranchCombo(parentNetwork, network);
                    cityCombo.addItem(network);
                    counter++;
                }
                cityCombo.setEnabled(true);
                break;
            } 
        }
    }
    
    public void populateBranchCombo(ParentNetwork parentNetwork, Network network){
        JComboBox branchCombo = comboBranch;
        branchCombo.removeAllItems();
        for(ParentNetwork pn : business.getParentNetworkDirectory().getParentNetworkList()){
            if(parentNetwork.getId() == pn.getId()){
                for(Network n : pn.getNetworkDirectory().getNetworkList()){
                    if(network.getId() == n.getId()){
                        for(Enterprise enterprise : n.getEnterpriseDirectory().getEnterpriseList()){
                           branchCombo.addItem(enterprise);
                        }
                        comboBranch.setEnabled(true);
                        break;
                    }
                }
                break;
            }
        }
    }
    
//    public void changeHeaderAfterLogin(String name){
//        btnProfile.setVisible(true);
//        btnLogout.setVisible(true);
//        btnNewUser.setVisible(false);
//        btnLogin.setVisible(false);
//        lblMainHeader.setText("Welcome, "+name);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jSplitPane1 = new javax.swing.JSplitPane();
        upperJPanel = new javax.swing.JPanel();
        btnNewUser = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblMainHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        passwordPassword = new javax.swing.JPasswordField();
        userProcessContainer = new javax.swing.JPanel();
        welcomeJPanel = new javax.swing.JPanel();
        btnGo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboCountry = new javax.swing.JComboBox<>();
        comboCity = new javax.swing.JComboBox<>();
        comboBranch = new javax.swing.JComboBox<>();
        btnAboutUs = new javax.swing.JButton();
        btnContactUS = new javax.swing.JButton();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("jMenu7");

        jMenu8.setText("jMenu8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        upperJPanel.setBackground(new java.awt.Color(255, 204, 0));
        upperJPanel.setPreferredSize(new java.awt.Dimension(800, 100));
        upperJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNewUser.setBackground(new java.awt.Color(255, 255, 255));
        btnNewUser.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnNewUser.setForeground(new java.awt.Color(102, 102, 255));
        btnNewUser.setText("New User");
        btnNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserActionPerformed(evt);
            }
        });
        upperJPanel.add(btnNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(901, 44, 124, -1));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(102, 102, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        upperJPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1034, 45, 92, -1));
        upperJPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 22, -1, -1));

        lblMainHeader.setFont(new java.awt.Font("Yuppy SC", 3, 34)); // NOI18N
        lblMainHeader.setForeground(new java.awt.Color(51, 51, 255));
        lblMainHeader.setText("Runtime Environment");
        upperJPanel.add(lblMainHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 22, 355, 44));
        upperJPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 22, -1, -1));

        btnLogout.setBackground(new java.awt.Color(102, 102, 255));
        btnLogout.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(102, 102, 255));
        btnLogout.setText("Logout");
        upperJPanel.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 44, 100, -1));

        btnProfile.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(102, 102, 255));
        btnProfile.setText("Profile");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        upperJPanel.add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 44, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Username:");
        upperJPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 16, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Password:");
        upperJPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(936, 16, -1, -1));

        txtUsername.setForeground(new java.awt.Color(51, 51, 255));
        upperJPanel.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(809, 12, 109, -1));

        passwordPassword.setForeground(new java.awt.Color(51, 51, 255));
        passwordPassword.setText("jPasswordField1");
        upperJPanel.add(passwordPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(1014, 12, 106, -1));

        jSplitPane1.setTopComponent(upperJPanel);

        userProcessContainer.setBackground(new java.awt.Color(102, 102, 255));
        userProcessContainer.setLayout(new java.awt.CardLayout());

        welcomeJPanel.setBackground(new java.awt.Color(102, 102, 255));
        welcomeJPanel.setForeground(new java.awt.Color(102, 102, 255));

        btnGo.setBackground(new java.awt.Color(255, 255, 255));
        btnGo.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnGo.setForeground(new java.awt.Color(255, 153, 0));
        btnGo.setText("Go");
        btnGo.setEnabled(false);

        jSeparator1.setForeground(new java.awt.Color(255, 204, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("Select Country");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Select City");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Select Branch");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("View our services:");

        comboCountry.setBackground(new java.awt.Color(255, 255, 255));
        comboCountry.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        comboCountry.setForeground(new java.awt.Color(255, 153, 0));
        comboCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCountry.setEnabled(false);
        comboCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCountryActionPerformed(evt);
            }
        });

        comboCity.setBackground(new java.awt.Color(255, 255, 255));
        comboCity.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        comboCity.setForeground(new java.awt.Color(255, 153, 0));
        comboCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCity.setEnabled(false);
        comboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCityActionPerformed(evt);
            }
        });

        comboBranch.setBackground(new java.awt.Color(255, 255, 255));
        comboBranch.setForeground(new java.awt.Color(255, 153, 0));
        comboBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBranch.setEnabled(false);

        btnAboutUs.setBackground(new java.awt.Color(255, 255, 255));
        btnAboutUs.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAboutUs.setForeground(new java.awt.Color(255, 153, 0));
        btnAboutUs.setText("About Us");
        btnAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutUsActionPerformed(evt);
            }
        });

        btnContactUS.setBackground(new java.awt.Color(255, 255, 255));
        btnContactUS.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnContactUS.setForeground(new java.awt.Color(255, 153, 0));
        btnContactUS.setText("Contact Us");
        btnContactUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactUSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout welcomeJPanelLayout = new javax.swing.GroupLayout(welcomeJPanel);
        welcomeJPanel.setLayout(welcomeJPanelLayout);
        welcomeJPanelLayout.setHorizontalGroup(
            welcomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomeJPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnAboutUs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnContactUS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 665, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(welcomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(welcomeJPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6))
                    .addComponent(btnGo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBranch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        welcomeJPanelLayout.setVerticalGroup(
            welcomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeJPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(welcomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(welcomeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAboutUs)
                        .addComponent(btnContactUS))
                    .addGroup(welcomeJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(comboCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(comboCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(btnGo))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        userProcessContainer.add(welcomeJPanel, "card14");

        jSplitPane1.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    // TODO add your handling code here:
        // Get user name
        // business.setTxtUsername(txtUsername.getText());
        String userName = txtUsername.getText().trim();
        if (userName.length() == 0){
            JOptionPane.showMessageDialog(null, "Username cannot be blank", "Error Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Get Password
        char[] passwordCharArray = passwordPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        if (password.length() == 0  || password.length() < 6){
            JOptionPane.showMessageDialog(null, "Password should be greater than 6 characters", "Error Message", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Step 1: Check in the user account directory if you have the user
        UserAccount userAccount = business.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise = null;

        if (userAccount == null) {
            //Step2:Go inside each parentnetwork and check each network
            for (ParentNetwork parentnetwork : business.getParentNetworkDirectory().getParentNetworkList()) {
                //Step2.1:Check against each network
                for (Network network : parentnetwork.getNetworkDirectory().getNetworkList()) {
                    //Step3:Check against each enterprise inside each network
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                        if (userAccount != null) {
                            inEnterprise = enterprise;
                            break;
                        }
                    }
                }
            }
        }
        if (userAccount == null) {
            JOptionPane.showMessageDialog(this, "Invalid Username/Password");
            return;
        } else {
            userProcessContainer.add("WorkArea", userAccount.getRole().createWorkArea(userProcessContainer, userAccount, inEnterprise, business));
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

        btnLogin.setEnabled(false);
        //logoutJButton.setEnabled(true);
        txtUsername.setEnabled(false);
        passwordPassword.setEnabled(false);

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserActionPerformed
        // TODO add your handling code here:
        RegisterJPanel registerJPanel = new RegisterJPanel(userProcessContainer, business);
        userProcessContainer.add("registerJPanel", registerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNewUserActionPerformed

    private void btnAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutUsActionPerformed
        // TODO add your handling code here:
        AboutUsJPanel aboutUsJPanel = new AboutUsJPanel(userProcessContainer);
        userProcessContainer.add("AboutUsJPanel",aboutUsJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAboutUsActionPerformed

    private void btnContactUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactUSActionPerformed
        // TODO add your handling code here:
        ContactUsJPanel contactUsJPanel = new ContactUsJPanel(userProcessContainer);
        userProcessContainer.add("ContactUsJPanel",contactUsJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnContactUSActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProfileActionPerformed

    private void comboCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCountryActionPerformed
        // TODO add your handling code here:
        if(comboCountry.isEnabled()){
            comboCity.setEnabled(false);
            comboBranch.setEnabled(false);
            ParentNetwork parentNetwork = (ParentNetwork)comboCountry.getSelectedItem();
            populateCityCombo(parentNetwork);
            comboCity.setEnabled(true);
        }
    }//GEN-LAST:event_comboCountryActionPerformed

    private void comboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCityActionPerformed
        // TODO add your handling code here:
        if(comboCity.isEnabled()){
            ParentNetwork parentNetwork = (ParentNetwork)comboCountry.getSelectedItem();
            Network network = (Network)comboCity.getSelectedItem();
            populateBranchCombo(parentNetwork, network);
            comboBranch.setEnabled(true);
        }
    }//GEN-LAST:event_comboCityActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainJFrame mjf = new MainJFrame();
                mjf.setExtendedState(JFrame.MAXIMIZED_BOTH);
                mjf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutUs;
    private javax.swing.JButton btnContactUS;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNewUser;
    private javax.swing.JButton btnProfile;
    private javax.swing.JComboBox<String> comboBranch;
    private javax.swing.JComboBox<String> comboCity;
    private javax.swing.JComboBox<String> comboCountry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblMainHeader;
    private javax.swing.JPasswordField passwordPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPanel upperJPanel;
    private javax.swing.JPanel userProcessContainer;
    private javax.swing.JPanel welcomeJPanel;
    // End of variables declaration//GEN-END:variables
}

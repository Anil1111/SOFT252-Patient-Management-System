/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiview;

/**
 *
 * @author kacper
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeadBlock = new javax.swing.JPanel();
        pnlTitleHeader = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlDetails = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cboGender = new javax.swing.JComboBox<>();
        dateDob = new com.toedter.calendar.JDateChooser();
        txtPassword = new javax.swing.JPasswordField();
        txtSurname1 = new javax.swing.JTextField();
        pnlAddress = new javax.swing.JPanel();
        lblBuilding = new javax.swing.JLabel();
        lblRoad = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblPostcode = new javax.swing.JLabel();
        txtBuilding = new javax.swing.JTextField();
        txtRoad = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtPostcode = new javax.swing.JTextField();
        pnlUserTypes = new javax.swing.JPanel();
        cboUserType = new javax.swing.JComboBox<>();
        lblUserType = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlHeadBlock.setBackground(new java.awt.Color(0, 96, 15));

        javax.swing.GroupLayout pnlHeadBlockLayout = new javax.swing.GroupLayout(pnlHeadBlock);
        pnlHeadBlock.setLayout(pnlHeadBlockLayout);
        pnlHeadBlockLayout.setHorizontalGroup(
            pnlHeadBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlHeadBlockLayout.setVerticalGroup(
            pnlHeadBlockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        pnlTitleHeader.setBackground(new java.awt.Color(106, 191, 105));

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setText("Register Page:");

        javax.swing.GroupLayout pnlTitleHeaderLayout = new javax.swing.GroupLayout(pnlTitleHeader);
        pnlTitleHeader.setLayout(pnlTitleHeaderLayout);
        pnlTitleHeaderLayout.setHorizontalGroup(
            pnlTitleHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleHeaderLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitle)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        pnlTitleHeaderLayout.setVerticalGroup(
            pnlTitleHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleHeaderLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitle)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnlDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        pnlDetails.setName(""); // NOI18N

        lblName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText("Name: ");

        lblSurname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblSurname.setForeground(new java.awt.Color(0, 0, 0));
        lblSurname.setText("Surname:");

        lblGender.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblGender.setForeground(new java.awt.Color(0, 0, 0));
        lblGender.setText("Gender:");

        lblDob.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDob.setForeground(new java.awt.Color(0, 0, 0));
        lblDob.setText("DoB:");

        lblPassword.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setText("Password:");

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));

        cboGender.setBackground(new java.awt.Color(255, 255, 255));
        cboGender.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cboGender.setForeground(new java.awt.Color(0, 0, 0));
        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        dateDob.setBackground(new java.awt.Color(255, 255, 255));
        dateDob.setDateFormatString("dd-MM-yyyy");
        dateDob.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));

        txtSurname1.setBackground(new java.awt.Color(255, 255, 255));
        txtSurname1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtSurname1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlDetailsLayout = new javax.swing.GroupLayout(pnlDetails);
        pnlDetails.setLayout(pnlDetailsLayout);
        pnlDetailsLayout.setHorizontalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword)
                    .addComponent(lblDob)
                    .addComponent(lblGender)
                    .addComponent(lblSurname)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateDob, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(txtPassword)
                    .addComponent(cboGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName)
                    .addComponent(txtSurname1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSurname)
                    .addComponent(txtSurname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(cboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDob)
                    .addComponent(dateDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pnlAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        pnlAddress.setName(""); // NOI18N

        lblBuilding.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblBuilding.setForeground(new java.awt.Color(0, 0, 0));
        lblBuilding.setText("Building:");

        lblRoad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRoad.setForeground(new java.awt.Color(0, 0, 0));
        lblRoad.setText("Road:");

        lblCity.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCity.setForeground(new java.awt.Color(0, 0, 0));
        lblCity.setText("City:");

        lblPostcode.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPostcode.setForeground(new java.awt.Color(0, 0, 0));
        lblPostcode.setText("Postcode:");

        txtBuilding.setBackground(new java.awt.Color(255, 255, 255));
        txtBuilding.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtBuilding.setForeground(new java.awt.Color(0, 0, 0));

        txtRoad.setBackground(new java.awt.Color(255, 255, 255));
        txtRoad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtRoad.setForeground(new java.awt.Color(0, 0, 0));

        txtCity.setBackground(new java.awt.Color(255, 255, 255));
        txtCity.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCity.setForeground(new java.awt.Color(0, 0, 0));

        txtPostcode.setBackground(new java.awt.Color(255, 255, 255));
        txtPostcode.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPostcode.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlAddressLayout = new javax.swing.GroupLayout(pnlAddress);
        pnlAddress.setLayout(pnlAddressLayout);
        pnlAddressLayout.setHorizontalGroup(
            pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddressLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPostcode)
                    .addComponent(lblCity)
                    .addComponent(lblRoad)
                    .addComponent(lblBuilding))
                .addGap(18, 18, 18)
                .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuilding)
                    .addComponent(txtRoad)
                    .addComponent(txtCity)
                    .addComponent(txtPostcode))
                .addGap(37, 37, 37))
        );
        pnlAddressLayout.setVerticalGroup(
            pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddressLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuilding)
                    .addComponent(txtBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoad)
                    .addComponent(txtRoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPostcode)
                    .addComponent(txtPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlUserTypes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UserType", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        cboUserType.setBackground(new java.awt.Color(255, 255, 255));
        cboUserType.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cboUserType.setForeground(new java.awt.Color(0, 0, 0));
        cboUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Doctor", "Secretary", "Admin", " " }));
        cboUserType.setEnabled(false);

        lblUserType.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUserType.setForeground(new java.awt.Color(0, 0, 0));
        lblUserType.setText("User Type:");

        javax.swing.GroupLayout pnlUserTypesLayout = new javax.swing.GroupLayout(pnlUserTypes);
        pnlUserTypes.setLayout(pnlUserTypesLayout);
        pnlUserTypesLayout.setHorizontalGroup(
            pnlUserTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserTypesLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblUserType)
                .addGap(18, 18, 18)
                .addComponent(cboUserType, 0, 294, Short.MAX_VALUE)
                .addGap(59, 59, 59))
        );
        pnlUserTypesLayout.setVerticalGroup(
            pnlUserTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserTypesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlUserTypesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserType)
                    .addComponent(cboUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnRegister.setBackground(new java.awt.Color(56, 142, 60));
        btnRegister.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 0, 0));
        btnRegister.setText("Register");
        btnRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnRegister.setBorderPainted(false);

        btnCancel.setBackground(new java.awt.Color(56, 142, 60));
        btnCancel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 0));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnCancel.setBorderPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeadBlock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTitleHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUserTypes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeadBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTitleHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUserTypes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JComboBox<String> cboUserType;
    private com.toedter.calendar.JDateChooser dateDob;
    private javax.swing.JLabel lblBuilding;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPostcode;
    private javax.swing.JLabel lblRoad;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserType;
    private javax.swing.JPanel pnlAddress;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JPanel pnlHeadBlock;
    private javax.swing.JPanel pnlTitleHeader;
    private javax.swing.JPanel pnlUserTypes;
    private javax.swing.JTextField txtBuilding;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPostcode;
    private javax.swing.JTextField txtRoad;
    private javax.swing.JTextField txtSurname1;
    // End of variables declaration//GEN-END:variables
}

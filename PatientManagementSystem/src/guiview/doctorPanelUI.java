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
public class doctorPanelUI extends javax.swing.JPanel {

    /**
     * Creates new form PatientPanelUI
     */
    public doctorPanelUI() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlAppointments = new javax.swing.JPanel();
        lblAppointmentsTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAppointments = new javax.swing.JList<>();
        jSeparator4 = new javax.swing.JSeparator();
        lblPatientDetailsTitle = new javax.swing.JLabel();
        lblNameTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblGenderTitle = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblAgeTitle = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btnViewPatientHistory = new javax.swing.JButton();
        btnStartConsultation = new javax.swing.JButton();
        pnlConsultations = new javax.swing.JPanel();
        lblPatientTitle = new javax.swing.JLabel();
        lblPatient = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblMedicineTitle = new javax.swing.JLabel();
        lblQuantityTitle = new javax.swing.JLabel();
        lblDosageTitle = new javax.swing.JLabel();
        cboMedicine = new javax.swing.JComboBox<>();
        txtQuantity = new javax.swing.JTextField();
        txtDosage = new javax.swing.JTextField();
        lblMedicalListTitle = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstMedicalList = new javax.swing.JList<>();
        jSeparator3 = new javax.swing.JSeparator();
        btnAddRequest = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        lblNoteTitle = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaNotes = new javax.swing.JTextArea();
        btnCancel = new javax.swing.JButton();
        btnAnotherAppointment = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();

        setBackground(new java.awt.Color(76, 107, 110));

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        pnlAppointments.setBackground(new java.awt.Color(143, 174, 177));

        lblAppointmentsTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAppointmentsTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblAppointmentsTitle.setText("Appointments:");

        lstAppointments.setBackground(new java.awt.Color(255, 255, 255));
        lstAppointments.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(lstAppointments);

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        lblPatientDetailsTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPatientDetailsTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientDetailsTitle.setText("Selected Patients Details:");

        lblNameTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNameTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblNameTitle.setText("Name:");

        lblName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("firstName lastName");

        lblGenderTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblGenderTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblGenderTitle.setText("Gender:");

        lblGender.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 255));
        lblGender.setText("male/female");

        lblAgeTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAgeTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblAgeTitle.setText("Age:");

        lblAge.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(255, 255, 255));
        lblAge.setText("00");

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        btnViewPatientHistory.setBackground(new java.awt.Color(255, 255, 255));
        btnViewPatientHistory.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnViewPatientHistory.setForeground(new java.awt.Color(102, 102, 102));
        btnViewPatientHistory.setText("View Patients History");

        btnStartConsultation.setBackground(new java.awt.Color(255, 255, 255));
        btnStartConsultation.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnStartConsultation.setForeground(new java.awt.Color(102, 102, 102));
        btnStartConsultation.setText("Start Consultation");

        javax.swing.GroupLayout pnlAppointmentsLayout = new javax.swing.GroupLayout(pnlAppointments);
        pnlAppointments.setLayout(pnlAppointmentsLayout);
        pnlAppointmentsLayout.setHorizontalGroup(
            pnlAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAppointmentsLayout.createSequentialGroup()
                .addGroup(pnlAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAppointmentsLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(pnlAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAppointmentsTitle)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPatientDetailsTitle)))
                    .addGroup(pnlAppointmentsLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnViewPatientHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStartConsultation, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAppointmentsLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAppointmentsLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(pnlAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAppointmentsLayout.createSequentialGroup()
                                .addGroup(pnlAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGenderTitle)
                                    .addComponent(lblNameTitle)
                                    .addComponent(lblAgeTitle))
                                .addGap(18, 18, 18)
                                .addGroup(pnlAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAge)
                                    .addComponent(lblName)
                                    .addComponent(lblGender)))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        pnlAppointmentsLayout.setVerticalGroup(
            pnlAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAppointmentsLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblAppointmentsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPatientDetailsTitle)
                .addGap(29, 29, 29)
                .addGroup(pnlAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameTitle)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenderTitle)
                    .addComponent(lblGender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgeTitle)
                    .addComponent(lblAge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(pnlAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewPatientHistory)
                    .addComponent(btnStartConsultation))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Appointments", pnlAppointments);

        pnlConsultations.setBackground(new java.awt.Color(143, 174, 177));
        pnlConsultations.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblPatientTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPatientTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientTitle.setText("Patient:");

        lblPatient.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPatient.setForeground(new java.awt.Color(255, 255, 255));
        lblPatient.setText("firstName lastName");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        lblMedicineTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMedicineTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblMedicineTitle.setText("Medicine");

        lblQuantityTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblQuantityTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantityTitle.setText("Quantity");

        lblDosageTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDosageTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblDosageTitle.setText("Dosage");

        cboMedicine.setBackground(new java.awt.Color(255, 255, 255));
        cboMedicine.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cboMedicine.setForeground(new java.awt.Color(0, 0, 0));
        cboMedicine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboMedicine.setBorder(null);

        txtQuantity.setBackground(new java.awt.Color(255, 255, 255));
        txtQuantity.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(0, 0, 0));

        txtDosage.setBackground(new java.awt.Color(255, 255, 255));
        txtDosage.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDosage.setForeground(new java.awt.Color(0, 0, 0));

        lblMedicalListTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMedicalListTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblMedicalListTitle.setText("Medicine List:");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        lstMedicalList.setBackground(new java.awt.Color(255, 255, 255));
        lstMedicalList.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lstMedicalList.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(lstMedicalList);

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        btnAddRequest.setBackground(new java.awt.Color(255, 255, 255));
        btnAddRequest.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAddRequest.setForeground(new java.awt.Color(102, 102, 102));
        btnAddRequest.setText("Add/ Request");

        btnRemove.setBackground(new java.awt.Color(255, 255, 255));
        btnRemove.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(102, 102, 102));
        btnRemove.setText("Remove");

        lblNoteTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNoteTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblNoteTitle.setText("Notes:");

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setForeground(new java.awt.Color(0, 0, 0));

        txtaNotes.setBackground(new java.awt.Color(255, 255, 255));
        txtaNotes.setColumns(20);
        txtaNotes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtaNotes.setForeground(new java.awt.Color(0, 0, 0));
        txtaNotes.setRows(5);
        jScrollPane3.setViewportView(txtaNotes);

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(102, 102, 102));
        btnCancel.setText("Cancel");

        btnAnotherAppointment.setBackground(new java.awt.Color(255, 255, 255));
        btnAnotherAppointment.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAnotherAppointment.setForeground(new java.awt.Color(102, 102, 102));
        btnAnotherAppointment.setText("Another Appointment");

        btnFinish.setBackground(new java.awt.Color(255, 255, 255));
        btnFinish.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFinish.setForeground(new java.awt.Color(102, 102, 102));
        btnFinish.setText("Finish");
        btnFinish.setActionCommand("Finish");

        javax.swing.GroupLayout pnlConsultationsLayout = new javax.swing.GroupLayout(pnlConsultations);
        pnlConsultations.setLayout(pnlConsultationsLayout);
        pnlConsultationsLayout.setHorizontalGroup(
            pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultationsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addGap(115, 115, 115))
            .addGroup(pnlConsultationsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultationsLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMedicineTitle))
                        .addGap(75, 75, 75)
                        .addGroup(pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantityTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDosageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDosage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlConsultationsLayout.createSequentialGroup()
                        .addGroup(pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlConsultationsLayout.createSequentialGroup()
                                .addGroup(pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlConsultationsLayout.createSequentialGroup()
                                        .addComponent(lblPatientTitle)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblPatient))
                                    .addGroup(pnlConsultationsLayout.createSequentialGroup()
                                        .addComponent(lblMedicalListTitle)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlConsultationsLayout.createSequentialGroup()
                                .addComponent(lblNoteTitle)
                                .addGap(18, 18, 18)
                                .addGroup(pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultationsLayout.createSequentialGroup()
                                        .addComponent(jScrollPane2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAddRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jSeparator3)
                                    .addComponent(jScrollPane3))))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultationsLayout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnAnotherAppointment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        pnlConsultationsLayout.setVerticalGroup(
            pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultationsLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientTitle)
                    .addComponent(lblPatient))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedicineTitle)
                    .addComponent(lblQuantityTitle)
                    .addComponent(lblDosageTitle))
                .addGap(18, 18, 18)
                .addGroup(pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDosage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMedicalListTitle)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlConsultationsLayout.createSequentialGroup()
                        .addComponent(btnAddRequest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemove)))
                .addGap(18, 18, 18)
                .addGroup(pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNoteTitle)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlConsultationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnotherAppointment)
                    .addComponent(btnFinish)
                    .addComponent(btnCancel))
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("Consultations", pnlConsultations);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRequest;
    private javax.swing.JButton btnAnotherAppointment;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnStartConsultation;
    private javax.swing.JButton btnViewPatientHistory;
    private javax.swing.JComboBox<String> cboMedicine;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAgeTitle;
    private javax.swing.JLabel lblAppointmentsTitle;
    private javax.swing.JLabel lblDosageTitle;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGenderTitle;
    private javax.swing.JLabel lblMedicalListTitle;
    private javax.swing.JLabel lblMedicineTitle;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameTitle;
    private javax.swing.JLabel lblNoteTitle;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel lblPatientDetailsTitle;
    private javax.swing.JLabel lblPatientTitle;
    private javax.swing.JLabel lblQuantityTitle;
    private javax.swing.JList<String> lstAppointments;
    private javax.swing.JList<String> lstMedicalList;
    private javax.swing.JPanel pnlAppointments;
    private javax.swing.JPanel pnlConsultations;
    private javax.swing.JTextField txtDosage;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextArea txtaNotes;
    // End of variables declaration//GEN-END:variables
}
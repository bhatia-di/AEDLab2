/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarCatalog;
import model.GeographicData;
import model.Month;

/**
 *
 * @author 18577
 */
public class UberMainFrame extends javax.swing.JFrame {
    CarCatalog carCatalog;
    DefaultTableModel carCatalogTableModel;

    /**
     * Creates new form UberMainFrame
     */
    public UberMainFrame() {
        this.carCatalog = new CarCatalog();
        initTableModel();
        initComponents();
        loadMonthModel();
        populateTableHistory();
        
        
    }
    
    private void initTableModel() {
        carCatalogTableModel = new DefaultTableModel();
        carCatalogTableModel.addColumn("Model Name");
        carCatalogTableModel.addColumn("Availability");
        carCatalogTableModel.addColumn("Number of Seats");
        carCatalogTableModel.addColumn("Manufacturer");

        carCatalogTableModel.addColumn("Availability Time");
        carCatalogTableModel.addColumn("Manufactured Timestamp");
        carCatalogTableModel.addColumn("Serial Number");
        carCatalogTableModel.addColumn("Location");
        carCatalogTableModel.addColumn("Maintenance Expiry");
    }
    
    private void loadMonthModel() {       
    
        DefaultComboBoxModel monthCombBoxModel = new DefaultComboBoxModel();
        monthCombBoxModel.addElement(new Month(1, "January"));
        monthCombBoxModel.addElement(new Month(2, "Feburay"));
        monthCombBoxModel.addElement(new Month(3, "March"));
        monthCombBoxModel.addElement(new Month(4, "April"));
        monthCombBoxModel.addElement(new Month(5, "May"));
        monthCombBoxModel.addElement(new Month(6, "June"));
        monthCombBoxModel.addElement(new Month(7, "July"));
        monthCombBoxModel.addElement(new Month(8, "August"));
        monthCombBoxModel.addElement(new Month(9, "September"));
        monthCombBoxModel.addElement(new Month(10, "October"));
        monthCombBoxModel.addElement(new Month(11, "November"));
        monthCombBoxModel.addElement(new Month(12, "December"));

                

        availableMonthCombobox1.setModel(monthCombBoxModel);
        
        DefaultComboBoxModel manufacturedMonthCombBoxModel = new DefaultComboBoxModel();
        manufacturedMonthCombBoxModel.addElement(new Month(1, "January"));
        manufacturedMonthCombBoxModel.addElement(new Month(2, "Feburay"));
        manufacturedMonthCombBoxModel.addElement(new Month(3, "March"));
        manufacturedMonthCombBoxModel.addElement(new Month(4, "April"));
        manufacturedMonthCombBoxModel.addElement(new Month(5, "May"));
        manufacturedMonthCombBoxModel.addElement(new Month(6, "June"));
        manufacturedMonthCombBoxModel.addElement(new Month(7, "July"));
        manufacturedMonthCombBoxModel.addElement(new Month(8, "August"));
        manufacturedMonthCombBoxModel.addElement(new Month(9, "September"));
        manufacturedMonthCombBoxModel.addElement(new Month(10, "October"));
        manufacturedMonthCombBoxModel.addElement(new Month(11, "November"));
        manufacturedMonthCombBoxModel.addElement(new Month(12, "December"));
        
        
        manufacturedMonthCombobox.setModel(manufacturedMonthCombBoxModel);
        
        DefaultComboBoxModel expiryMonthComboModel = new DefaultComboBoxModel();
        expiryMonthComboModel.addElement(new Month(1, "January"));
        expiryMonthComboModel.addElement(new Month(2, "Feburay"));
        expiryMonthComboModel.addElement(new Month(3, "March"));
        expiryMonthComboModel.addElement(new Month(4, "April"));
        expiryMonthComboModel.addElement(new Month(5, "May"));
        expiryMonthComboModel.addElement(new Month(6, "June"));
        expiryMonthComboModel.addElement(new Month(7, "July"));
        expiryMonthComboModel.addElement(new Month(8, "August"));
        expiryMonthComboModel.addElement(new Month(9, "September"));
        expiryMonthComboModel.addElement(new Month(10, "October"));
        expiryMonthComboModel.addElement(new Month(11, "November"));
        expiryMonthComboModel.addElement(new Month(12, "December"));
        
        expiryMonthCombobox.setModel(expiryMonthComboModel);
        
        
        for(int index = 1; index<32; index++) {
           availableDateComboBox.addItem(index);
           manufacturedDateComboBox1.addItem(index);
           maintainenaceDateComboBox.addItem(index);
        }
        
        
         for(int index = 2000; index<2022; index++) {
             availableYearCombobox.addItem(index);
             manufacturedYearCombobox.addItem(index);
             expiryYearCombobox.addItem(index);
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

        UberMainTabbedFrame = new javax.swing.JTabbedPane();
        adminPanel = new javax.swing.JPanel();
        carCatalogScrollPane = new javax.swing.JScrollPane();
        carCatalogTable = new javax.swing.JTable();
        formHeaderLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        createUpdateScrollablePanel = new javax.swing.JScrollPane();
        createUpdateViewForm = new javax.swing.JPanel();
        modelNameLabel = new javax.swing.JLabel();
        manufacturerNameLabel = new javax.swing.JLabel();
        availabilityLabel = new javax.swing.JLabel();
        availabiityTimestampLabel = new javax.swing.JLabel();
        manufacturedTimestampLabel = new javax.swing.JLabel();
        numberOfSeatsLabel = new javax.swing.JLabel();
        serialNumberLabel = new javax.swing.JLabel();
        maintenanceTimestampLabel = new javax.swing.JLabel();
        modelNameTextField = new javax.swing.JTextField();
        isAvailableCheckbox = new javax.swing.JCheckBox();
        availableYearCombobox = new javax.swing.JComboBox<>();
        availableMonthCombobox1 = new javax.swing.JComboBox<>();
        manufacturerNameTextField = new javax.swing.JTextField();
        serialNumberTextField = new javax.swing.JTextField();
        manufacturedYearCombobox = new javax.swing.JComboBox<>();
        manufacturedMonthCombobox = new javax.swing.JComboBox<>();
        expiryYearCombobox = new javax.swing.JComboBox<>();
        expiryMonthCombobox = new javax.swing.JComboBox<>();
        maintainenaceDateComboBox = new javax.swing.JComboBox<>();
        availableDateComboBox = new javax.swing.JComboBox<>();
        manufacturedDateComboBox1 = new javax.swing.JComboBox<>();
        numberOfSeatSlider = new javax.swing.JSlider();
        availableHourTextField = new javax.swing.JTextField();
        dotTimeLabel = new javax.swing.JLabel();
        availableMinuteTextField = new javax.swing.JTextField();
        dotTimeLabel1 = new javax.swing.JLabel();
        availableSecondTextField = new javax.swing.JTextField();
        modelNumberLabel = new javax.swing.JLabel();
        modelNumberTextField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        saveChangesButton = new javax.swing.JButton();
        carCatalogHeaderLabel1 = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UberMainTabbedFrame.setForeground(new java.awt.Color(0, 0, 102));
        UberMainTabbedFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UberMainTabbedFrame.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        adminPanel.setAutoscrolls(true);
        adminPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        carCatalogTable.setForeground(new java.awt.Color(0, 0, 102));
        carCatalogTable.setModel(carCatalogTableModel);
        carCatalogTable.setColumnSelectionAllowed(true);
        carCatalogScrollPane.setViewportView(carCatalogTable);
        carCatalogTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        formHeaderLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        formHeaderLabel.setForeground(new java.awt.Color(0, 0, 102));
        formHeaderLabel.setText(" ");

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        viewButton.setText("View ");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        createUpdateViewForm.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        createUpdateViewForm.setAutoscrolls(true);

        modelNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        modelNameLabel.setForeground(new java.awt.Color(0, 0, 102));
        modelNameLabel.setText("Model Name :");

        manufacturerNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        manufacturerNameLabel.setForeground(new java.awt.Color(0, 0, 102));
        manufacturerNameLabel.setText("Manufacturer Name:");

        availabilityLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        availabilityLabel.setForeground(new java.awt.Color(0, 0, 102));
        availabilityLabel.setText("Is Available?");

        availabiityTimestampLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        availabiityTimestampLabel.setForeground(new java.awt.Color(0, 0, 102));
        availabiityTimestampLabel.setText("Available Timestamp:");

        manufacturedTimestampLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        manufacturedTimestampLabel.setForeground(new java.awt.Color(0, 0, 102));
        manufacturedTimestampLabel.setText("Manufactured Timestamp:");

        numberOfSeatsLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numberOfSeatsLabel.setForeground(new java.awt.Color(0, 0, 102));
        numberOfSeatsLabel.setText("Number of Seats: ");

        serialNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        serialNumberLabel.setForeground(new java.awt.Color(0, 0, 102));
        serialNumberLabel.setText("Serial Number: ");

        maintenanceTimestampLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        maintenanceTimestampLabel.setForeground(new java.awt.Color(0, 0, 102));
        maintenanceTimestampLabel.setText("Maintenance Expiry Timestamp: ");

        modelNameTextField.setForeground(new java.awt.Color(0, 0, 102));
        modelNameTextField.setText(" ");

        isAvailableCheckbox.setForeground(new java.awt.Color(0, 0, 102));
        isAvailableCheckbox.setText("Yes");
        isAvailableCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isAvailableCheckboxActionPerformed(evt);
            }
        });

        availableYearCombobox.setForeground(new java.awt.Color(0, 0, 102));

        availableMonthCombobox1.setForeground(new java.awt.Color(0, 0, 102));
        availableMonthCombobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableMonthCombobox1ActionPerformed(evt);
            }
        });

        manufacturerNameTextField.setForeground(new java.awt.Color(0, 0, 102));
        manufacturerNameTextField.setText(" ");

        serialNumberTextField.setForeground(new java.awt.Color(0, 0, 102));
        serialNumberTextField.setText(" ");

        manufacturedYearCombobox.setForeground(new java.awt.Color(0, 0, 102));

        manufacturedMonthCombobox.setForeground(new java.awt.Color(0, 0, 102));

        expiryYearCombobox.setForeground(new java.awt.Color(0, 0, 102));

        expiryMonthCombobox.setForeground(new java.awt.Color(0, 0, 102));

        maintainenaceDateComboBox.setForeground(new java.awt.Color(0, 0, 102));

        availableDateComboBox.setForeground(new java.awt.Color(0, 0, 102));

        manufacturedDateComboBox1.setForeground(new java.awt.Color(0, 0, 102));
        manufacturedDateComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturedDateComboBox1ActionPerformed(evt);
            }
        });

        numberOfSeatSlider.setForeground(new java.awt.Color(0, 0, 102));
        numberOfSeatSlider.setMaximum(8);
        numberOfSeatSlider.setMinimum(1);
        numberOfSeatSlider.setMinorTickSpacing(1);
        numberOfSeatSlider.setPaintLabels(true);
        numberOfSeatSlider.setSnapToTicks(true);
        numberOfSeatSlider.setToolTipText("");

        availableHourTextField.setForeground(new java.awt.Color(0, 0, 102));
        availableHourTextField.setText(" ");

        dotTimeLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dotTimeLabel.setForeground(new java.awt.Color(0, 0, 102));
        dotTimeLabel.setText(" :: ");

        availableMinuteTextField.setForeground(new java.awt.Color(0, 0, 102));
        availableMinuteTextField.setText(" ");

        dotTimeLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dotTimeLabel1.setForeground(new java.awt.Color(0, 0, 102));
        dotTimeLabel1.setText(" :: ");

        availableSecondTextField.setForeground(new java.awt.Color(0, 0, 102));
        availableSecondTextField.setText(" ");

        modelNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        modelNumberLabel.setForeground(new java.awt.Color(0, 0, 102));
        modelNumberLabel.setText("Model Number: ");

        modelNumberTextField.setForeground(new java.awt.Color(0, 0, 102));
        modelNumberTextField.setText(" ");

        cityLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cityLabel.setForeground(new java.awt.Color(0, 0, 102));
        cityLabel.setText("Destination City:");

        cityTextField.setForeground(new java.awt.Color(0, 0, 102));
        cityTextField.setText(" ");

        saveChangesButton.setText("Save");

        javax.swing.GroupLayout createUpdateViewFormLayout = new javax.swing.GroupLayout(createUpdateViewForm);
        createUpdateViewForm.setLayout(createUpdateViewFormLayout);
        createUpdateViewFormLayout.setHorizontalGroup(
            createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveChangesButton)
                    .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                        .addComponent(maintenanceTimestampLabel)
                        .addGap(42, 42, 42)
                        .addComponent(maintainenaceDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(expiryMonthCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(expiryYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(serialNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                        .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availabilityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manufacturerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manufacturedTimestampLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberOfSeatsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(availabiityTimestampLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modelNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createUpdateViewFormLayout.createSequentialGroup()
                                        .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(modelNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(isAvailableCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25))
                                    .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(manufacturerNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, createUpdateViewFormLayout.createSequentialGroup()
                                            .addComponent(availableDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(availableMonthCombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(availableYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(serialNumberTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                                            .addComponent(manufacturedDateComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(manufacturedMonthCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(manufacturedYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(numberOfSeatSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(availableHourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dotTimeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(availableMinuteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dotTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(availableSecondTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cityTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(modelNumberTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)))))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        createUpdateViewFormLayout.setVerticalGroup(
            createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modelNameTextField)
                    .addComponent(modelNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isAvailableCheckbox)
                    .addComponent(availabilityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(availabiityTimestampLabel)
                    .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(availableMonthCombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(availableYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(availableDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(availableHourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dotTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(availableMinuteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dotTimeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(availableSecondTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manufacturerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manufacturerNameLabel))
                .addGap(30, 30, 30)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manufacturedDateComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(manufacturedMonthCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(manufacturedYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(manufacturedTimestampLabel))
                .addGap(21, 21, 21)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(numberOfSeatsLabel)
                    .addComponent(numberOfSeatSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serialNumberLabel)
                    .addComponent(serialNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modelNumberLabel)
                    .addComponent(modelNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityLabel)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintenanceTimestampLabel)
                    .addComponent(maintainenaceDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expiryMonthCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expiryYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(saveChangesButton)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        createUpdateScrollablePanel.setViewportView(createUpdateViewForm);

        carCatalogHeaderLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        carCatalogHeaderLabel1.setForeground(new java.awt.Color(0, 0, 102));
        carCatalogHeaderLabel1.setText("Car Catalog");

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carCatalogScrollPane)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addComponent(formHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createButton)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton)
                        .addGap(18, 18, 18)
                        .addComponent(viewButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton)
                        .addGap(40, 40, 40)))
                .addContainerGap())
            .addComponent(createUpdateScrollablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1286, Short.MAX_VALUE)
            .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adminPanelLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(carCatalogHeaderLabel1)
                    .addContainerGap(1138, Short.MAX_VALUE)))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(carCatalogScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(viewButton)
                    .addComponent(createButton))
                .addGap(18, 18, 18)
                .addComponent(createUpdateScrollablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adminPanelLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(carCatalogHeaderLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1072, Short.MAX_VALUE)))
        );

        UberMainTabbedFrame.addTab("Admin", adminPanel);

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1286, Short.MAX_VALUE)
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1124, Short.MAX_VALUE)
        );

        UberMainTabbedFrame.addTab("Search", searchPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UberMainTabbedFrame)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UberMainTabbedFrame)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader(" ");

    }//GEN-LAST:event_viewButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader(" ");

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Update details to for below Car record & hit save.");

    }//GEN-LAST:event_updateButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Add details to create a Car record.");
        
    }//GEN-LAST:event_createButtonActionPerformed

    private void isAvailableCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isAvailableCheckboxActionPerformed
        // TODO add your handling code here:
            availableDateComboBox.setEnabled(!isAvailableCheckbox.isSelected());    
            availableMonthCombobox1.setEnabled(!isAvailableCheckbox.isSelected());
            availableYearCombobox.setEnabled(!isAvailableCheckbox.isSelected());
            availableHourTextField.setEnabled(!isAvailableCheckbox.isSelected());
            availableMinuteTextField.setEnabled(!isAvailableCheckbox.isSelected());
            availableSecondTextField.setEnabled(!isAvailableCheckbox.isSelected());
        
    }//GEN-LAST:event_isAvailableCheckboxActionPerformed

    private void manufacturedDateComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturedDateComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturedDateComboBox1ActionPerformed
     
    
    private void populateTableHistory() {
        
        
        for(Car carRecord: carCatalog.getCars()) {
            String[] rowData = {
                carRecord.getModelName(), 
                Boolean.toString(carRecord.isIsAvailable()), 
                Integer.toString(carRecord.getNoOfSeats()),
                carRecord.getManufacturer(),
                carRecord.getAvailabilityTimestamp(),
                carRecord.getManufacturedTimestamp(),
                carRecord.getSerialNumber(),
                carRecord.getGeographicData().getCity(),
                carRecord.getMaintenanceExpiryTimestamp()                
                };
            carCatalogTableModel.addRow(rowData);
                                                   
        
      }

    }                                             
    private void availableMonthCombobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableMonthCombobox1ActionPerformed
        // TODO add your handling code here:
        
       


    }//GEN-LAST:event_availableMonthCombobox1ActionPerformed
    
    private void updateAdminHeader(String text) {
        formHeaderLabel.setText(text);
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
            java.util.logging.Logger.getLogger(UberMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UberMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UberMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UberMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new UberMainFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane UberMainTabbedFrame;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JLabel availabiityTimestampLabel;
    private javax.swing.JLabel availabilityLabel;
    private javax.swing.JComboBox<Integer> availableDateComboBox;
    private javax.swing.JTextField availableHourTextField;
    private javax.swing.JTextField availableMinuteTextField;
    private javax.swing.JComboBox<String> availableMonthCombobox1;
    private javax.swing.JTextField availableSecondTextField;
    private javax.swing.JComboBox<Integer> availableYearCombobox;
    private javax.swing.JLabel carCatalogHeaderLabel1;
    private javax.swing.JScrollPane carCatalogScrollPane;
    private javax.swing.JTable carCatalogTable;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JButton createButton;
    private javax.swing.JScrollPane createUpdateScrollablePanel;
    private javax.swing.JPanel createUpdateViewForm;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel dotTimeLabel;
    private javax.swing.JLabel dotTimeLabel1;
    private javax.swing.JComboBox<String> expiryMonthCombobox;
    private javax.swing.JComboBox<Integer> expiryYearCombobox;
    private javax.swing.JLabel formHeaderLabel;
    private javax.swing.JCheckBox isAvailableCheckbox;
    private javax.swing.JComboBox<Integer> maintainenaceDateComboBox;
    private javax.swing.JLabel maintenanceTimestampLabel;
    private javax.swing.JComboBox<Integer> manufacturedDateComboBox1;
    private javax.swing.JComboBox<String> manufacturedMonthCombobox;
    private javax.swing.JLabel manufacturedTimestampLabel;
    private javax.swing.JComboBox<Integer> manufacturedYearCombobox;
    private javax.swing.JLabel manufacturerNameLabel;
    private javax.swing.JTextField manufacturerNameTextField;
    private javax.swing.JLabel modelNameLabel;
    private javax.swing.JTextField modelNameTextField;
    private javax.swing.JLabel modelNumberLabel;
    private javax.swing.JTextField modelNumberTextField;
    private javax.swing.JSlider numberOfSeatSlider;
    private javax.swing.JLabel numberOfSeatsLabel;
    private javax.swing.JButton saveChangesButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JLabel serialNumberLabel;
    private javax.swing.JTextField serialNumberTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}

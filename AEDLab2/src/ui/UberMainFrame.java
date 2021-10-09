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
import model.CarProperties;
import model.GeographicData;
import model.Month;
import util.Utility;

/**
 *
 * @author 18577
 */
public class UberMainFrame extends javax.swing.JFrame {
    CarCatalog carCatalog;
    DefaultTableModel carCatalogTableModel;
    DefaultTableModel searchCarCatalogTableModel;


    /**
     * Creates new form UberMainFrame
     */
    public UberMainFrame() {
        this.carCatalog = new CarCatalog();
        initTableModel();
        initComponents();
        loadMonthModel();
        initSearchComboModel();
        populateTableHistory();
        populateSearchTableHistory(carCatalog.getCars());
        
    }
    
    private void initSearchComboModel () {
        
        DefaultComboBoxModel searchComboModel = new DefaultComboBoxModel();
        searchComboModel.addElement(new CarProperties("modelName", "Model Name"));
        searchComboModel.addElement(new CarProperties("isAvailable", "Availability"));
        searchComboModel.addElement(new CarProperties("availabilityTimestamp", "Available Timestamp"));
        searchComboModel.addElement(new CarProperties("manufacturer", "Manufacturer"));
        searchComboModel.addElement(new CarProperties("manufacturedTimestamp", "Manufactured Year (YYYY)"));
        searchComboModel.addElement(new CarProperties("noOfSeats", "Number of seats"));
        searchComboModel.addElement(new CarProperties("modelNumber", "Model Number"));

        searchComboModel.addElement(new CarProperties("serialNumber", "Serial Number"));
        searchComboModel.addElement(new CarProperties("city", "City"));
        searchComboModel.addElement(new CarProperties("maintenanceExpiry", "Maintenance Expiry (MM:YYYY)"));

       
        propertyComboBox.setModel(searchComboModel);     
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
        
        
        searchCarCatalogTableModel = new DefaultTableModel();
        searchCarCatalogTableModel.addColumn("Model Name");
        searchCarCatalogTableModel.addColumn("Availability");
        searchCarCatalogTableModel.addColumn("Number of Seats");
        searchCarCatalogTableModel.addColumn("Manufacturer");

        searchCarCatalogTableModel.addColumn("Availability Time");
        searchCarCatalogTableModel.addColumn("Manufactured Timestamp");
        searchCarCatalogTableModel.addColumn("Serial Number");
        searchCarCatalogTableModel.addColumn("Location");
        searchCarCatalogTableModel.addColumn("Maintenance Expiry");
      
        
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
        carCatalogTableLabel = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();
        searchHeaderLabel = new javax.swing.JLabel();
        propertyComboBox = new javax.swing.JComboBox<>();
        propertyValueTextField = new javax.swing.JTextField();
        searchCarCatalogScrollPanel = new javax.swing.JScrollPane();
        searchCarCatalogTable = new javax.swing.JTable();
        summarySearchTabPanel = new javax.swing.JLabel();
        carListSearchButton = new javax.swing.JButton();
        helpTextLabel = new javax.swing.JLabel();
        resetTableButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UberMainTabbedFrame.setForeground(new java.awt.Color(0, 0, 102));
        UberMainTabbedFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UberMainTabbedFrame.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        adminPanel.setAutoscrolls(true);
        adminPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        carCatalogTable.setForeground(new java.awt.Color(0, 0, 102));
        carCatalogTable.setModel(carCatalogTableModel);
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
        saveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesButtonActionPerformed(evt);
            }
        });

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
                        .addGap(95, 95, 95)
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
                .addContainerGap(257, Short.MAX_VALUE))
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

        carCatalogTableLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        carCatalogTableLabel.setForeground(new java.awt.Color(0, 0, 102));
        carCatalogTableLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        carCatalogTableLabel.setText(" ");

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createUpdateScrollablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1325, Short.MAX_VALUE)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addComponent(formHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createButton)
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addGap(18, 18, 18)
                .addComponent(viewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton))
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carCatalogScrollPane)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(carCatalogTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adminPanelLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(carCatalogHeaderLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1153, Short.MAX_VALUE)))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(carCatalogScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carCatalogTableLabel)
                .addGap(18, 18, 18)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(viewButton)
                    .addComponent(createButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createUpdateScrollablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adminPanelLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(carCatalogHeaderLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1072, Short.MAX_VALUE)))
        );

        UberMainTabbedFrame.addTab("Admin", adminPanel);

        searchHeaderLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchHeaderLabel.setText("Select property to filter out cars");

        propertyComboBox.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        propertyComboBox.setForeground(new java.awt.Color(0, 0, 102));
        propertyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertyComboBoxActionPerformed(evt);
            }
        });

        propertyValueTextField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        propertyValueTextField.setForeground(new java.awt.Color(0, 0, 102));
        propertyValueTextField.setText(" ");

        searchCarCatalogTable.setForeground(new java.awt.Color(0, 0, 102));
        searchCarCatalogTable.setModel(searchCarCatalogTableModel);
        searchCarCatalogScrollPanel.setViewportView(searchCarCatalogTable);
        searchCarCatalogTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        summarySearchTabPanel.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        summarySearchTabPanel.setForeground(new java.awt.Color(0, 0, 102));
        summarySearchTabPanel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        summarySearchTabPanel.setText(" ");

        carListSearchButton.setText("Search");
        carListSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carListSearchButtonActionPerformed(evt);
            }
        });

        helpTextLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        helpTextLabel.setForeground(new java.awt.Color(0, 0, 102));
        helpTextLabel.setText(" ");

        resetTableButton.setText("Reset");
        resetTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetTableButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(summarySearchTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchCarCatalogScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(481, 481, 481)
                        .addComponent(searchHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(helpTextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addComponent(propertyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(propertyValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(carListSearchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetTableButton)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(summarySearchTabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchHeaderLabel)
                .addGap(18, 18, 18)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resetTableButton, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(propertyValueTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(carListSearchButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(propertyComboBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(helpTextLabel)
                .addGap(26, 26, 26)
                .addComponent(searchCarCatalogScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
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
        updateAdminHeader("Viewing record below");

    }//GEN-LAST:event_viewButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader(" ");

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Update Car record");

    }//GEN-LAST:event_updateButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Create Car record");
        
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
        
       carCatalogTableLabel.setText("Total number of cars: " + carCatalog.getTotalCars() + "   | Last updated timestamp: " + carCatalog.getLastUpdatedTimestamp().toString());
       summarySearchTabPanel.setText("Total number of cars in the catalog: " + carCatalog.getTotalCars() + "   | Last updated timestamp: " + carCatalog.getLastUpdatedTimestamp().toString());
    
    
    }    
    
    
    private void populateSearchTableHistory(ArrayList<Car> carList) {
        searchCarCatalogTableModel.setRowCount(0);
        
        
        for(Car carRecord: carList) {
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
            searchCarCatalogTableModel.addRow(rowData);
                                                   
        
      }
        
    
    }   
    private void availableMonthCombobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableMonthCombobox1ActionPerformed
        // TODO add your handling code here:
        
        
       


    }//GEN-LAST:event_availableMonthCombobox1ActionPerformed

    private void saveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesButtonActionPerformed
        // TODO add your handling code here:
        
        ArrayList<Car> carArray = carCatalog.getCars();
        Car carRecord = new Car();
        carRecord.setModelName(modelNameTextField.getText().trim());
        carRecord.setIsAvailable(isAvailableCheckbox.isSelected());
        
        if(!isAvailableCheckbox.isSelected()) {
         carRecord.setAvailabilityTimestamp(LocalDateTime.of((int) availableYearCombobox.getSelectedItem(),
                ((Month)manufacturedMonthCombobox.getSelectedItem()).getMonthNumber(), 
                (int)availableDateComboBox.getSelectedItem(), 
                Integer.parseInt(availableHourTextField.getText().trim()),
                Integer.parseInt(availableMinuteTextField.getText().trim()), 
                Integer.parseInt(availableSecondTextField.getText().trim())));
        }
       
        carRecord.setManufacturer(manufacturerNameTextField.getText().trim());
        carRecord.setManufacturedTimestamp(LocalDate.of((int) manufacturedYearCombobox.getSelectedItem(),
                ((Month)manufacturedMonthCombobox.getSelectedItem()).getMonthNumber(), (int) manufacturedDateComboBox1.getSelectedItem()));
        carRecord.setNoOfSeats(numberOfSeatSlider.getValue());
        carRecord.setSerialNumber(serialNumberTextField.getText().trim());
        
        carRecord.setGeographicData(new GeographicData(null, 
                cityTextField.getText().trim(),
                null, "USA", null));
        
        carRecord.setMaintenanceExpiryTimestamp(LocalDate.of((int) expiryYearCombobox.getSelectedItem(),
                ((Month)expiryMonthCombobox.getSelectedItem()).getMonthNumber(), (int) maintainenaceDateComboBox.getSelectedItem()));
        
        
        carArray.add(carRecord);
        System.out.println(carRecord);

        carCatalog.setCars(carArray);
        System.out.println(carCatalog.getTotalCars());
        
        populateTableHistory();
    }//GEN-LAST:event_saveChangesButtonActionPerformed

    private void propertyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertyComboBoxActionPerformed
        // TODO add your handling code here:
        
       String propertyLabel = ((CarProperties)propertyComboBox.getSelectedItem()).getCarPropertyLabel();
       String propertyName = ((CarProperties)propertyComboBox.getSelectedItem()).getCarPropertyName();
       
       String filterPropertyValue = propertyValueTextField.getText();
       
       System.out.println(propertyLabel + " ===  " + propertyName + " ==== " + filterPropertyValue);
       helpTextLabel.setText("");
       switch (propertyName) {
            case "isAvailable": helpTextLabel.setText("Acceptable values are: true/false. Any other value would result in invalid filters."); break;
            case "modelName": helpTextLabel.setText("Acceptable values: X1, X2 etc.");break;
            case "manufacturer": helpTextLabel.setText("Acceptable values: BMW, Tesla etc.");break;
            case "manufacturedTimestamp": helpTextLabel.setText("Filter based in manufacture year. Eg. 2013, 2015");break;
            case "noOfSeats": helpTextLabel.setText("Eg =4 or less than 8 and greater than 7 or greater than 4 or less than 8");break;
            case "modelNumber": helpTextLabel.setText("Filter based on model number.");break;
            case "serialNumber": helpTextLabel.setText("Filter based on model number.");break;
            case "city": helpTextLabel.setText("Filter based on city.");break;
            case "maintenanceExpiry": helpTextLabel.setText("Filter based on expiry");break;
            case "availabilityTimestamp": helpTextLabel.setText("Filter based on expiry");break;

           
      }
       
       
       
             
       
        
        
    }//GEN-LAST:event_propertyComboBoxActionPerformed

    private void carListSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carListSearchButtonActionPerformed
        // TODO add your handling code here:
        
       String propertyLabel = ((CarProperties)propertyComboBox.getSelectedItem()).getCarPropertyLabel();
       String propertyName = ((CarProperties)propertyComboBox.getSelectedItem()).getCarPropertyName();
       
       String filterPropertyValue = propertyValueTextField.getText();
       
       System.out.println(propertyLabel + " ===  " + propertyName + " ==== " + filterPropertyValue);
       
       ArrayList<Car> filteredList = new Utility().filterTable(propertyName, filterPropertyValue, carCatalog.getCars());
       
       populateSearchTableHistory(filteredList);
       
       
    }//GEN-LAST:event_carListSearchButtonActionPerformed

    private void resetTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetTableButtonActionPerformed
        // TODO add your handling code here:
        populateSearchTableHistory(carCatalog.getCars());
    }//GEN-LAST:event_resetTableButtonActionPerformed
    
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
    private javax.swing.JLabel carCatalogTableLabel;
    private javax.swing.JButton carListSearchButton;
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
    private javax.swing.JLabel helpTextLabel;
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
    private javax.swing.JComboBox<String> propertyComboBox;
    private javax.swing.JTextField propertyValueTextField;
    private javax.swing.JButton resetTableButton;
    private javax.swing.JButton saveChangesButton;
    private javax.swing.JScrollPane searchCarCatalogScrollPanel;
    private javax.swing.JTable searchCarCatalogTable;
    private javax.swing.JLabel searchHeaderLabel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JLabel serialNumberLabel;
    private javax.swing.JTextField serialNumberTextField;
    private javax.swing.JLabel summarySearchTabPanel;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}

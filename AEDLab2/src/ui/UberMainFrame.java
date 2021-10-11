/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
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
        //searchComboModel.addElement(new CarProperties("availabilityTimestamp", "Next Available cars"));
        searchComboModel.addElement(new CarProperties("manufacturer", "Manufacturer"));
        searchComboModel.addElement(new CarProperties("manufacturedTimestamp", "Manufactured Year (YYYY)"));
        searchComboModel.addElement(new CarProperties("noOfSeats", "Number of seats"));
        searchComboModel.addElement(new CarProperties("modelNumber", "Model Number"));

        searchComboModel.addElement(new CarProperties("serialNumber", "Serial Number"));
        searchComboModel.addElement(new CarProperties("city", "City"));
        searchComboModel.addElement(new CarProperties("maintenanceExpiry", "Expired"));

       
        propertyComboBox.setModel(searchComboModel);
    }
    
    
    private void initTableModel() {
        carCatalogTableModel = new DefaultTableModel();
        carCatalogTableModel.addColumn("Model Name");
        carCatalogTableModel.addColumn("Model Number");

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
        searchCarCatalogTableModel.addColumn("Model Number");

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
        
        
         for(int index = 2000; index<2030; index++) {
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
        modelNumberLabel = new javax.swing.JLabel();
        modelNumberTextField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        saveChangesButton = new javax.swing.JButton();
        availableSecondTextField = new javax.swing.JTextField();
        dotTimeLabel2 = new javax.swing.JLabel();
        carCatalogHeaderLabel1 = new javax.swing.JLabel();
        carCatalogTableLabel = new javax.swing.JLabel();
        formHeaderLabel = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();
        searchHeaderLabel = new javax.swing.JLabel();
        propertyComboBox = new javax.swing.JComboBox<>();
        propertyValueTextField = new javax.swing.JTextField();
        searchCarCatalogScrollPanel = new javax.swing.JScrollPane();
        searchCarCatalogTable = new javax.swing.JTable();
        carListSearchButton = new javax.swing.JButton();
        helpTextLabel = new javax.swing.JLabel();
        resetTableButton = new javax.swing.JButton();
        summaryLabel = new javax.swing.JLabel();
        availableCarLabel = new javax.swing.JLabel();
        unavailableCarLabel = new javax.swing.JLabel();
        manufacturersList = new javax.swing.JLabel();
        lastUPdatedTimestampLabel = new javax.swing.JLabel();
        availableCarCountLabel = new javax.swing.JLabel();
        unavailableCarCountLabel = new javax.swing.JLabel();
        lastUpdatedTimeStampValueLabel = new javax.swing.JLabel();
        manufacturerListValueLabel = new javax.swing.JLabel();
        totalCarsLabel = new javax.swing.JLabel();
        totalCarsValueLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UberMainTabbedFrame.setForeground(new java.awt.Color(0, 0, 102));
        UberMainTabbedFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        UberMainTabbedFrame.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        adminPanel.setAutoscrolls(true);
        adminPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        carCatalogTable.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        carCatalogTable.setForeground(new java.awt.Color(0, 0, 102));
        carCatalogTable.setModel(carCatalogTableModel);
        carCatalogTable.setRowHeight(40);
        carCatalogTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        carCatalogScrollPane.setViewportView(carCatalogTable);
        carCatalogTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(0, 0, 102));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        updateButton.setForeground(new java.awt.Color(0, 0, 102));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        viewButton.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        viewButton.setForeground(new java.awt.Color(0, 0, 102));
        viewButton.setText("View ");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        createButton.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        createButton.setForeground(new java.awt.Color(0, 0, 102));
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
        availableMinuteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableMinuteTextFieldActionPerformed(evt);
            }
        });

        dotTimeLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dotTimeLabel1.setForeground(new java.awt.Color(0, 0, 102));
        dotTimeLabel1.setText(" :: ");

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

        saveChangesButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        saveChangesButton.setText("Save");
        saveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesButtonActionPerformed(evt);
            }
        });

        availableSecondTextField.setForeground(new java.awt.Color(0, 0, 102));
        availableSecondTextField.setText(" ");
        availableSecondTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableSecondTextFieldActionPerformed(evt);
            }
        });

        dotTimeLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dotTimeLabel2.setForeground(new java.awt.Color(0, 0, 102));
        dotTimeLabel2.setText(" :: ");

        javax.swing.GroupLayout createUpdateViewFormLayout = new javax.swing.GroupLayout(createUpdateViewForm);
        createUpdateViewForm.setLayout(createUpdateViewFormLayout);
        createUpdateViewFormLayout.setHorizontalGroup(
            createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                        .addComponent(maintenanceTimestampLabel)
                        .addGap(42, 42, 42)
                        .addComponent(maintainenaceDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(expiryMonthCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(expiryYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(isAvailableCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(927, 927, 927))
                                    .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                                        .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(manufacturerNameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, createUpdateViewFormLayout.createSequentialGroup()
                                                .addComponent(availableDateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(availableMonthCombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(availableYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(availableHourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dotTimeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(availableMinuteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dotTimeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(availableSecondTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(serialNumberTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                                            .addComponent(manufacturedDateComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(manufacturedMonthCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(manufacturedYearCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(numberOfSeatSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(182, 182, 182)
                                .addComponent(dotTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cityTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(modelNumberTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))
                            .addComponent(modelNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(1020, Short.MAX_VALUE))
        );
        createUpdateViewFormLayout.setVerticalGroup(
            createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createUpdateViewFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createUpdateViewFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modelNameLabel)
                    .addComponent(modelNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
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
                        .addComponent(availableSecondTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dotTimeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(saveChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        createUpdateScrollablePanel.setViewportView(createUpdateViewForm);

        carCatalogHeaderLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        carCatalogHeaderLabel1.setForeground(new java.awt.Color(0, 0, 102));
        carCatalogHeaderLabel1.setText("Car Catalog");

        carCatalogTableLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        carCatalogTableLabel.setForeground(new java.awt.Color(0, 0, 102));
        carCatalogTableLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        carCatalogTableLabel.setText(" ");

        formHeaderLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        formHeaderLabel.setForeground(new java.awt.Color(0, 0, 102));
        formHeaderLabel.setText(" ");

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carCatalogScrollPane)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(carCatalogTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(formHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createButton)
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addGap(18, 18, 18)
                .addComponent(viewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton)
                .addGap(15, 15, 15))
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createUpdateScrollablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1504, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adminPanelLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(carCatalogHeaderLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1344, Short.MAX_VALUE)))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(carCatalogScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carCatalogTableLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(viewButton)
                    .addComponent(createButton)
                    .addComponent(formHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createUpdateScrollablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adminPanelLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(carCatalogHeaderLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1072, Short.MAX_VALUE)))
        );

        UberMainTabbedFrame.addTab("Admin", adminPanel);

        searchPanel.setForeground(new java.awt.Color(0, 0, 102));

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

        searchCarCatalogTable.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        searchCarCatalogTable.setForeground(new java.awt.Color(0, 0, 102));
        searchCarCatalogTable.setModel(searchCarCatalogTableModel);
        searchCarCatalogTable.setRowHeight(40);
        searchCarCatalogScrollPanel.setViewportView(searchCarCatalogTable);
        searchCarCatalogTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

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

        summaryLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        summaryLabel.setForeground(new java.awt.Color(0, 0, 102));
        summaryLabel.setText("Summary");

        availableCarLabel.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        availableCarLabel.setForeground(new java.awt.Color(0, 0, 102));
        availableCarLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        availableCarLabel.setText("Count of Available Cars:");

        unavailableCarLabel.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        unavailableCarLabel.setForeground(new java.awt.Color(0, 0, 102));
        unavailableCarLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        unavailableCarLabel.setText("Count of Unavailable Cars:");

        manufacturersList.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        manufacturersList.setForeground(new java.awt.Color(0, 0, 102));
        manufacturersList.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        manufacturersList.setText("List of manufacturers: ");

        lastUPdatedTimestampLabel.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        lastUPdatedTimestampLabel.setForeground(new java.awt.Color(0, 0, 102));
        lastUPdatedTimestampLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lastUPdatedTimestampLabel.setText("Last Updated Timestamp for Car Catalog: ");

        availableCarCountLabel.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        availableCarCountLabel.setForeground(new java.awt.Color(0, 0, 102));
        availableCarCountLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        availableCarCountLabel.setText(" ");

        unavailableCarCountLabel.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        unavailableCarCountLabel.setForeground(new java.awt.Color(0, 0, 102));
        unavailableCarCountLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        unavailableCarCountLabel.setText(" ");

        lastUpdatedTimeStampValueLabel.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        lastUpdatedTimeStampValueLabel.setForeground(new java.awt.Color(0, 0, 102));
        lastUpdatedTimeStampValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lastUpdatedTimeStampValueLabel.setText(" ");

        manufacturerListValueLabel.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        manufacturerListValueLabel.setForeground(new java.awt.Color(0, 0, 102));
        manufacturerListValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        manufacturerListValueLabel.setText(" ");

        totalCarsLabel.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        totalCarsLabel.setForeground(new java.awt.Color(0, 0, 102));
        totalCarsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalCarsLabel.setText(" Total Cars:");

        totalCarsValueLabel.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        totalCarsValueLabel.setForeground(new java.awt.Color(0, 0, 102));
        totalCarsValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalCarsValueLabel.setText(" ");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addGap(355, 355, 355)
                                .addComponent(searchHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(helpTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(searchPanelLayout.createSequentialGroup()
                                        .addComponent(propertyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(propertyValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(carListSearchButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetTableButton))))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addComponent(lastUPdatedTimestampLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastUpdatedTimeStampValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(totalCarsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(summaryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalCarsValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(searchCarCatalogScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addComponent(unavailableCarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(unavailableCarCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(availableCarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(availableCarCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addComponent(manufacturersList, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(manufacturerListValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(summaryLabel)
                .addGap(18, 18, 18)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalCarsLabel)
                    .addComponent(totalCarsValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unavailableCarLabel)
                    .addComponent(unavailableCarCountLabel)
                    .addComponent(availableCarLabel)
                    .addComponent(availableCarCountLabel))
                .addGap(18, 18, 18)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufacturersList)
                    .addComponent(manufacturerListValueLabel))
                .addGap(18, 18, 18)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastUPdatedTimestampLabel)
                    .addComponent(lastUpdatedTimeStampValueLabel))
                .addGap(29, 29, 29)
                .addComponent(searchHeaderLabel)
                .addGap(18, 18, 18)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resetTableButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carListSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(propertyComboBox)
                        .addComponent(propertyValueTextField)))
                .addGap(18, 18, 18)
                .addComponent(helpTextLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchCarCatalogScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
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
        
        
        int selectedRowIndex = carCatalogTable.getSelectedRow();
        
        if(selectedRowIndex == -1) {
            JOptionPane.showConfirmDialog(null, "No record selected to view the row", "Error!",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE);
            return;
        }
        
        setValuesInForm(selectedRowIndex);

    }//GEN-LAST:event_viewButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Deleting selected record.");
        
        int selectedRowIndex = carCatalogTable.getSelectedRow();
        
        if(selectedRowIndex == -1) {
            JOptionPane.showConfirmDialog(null, 
                    "No record selected to delete the row",
                    "Error!",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE);
            return;
        }


        int response = JOptionPane.showConfirmDialog(null, "Do you want to delete selected record?");
        if(response == 0) carCatalog.removeCarAtIndex(selectedRowIndex);

        populateTableHistory();
        populateSearchTableHistory(carCatalog.getCars());



    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Update Car record");
        
        int selectedRowIndex = carCatalogTable.getSelectedRow();
        
        if(selectedRowIndex == -1) {
            JOptionPane.showConfirmDialog(null, "No record selected to update the row", "Error!",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.PLAIN_MESSAGE);
            return;
        }
        
        setValuesInForm(selectedRowIndex);
           
                
        
        
        
        
       

    }//GEN-LAST:event_updateButtonActionPerformed
    private void setValuesInForm(int selectedRowIndex) {
        Car carRecord = carCatalog.getCarAtIndex(selectedRowIndex);
        modelNameTextField.setText(carRecord.getModelName());
        isAvailableCheckbox.setSelected(carRecord.isIsAvailable());
        setAvailableTimestampFormEnableDisable(carRecord.isIsAvailable());
        if (!carRecord.isIsAvailable()) {
            
            availableDateComboBox.setSelectedIndex(carRecord.getAvailabilityTimestampDate().getDayOfMonth()-1);
            availableMonthCombobox1.setSelectedIndex(carRecord.getAvailabilityTimestampDate().getMonthValue()-1);
            availableYearCombobox.setSelectedIndex(carRecord.getAvailabilityTimestampDate().getYear()%2000);
            availableHourTextField.setText(Integer.toString(carRecord.getAvailabilityTimestampDate().getHour()));
            availableMinuteTextField.setText(Integer.toString(carRecord.getAvailabilityTimestampDate().getMinute()));
            availableSecondTextField.setText(Integer.toString(carRecord.getAvailabilityTimestampDate().getSecond()));
          }
        modelNumberTextField.setText(carRecord.getModelNumber());
        manufacturerNameTextField.setText(carRecord.getManufacturer());
        manufacturedDateComboBox1.setSelectedIndex(carRecord.getManufacturedTimestampDate().getDayOfMonth()-1);
        manufacturedMonthCombobox.setSelectedIndex(carRecord.getManufacturedTimestampDate().getMonthValue()-1);
        manufacturedYearCombobox.setSelectedIndex(carRecord.getManufacturedTimestampDate().getYear()%2000);
        numberOfSeatSlider.setValue(carRecord.getNoOfSeats());
        serialNumberTextField.setText(carRecord.getSerialNumber());
        cityTextField.setText(carRecord.getGeographicData().getCity());
        maintainenaceDateComboBox.setSelectedIndex(carRecord.getMaintenanceExpiryTimestampDate().getDayOfMonth()-1);
        expiryMonthCombobox.setSelectedIndex(carRecord.getMaintenanceExpiryTimestampDate().getMonthValue()-1);
        //System.out.println(carRecord.getMaintenanceExpiryTimestampDate().getYear()%2000);
        
        expiryYearCombobox.setSelectedIndex(carRecord.getMaintenanceExpiryTimestampDate().getYear()%2000);
        
    }
      
        
        
           
    
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        updateAdminHeader("Create Car record");
        
    }//GEN-LAST:event_createButtonActionPerformed

    private void isAvailableCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isAvailableCheckboxActionPerformed
        // TODO add your handling code here:
          
            setAvailableTimestampFormEnableDisable(Objects.isNull(isAvailableCheckbox)? false : isAvailableCheckbox.isSelected());
        
    }//GEN-LAST:event_isAvailableCheckboxActionPerformed
private void setAvailableTimestampFormEnableDisable(boolean availability) {

            availableDateComboBox.setEnabled(!availability);    
            availableMonthCombobox1.setEnabled(!availability);
            availableYearCombobox.setEnabled(!availability);
            availableHourTextField.setEnabled(!availability);
            availableMinuteTextField.setEnabled(!availability);
            availableSecondTextField.setEnabled(!availability);
}
    private void manufacturedDateComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturedDateComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturedDateComboBox1ActionPerformed
     
    
    private void populateTableHistory() {
        
        carCatalogTableModel.setRowCount(0);

        for(Car carRecord: carCatalog.getCars()) {
            String[] rowData = {
                carRecord.getModelName(), 
                carRecord.getModelNumber(),
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
       availableCarCountLabel.setText( Integer.toString(carCatalog.getAvailableNumberOfCars()));
       unavailableCarCountLabel.setText(Integer.toString(carCatalog.getUnAvailableNumberOfCars()));
       manufacturerListValueLabel.setText(carCatalog.getListOfManufacturer());
       lastUpdatedTimeStampValueLabel.setText(carCatalog.getLastUpdatedTimestamp());
       totalCarsValueLabel.setText(String.valueOf(carCatalog.getTotalCars()));
    
    }    
    
    
    private void populateSearchTableHistory(ArrayList<Car> carList) {
        searchCarCatalogTableModel.setRowCount(0);
        
        
        for(Car carRecord: carList) {
            String[] rowData = {
                carRecord.getModelName(), 
                carRecord.getModelNumber(),
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
        
       if (formHeaderLabel.getText().contains("Create")) {
       
        ArrayList<Car> carArray = carCatalog.getCars();
        Car carRecord = new Car();
        int resp = saveChangesInCarAndReturnCar(carRecord);
        if (resp == 1) {
            System.out.println(carRecord);

            carArray.add(carRecord);

            carCatalog.setCars(carArray);
            System.out.println(carCatalog.getTotalCars());

            populateTableHistory();
            JOptionPane.showConfirmDialog(null, "Created record successfully!", "Error!",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);


            populateSearchTableHistory(carCatalog.getCars());


        }





       }
       
       if (formHeaderLabel.getText().contains("Update")) {
           int selectedIndex = carCatalogTable.getSelectedRow();
           Car carRecord = carCatalog.getCarAtIndex(selectedIndex);
           int resp = saveChangesInCarAndReturnCar(carRecord);
           if (resp == 1) {
               carCatalog.setCarAtIndex(selectedIndex, carRecord);
               populateTableHistory();

               JOptionPane.showConfirmDialog(null, "Record updated successfully!", "Error!",
                       JOptionPane.DEFAULT_OPTION,
                       JOptionPane.PLAIN_MESSAGE);


               populateSearchTableHistory(carCatalog.getCars());

           }





       }
        
          
    }//GEN-LAST:event_saveChangesButtonActionPerformed
    private int saveChangesInCarAndReturnCar(Car carRecord) {

        String serialNumber= serialNumberTextField.getText().trim();

        if (modelNameTextField.getText().trim().isEmpty()) {

            JOptionPane.showConfirmDialog(null, "Please verify values for Model name. It should non-empty.", "Error!",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
            return 0;

        }

        if (serialNumber.isEmpty()) {
            JOptionPane.showConfirmDialog(null, "Please verify values for Serial Number. It should non-empty.", "Error!",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
            return 0;
        }

        if (formHeaderLabel.getText().contains("Create") && carCatalog.getCars().stream().anyMatch(car -> car.getSerialNumber().equals(serialNumber))) {
            JOptionPane.showConfirmDialog(null, "Please verify values for Serial Number. It should unique.", "Error!",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
            return 0;


        }


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
       carRecord.setModelNumber(modelNumberTextField.getText().trim());
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
        System.out.println(carRecord);
        return 1;

    }
    private void propertyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertyComboBoxActionPerformed
        // TODO add your handling code here:
        
       String propertyLabel = ((CarProperties)propertyComboBox.getSelectedItem()).getCarPropertyLabel();
       String propertyName = ((CarProperties)propertyComboBox.getSelectedItem()).getCarPropertyName();
       propertyValueTextField.setText("");
            
       helpTextLabel.setText("");
       switch (propertyName) {
            case "isAvailable": helpTextLabel.setText("Acceptable values are: true/false. Any other value would result in invalid filters."); break;
            case "modelName": helpTextLabel.setText("Acceptable values: X1, X2 etc.");break;
            case "manufacturer": helpTextLabel.setText("Acceptable values: BMW, Tesla etc.");break;
            case "manufacturedTimestamp": helpTextLabel.setText("Filter based in manufactured year. Eg. 2013, 2015");break;
            case "noOfSeats": helpTextLabel.setText("Eg, =4 expressed as: 4 | greater than 4 and less than 8 expressed as 4,8");break;
            case "modelNumber": helpTextLabel.setText("Filter based on model number.");break;
            case "serialNumber": helpTextLabel.setText("Filter based on model number.");break;
            case "city": helpTextLabel.setText("Filter based on city.Eg. Boston, Cambridge");break;
            case "maintenanceExpiry": helpTextLabel.setText("Filter based on maintenance expiry. Eg. MM-YYYY");break;
            case "availabilityTimestamp": helpTextLabel.setText("Filter based on next available timestamp");break;

           
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

    private void availableMinuteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableMinuteTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableMinuteTextFieldActionPerformed

    private void availableSecondTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableSecondTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableSecondTextFieldActionPerformed
    
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
    private javax.swing.JLabel availableCarCountLabel;
    private javax.swing.JLabel availableCarLabel;
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
    private javax.swing.JLabel dotTimeLabel2;
    private javax.swing.JComboBox<String> expiryMonthCombobox;
    private javax.swing.JComboBox<Integer> expiryYearCombobox;
    private javax.swing.JLabel formHeaderLabel;
    private javax.swing.JLabel helpTextLabel;
    private javax.swing.JCheckBox isAvailableCheckbox;
    private javax.swing.JLabel lastUPdatedTimestampLabel;
    private javax.swing.JLabel lastUpdatedTimeStampValueLabel;
    private javax.swing.JComboBox<Integer> maintainenaceDateComboBox;
    private javax.swing.JLabel maintenanceTimestampLabel;
    private javax.swing.JComboBox<Integer> manufacturedDateComboBox1;
    private javax.swing.JComboBox<String> manufacturedMonthCombobox;
    private javax.swing.JLabel manufacturedTimestampLabel;
    private javax.swing.JComboBox<Integer> manufacturedYearCombobox;
    private javax.swing.JLabel manufacturerListValueLabel;
    private javax.swing.JLabel manufacturerNameLabel;
    private javax.swing.JTextField manufacturerNameTextField;
    private javax.swing.JLabel manufacturersList;
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
    private javax.swing.JLabel summaryLabel;
    private javax.swing.JLabel totalCarsLabel;
    private javax.swing.JLabel totalCarsValueLabel;
    private javax.swing.JLabel unavailableCarCountLabel;
    private javax.swing.JLabel unavailableCarLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}

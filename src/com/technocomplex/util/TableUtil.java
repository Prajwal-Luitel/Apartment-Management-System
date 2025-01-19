
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.technocomplex.util;

import com.technocomplexr.model.FlatModel;
import com.technocomplexr.model.TenantModel;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 * <b>Table Util provide the utility method needed to work with table along with
 * its GUI.</b>.
 *
 * <p>
 * Features include:</p>
 * <ul>
 * <li>Customizes JTable appearance, including header, row styles and text
 * alignment.</li>
 * <li>Initializes default flat and tenant data for the application.</li>
 * <li>Populates JTable with flat or tenant data.</li>
 * <li>Supports adding individual flat or tenant records to the JTable.</li>
 * <li>Clears existing JTable data when needed.</li>
 * </ul>
 *
 * @author Prajwal Luitel LMU ID 23048626
 */
public class TableUtil {

    private static DefaultTableModel tableModel;

    public TableUtil() {

    }

    /**
     * Change the GUI of JTable. Color the Header to Blue, even row to white
     * light blue and odd row to light blue while aligning the text to center.
     *
     * @param table the JTable which GUI is to be changed
     */
    public static void designTable(JTable table) {
        //Custom renderer for header
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(0, 51, 255));
        headerRenderer.setForeground(Color.WHITE);
        headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Center align text
        // Apply the header renderer to all columns
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        // Custom renderer for alternate row colors
        DefaultTableCellRenderer rowRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus,
                    int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                // background color based on row index
                if (row % 2 == 0) {
                    c.setBackground(new Color(237, 242, 251)); //  white light blue for even rows
                } else {
                    c.setBackground(new Color(226, 234, 252));  // light blue for odd rows
                }
                // Highlight selected row
                if (isSelected) {
                    c.setBackground(Color.ORANGE); // Highlight selection
                    c.setForeground(Color.BLACK);
                }
                return this;
            }
        };
        rowRenderer.setHorizontalAlignment(JLabel.CENTER); // Center align text
        // Apply the row renderer to all columns
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(rowRenderer);
        }
    }

    /**
     * Populate the flat data in flat list.
     *
     * @param flatList the list which collect flat data
     * @return the list which has flat data
     */
    public static List<FlatModel> initialFlatData(List<FlatModel> flatList) {
        flatList = new ArrayList();
        // Default flat data
        flatList.add(new FlatModel((short) 100, 25000, 500, (byte) 1, (byte) 1, (byte) 1, "Furnished", "Not Available"));
        flatList.add(new FlatModel((short) 101, 25000, 500, (byte) 1, (byte) 1, (byte) 1, "Furnished", "Not Available"));
        flatList.add(new FlatModel((short) 102, 150000, 800, (byte) 2, (byte) 2, (byte) 1, "Unfurnished", "Not Available"));
        flatList.add(new FlatModel((short) 103, 300000, 1200, (byte) 3, (byte) 4, (byte) 2, "Furnished", "Not Available"));
        flatList.add(new FlatModel((short) 104, 500000, 2000, (byte) 4, (byte) 5, (byte) 3, "Furnished", "Not Available"));
        flatList.add(new FlatModel((short) 105, 70000, 600, (byte) 2, (byte) 1, (byte) 1, "Unfurnished", "Not Available"));
        flatList.add(new FlatModel((short) 106, 120000, 900, (byte) 3, (byte) 3, (byte) 2, "Furnished", "Not Available"));
        flatList.add(new FlatModel((short) 107, 450000, 1800, (byte) 4, (byte) 5, (byte) 3, "Unfurnished", "Available"));
        flatList.add(new FlatModel((short) 108, 60000, 1200, (byte) 2, (byte) 1, (byte) 1, "Furnished", "Available"));
        flatList.add(new FlatModel((short) 109, 200000, 1500, (byte) 2, (byte) 4, (byte) 2, "Unfurnished", "Available"));
        flatList.add(new FlatModel((short) 110, 350000, 2200, (byte) 4, (byte) 6, (byte) 3, "Furnished", "Available"));
        return flatList;
    }

    /**
     * Populate the tenant data in tenant list
     *
     * @param tenantList the list which collect tenant data
     * @return the list which has tenant data
     */
    public static List<TenantModel> initialTenantData(List<TenantModel> tenantList) {
        tenantList = new ArrayList();
        // Default tenant data
        tenantList.add(new TenantModel((short) 102, "Sita Pokherel", (short) 30, "9823456781", "2020-06-10", (short) 100, "Female"));
        tenantList.add(new TenantModel((short) 103, "Hari Khadka", (short) 40, "9834567892", "2018-08-20", (short) 101, "Male"));
        tenantList.add(new TenantModel((short) 104, "Mina Dahal", (short) 22, "9845678903", "2021-01-25", (short) 102, "Female"));
        tenantList.add(new TenantModel((short) 105, "Krishna Lama", (short) 35, "9856789014", "2022-11-05", (short) 103, "Male"));
        tenantList.add(new TenantModel((short) 106, "Bikash Kafle", (short) 45, "9878901236", "2024-07-18", (short) 104, "Male"));
        tenantList.add(new TenantModel((short) 107, "Saraswati Rai", (short) 32, "9889012347", "2020-04-12", (short) 105, "Female"));
        tenantList.add(new TenantModel((short) 108, "Mina Dahal", (short) 27, "9801234569", "2018-12-10", (short) 106, "Female"));
        return tenantList;
    }

    /**
     * Populates the JTable with the current list of flat or tenant record.
     * Clears existing rows in the table model before adding new data. Then,
     * type check the list for flat or tenant record and populate JTable
     * accordingly
     *
     * @param listData the non-generic list which contain either flat data or
     * tenant data
     * @param table in which listData is to populate
     */
    public static void loadListDataToTable(List listData, JTable table) {
        tableModel = (DefaultTableModel) table.getModel();
        // Clear existing rows if needed
        tableModel.setRowCount(0);
        //Handeling Empty List
        if (listData.isEmpty()) {
            return;
        }

        // Check the type of the first element in the list.
        Object firstElement = listData.get(0);

        if (firstElement instanceof FlatModel) {
            for (Object obj : listData) {
                FlatModel flat = (FlatModel) obj;
                addFLatDataToTable(flat, table);
            }
        } else {
            for (Object obj : listData) {
                TenantModel tenant = (TenantModel) obj;
                addTenantDataToTable(tenant, table);
            }
        }
    }

    /**
     * Add the Flat record in the JTable.
     *
     * @param flat the record to be added in JTable
     * @param table in which flat record is to add
     */
    public static void addFLatDataToTable(FlatModel flat, JTable table) {
        tableModel = (DefaultTableModel) table.getModel();
        tableModel.addRow(new Object[]{
            flat.getFlatId(), flat.getPrice(), flat.getSize(), flat.getLivingroom(),
            flat.getBedroom(), flat.getKitchen(), flat.getFurnishing(), flat.getFlatStatus()
        });
    }

    /**
     * Add the Tenant record in the JTable.
     *
     * @param tenant the record to be added in JTable
     * @param table in which Tenant record is to add
     */
    public static void addTenantDataToTable(TenantModel tenant, JTable table) {
        tableModel = (DefaultTableModel) table.getModel();
        tableModel.addRow(new Object[]{
            tenant.getTenantId(), tenant.getName(), tenant.getAge(), tenant.getContact(),
            tenant.getJoinDate(), tenant.getFlatId(), tenant.getGender()
        });
    }

    /**
     * Reset the table data .
     *
     * @param table which is to be reset
     */
    public static void clearTableData(JTable table) {
        tableModel = (DefaultTableModel) table.getModel();
        int size = tableModel.getRowCount() - 1;
        while (size >= 0) {
            tableModel.removeRow(size--);
        }
    }
}

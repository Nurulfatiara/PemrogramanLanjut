package gui.tableSorting;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramSorting {
    private JTextField textAngka;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JTable tableAngka;
    private JTextField textJumlah;
    private JButton buttonOK;
    private DefaultTableModel tableModel;
    private boolean added = false;
    private Object DefaultTableModel;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public ProgramSorting() {

        this.iniComponents();
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(textJumlah.getText().isEmpty() || textAngka.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data Belum Diisi",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                DefaultTableModel model = (DefaultTableModel) tableAngka.getModel();
                String input = textAngka.getText();
                int jumlah = Integer.parseInt(textJumlah.getText());
                String[] stmp = input.split(",");
                if (stmp.length > jumlah || stmp.length < jumlah) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Jumlah Angka Tidak Sesuai",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (!added) {
                    for (int i = 0; i < jumlah; i++) {
                        model.addRow(new Object[]{});
                    }
                    added = true;
                }
                int n = 0;
                for (int i : Sorting.getas(input, jumlah)) {
                    model.setValueAt(i, n, 0);
                    n++;
                }
                int m = 0;
                for (int i : Sorting.getdes(input, jumlah)) {
                    model.setValueAt(i, m, 1);
                    m++;
                }
            }
        });
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void iniComponents() {
        Object[] tableColom = {
                "Ascending",
                "Descending"
        };
        Object[][] initData = {

        };
        tableModel = new DefaultTableModel(initData, tableColom);
        tableAngka.setModel(tableModel);
        tableAngka.setAutoCreateRowSorter(false);
        tableAngka.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}

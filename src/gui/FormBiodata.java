package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JPanel rootPanel;
    private JPanel rootPanel2;
    private JTextField hasil;
    private JButton simpanButton;
    private JTextField hasil1;
    private JTextField hasil2;
    private JTextField hasil3;
    private JTextField hasil4;
    private JTextField hasil5;
    private JTextField hasil6;
    private JTextField hasil7;
    private JButton buttonOk;

    public FormBiodata() {
        simpanButton.addActionListener( e -> {
                //Mengambil data dari textNama
                String nama = textNama.getText();

                //Mengambil data dari textNim
                String nim = textNim.getText();

                //Diproses
                Mahasiswa Nim = new Mahasiswa();
                Nim.setNama(nama);
                Nim.setNim(nim);

                //Tampilkan output ke FORM
                hasil.setText(nama);
                hasil1.setText(nim);
                hasil2.setText(Nim.JenjangPendidikan());
                hasil3.setText(Nim.TahunMasuk());
                hasil4.setText(Nim.MenentukanFakultas());
                hasil5.setText(Nim.MenentukanJurusan());
                hasil6.setText(Nim.JenisKelamin());
                hasil7.setText(Nim.NomorUrutMahasiswa());

        });
        buttonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

       public JPanel getRootPanel() {
        return rootPanel;
    }
}

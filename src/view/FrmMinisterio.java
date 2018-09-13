/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import arquivo.Arquivo;
import arquivo.IOFile;
import com.seaglasslookandfeel.SeaGlassLookAndFeel;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author devil
 */
public class FrmMinisterio extends javax.swing.JFrame {

    /**
     * Creates new form FrmMinisterio
     */
    public FrmMinisterio() {
        initComponents();
        setIcon();
        guias.setEnabledAt(1, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIcon = new javax.swing.JPanel();
        guias = new javax.swing.JTabbedPane();
        pLogin = new javax.swing.JPanel();
        btFingerPrint = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        pAccess = new javax.swing.JPanel();
        gAccess = new javax.swing.JTabbedPane();
        level1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        level2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        level3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ministério do Meio Ambiente");

        panelIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        btFingerPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/biometria 2.png"))); // NOI18N
        btFingerPrint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btFingerPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFingerPrint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFingerPrint.setSelected(true);
        btFingerPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFingerPrintActionPerformed(evt);
            }
        });

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/meio-ambiente.jpg"))); // NOI18N
        lblFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/wooden texture.jpg"))); // NOI18N

        javax.swing.GroupLayout pLoginLayout = new javax.swing.GroupLayout(pLogin);
        pLogin.setLayout(pLoginLayout);
        pLoginLayout.setHorizontalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300)
                .addComponent(btFingerPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pLoginLayout.setVerticalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(btFingerPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        guias.addTab("Login", pLogin);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/wooden texture.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout level1Layout = new javax.swing.GroupLayout(level1);
        level1.setLayout(level1Layout);
        level1Layout.setHorizontalGroup(
            level1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1048, Short.MAX_VALUE)
        );
        level1Layout.setVerticalGroup(
            level1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, level1Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gAccess.addTab("Nível 1", level1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/wooden texture.jpg"))); // NOI18N

        javax.swing.GroupLayout level2Layout = new javax.swing.GroupLayout(level2);
        level2.setLayout(level2Layout);
        level2Layout.setHorizontalGroup(
            level2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(level2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        level2Layout.setVerticalGroup(
            level2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(level2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gAccess.addTab("Nivel 2", level2);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/wooden texture.jpg"))); // NOI18N

        javax.swing.GroupLayout level3Layout = new javax.swing.GroupLayout(level3);
        level3.setLayout(level3Layout);
        level3Layout.setHorizontalGroup(
            level3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1048, Short.MAX_VALUE)
        );
        level3Layout.setVerticalGroup(
            level3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(level3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gAccess.addTab("Nível 3", level3);

        javax.swing.GroupLayout pAccessLayout = new javax.swing.GroupLayout(pAccess);
        pAccess.setLayout(pAccessLayout);
        pAccessLayout.setHorizontalGroup(
            pAccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, Short.MAX_VALUE)
        );
        pAccessLayout.setVerticalGroup(
            pAccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gAccess, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        guias.addTab("Acesso", pAccess);

        javax.swing.GroupLayout panelIconLayout = new javax.swing.GroupLayout(panelIcon);
        panelIcon.setLayout(panelIconLayout);
        panelIconLayout.setHorizontalGroup(
            panelIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guias)
        );
        panelIconLayout.setVerticalGroup(
            panelIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guias, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFingerPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFingerPrintActionPerformed

        JFileChooser fc = new JFileChooser();
        File file = null;
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int f = fc.showOpenDialog(null);
        if (f == 1) {
        } else {
            file = fc.getSelectedFile();
            fileName = fc.getName(file);
            try {
                arqFinal = Arquivo.emBytes(file);
                try {
                    PrintStream ps = new PrintStream(servidor.getOutputStream());
                    java.util.Scanner s = new java.util.Scanner(servidor.getInputStream());
                    ps.println(fileName);
                    s.nextLine();
                    ps.println(arqFinal.length);
                    s.nextLine();
                    IOFile.sendFile(servidor, arqFinal);
                    String message =s.nextLine();
                    System.out.println(message);
                    /*if (message.equals("true")) {
                        guias.setEnabledAt(1, true);
                        guias.setEnabledAt(0, false);
                        guias.setSelectedComponent(pAccess);
                        JOptionPane.showMessageDialog(this, "Digital do funcionario(a) " + s.nextLine() + " Reconhecida");
                        access = Integer.parseInt(s.nextLine());
                        JOptionPane.showMessageDialog(this, "Acesso nível " + access);
                        switch (access) {
                            case 1:
                                gAccess.setEnabledAt(1, false);
                                gAccess.setEnabledAt(2, false);
                                break;
                            case 2:
                                gAccess.setEnabledAt(2, false);
                                break;
                            default:
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Digital não reconhecida!", "Erro de identificação", JOptionPane.ERROR_MESSAGE);
                    }*/
                } catch (IOException ex) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Erro ao se comunicar com o servidor");
                }
            } catch (IOException ex) {
                javax.swing.JOptionPane.showMessageDialog(this, "Erro ao selecionar digital");
            }
        }
    }//GEN-LAST:event_btFingerPrintActionPerformed

    private boolean start() {
        String host = "127.0.0.1";
        int gate = 34197;
        JLabel lblMessage = new JLabel("Digite o endereço do servidor!");
        JTextField txtIP = new JTextField("127.0.0.1");
        JTextField txtPorta = new JTextField("34197");
        Object[] texts = {lblMessage, txtIP, txtPorta};
        JOptionPane.showMessageDialog(null, texts, "Aviso!", JOptionPane.INFORMATION_MESSAGE);
        try {
            host = txtIP.getText();
            gate = Integer.parseInt(txtPorta.getText());
            try {
                servidor = new java.net.Socket(host, gate);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível de conectar com o servidor!!!", "Erro ao Conectar", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NullPointerException | NumberFormatException c) {
            JOptionPane.showMessageDialog(this, "Foi informado o valor incorreto");
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        try {

            javax.swing.UIManager.setLookAndFeel(new SeaGlassLookAndFeel());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMinisterio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmMinisterio frm = new FrmMinisterio();
                if (frm.start() == true) {
                    frm.setVisible(true);
                } else {
                    System.exit(0);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFingerPrint;
    private String fileName;
    private byte[] arqFinal;
    private javax.swing.JTabbedPane gAccess;
    private javax.swing.JTabbedPane guias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JPanel level1;
    private javax.swing.JPanel level2;
    private javax.swing.JPanel level3;
    private javax.swing.JPanel pAccess;
    private javax.swing.JPanel pLogin;
    private javax.swing.JPanel panelIcon;
    // End of variables declaration//GEN-END:variables
    private java.net.Socket servidor;
    private int access;

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/mma_icon.jpg")));
    }
}

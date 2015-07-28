package ProgramSaverUI;

import java.awt.Desktop;
import javax.xml.bind.DatatypeConverter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProgramSaver extends javax.swing.JFrame {

//    Date dateNow = Calendar.getInstance().getTime();
//    Calendar Now = Calendar.getInstance();
    File filemerge;

    public ProgramSaver() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrameUtama = new javax.swing.JFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        OpenFileButton = new javax.swing.JButton();
        MinButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        SaveFileButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        OkeButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        FrameUtama.setBounds(new java.awt.Rectangle(300, 300, 248, 133));
        FrameUtama.setMinimumSize(new java.awt.Dimension(248, 133));
        FrameUtama.setUndecorated(true);
        FrameUtama.setResizable(false);

        jDesktopPane1.setMaximumSize(new java.awt.Dimension(248, 133));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(248, 133));

        OpenFileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramSaverUI/Images/timer_down.png"))); // NOI18N
        OpenFileButton.setBorder(null);
        OpenFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpenFileButtonMouseClicked(evt);
            }
        });
        jDesktopPane1.add(OpenFileButton);
        OpenFileButton.setBounds(110, 50, 70, 70);

        MinButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramSaverUI/Images/playback_stop.png"))); // NOI18N
        MinButton.setBorder(null);
        jDesktopPane1.add(MinButton);
        MinButton.setBounds(190, 10, 20, 20);

        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramSaverUI/Images/logout.png"))); // NOI18N
        CloseButton.setBorder(null);
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
        });
        jDesktopPane1.add(CloseButton);
        CloseButton.setBounds(220, 10, 20, 20);

        SaveFileButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramSaverUI/Images/timer_refresh.png"))); // NOI18N
        SaveFileButton2.setBorder(null);
        SaveFileButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveFileButton2MouseClicked(evt);
            }
        });
        jDesktopPane1.add(SaveFileButton2);
        SaveFileButton2.setBounds(20, 50, 70, 70);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Ecode file test");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(10, 10, 140, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProgramSaverUI/Images/Background.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setMaximumSize(new java.awt.Dimension(248, 133));
        jLabel6.setMinimumSize(new java.awt.Dimension(248, 133));
        jLabel6.setPreferredSize(new java.awt.Dimension(248, 133));
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(0, 0, 248, 133);

        javax.swing.GroupLayout FrameUtamaLayout = new javax.swing.GroupLayout(FrameUtama.getContentPane());
        FrameUtama.getContentPane().setLayout(FrameUtamaLayout);
        FrameUtamaLayout.setHorizontalGroup(
            FrameUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );
        FrameUtamaLayout.setVerticalGroup(
            FrameUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DimasInchidi");

        OkeButton.setText("Ok");
        OkeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OkeButtonMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Welcome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OkeButton)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OkeButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OkeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkeButtonMouseClicked
        FrameUtama.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_OkeButtonMouseClicked

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        System.exit(1);
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void SaveFileButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveFileButton2MouseClicked
        try {
            String path = getProgramPath2();
            File fileDir = new File(path + "/Splitted/");
            writeDir(fileDir);
        } catch (IOException e) {
        }

        SplitFile sf = new SplitFile();
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            Integer PanjangFile = (int) (long) file.length();
            int part = (int) PanjangFile / 5;
            sf.splitFile(file, 5, PanjangFile);
            if (file.delete()) {
                System.out.println(file.getName() + " is deleted!");
            } else {
                System.out.println("Delete operation is failed.");
            }

        }
    }//GEN-LAST:event_SaveFileButton2MouseClicked

    private void OpenFileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenFileButtonMouseClicked
        MergeFile mf = new MergeFile();
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File TerpilihGabung = fileChooser.getSelectedFile();
            mf.mergeFiles(TerpilihGabung);
        }
        //JOptionPane.showMessageDialog(this,TerpilihGabung.toString()+" "+s, "dir",JOptionPane.ERROR_MESSAGE); 
    }//GEN-LAST:event_OpenFileButtonMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
         try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
         if ("Nimbus".equals(info.getName())) {
         javax.swing.UIManager.setLookAndFeel(info.getClassName());
         break;
         }
         }
         } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(ProgramSaver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(ProgramSaver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(ProgramSaver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(ProgramSaver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         //</editor-fold>

         /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProgramSaver().setVisible(true);
            }
        });
    }

    public class MergeFile {

        public File mergeFiles(File source) {
            byte[] decoded = DatatypeConverter.parseBase64Binary(source.getName());
            String namafile = "";
            try {
                namafile = new String(decoded, "UTF-8");
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(ProgramSaver.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(namafile);
            String[] parts = namafile.split("\\.");
            System.out.println(parts.length);
            String Inchidi = parts[0];
            String BesarFile = parts[1];
            String NoUrut = parts[2];
            String NamaFile = parts[3];
            String ekstensi = parts[4];
            if (ekstensi == null ? NoUrut == null : ekstensi.equals(NoUrut)) {
                ekstensi = "";
            }
            String path = source.getParent();
            String file[] = new String[200];
            for (int i = 1; i <= 5; i++) {
                String smessage = "inchidi" + "." + BesarFile + "." + i + "." + NamaFile + "." + ekstensi + "." + i;
                byte[] message = smessage.getBytes();
                String splitname = DatatypeConverter.printBase64Binary(message);
                file[i] = splitname;
            }
            for (int i = 1; i <= 5; i++) {
                try {
                    File f1 = new File(path + "/" + file[i]);
                    FileOutputStream fos;
                    try (InputStream in = new FileInputStream(f1)) {
                        int FRG_FSIZE = (int) (long) f1.length();
                        fos = new FileOutputStream(source.getParent() + "/" + NamaFile + "." + ekstensi, true);
                        byte[] data = new byte[FRG_FSIZE];
                        int count = in.read(data);
                        fos.write(data);
                        if (f1.delete()) {
                            System.out.println(f1.getName() + " is deleted!");
                        } else {
                            System.out.println("Delete operation is failed.");
                        }
                    }
                    fos.close();
                    System.out.println("File copied.");
                } catch (FileNotFoundException ex) {
                    System.out.println(ex.getMessage() + " in the specified directory.");
                    System.exit(0);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            //apakah anda ingin membuka file?  
            int reply = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin membuka File?", "Pesan", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                File command = new File(source.getParent() + "/" + NamaFile + "." + ekstensi);
                try {
                    Desktop.getDesktop().open(command);
                } catch (IOException ex) {
                    Logger.getLogger(ProgramSaver.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Baiklah, mungkin lain kali.");
                System.exit(0);
            }

            return null;
        }
    }

    public static String getProgramPath2() throws UnsupportedEncodingException {
        URL url = ProgramSaver.class.getProtectionDomain().getCodeSource().getLocation();
        String jarPath = URLDecoder.decode(url.getFile(), "UTF-8");
        String parentPath = new File(jarPath).getParentFile().getPath();
        return parentPath;
    }

    public class SplitFile {

        int FRG_FSIZE = 0;

        public File[] splitFile(File source, int noFile, int lsize) {
            FRG_FSIZE = lsize / 5;
            File[] fileFragments = new File[noFile];
            String[] frgfName = new String[noFile];
            try {
                String sourceFName = source.getName();
                long sourceFSize = source.length();
                FileInputStream fis = new FileInputStream(source);

                String path = getProgramPath2();
                String Fileinfo = sourceFName + "," + String.valueOf(sourceFSize);
                System.out.println(noFile);
                if (lsize != 0) {
                    noFile--;
                }
                System.out.println(noFile);
                //sourceFName = sourceFName.substring(0, sourceFName.lastIndexOf("."));
                int j = 0;

                for (int i = 1; i <= noFile; i++) {
                    String smessage = "inchidi" + "." + Integer.toString(lsize) + "." + String.valueOf(i) + "." + source.getName() + "." + String.valueOf(i);
                    byte[] message = smessage.getBytes();
                    String splitname = DatatypeConverter.printBase64Binary(message);
                    frgfName[i - 1] = path + "/Splitted/" + splitname;
                    fileFragments[i - 1] = new File(frgfName[i - 1]);

                    try (FileOutputStream fos = new FileOutputStream(fileFragments[i - 1])) {
                        byte[] data = new byte[FRG_FSIZE];
                        int count = fis.read(data);
                        fos.write(data);
                    }
                    String frgFileInfo = frgfName[i - 1] + "," + String.valueOf(FRG_FSIZE);
                    System.out.println(lsize);
                }
                if (lsize != 0) {
                    System.out.println(lsize);
                    String smessage = "inchidi" + "." + Integer.toString(lsize) + "." + String.valueOf(noFile + 1) + "." + source.getName() + "." + String.valueOf(noFile + 1);
                    byte[] message = smessage.getBytes();
                    String splitname = DatatypeConverter.printBase64Binary(message);
                    frgfName[noFile] = path + "/Splitted/" + splitname;

                    fileFragments[noFile] = new File(frgfName[noFile]);
                    try (FileOutputStream fos = new FileOutputStream(fileFragments[noFile])) {
                        byte[] data = new byte[lsize / 4];
                        int count = fis.read(data);
                        fos.write(data);
                    }
                    String frgFileInfo = frgfName[noFile] + "," + String.valueOf(lsize);
                }
            } catch (Exception e) {

                System.out.println("Error in Splitting" + e);
                JOptionPane.showMessageDialog(null, "Error in Splitting File \n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }
            return fileFragments;
        }
    }

    private void writeDir(File f) {
        f.mkdirs();
        //cek OS
        if (System.getProperty("os.name").contains("Windows")) {
            String command = "attrib +S +H " + f;
            try {
                Process child = Runtime.getRuntime().exec(command);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseButton;
    private javax.swing.JFrame FrameUtama;
    private javax.swing.JButton MinButton;
    private javax.swing.JButton OkeButton;
    private javax.swing.JButton OpenFileButton;
    private javax.swing.JButton SaveFileButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}

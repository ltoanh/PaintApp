package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class ToolBar extends javax.swing.JPanel {

    /**
     * Creates new form ToolBar
     */
    private Graphics2D graphics2D;
    private Main frame;
//    private Dimension newDimension;
    private File f;
    private JFileChooser fc;
    private Dimension newDimensions = new Dimension(700, 500);

    public ToolBar(Main frame) {
        initComponents();
        this.frame = frame;
        // fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        fc = new JFileChooser(new File("."));
        fc.setFileFilter(new FileNameExtensionFilter("choose images", "jpg", "png", "jpeg", "gif"));

    }

    private void getLineWidth() {
        try {
            String currentLine = (String) comboBox.getSelectedItem();
            frame.getInkPanel().setThickness(Float.valueOf(currentLine));
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    private void openFile(File f) {
        try {
            frame.getInkPanel().setImage(ImageIO.read(f));
            newDimensions = new Dimension(ImageIO.read(f).getWidth(), ImageIO.read(f).getHeight());
            setDimensions(newDimensions.width, newDimensions.height);
        } catch (IOException e) {
            System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        newFile = new javax.swing.JButton();
        open = new javax.swing.JButton();
        save = new javax.swing.JButton();
        pencil = new javax.swing.JButton();
        line = new javax.swing.JButton();
        rectangle = new javax.swing.JButton();
        circle = new javax.swing.JButton();
        erase = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        newFile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Create New-24.png"))); // NOI18N
        newFile.setText("New");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });

        open.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add Folder-24.png"))); // NOI18N
        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save-24.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        pencil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pencil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Pencil-24.png"))); // NOI18N
        pencil.setText("Pencil");
        pencil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pencilActionPerformed(evt);
            }
        });

        line.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Line-24.png"))); // NOI18N
        line.setText("Line");
        line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineActionPerformed(evt);
            }
        });

        rectangle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rectangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Rectangle-24.png"))); // NOI18N
        rectangle.setText("Retangle");
        rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleActionPerformed(evt);
            }
        });

        circle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        circle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Circled.png"))); // NOI18N
        circle.setText("Circle");
        circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleActionPerformed(evt);
            }
        });

        erase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        erase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Eraser-24.png"))); // NOI18N
        erase.setText("Erase");
        erase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraseActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Trash-24.png"))); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        comboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", " " }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Line Width");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(erase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newFile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(open, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pencil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(line, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(circle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rectangle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(newFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(open)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(save)
                .addGap(27, 27, 27)
                .addComponent(pencil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rectangle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(circle)
                .addGap(28, 28, 28)
                .addComponent(erase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void circleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleActionPerformed
        frame.getInkPanel().setTool(3);
        getLineWidth();
    }//GEN-LAST:event_circleActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        if (fc.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
            f = fc.getSelectedFile();
            openFile(f);
        }
    }//GEN-LAST:event_openActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (fc.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) {
            f = new File(fc.getSelectedFile() + ".png");
            try {
                saveFile(f);
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        newFile();
    }//GEN-LAST:event_newFileActionPerformed

    private void pencilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pencilActionPerformed
        frame.getInkPanel().setTool(0);
        getLineWidth();
    }//GEN-LAST:event_pencilActionPerformed

    private void lineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineActionPerformed
        frame.getInkPanel().setTool(1);
        getLineWidth();
    }//GEN-LAST:event_lineActionPerformed

    private void rectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleActionPerformed
        frame.getInkPanel().setTool(2);
        getLineWidth();

    }//GEN-LAST:event_rectangleActionPerformed

    private void eraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraseActionPerformed
        frame.getInkPanel().setTool(4);
    }//GEN-LAST:event_eraseActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        frame.getInkPanel().setTool(5);
    }//GEN-LAST:event_clearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton circle;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JButton erase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton line;
    private javax.swing.JButton newFile;
    private javax.swing.JButton open;
    private javax.swing.JButton pencil;
    private javax.swing.JButton rectangle;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables

    public void setDimensions(int width, int height) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        if (height > dim.height - 160 && width > dim.width - 150) {
            frame.getSP().setSize(dim.width - 150, dim.height - 160);
        } else if (width > dim.width - 150) {
            frame.getSP().setSize(dim.width - 150, height);
        } else if (height > dim.height - 160) {
            frame.getSP().setSize(width, dim.height - 160);
        } else {
            frame.getSP().setSize(width, height);
        }
    }

    private void newFile() {
        JDialog newFileDialog = new newFileDialog(frame, true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        newFileDialog.setLocation(dim.width / 2 - newFileDialog.getSize().width / 2, dim.height / 2 - newFileDialog.getSize().height / 2);

        newFileDialog.setVisible(true);

    }

    private void saveFile(File f) throws IOException {
        BufferedImage im = makePanel(frame.getInkPanel());
        ImageIO.write(im, "png", f);
    }

    private BufferedImage makePanel(Paint panel) {
        int w = panel.getWidth();
        int h = panel.getHeight();
        BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bi.createGraphics();
        panel.print(g);
        return bi;
    }
}

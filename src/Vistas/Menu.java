/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Jeremias
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/EU.png"));
        Image imagenEU = imagen.getImage();
        Escritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(imagenEU,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuFormAlum = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuFormMat = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuAdminNota = new javax.swing.JMenuItem();
        jMenuManInscrip = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuAlumxMat = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jMenu7.setText("jMenu7");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        Escritorio.setBackground(new java.awt.Color(0, 51, 51));
        Escritorio.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuFormAlum.setText("Formulario de Alumno");
        jMenuFormAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFormAlumActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuFormAlum);

        jMenuItem1.setText("Actualizar Alumnos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        jMenuFormMat.setText("Formulario de materia");
        jMenuFormMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFormMatActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuFormMat);

        jMenuItem2.setText("Actulizar Materias");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administración");

        jMenuAdminNota.setText("Administración de notas");
        jMenuAdminNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAdminNotaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuAdminNota);

        jMenuManInscrip.setText("Manejo de inscripciones");
        jMenuManInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuManInscripActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuManInscrip);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consulta");

        jMenuAlumxMat.setText("Alumno por materia");
        jMenu4.add(jMenuAlumxMat);

        jMenuBar1.add(jMenu4);

        jMSalir.setText("Salir");
        jMSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMSalirMouseClicked(evt);
            }
        });
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuFormAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFormAlumActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioAlumno formularioAlumno = new FormularioAlumno();
        formularioAlumno.setVisible(true);
        Escritorio.add(formularioAlumno);
        Escritorio.moveToFront(formularioAlumno);
        formularioAlumno.setLocation(40,40);
    }//GEN-LAST:event_jMenuFormAlumActionPerformed

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
     this.setVisible(false);
      
    }//GEN-LAST:event_jMSalirActionPerformed

    private void jMenuManInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuManInscripActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioInscripcion formularioInscripcion = new FormularioInscripcion();
        formularioInscripcion.setVisible(true);
        Escritorio.add(formularioInscripcion);
        Escritorio.moveToFront(formularioInscripcion);
        formularioInscripcion.setLocation(120,0);
    }//GEN-LAST:event_jMenuManInscripActionPerformed

    private void jMenuFormMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFormMatActionPerformed
        // FormDeMat
        this.Escritorio.removeAll();
        this.Escritorio.repaint();
        FormularioMateria formulariomateria = new FormularioMateria();
        formulariomateria.setVisible(true);
        this.Escritorio.add(formulariomateria);
        this.Escritorio.moveToFront(formulariomateria);
        formulariomateria.setLocation(90,60);
    }//GEN-LAST:event_jMenuFormMatActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuAdminNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAdminNotaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        CargaDeNotas cargaDeNotas = new CargaDeNotas();
        cargaDeNotas.setVisible(true);
        Escritorio.add(cargaDeNotas);
        Escritorio.moveToFront(cargaDeNotas);
        cargaDeNotas.setLocation(90,60);
    }//GEN-LAST:event_jMenuAdminNotaActionPerformed

    private void jMSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMSalirMouseClicked
         dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMSalirMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // actualizar Materias
        this.Escritorio.removeAll();
        this.Escritorio.repaint();
        ActualizarMaterias actualizarMateria = new ActualizarMaterias();
        actualizarMateria.setVisible(true);
        this.Escritorio.add(actualizarMateria);
        this.Escritorio.moveToFront(actualizarMateria);
        actualizarMateria.setLocation(120, 30);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Actualizar Alumnos
        this.Escritorio.removeAll();
        this.Escritorio.repaint();
        ActualizarAlumnos actualizarAlumnos = new ActualizarAlumnos();
        actualizarAlumnos.setVisible(true);
        this.Escritorio.add(actualizarAlumnos);
        this.Escritorio.moveToFront(actualizarAlumnos);
        actualizarAlumnos.setLocation(10, 20);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuAdminNota;
    private javax.swing.JMenuItem jMenuAlumxMat;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuFormAlum;
    private javax.swing.JMenuItem jMenuFormMat;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuManInscrip;
    // End of variables declaration//GEN-END:variables
}

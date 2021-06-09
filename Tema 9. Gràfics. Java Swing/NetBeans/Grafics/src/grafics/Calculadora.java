
package grafics;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;




public class Calculadora extends javax.swing.JFrame {
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JLabel();
        txtOperacion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_2 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_mul = new javax.swing.JButton();
        btn_res = new javax.swing.JButton();
        brn_sum = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_por = new javax.swing.JButton();
        btn_borrardigito = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();

        jButton6.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        jButton6.setText("C");
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora_pressed.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, 60));

        txtOperacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 320, 38));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_2.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorderPainted(false);
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 50, 50));

        btn_1.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorderPainted(false);
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 50, 50));

        btn_div.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn_div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        btn_div.setText("/");
        btn_div.setBorderPainted(false);
        btn_div.setFocusPainted(false);
        btn_div.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_div.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        btn_div.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora_pressed.png"))); // NOI18N
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });
        jPanel2.add(btn_div, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 50, 50));

        btn_mul.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn_mul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        btn_mul.setText("x");
        btn_mul.setBorderPainted(false);
        btn_mul.setFocusPainted(false);
        btn_mul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mul.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        btn_mul.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora_pressed.png"))); // NOI18N
        btn_mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mulActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mul, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 50, 50));

        btn_res.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn_res.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        btn_res.setText("-");
        btn_res.setBorderPainted(false);
        btn_res.setFocusPainted(false);
        btn_res.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_res.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        btn_res.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora_pressed.png"))); // NOI18N
        btn_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resActionPerformed(evt);
            }
        });
        jPanel2.add(btn_res, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 50, 50));

        brn_sum.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        brn_sum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        brn_sum.setText("+");
        brn_sum.setBorderPainted(false);
        brn_sum.setFocusPainted(false);
        brn_sum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        brn_sum.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        brn_sum.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora_pressed.png"))); // NOI18N
        brn_sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brn_sumActionPerformed(evt);
            }
        });
        jPanel2.add(brn_sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 50, 50));

        btn3.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn3.setText("3");
        btn3.setBorderPainted(false);
        btn3.setFocusPainted(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 50, 50));

        btn_8.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorderPainted(false);
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 50, 50));

        btn_4.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorderPainted(false);
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 50));

        btn_7.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorderPainted(false);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 50));

        btn_9.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorderPainted(false);
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 50, 50));

        btn_5.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorderPainted(false);
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 50, 50));

        btn_6.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorderPainted(false);
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 50, 50));

        btn_por.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn_por.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        btn_por.setText("%");
        btn_por.setBorderPainted(false);
        btn_por.setFocusPainted(false);
        btn_por.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_por.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        btn_por.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora_pressed.png"))); // NOI18N
        btn_por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porActionPerformed(evt);
            }
        });
        jPanel2.add(btn_por, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 50, 50));

        btn_borrardigito.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        btn_borrardigito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        btn_borrardigito.setText("CE");
        btn_borrardigito.setBorderPainted(false);
        btn_borrardigito.setFocusPainted(false);
        btn_borrardigito.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_borrardigito.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        btn_borrardigito.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora_pressed.png"))); // NOI18N
        btn_borrardigito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrardigitoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_borrardigito, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 50, 50));

        btn_c.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setBorderPainted(false);
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora_pressed.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, 50));

        btn_0.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero1.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorderPainted(false);
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/numero.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, 50));

        btn_punto.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setBorderPainted(false);
        btn_punto.setFocusPainted(false);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        btn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora_pressed.png"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 50, 50));

        btn_igual.setBackground(new java.awt.Color(255, 255, 255));
        btn_igual.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/igual.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setBorderPainted(false);
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora.png"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cercleCalculadora_pressed.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 340, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        txtOperacion.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        añadirNumero("7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        añadirNumero("9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        añadirNumero("8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        añadirNumero("6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        añadirNumero("5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        añadirNumero("4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        añadirNumero("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        añadirNumero("2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        añadirNumero("1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
       añadirNumero("0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_borrardigitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrardigitoActionPerformed
        añadirNumero("^");
    }//GEN-LAST:event_btn_borrardigitoActionPerformed

    private void btn_porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porActionPerformed
        añadirNumero("%");
    }//GEN-LAST:event_btn_porActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
        añadirNumero("/");
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mulActionPerformed
        añadirNumero("*");
    }//GEN-LAST:event_btn_mulActionPerformed

    private void btn_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resActionPerformed
        añadirNumero("-");
    }//GEN-LAST:event_btn_resActionPerformed

    private void brn_sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brn_sumActionPerformed
        añadirNumero("+");
    }//GEN-LAST:event_brn_sumActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        añadirNumero(".");
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
         try {
            String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
        } catch (Exception e) {
     
        }
    }//GEN-LAST:event_btn_igualActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    public void añadirNumero(String digito){
        txtOperacion.setText(txtOperacion.getText()+digito);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brn_sum;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_borrardigito;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_mul;
    private javax.swing.JButton btn_por;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_res;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}

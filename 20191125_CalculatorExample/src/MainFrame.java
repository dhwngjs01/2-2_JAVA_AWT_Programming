import java.awt.event.KeyEvent;

public class MainFrame extends javax.swing.JFrame {

    double dResult = 0;
    double dTemp = 0;
    String strResult = "";
    String strTemp = "";
    String strDiscri = "";
    String strMem="";
    
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        MemClear = new javax.swing.JButton();
        MemRead = new javax.swing.JButton();
        MemSave = new javax.swing.JButton();
        MemPlus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        num0 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        comma = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        CompuA = new javax.swing.JButton();
        CompuS = new javax.swing.JButton();
        CompuM = new javax.swing.JButton();
        CompuD = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        BackSpace = new javax.swing.JButton();
        Result = new javax.swing.JButton();
        num1_Division = new javax.swing.JButton();
        ComputR = new javax.swing.JButton();
        ComputSQRT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("0.");

        MemClear.setText("MC");
        MemClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemClearActionPerformed(evt);
            }
        });

        MemRead.setText("MR");
        MemRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemReadActionPerformed(evt);
            }
        });

        MemSave.setText("MS");
        MemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemSaveActionPerformed(evt);
            }
        });

        MemPlus.setText("M+");
        MemPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemPlusActionPerformed(evt);
            }
        });

        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        jButton6.setText("+/-");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        comma.setText(".");
        comma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commaActionPerformed(evt);
            }
        });

        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        CompuA.setText("+");
        CompuA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompuAActionPerformed(evt);
            }
        });

        CompuS.setText("-");
        CompuS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompuSActionPerformed(evt);
            }
        });

        CompuM.setText("*");
        CompuM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompuMActionPerformed(evt);
            }
        });

        CompuD.setText("/");
        CompuD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompuDActionPerformed(evt);
            }
        });

        Clear.setText("C");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Delete.setText("CE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        BackSpace.setText("BackSpace");
        BackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackSpaceActionPerformed(evt);
            }
        });

        Result.setText("=");
        Result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultActionPerformed(evt);
            }
        });

        num1_Division.setText("1/x");
        num1_Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1_DivisionActionPerformed(evt);
            }
        });

        ComputR.setText("%");
        ComputR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputRActionPerformed(evt);
            }
        });

        ComputSQRT.setText("sqrt");
        ComputSQRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputSQRTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(MemPlus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(MemRead)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(MemSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CompuA)
                            .addComponent(CompuS)
                            .addComponent(CompuM)
                            .addComponent(CompuD)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MemClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num9)
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Result)
                                    .addComponent(num1_Division)
                                    .addComponent(ComputR)
                                    .addComponent(ComputSQRT)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BackSpace)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CompuA, CompuD, CompuM, CompuS, ComputR, ComputSQRT, MemClear, MemPlus, MemRead, MemSave, Result, comma, jButton6, num0, num1, num1_Division, num2, num3, num4, num5, num6, num7, num8, num9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Clear)
                    .addComponent(BackSpace)
                    .addComponent(Delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemClear)
                    .addComponent(num7)
                    .addComponent(num8)
                    .addComponent(num9)
                    .addComponent(CompuD)
                    .addComponent(ComputSQRT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemRead)
                    .addComponent(num4)
                    .addComponent(num5)
                    .addComponent(num6)
                    .addComponent(CompuM)
                    .addComponent(ComputR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemSave)
                    .addComponent(num1)
                    .addComponent(num2)
                    .addComponent(num3)
                    .addComponent(CompuS)
                    .addComponent(num1_Division))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemPlus)
                    .addComponent(num0)
                    .addComponent(jButton6)
                    .addComponent(comma)
                    .addComponent(CompuA)
                    .addComponent(Result))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        if(strTemp==""){
            
        }else{
            strTemp +=0;
        }
        jTextField1.setText(strTemp);
    }//GEN-LAST:event_num0ActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        strTemp += 1;
        
        jTextField1.setText(strTemp);
    }//GEN-LAST:event_num1ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        strTemp += 2;
        
        jTextField1.setText(strTemp);
    }//GEN-LAST:event_num2ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        strTemp += 3;
        
        jTextField1.setText(strTemp);
    }//GEN-LAST:event_num3ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        strTemp += 4;
        
        jTextField1.setText(strTemp);
    }//GEN-LAST:event_num4ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        strTemp += 5;
        
        jTextField1.setText(strTemp);
    }//GEN-LAST:event_num5ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        strTemp += 6;
        
        jTextField1.setText(strTemp);
    }//GEN-LAST:event_num6ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        strTemp += 7;
        
        jTextField1.setText(strTemp);
    }//GEN-LAST:event_num7ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        strTemp += 8;
        
        jTextField1.setText(strTemp);
    }//GEN-LAST:event_num8ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        strTemp += 9;
        
        jTextField1.setText(strTemp);
    }//GEN-LAST:event_num9ActionPerformed

    private void CompuAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompuAActionPerformed
       dTemp = Double.valueOf(strTemp);
       
       if(dResult == 0){
           dResult = dTemp;
       }else
           dResult += dTemp;
       
       strResult = String.valueOf(dResult);
       
       jTextField1.setText(strResult);
       
       dTemp = 0;
       strTemp = "";
       strDiscri = "+";
    }//GEN-LAST:event_CompuAActionPerformed

    private void CompuSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompuSActionPerformed
        dTemp = Double.valueOf(strTemp);
       
       if(dResult == 0){
           dResult = dTemp;
       }else
           dResult -= dTemp;
       
       strResult = String.valueOf(dResult);
       
       jTextField1.setText(strResult);
       
       dTemp = 0;
       strTemp = "";
       strDiscri = "-";
    }//GEN-LAST:event_CompuSActionPerformed

    private void CompuMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompuMActionPerformed
        dTemp = Double.valueOf(strTemp);
       
       if(dResult == 0){
           dResult = dTemp;
       }else
           dResult *= dTemp;
       
       strResult = String.valueOf(dResult);
       
       jTextField1.setText(strResult);
       
       dTemp = 0;
       strTemp = "";
       strDiscri = "*";
    }//GEN-LAST:event_CompuMActionPerformed

    private void CompuDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompuDActionPerformed
        dTemp = Double.valueOf(strTemp);
       
       if(dResult == 0){
           dResult = dTemp;
       }else
           dResult /= dTemp;
       
       strResult = String.valueOf(dResult);
       
       jTextField1.setText(strResult);
       
       dTemp = 0;
       strTemp = "";
       strDiscri = "/";
    }//GEN-LAST:event_CompuDActionPerformed

    private void ResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultActionPerformed
        dTemp = Double.parseDouble(strTemp);
        
        if (strDiscri == "+"){
            dTemp = Double.valueOf(strTemp);
            dResult += dTemp;
        }
        else if(strDiscri == "-"){
            dResult -= dTemp;
        }
        else if(strDiscri == "*"){
            dResult *= dTemp;
        }
        else if(strDiscri == "/"){
            dResult /= dTemp;
        }
        else if(strDiscri == "%"){
            dResult %= dTemp;
        }
            
        strResult = String.valueOf(dResult);
       
       jTextField1.setText(strResult);
       strDiscri = "";
            
    }//GEN-LAST:event_ResultActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        dResult = 0;
        dTemp = 0;
        strResult = "";
        strTemp = "";
        strDiscri = "";
        
        jTextField1.setText("0");
    }//GEN-LAST:event_ClearActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        strTemp = "";
        
        jTextField1.setText(strTemp);
    }//GEN-LAST:event_DeleteActionPerformed

    private void ComputRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputRActionPerformed
        dTemp = Double.valueOf(strTemp);
       
       if(dResult == 0){
           dResult = dTemp;
       }else
           dResult %= dTemp;
       
       strResult = String.valueOf(dResult);
       
       jTextField1.setText(strResult);
       
       dTemp = 0;
       strTemp = "";
       strDiscri = "%";
    }//GEN-LAST:event_ComputRActionPerformed

    private void num1_DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1_DivisionActionPerformed
        dTemp = Double.valueOf(strTemp);
        
        if(dTemp != 0){
            dResult = 1 / dTemp;
            
            strResult = String.valueOf(dResult);
            jTextField1.setText(strResult);
        }
        else{
            jTextField1.setText("0으로 나눌 수 없습니다.");
        }
        
        strTemp = "";
        dTemp = 0;
    }//GEN-LAST:event_num1_DivisionActionPerformed

    private void commaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commaActionPerformed
        strTemp += ".";
        
        jTextField1.setText(strTemp);
    }//GEN-LAST:event_commaActionPerformed

    private void BackSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackSpaceActionPerformed
        String stData = strTemp.substring(0, strTemp.length()-1);
        
        strTemp = stData;

        jTextField1.setText(strTemp);
    }//GEN-LAST:event_BackSpaceActionPerformed

    private void ComputSQRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputSQRTActionPerformed
        dTemp = Double.valueOf(strTemp);
        dResult = Math.sqrt(dTemp);
        strResult = String.valueOf(dResult);
        jTextField1.setText(strResult);
    }//GEN-LAST:event_ComputSQRTActionPerformed

    private void MemReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemReadActionPerformed
        jTextField1.setText(strMem);
        
        strTemp = strMem;
    }//GEN-LAST:event_MemReadActionPerformed

    private void MemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemSaveActionPerformed
        strMem = strTemp;
        
        jLabel1.setText(strMem);
    }//GEN-LAST:event_MemSaveActionPerformed

    private void MemClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemClearActionPerformed
        strMem = "";
        jLabel1.setText(strMem);
    }//GEN-LAST:event_MemClearActionPerformed

    private void MemPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemPlusActionPerformed
        dTemp = Double.valueOf(strTemp);
        dResult = dTemp + Double.valueOf(strMem);
        
        strResult = String.valueOf(dResult);
        strTemp = strResult;
        jTextField1.setText(strResult);
    }//GEN-LAST:event_MemPlusActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed


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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackSpace;
    private javax.swing.JButton Clear;
    private javax.swing.JButton CompuA;
    private javax.swing.JButton CompuD;
    private javax.swing.JButton CompuM;
    private javax.swing.JButton CompuS;
    private javax.swing.JButton ComputR;
    private javax.swing.JButton ComputSQRT;
    private javax.swing.JButton Delete;
    private javax.swing.JButton MemClear;
    private javax.swing.JButton MemPlus;
    private javax.swing.JButton MemRead;
    private javax.swing.JButton MemSave;
    private javax.swing.JButton Result;
    private javax.swing.JButton comma;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num1_Division;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    // End of variables declaration//GEN-END:variables
}

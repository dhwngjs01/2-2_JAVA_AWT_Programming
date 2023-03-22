
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
	initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblOrder = new javax.swing.JLabel();
        lblMovie = new javax.swing.JLabel();
        lblGallery = new javax.swing.JLabel();
        tbxOrder = new javax.swing.JTextField();
        tbxMovie = new javax.swing.JTextField();
        tbxGallery = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setText("Table 예제");

        lblOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrder.setText("순        위");

        lblMovie.setText("영화 제목");

        lblGallery.setText("관객 동원");

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "로마의 휴일", "1000000"},
                { new Integer(2), "타이타닉", "800000"},
                { new Integer(3), "죽은 시인의 사회", "600000"},
                { new Integer(4), "쉬리", "400000"},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "순위", "영화 제목", "관객 동원"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblGallery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tbxOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnInsert))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tbxMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tbxGallery, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrder)
                    .addComponent(tbxOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMovie)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxGallery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGallery)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
	int iCntRow = 0;
	iCntRow = jTable1.getSelectedRow(); // 선택한 행 번호 반환
	
	tbxOrder.setText(jTable1.getValueAt(iCntRow, 0).toString()); // 선택한 행의 순위 반환
	tbxMovie.setText(jTable1.getValueAt(iCntRow, 1).toString()); // 선택한 행의 영화 제목 반환
	tbxGallery.setText(jTable1.getValueAt(iCntRow, 2).toString()); // 선택한 행의 관객 동원 반환
	
	
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // 변수 초기화
	int iCntRow = 0;
	int tbxOrderVal = 0;
	String tbxMovieVal = null;
	String tbxGalleryVal = null;
	
	// 플래그 변수
	boolean overlapOrder = false;
	boolean overlapMovie = false;
	
	// 텍스트 필드에 입력한 값 변수에 저장
	tbxOrderVal = Integer.parseInt(tbxOrder.getText()); // 순위 필드 값
	tbxMovieVal = tbxMovie.getText(); // 영화제목 필드 값
	tbxGalleryVal = tbxGallery.getText(); // 관객 필드 값
	
	// 테이블 행의 총 개수
	iCntRow = jTable1.getRowCount();
	
	// 테이블 행의 총 개수만큼 반복
	for(int i = 0; i < jTable1.getRowCount(); i++){
	    // 테이블 N행의 '순위' 열의 값이 null 이 아닐때
	    if(jTable1.getValueAt(i, 0) != null){
		// 중복되는 '순위'가 있으면 플래그 변수에 true 저장
		if(tbxOrderVal == Integer.parseInt(jTable1.getValueAt(i, 0).toString())){
		    overlapOrder = true;
		    break;
		}

		// 중복되는 '영화 제목'이 있으면 플래그 변수에 true 저장
		if(tbxMovieVal.equals(jTable1.getValueAt(i, 1).toString())){
		    overlapMovie = true;
		    break;
		}
	    } else {
		// 테이블 행들 중 '순위' 열의 값이 null 일때
		iCntRow = i;
		break;
	    }
	}
	
	// 중복되는 '순위'가 있으면 메시지 창을 출력
	if(overlapOrder == true){
	    JOptionPane.showMessageDialog(rootPane, "중복되는 순위가 있습니다.");    
	    
	// 중복되는 '영화 제목'이 있으면 메시지 창을 출력
	} else if(overlapMovie == true){
	    JOptionPane.showMessageDialog(rootPane, "중복되는 영화 제목이 있습니다.");
	} else {
	    // 테이블에 빈 행에 값들 입력
	    String[] tbxVal = { tbxOrder.getText(), tbxMovie.getText(), tbxGallery.getText() };
	    
	    for(int i = 0; i < 3; i++){
		jTable1.setValueAt(tbxVal[i], iCntRow, i);
	    }
	}
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int iCntRow = 0;
	iCntRow = jTable1.getSelectedRow();
	
	jTable1.setValueAt(tbxOrder.getText(), iCntRow, 0);
	jTable1.setValueAt(tbxMovie.getText(), iCntRow, 1);
	jTable1.setValueAt(tbxGallery.getText(), iCntRow, 2);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int iCntRow = 0;
	iCntRow = jTable1.getSelectedRow();
	
	for(int i = 0; i < jTable1.getColumnCount(); i++){
	    jTable1.setValueAt(null, iCntRow, i);
	}
	
	tbxOrder.setText(null);
	tbxMovie.setText(null);
	tbxGallery.setText(null);
    }//GEN-LAST:event_btnDeleteActionPerformed

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
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblGallery;
    private javax.swing.JLabel lblMovie;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField tbxGallery;
    private javax.swing.JTextField tbxMovie;
    private javax.swing.JTextField tbxOrder;
    // End of variables declaration//GEN-END:variables
}

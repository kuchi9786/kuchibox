package intranet;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 2class-004
 */
public class AdminEdit extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
	
	Intra intra;
	AdminEditDAO dao;
	ArrayList<DeptVO> allDeptList=null;
	int deptNo;
	String dName;
	
    public AdminEdit(Intra intra, AdminEditDAO dao, ArrayList<DeptVO> allDeptList) {
        initComponents();
        this.intra=intra;
        this.dao=dao;
        
        // 전체 부서 번호, 부서명을 전달받아 저장
        if (allDeptList==null) {
    		DeptDAO dDao=new DeptDAO();
    		this.allDeptList=dDao.listDept();
    		// System.out.println("부서 정보 추출");
    	} else this.allDeptList=allDeptList;
    	
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Admin = new javax.swing.JPanel();
        lbMypageHeader = new javax.swing.JLabel();
        lbEmpid = new javax.swing.JLabel();
        lbEname = new javax.swing.JLabel();
        lbPwd = new javax.swing.JLabel();
        lbPwdConfirm = new javax.swing.JLabel();
        sexGroup = new javax.swing.ButtonGroup();
        lbSex = new javax.swing.JLabel();
        lbTel = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        lbRank = new javax.swing.JLabel();
        lbDept = new javax.swing.JLabel();
        btSexM = new javax.swing.JRadioButton();
        btSexF = new javax.swing.JRadioButton();
        tfEmpid = new javax.swing.JTextField();
        tfEname = new javax.swing.JTextField();
        tfPwd = new javax.swing.JTextField();
        tfPwdConfirm = new javax.swing.JTextField();
        tfTel = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfDate = new javax.swing.JTextField();
        tfRank = new javax.swing.JTextField();
        tfDept = new javax.swing.JTextField();
        btDeptCheck = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        btReg = new javax.swing.JButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Admin.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new java.awt.CardLayout());

        lbPwd.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbPwd.setText("비  밀  번  호");

        btReg.setText("등록 완료");
        btReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegActionPerformed(evt);
            }
        });

        lbSex.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbSex.setText("성            별");

        sexGroup.add(btSexM);
        btSexM.setText("M");
        
        sexGroup.add(btSexF);
        btSexF.setText("F");

        lbEmpid.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbEmpid.setText("사            번");

        lbPwdConfirm.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbPwdConfirm.setText("비밀번호 확인");

        lbRank.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbRank.setText("직            급");
        
        lbDate.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbDate.setText("입사일(년/월/일) : YY/MM/DD");

        btCancel.setText("취소");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        btDeptCheck.setText("부서 확인");
        btDeptCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDeptCheckMouseClicked(evt);
            }
        });

        tfPwdConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPwdConfirmActionPerformed(evt);
            }
        });

        lbMypageHeader.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        lbMypageHeader.setText("::: 사원 정보 수정 :::");

        lbTel.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbTel.setText("전  화  번  호");

        lbEname.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbEname.setText("이            름");

        lbEmail.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbEmail.setText("이     메    일");

        lbDept.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        lbDept.setText("부            서");

        btCancel.setText("취소");

        javax.swing.GroupLayout AdminLayout = new javax.swing.GroupLayout(Admin);
        Admin.setLayout(AdminLayout);
        AdminLayout.setHorizontalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminLayout.createSequentialGroup()
                        .addComponent(lbMypageHeader)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(AdminLayout.createSequentialGroup()
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AdminLayout.createSequentialGroup()
                                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbRank)
                                    .addComponent(lbDept))
                                .addGap(13, 13, 13)
                                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AdminLayout.createSequentialGroup()
                                        .addComponent(tfDept, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btDeptCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(AdminLayout.createSequentialGroup()
                                        .addComponent(tfRank, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                                        .addComponent(btReg))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(AdminLayout.createSequentialGroup()
                                    .addComponent(lbPwdConfirm)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfPwdConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEmpid)
                                    .addComponent(lbPwd)
                                    .addGroup(AdminLayout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(AdminLayout.createSequentialGroup()
                                    .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)))
                            .addGroup(AdminLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(AdminLayout.createSequentialGroup()
                                        .addComponent(lbEmail)
                                        .addGap(13, 13, 13)
                                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(AdminLayout.createSequentialGroup()
                                            .addComponent(lbSex)
                                            .addGap(13, 13, 13)
                                            .addComponent(btSexM)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btSexF))
                                        .addGroup(AdminLayout.createSequentialGroup()
                                            .addComponent(lbTel)
                                            .addGap(13, 13, 13)
                                            .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(AdminLayout.createSequentialGroup()
                                            .addComponent(lbEname)
                                            .addGap(13, 13, 13)
                                            .addComponent(tfEname, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(318, 318, 318)))
                        .addGap(146, 146, 146))))
            .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminLayout.createSequentialGroup()
                    .addContainerGap(805, Short.MAX_VALUE)
                    .addComponent(btCancel)
                    .addGap(67, 67, 67)))
        );
        AdminLayout.setVerticalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbMypageHeader)
                .addGap(18, 18, 18)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmpid)
                    .addComponent(tfEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPwd)
                    .addComponent(tfPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPwdConfirm)
                    .addComponent(tfPwdConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEname)
                    .addComponent(tfEname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSex)
                    .addComponent(btSexM)
                    .addComponent(btSexF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTel)
                    .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDate)
                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDept)
                    .addComponent(tfDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDeptCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRank)
                    .addComponent(tfRank, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btReg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminLayout.createSequentialGroup()
                    .addContainerGap(415, Short.MAX_VALUE)
                    .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void tfPwdConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPwdConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPwdConfirmActionPerformed

    private void btDeptCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeptCheckMouseClicked
    	// 부서명이 있는지 확인하고 없으면 다시 입력하라고 메시지 보냄
    	// 입력된 부서명이 존재하지 않으면 다시 입력하라고 메시지 보냄
    	// 부서 id도 수정 (구현해야 함)
    	String inputtedDname=tfDept.getText();
    	if (inputtedDname.isEmpty()) {
    		JOptionPane.showMessageDialog(null, "부서명을 입력하세요.");
    	} else if ((deptNo=DeptCheck(inputtedDname)) > 0) {
    		dName=inputtedDname;
    		JOptionPane.showMessageDialog(null, "부서 이름이 확인되었습니다.");
    	} else {
			JOptionPane.showMessageDialog(null, "부서 이름을 다시 확인하고 다시 입력해 주세요.");
		}
    }//GEN-LAST:event_btDeptCheckMouseClicked
    
	public int DeptCheck(String dept) {
		System.out.println(dept);
        for(int i=0;i<allDeptList.size();i++) {
        	DeptVO user=allDeptList.get(i);
			if (user.getdName().contentEquals(dept)) {
				return user.getDeptNo();
			}
        }
        return -1;
	}	

    /**등록 버튼*/
    private void btRegActionPerformed(java.awt.event.ActionEvent evt) {
        
    	String oid=tfEmpid.getText();
    	int id=Integer.parseInt(oid.trim());
    	String pwd=tfPwd.getText();
    	System.out.println(pwd);
    	String pwdCon=tfPwdConfirm.getText();
    	String name=tfEname.getText();
    	dName=tfDept.getText();
    	deptNo=DeptCheck(dName);
    	// System.out.println(dName+" = "+deptNo);
    	ButtonModel sexModel=sexGroup.getSelection() ;
    	String sex=sexGroup(sexModel);
    	String tel=tfTel.getText();
    	String email=tfEmail.getText();
    	String rank=tfRank.getText();
//		SimpleDateFormat dataFormat = new SimpleDateFormat ( "yy/MM/dd");
//		Date date = new Date();
//		String hiredate=dataFormat.format(date);
//		System.out.println(hiredate);
		String hiredate=tfDate.getText();
    	
		if (pwdCheck(pwd, pwdCon) == true) {
			AdminRegisterVO vo = new AdminRegisterVO(id, name, deptNo, dName, tel, 
					rank, email, hiredate, sex, pwd);
			int cnt = dao.updateEmp(vo);
			if (cnt > 0) {
				showMessage("사원 정보 수정 완료");
				intra.empList=intra.aDao.selectAll();
		    	intra.showTaList(intra.empList);
				this.dispose();
			} else {
				showMessage("사원 정보 수정 실패");
			}
		}
    }
    
    /**성별 확인*/
    public String sexGroup(ButtonModel sexModel) {
    	if(sexModel==this.btSexF.getModel()) {
    		return "F";
    	}else {
    		return "M";
    	}
    }
    
    /**비밀번호 재확인*/
    public boolean pwdCheck(String pwd, String pwdCon) {
    	if(!((pwd.trim()).equals(pwdCon.trim()))||pwd.trim().isEmpty()||pwdCon.trim().isEmpty()) {
    		JOptionPane.showMessageDialog(this, "비밀번호가 일치하지 않습니다.");
    		return false;
    	}
    	return true;
    }
    
    /**확인 메시지 출력*/
    public void showMessage(String str) {
    	JOptionPane.showMessageDialog(this, str);
    }
    
    /**취소버튼*/
    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
        intra.card.show(intra.pCenter, "pAdmin");
    }
    
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
            java.util.logging.Logger.getLogger(AdminEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel Admin;
    javax.swing.JTextField tfEmpid;
    javax.swing.JTextField tfEname;
    javax.swing.JTextField tfPwd;
    javax.swing.JRadioButton btSexF;
    javax.swing.JRadioButton btSexM;
    private javax.swing.ButtonGroup sexGroup;
    javax.swing.JTextField tfTel;
    javax.swing.JTextField tfEmail;
    javax.swing.JTextField tfDate;
    javax.swing.JTextField tfRank;
    javax.swing.JTextField tfDept;
    
    private javax.swing.JTextField tfPwdConfirm;
    private javax.swing.JLabel lbMypageHeader;
    private javax.swing.JLabel lbEmpid;
    private javax.swing.JLabel lbEname;
    private javax.swing.JLabel lbPwd;
    private javax.swing.JLabel lbPwdConfirm;
    private javax.swing.JLabel lbSex;
    private javax.swing.JLabel lbTel;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbRank;
    private javax.swing.JLabel lbDept;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btDeptCheck;
    private javax.swing.JButton btReg;
    // End of variables declaration//GEN-END:variables
}

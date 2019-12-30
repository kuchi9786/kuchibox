package intranet;

import java.sql.Date;

public class MsgVO {
	private int msgid; // �۹�ȣ
	private String s_R; // ������/�ޱ�
	private int empid; // �������/������� id
	private String ename; // �������/�������
	private String title; // �޸� ����
	private String msg; // �޸𳻿�
	private java.sql.Date sdate; // �ۼ���
	private String rD; // ��������
	
	public int getMsgid() {
		return msgid;
	}
	public void setMsgid(int msgid) {
		this.msgid = msgid;
	}
	public String getS_R() {
		return s_R;
	}
	public void setS_R(String s_R) {
		this.s_R = s_R;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public java.sql.Date getSdate() {
		return sdate;
	}
	public void setSdate(java.sql.Date sdate) {
		this.sdate = sdate;
	}
	public String getrD() {
		return rD;
	}
	public void setrD(String rD) {
		this.rD = rD;
	}
	
	public MsgVO(String s_R, int empid, String title, String msg, String rD) {
		super();
		this.s_R = s_R;
		this.empid = empid;
		this.title = title;
		this.msg = msg;
		this.rD = rD;
	}
	
	public MsgVO(int msgid, String s_R, int empid, String ename, String title, String msg, Date sdate, String rD) {
		super();
		this.msgid = msgid;
		this.s_R = s_R;
		this.empid = empid;
		this.ename = ename;
		this.title = title;
		this.msg = msg;
		this.sdate = sdate;
		this.rD = rD;
	}
	@Override
	public String toString() {
		return "MsgVO [msgid=" + msgid + ", s_R=" + s_R + ", empid=" + empid + ", ename=" + ename + ", title=" + title
				+ ", msg=" + msg + ", sdate=" + sdate + ", rD=" + rD + "]";
	}
	
}

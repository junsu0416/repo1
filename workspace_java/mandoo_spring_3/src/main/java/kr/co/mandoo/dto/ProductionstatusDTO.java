package kr.co.mandoo.dto;

import java.sql.Date;
import java.util.List;

public class ProductionstatusDTO {
	
	private String work_id;  
	private String user_id; 
	private String item_code; 
	private Date work_write; 
	private Date work_endate; 
	private String work_name; 
	private String work_do; 
	private int production_qty; 
	private int line_no; 
	private int production_Completed_Qty; 
	
	
	public String getWork_id() {
		return work_id;
	}
	public void setWork_id(String work_id) {
		this.work_id = work_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getItem_code() {
		return item_code;
	}
	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}
	public Date getWork_write() {
		return work_write;
	}
	public void setWork_write(Date work_write) {
		this.work_write = work_write;
	}
	public Date getWork_endate() {
		return work_endate;
	}
	public void setWork_endate(Date work_endate) {
		this.work_endate = work_endate;
	}
	public String getWork_name() {
		return work_name;
	}
	public void setWork_name(String work_name) {
		this.work_name = work_name;
	}
	public String getWork_do() {
		return work_do;
	}
	public void setWork_do(String work_do) {
		this.work_do = work_do;
	}
	public int getProduction_qty() {
		return production_qty;
	}
	public void setProduction_qty(int production_qty) {
		this.production_qty = production_qty;
	}
	public int getLine_no() {
		return line_no;
	}
	public void setLine_no(int line_no) {
		this.line_no = line_no;
	}
	public int getProduction_Completed_Qty() {
		return production_Completed_Qty;
	}
	public void setProduction_Completed_Qty(int production_Completed_Qty) {
		this.production_Completed_Qty = production_Completed_Qty;
	}
	
	@Override
	public String toString() {
		return "ProductionstatusDTO [work_id=" + work_id + ", user_id=" + user_id + ", item_code=" + item_code
				+ ", work_write=" + work_write + ", work_endate=" + work_endate + ", work_name=" + work_name
				+ ", work_do=" + work_do + ", production_qty=" + production_qty + ", line_no=" + line_no
				+ ", production_Completed_Qty=" + production_Completed_Qty + "]";
	}
	
	
	
	}

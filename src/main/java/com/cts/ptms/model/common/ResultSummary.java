package com.cts.ptms.model.common;

public class ResultSummary {
	
	@Override
	public String toString() {
		return "OrderSummary [columnName=" + columnName + ", value=" + value + "]";
	}
	
	private String columnName;
	private int value;
	private String columnId;
	
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getColumnId() {
		return columnId;
	}
	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}
	

	
	
}

package com.abner.commons;

public class Pager {
	private int totalRows;
	private int pageSize = 5;
	private int currentPage;
	private int totalPage;
	private int startRow;
	
	public Pager() {
		// TODO Auto-generated constructor stub
	}
	
	public Pager(int _totalRows){
		totalRows = _totalRows;
		totalPage = totalRows / pageSize;
		int  mod = totalRows % pageSize;
		if (mod > 0) {
			totalPage++;
		}
		currentPage = 1;
		startRow = 0;
	}
	
	public void first() {
		currentPage = 1;
		startRow = 0;
	}
	
	public void previous() {
		if (currentPage == 1) {
			return;
		}
		currentPage--;
		startRow = (currentPage-1) * pageSize;
	}
	
	public void next() {
		if (currentPage < totalPage) {
			currentPage++;
		}
		startRow = (currentPage - 1) * pageSize;
	}
	
	public void last() {
		currentPage =  totalPage;
		startRow = (currentPage - 1) * pageSize;
	} 
	
	public void refresh(int _currentPage) {
		currentPage = _currentPage;
		if (currentPage > totalPage) {
			last();
		}
	}
	
	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	@Override
	public String toString() {
		return "Pager [totalRows=" + totalRows + ", pageSize=" + pageSize + ", currentPage=" + currentPage
				+ ", totalPage=" + totalPage + ", startRow=" + startRow + "]";
	}
	
}

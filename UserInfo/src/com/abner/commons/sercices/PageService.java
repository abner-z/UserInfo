package com.abner.commons.sercices;

import com.abner.commons.Pager;

public class PageService {
	public Pager getPage(String currentPage,String pagerMethod , int totalRows) {
		Pager pager = new Pager(totalRows);
		if (currentPage == null) {
			pager.first();
		}else {
			pager.refresh(Integer.parseInt(currentPage));
			if (pagerMethod.equals("first")) {
				pager.first();
			}else if (pagerMethod.equals("next")) {
				pager.next();
			}else if (pagerMethod.equals("previous")) {
				pager.previous();
			}else if (pagerMethod.equals("last")) {
				pager.last();
			}
		}
		return pager;
	}
}

package com.comsys.service;

import com.comsys.domain.Userinfo;
import com.comsys.util.PageBean;

public interface UserinfoService {
	public Userinfo queryById(int id);
	
	public PageBean queryByPage(int currentPage, int pageSize);
}

package com.comsys.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.comsys.domain.Userinfo;
import com.comsys.mapper.UserinfoMapper;
import com.comsys.service.UserinfoService;
import com.comsys.util.PageBean;
import com.github.pagehelper.PageHelper;

@Service("userinfoService")
public class UserinfoServiceImpl implements UserinfoService {
	@Resource
	private UserinfoMapper userinfoMapper;

	@Override
	public Userinfo queryById(int id) {
		return userinfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public PageBean queryByPage(int pageNo, int pageSize) {
		int totalnum = userinfoMapper.countAll();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		int start = (pageNo - 1) * pageSize;
		/*map.put("start", start);
		map.put("pageSize", pageSize);
		List<Userinfo> records = userinfoMapper.queryByPage(map);*/
		
		PageHelper.startPage(pageNo, pageSize);
		List<Userinfo> records = userinfoMapper.queryListPage();
		
		return new PageBean(records, totalnum, pageNo, pageSize);
	}
}

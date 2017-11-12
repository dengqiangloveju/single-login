package com.comsys.mapper;

import java.util.List;
import java.util.Map;

import com.comsys.domain.Userinfo;

public interface UserinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
    
    int countAll();

	List<Userinfo> queryByPage(Map<String, Object> map);
	
	public List<Userinfo> queryListPage();
}
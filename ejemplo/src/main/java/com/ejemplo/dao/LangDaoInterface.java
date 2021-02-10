package com.ejemplo.dao;

import java.util.List;

import com.ejemplo.entity.Lang;

public interface LangDaoInterface {
	
	public void save(Lang lang);
	
	public void update(Lang lang);
	
	public void deleteOne(long id);
	
	public List<Lang> findAll();
	
	public List<Lang> findById(long id);

}

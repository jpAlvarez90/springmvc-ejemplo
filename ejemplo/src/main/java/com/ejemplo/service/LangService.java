package com.ejemplo.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ejemplo.dao.LangDaoInterface;
import com.ejemplo.entity.Lang;

public class LangService implements LangDaoInterface{
	
	private JdbcTemplate jdbcTemplate;
	
	public LangService(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	String sql;

	@Override
	public void save(Lang lang) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Lang lang) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOne(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Lang> findAll() {
		sql = "SELECT * FROM lang";
		return this.jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Lang.class));
	}

	@Override
	public List<Lang> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

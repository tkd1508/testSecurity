package com.io.securityInfrun.web.test.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.io.securityInfrun.util.UISMap;

@Repository
@Mapper
public interface TestMapper {

	public ArrayList<UISMap> selectTest();
	
	/*
	 * @Select("select * from testtable") public String testtt();
	 */
	
}

package com.wyy.mapper;

import com.wyy.model.Propertie;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PropertiesMapper {
	
	int insert(final Propertie p);
	
	int deleteByKey(final String propertieKey);
	
	Propertie selectByKey(final String propertieKey);
	
	int update(final Propertie p);
	
}

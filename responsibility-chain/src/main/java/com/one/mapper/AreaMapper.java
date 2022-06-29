package com.one.mapper;

import com.one.domain.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author itdebug
 * @create 2021-12-19 10:13
 **/
@Mapper
public interface AreaMapper {
    /**
     * 列出区域信息
     * 
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据查询某一个区域信息
     * 
     * @param id
     * @return
     */
    Area queryAreaById(Integer id);

    /**
     * 插入一个区域信息
     * 
     * @param area 区域
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     * 
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除某一个区域信息
     * 
     * @param id
     * @return
     */
    int deleteAreaById(Integer id);
}

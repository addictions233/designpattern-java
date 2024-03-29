package com.one.service;

import com.one.domain.Area;

import java.util.List;

/**
 * @author one
 */
public interface AreaService {

    /**
     * 根据区域的id 获取区域的信息
     * 
     * @param areaId
     * @return
     */
    Area getAreaByAreaId(Integer areaId);

    /**
     * 获取所有区域信息
     * 
     * @return
     */
    List<Area> getAreaList();

    /**
     * 添加一个区域
     * 
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 更新区域信息
     * 
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     * 根据areaId 删除区域信息
     * 
     * @param areaId
     * @return
     */
    boolean deleteArea(Integer areaId);
}

package com.one.controller;

import com.one.domain.Area;
import com.one.filter.union.ChainPatternDemo;
import com.one.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author one
 * @create 2021-12-19 15:39
 **/
@RestController
@RequestMapping("/superadmin")
public class AreaController {
    
    @Autowired
    private AreaService areaService;
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;
    @Autowired
    private ChainPatternDemo chainPatternDemo;

    @GetMapping(value = "/listarea")
    public Map<String, Object> listArea(){
        Map<String, Object> modelMap = new HashMap<>();
        List<Area> list = areaService.getAreaList();
        System.out.println("---" +  chainPatternDemo.exec(request,response));
        modelMap.put("areaList", list);
        
        return modelMap;
    }
    
    @GetMapping("/getarea")
    public Map<String, Object> getAreaByAreaId(Integer areaId){
        Map<String, Object> modelMap = new HashMap<>();
        Area area = areaService.getAreaByAreaId(areaId);
        
        modelMap.put("area", area);
        
        return modelMap;
    }
    
    @PostMapping("/addarea")
    public Map<String, Object> addArea(@RequestBody Area area){
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", areaService.addArea(area));
        
        return modelMap;
    }

    @PostMapping("/modifyarea")
    public Map<String, Object> modifyArea(@RequestBody Area area){
        Map<String, Object> modelMap = new HashMap<>();

        modelMap.put("success", areaService.modifyArea(area));

        return modelMap;
    }
    
    @GetMapping("/delarea")
    public Map<String, Object> deleteArea(Integer areaId){
        System.out.println(areaId);
        Map<String, Object> modelMap = new HashMap<>();

        modelMap.put("success", areaService.deleteArea(areaId));

        return modelMap;
    } 
    
}

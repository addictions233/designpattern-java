package com.one.controller;

import com.one.domain.Area;
import com.one.filter.chain.ChainPatternDemo;
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
 **/
@RestController
@RequestMapping("/area")
public class AreaController {
    
    @Autowired
    private AreaService areaService;
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpServletResponse response;
    @Autowired
    private ChainPatternDemo chainPatternDemo;

    @GetMapping(value = "/list")
    public Map<String, Object> listArea(){
        Map<String, Object> modelMap = new HashMap<>();
        // 执行所有的责任链
        chainPatternDemo.execute(request,response);
        List<Area> list = areaService.getAreaList();
        modelMap.put("areaList", list);
        return modelMap;
    }
    
    @GetMapping("/get/{areaId}")
    public Map<String, Object> getAreaByAreaId(@PathVariable("areaId") Integer areaId){
        Map<String, Object> modelMap = new HashMap<>();
        // 执行所有的责任链
        chainPatternDemo.execute(request,response);
        Area area = areaService.getAreaByAreaId(areaId);
        modelMap.put("area", area);
        return modelMap;
    }
    
    @PostMapping("/add")
    public Map<String, Object> addArea(@RequestBody Area area){
        Map<String, Object> modelMap = new HashMap<>();
        // 执行所有的责任链
        chainPatternDemo.execute(request,response);
        modelMap.put("success", areaService.addArea(area));
        return modelMap;
    }

    @PostMapping("/modify")
    public Map<String, Object> modifyArea(@RequestBody Area area){
        Map<String, Object> modelMap = new HashMap<>();
        // 执行所有的责任链
        chainPatternDemo.execute(request,response);
        modelMap.put("success", areaService.modifyArea(area));
        return modelMap;
    }
    
    @GetMapping("/delete/{areaId}")
    public Map<String, Object> deleteArea(@PathVariable("areaId") Integer areaId){
        System.out.println(areaId);
        // 执行所有的责任链
        chainPatternDemo.execute(request,response);
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", areaService.deleteArea(areaId));
        return modelMap;
    } 
    
}

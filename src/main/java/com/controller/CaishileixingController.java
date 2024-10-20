package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.CaishileixingEntity;
import com.entity.view.CaishileixingView;

import com.service.CaishileixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 菜式类型
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-25 08:11:08
 */
@RestController
@RequestMapping("/caishileixing")
public class CaishileixingController {
    @Autowired
    private CaishileixingService caishileixingService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CaishileixingEntity caishileixing,
		HttpServletRequest request){
        EntityWrapper<CaishileixingEntity> ew = new EntityWrapper<CaishileixingEntity>();

		PageUtils page = caishileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, caishileixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CaishileixingEntity caishileixing, 
		HttpServletRequest request){
        EntityWrapper<CaishileixingEntity> ew = new EntityWrapper<CaishileixingEntity>();

		PageUtils page = caishileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, caishileixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CaishileixingEntity caishileixing){
       	EntityWrapper<CaishileixingEntity> ew = new EntityWrapper<CaishileixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( caishileixing, "caishileixing")); 
        return R.ok().put("data", caishileixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CaishileixingEntity caishileixing){
        EntityWrapper< CaishileixingEntity> ew = new EntityWrapper< CaishileixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( caishileixing, "caishileixing")); 
		CaishileixingView caishileixingView =  caishileixingService.selectView(ew);
		return R.ok("查询菜式类型成功").put("data", caishileixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CaishileixingEntity caishileixing = caishileixingService.selectById(id);
        return R.ok().put("data", caishileixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CaishileixingEntity caishileixing = caishileixingService.selectById(id);
        return R.ok().put("data", caishileixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CaishileixingEntity caishileixing, HttpServletRequest request){
    	caishileixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(caishileixing);
        caishileixingService.insert(caishileixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CaishileixingEntity caishileixing, HttpServletRequest request){
    	caishileixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(caishileixing);
        caishileixingService.insert(caishileixing);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody CaishileixingEntity caishileixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(caishileixing);
        caishileixingService.updateById(caishileixing);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        caishileixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}

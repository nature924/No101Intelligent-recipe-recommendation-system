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

import com.entity.DiscusscaipuxinxiEntity;
import com.entity.view.DiscusscaipuxinxiView;

import com.service.DiscusscaipuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 菜谱信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2023-04-25 08:11:09
 */
@RestController
@RequestMapping("/discusscaipuxinxi")
public class DiscusscaipuxinxiController {
    @Autowired
    private DiscusscaipuxinxiService discusscaipuxinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscusscaipuxinxiEntity discusscaipuxinxi,
		HttpServletRequest request){
        EntityWrapper<DiscusscaipuxinxiEntity> ew = new EntityWrapper<DiscusscaipuxinxiEntity>();

		PageUtils page = discusscaipuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusscaipuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscusscaipuxinxiEntity discusscaipuxinxi, 
		HttpServletRequest request){
        EntityWrapper<DiscusscaipuxinxiEntity> ew = new EntityWrapper<DiscusscaipuxinxiEntity>();

		PageUtils page = discusscaipuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusscaipuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscusscaipuxinxiEntity discusscaipuxinxi){
       	EntityWrapper<DiscusscaipuxinxiEntity> ew = new EntityWrapper<DiscusscaipuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discusscaipuxinxi, "discusscaipuxinxi")); 
        return R.ok().put("data", discusscaipuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusscaipuxinxiEntity discusscaipuxinxi){
        EntityWrapper< DiscusscaipuxinxiEntity> ew = new EntityWrapper< DiscusscaipuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discusscaipuxinxi, "discusscaipuxinxi")); 
		DiscusscaipuxinxiView discusscaipuxinxiView =  discusscaipuxinxiService.selectView(ew);
		return R.ok("查询菜谱信息评论表成功").put("data", discusscaipuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscusscaipuxinxiEntity discusscaipuxinxi = discusscaipuxinxiService.selectById(id);
        return R.ok().put("data", discusscaipuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscusscaipuxinxiEntity discusscaipuxinxi = discusscaipuxinxiService.selectById(id);
        return R.ok().put("data", discusscaipuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusscaipuxinxiEntity discusscaipuxinxi, HttpServletRequest request){
    	discusscaipuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusscaipuxinxi);
        discusscaipuxinxiService.insert(discusscaipuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusscaipuxinxiEntity discusscaipuxinxi, HttpServletRequest request){
    	discusscaipuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discusscaipuxinxi);
        discusscaipuxinxiService.insert(discusscaipuxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscusscaipuxinxiEntity discusscaipuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discusscaipuxinxi);
        discusscaipuxinxiService.updateById(discusscaipuxinxi);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discusscaipuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}

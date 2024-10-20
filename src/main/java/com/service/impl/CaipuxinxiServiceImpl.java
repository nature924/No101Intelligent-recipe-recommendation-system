package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CaipuxinxiDao;
import com.entity.CaipuxinxiEntity;
import com.service.CaipuxinxiService;
import com.entity.vo.CaipuxinxiVO;
import com.entity.view.CaipuxinxiView;

@Service("caipuxinxiService")
public class CaipuxinxiServiceImpl extends ServiceImpl<CaipuxinxiDao, CaipuxinxiEntity> implements CaipuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaipuxinxiEntity> page = this.selectPage(
                new Query<CaipuxinxiEntity>(params).getPage(),
                new EntityWrapper<CaipuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaipuxinxiEntity> wrapper) {
		  Page<CaipuxinxiView> page =new Query<CaipuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaipuxinxiVO> selectListVO(Wrapper<CaipuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaipuxinxiVO selectVO(Wrapper<CaipuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaipuxinxiView> selectListView(Wrapper<CaipuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaipuxinxiView selectView(Wrapper<CaipuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<CaipuxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<CaipuxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<CaipuxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}

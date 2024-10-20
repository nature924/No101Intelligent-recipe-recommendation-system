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


import com.dao.PingfenxinxiDao;
import com.entity.PingfenxinxiEntity;
import com.service.PingfenxinxiService;
import com.entity.vo.PingfenxinxiVO;
import com.entity.view.PingfenxinxiView;

@Service("pingfenxinxiService")
public class PingfenxinxiServiceImpl extends ServiceImpl<PingfenxinxiDao, PingfenxinxiEntity> implements PingfenxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PingfenxinxiEntity> page = this.selectPage(
                new Query<PingfenxinxiEntity>(params).getPage(),
                new EntityWrapper<PingfenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PingfenxinxiEntity> wrapper) {
		  Page<PingfenxinxiView> page =new Query<PingfenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PingfenxinxiVO> selectListVO(Wrapper<PingfenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PingfenxinxiVO selectVO(Wrapper<PingfenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PingfenxinxiView> selectListView(Wrapper<PingfenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PingfenxinxiView selectView(Wrapper<PingfenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<PingfenxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<PingfenxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<PingfenxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}

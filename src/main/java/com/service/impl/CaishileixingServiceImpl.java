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


import com.dao.CaishileixingDao;
import com.entity.CaishileixingEntity;
import com.service.CaishileixingService;
import com.entity.vo.CaishileixingVO;
import com.entity.view.CaishileixingView;

@Service("caishileixingService")
public class CaishileixingServiceImpl extends ServiceImpl<CaishileixingDao, CaishileixingEntity> implements CaishileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaishileixingEntity> page = this.selectPage(
                new Query<CaishileixingEntity>(params).getPage(),
                new EntityWrapper<CaishileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaishileixingEntity> wrapper) {
		  Page<CaishileixingView> page =new Query<CaishileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaishileixingVO> selectListVO(Wrapper<CaishileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaishileixingVO selectVO(Wrapper<CaishileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaishileixingView> selectListView(Wrapper<CaishileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaishileixingView selectView(Wrapper<CaishileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

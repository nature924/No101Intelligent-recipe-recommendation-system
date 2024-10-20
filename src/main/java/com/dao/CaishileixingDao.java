package com.dao;

import com.entity.CaishileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaishileixingVO;
import com.entity.view.CaishileixingView;


/**
 * 菜式类型
 * 
 * @author 
 * @email 
 * @date 2023-04-25 08:11:08
 */
public interface CaishileixingDao extends BaseMapper<CaishileixingEntity> {
	
	List<CaishileixingVO> selectListVO(@Param("ew") Wrapper<CaishileixingEntity> wrapper);
	
	CaishileixingVO selectVO(@Param("ew") Wrapper<CaishileixingEntity> wrapper);
	
	List<CaishileixingView> selectListView(@Param("ew") Wrapper<CaishileixingEntity> wrapper);

	List<CaishileixingView> selectListView(Pagination page,@Param("ew") Wrapper<CaishileixingEntity> wrapper);
	
	CaishileixingView selectView(@Param("ew") Wrapper<CaishileixingEntity> wrapper);
	

}

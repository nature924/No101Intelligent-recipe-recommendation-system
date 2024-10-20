package com.dao;

import com.entity.CaipuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaipuxinxiVO;
import com.entity.view.CaipuxinxiView;


/**
 * 菜谱信息
 * 
 * @author 
 * @email 
 * @date 2023-04-25 08:11:08
 */
public interface CaipuxinxiDao extends BaseMapper<CaipuxinxiEntity> {
	
	List<CaipuxinxiVO> selectListVO(@Param("ew") Wrapper<CaipuxinxiEntity> wrapper);
	
	CaipuxinxiVO selectVO(@Param("ew") Wrapper<CaipuxinxiEntity> wrapper);
	
	List<CaipuxinxiView> selectListView(@Param("ew") Wrapper<CaipuxinxiEntity> wrapper);

	List<CaipuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CaipuxinxiEntity> wrapper);
	
	CaipuxinxiView selectView(@Param("ew") Wrapper<CaipuxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CaipuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CaipuxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CaipuxinxiEntity> wrapper);



}

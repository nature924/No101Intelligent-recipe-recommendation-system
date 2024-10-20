package com.dao;

import com.entity.PingfenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PingfenxinxiVO;
import com.entity.view.PingfenxinxiView;


/**
 * 评分信息
 * 
 * @author 
 * @email 
 * @date 2023-04-25 08:11:08
 */
public interface PingfenxinxiDao extends BaseMapper<PingfenxinxiEntity> {
	
	List<PingfenxinxiVO> selectListVO(@Param("ew") Wrapper<PingfenxinxiEntity> wrapper);
	
	PingfenxinxiVO selectVO(@Param("ew") Wrapper<PingfenxinxiEntity> wrapper);
	
	List<PingfenxinxiView> selectListView(@Param("ew") Wrapper<PingfenxinxiEntity> wrapper);

	List<PingfenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<PingfenxinxiEntity> wrapper);
	
	PingfenxinxiView selectView(@Param("ew") Wrapper<PingfenxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<PingfenxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<PingfenxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<PingfenxinxiEntity> wrapper);



}

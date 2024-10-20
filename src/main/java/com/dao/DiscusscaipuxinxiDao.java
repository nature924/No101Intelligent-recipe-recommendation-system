package com.dao;

import com.entity.DiscusscaipuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusscaipuxinxiVO;
import com.entity.view.DiscusscaipuxinxiView;


/**
 * 菜谱信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-04-25 08:11:09
 */
public interface DiscusscaipuxinxiDao extends BaseMapper<DiscusscaipuxinxiEntity> {
	
	List<DiscusscaipuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusscaipuxinxiEntity> wrapper);
	
	DiscusscaipuxinxiVO selectVO(@Param("ew") Wrapper<DiscusscaipuxinxiEntity> wrapper);
	
	List<DiscusscaipuxinxiView> selectListView(@Param("ew") Wrapper<DiscusscaipuxinxiEntity> wrapper);

	List<DiscusscaipuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusscaipuxinxiEntity> wrapper);
	
	DiscusscaipuxinxiView selectView(@Param("ew") Wrapper<DiscusscaipuxinxiEntity> wrapper);
	

}

package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PingfenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PingfenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PingfenxinxiView;


/**
 * 评分信息
 *
 * @author 
 * @email 
 * @date 2023-04-25 08:11:08
 */
public interface PingfenxinxiService extends IService<PingfenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PingfenxinxiVO> selectListVO(Wrapper<PingfenxinxiEntity> wrapper);
   	
   	PingfenxinxiVO selectVO(@Param("ew") Wrapper<PingfenxinxiEntity> wrapper);
   	
   	List<PingfenxinxiView> selectListView(Wrapper<PingfenxinxiEntity> wrapper);
   	
   	PingfenxinxiView selectView(@Param("ew") Wrapper<PingfenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PingfenxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<PingfenxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<PingfenxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<PingfenxinxiEntity> wrapper);



}


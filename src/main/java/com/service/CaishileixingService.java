package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaishileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaishileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaishileixingView;


/**
 * 菜式类型
 *
 * @author 
 * @email 
 * @date 2023-04-25 08:11:08
 */
public interface CaishileixingService extends IService<CaishileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaishileixingVO> selectListVO(Wrapper<CaishileixingEntity> wrapper);
   	
   	CaishileixingVO selectVO(@Param("ew") Wrapper<CaishileixingEntity> wrapper);
   	
   	List<CaishileixingView> selectListView(Wrapper<CaishileixingEntity> wrapper);
   	
   	CaishileixingView selectView(@Param("ew") Wrapper<CaishileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaishileixingEntity> wrapper);
   	

}


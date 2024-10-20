package com.entity.view;

import com.entity.CaishileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 菜式类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-25 08:11:08
 */
@TableName("caishileixing")
public class CaishileixingView  extends CaishileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaishileixingView(){
	}
 
 	public CaishileixingView(CaishileixingEntity caishileixingEntity){
 	try {
			BeanUtils.copyProperties(this, caishileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

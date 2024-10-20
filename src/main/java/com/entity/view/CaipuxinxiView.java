package com.entity.view;

import com.entity.CaipuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 菜谱信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-25 08:11:08
 */
@TableName("caipuxinxi")
public class CaipuxinxiView  extends CaipuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CaipuxinxiView(){
	}
 
 	public CaipuxinxiView(CaipuxinxiEntity caipuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, caipuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

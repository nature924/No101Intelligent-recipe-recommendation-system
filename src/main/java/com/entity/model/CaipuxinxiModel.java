package com.entity.model;

import com.entity.CaipuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 菜谱信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-04-25 08:11:08
 */
public class CaipuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 菜谱封面
	 */
	
	private String caipufengmian;
		
	/**
	 * 菜式类型
	 */
	
	private String caishileixing;
		
	/**
	 * 烹饪方式
	 */
	
	private String pengrenfangshi;
		
	/**
	 * 分数
	 */
	
	private Integer fenshu;
		
	/**
	 * 材料
	 */
	
	private String cailiao;
		
	/**
	 * 制作流程
	 */
	
	private String zhizuoliucheng;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：菜谱封面
	 */
	 
	public void setCaipufengmian(String caipufengmian) {
		this.caipufengmian = caipufengmian;
	}
	
	/**
	 * 获取：菜谱封面
	 */
	public String getCaipufengmian() {
		return caipufengmian;
	}
				
	
	/**
	 * 设置：菜式类型
	 */
	 
	public void setCaishileixing(String caishileixing) {
		this.caishileixing = caishileixing;
	}
	
	/**
	 * 获取：菜式类型
	 */
	public String getCaishileixing() {
		return caishileixing;
	}
				
	
	/**
	 * 设置：烹饪方式
	 */
	 
	public void setPengrenfangshi(String pengrenfangshi) {
		this.pengrenfangshi = pengrenfangshi;
	}
	
	/**
	 * 获取：烹饪方式
	 */
	public String getPengrenfangshi() {
		return pengrenfangshi;
	}
				
	
	/**
	 * 设置：分数
	 */
	 
	public void setFenshu(Integer fenshu) {
		this.fenshu = fenshu;
	}
	
	/**
	 * 获取：分数
	 */
	public Integer getFenshu() {
		return fenshu;
	}
				
	
	/**
	 * 设置：材料
	 */
	 
	public void setCailiao(String cailiao) {
		this.cailiao = cailiao;
	}
	
	/**
	 * 获取：材料
	 */
	public String getCailiao() {
		return cailiao;
	}
				
	
	/**
	 * 设置：制作流程
	 */
	 
	public void setZhizuoliucheng(String zhizuoliucheng) {
		this.zhizuoliucheng = zhizuoliucheng;
	}
	
	/**
	 * 获取：制作流程
	 */
	public String getZhizuoliucheng() {
		return zhizuoliucheng;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}

package org.crazyit.app.service.impl;

import org.springframework.beans.factory.DisposableBean;

import org.crazyit.app.service.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Chinese implements Person,DisposableBean
{
	private Axe axe;
	public Chinese()
	{
		System.out.println("Spring实例化主调bean：Chinese实例...");
	}
	public void setAxe(Axe axe)
	{
		System.out.println("Spring执行依赖关系注入...");
		this.axe = axe;
	}
	public void useAxe()
	{
		System.out.println(axe.chop());
	}
	public void close()
	{
		System.out.println("正在执行销毁之前的方法 close...");
	}
	public void destroy() throws Exception
	{
		System.out.println("正在执行销毁之前的方法 destroy...");
	}
}
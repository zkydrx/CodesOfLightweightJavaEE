package org.crazyit.hrsystem.dao;

import java.util.*;

import org.crazyit.common.dao.BaseDao;
import org.crazyit.hrsystem.domain.*;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public interface AttendDao extends BaseDao<Attend>
{
	/**
	 * ����Ա�����·ݲ�ѯ��Ա���ĳ��ڼ�¼
	 * @param emp Ա��
	 * @param month �·ݣ��·�������"2012-02"��ʽ���ַ���
	 * @return ��Ա����ָ���·ݵ�ȫ�����ڼ�¼
	 */
	List<Attend> findByEmpAndMonth(Employee emp , String month);

	/**
	 * ����Ա�������ڲ�ѯ��Ա���Ĵ򿨼�¼����
	 * @param emp Ա��
	 * @param dutyDay ����
	 * @return ��Ա����ĳ��Ĵ򿨼�¼����
	 */
	List<Attend> findByEmpAndDutyDay(Employee emp
		, String dutyDay);

	/**
	 * ����Ա�������� �����°��ѯ��Ա���Ĵ򿨼�¼����
	 * @param emp Ա��
	 * @param dutyDay ����
	 * @param isCome �Ƿ��ϰ�
	 * @return ��Ա����ĳ���ϰ���°�Ĵ򿨼�¼
	 */
	Attend findByEmpAndDutyDayAndCome(Employee emp ,
		String dutyDay , boolean isCome);

	/**
	 * �鿴Ա��ǰ����ķ�������
	 * @param emp Ա��
	 * @return ��Ա����ǰ����ķ�������
	 */
	List<Attend> findByEmpUnAttend(Employee emp
		, AttendType type);
}
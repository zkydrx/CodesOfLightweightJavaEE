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
public class Test
{
	public static void main(String[] args)
	{
		// ����һ�����۲��߶���
		Product p = new Product("���ӻ�" , 176);
		// ���������۲��߶���
		NameObserver no = new NameObserver();
		PriceObserver po = new PriceObserver();
		// �򱻹۲������ע�������۲��߶���
		p.registObserver(no);
		p.registObserver(po);
		// �������setter�������ı�Product��name��price��Ա����
		p.setName("����");
		p.setPrice(345f);
	}
}
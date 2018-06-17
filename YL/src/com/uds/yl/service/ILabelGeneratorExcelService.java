package com.uds.yl.service;

import java.util.List;

import com.teamcenter.rac.commands.voidDS.VoidDigitalSignatureDataBean;
import com.teamcenter.rac.kernel.TCComponentItemRevision;
import com.uds.yl.bean.IndexItemBean;

public interface ILabelGeneratorExcelService {
	
	//��ȡ����BOM�µ����е�ָ����Ŀ
	List<IndexItemBean> getAllIndexItemBeanList(TCComponentItemRevision itemRev);
	
	//�½��Ŀյ��Ա�ǩ���ź�˳���ָ��Ϊ˳�򴴽�һ��List
	List<IndexItemBean> getSortedIndexItemBeanList();
	
	//�����е�ָ������кϲ�����洢�������ص�IndexItemBeanList��
	List<IndexItemBean> initSortedIndexItemBeanList(List<IndexItemBean> allIndexItemBeanList,List<IndexItemBean> sortedIndexItemBeanList);

	
	//��soretdIndexItemBean�ٽ��й���  ��������0��ֵ��ֵ��λ0
	void filterZero(List<IndexItemBean> sortedIndexItemBeanList);
	
	//�Ծ����ٽ�ֵ�����sortedIndexItemBean�������ǵ�NRVֵ
	void NRVCompute(List<IndexItemBean> sortedIndexItemBeanList);
}
package com.uds.yl.service;

import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;

import com.teamcenter.rac.kernel.TCComponentBOMLine;
import com.teamcenter.rac.kernel.TCComponentItemRevision;
import com.uds.yl.bean.MaterialaccBean;

public interface IAccessoriesTechStandardExcelService {
	//���ݰ汾��ȡTopLine
	public TCComponentBOMLine getTopBOMLine(TCComponentItemRevision itemRevision);
	//����topBomLine��ȡԭ�ϱ�׼ָ���BOM
	public List<TCComponentBOMLine> getmaterialIndexBomList(TCComponentBOMLine topBomLine);
	//���ݻ�ȡ��BOM��ȡ��׼ָ��Bean
	public void getIndexBeanList(List<TCComponentBOMLine> materialIndexBomList);
	//����ԭ��Excel
	public void DoIndexExcel(List<MaterialaccBean> tempList,Sheet sheet,int k,int j);

}
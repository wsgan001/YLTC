package com.uds.yl.service;

import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;

import com.teamcenter.rac.kernel.TCComponentBOMLine;
import com.teamcenter.rac.kernel.TCComponentItemRevision;
import com.uds.yl.bean.MaterialaccBean;

public interface IProductTechStandardExcelService {
	//���ݰ汾��ȡTopLine
	public TCComponentBOMLine getTopBOMLine(TCComponentItemRevision itemRevision);
	//����topBomLine��ȡԭ�ϱ�׼ָ���BOM
	public List<TCComponentBOMLine> getendProIndexBomList(TCComponentBOMLine topBomLine);
	//���ݻ�ȡ��BOM��ȡ��׼ָ��Bean
	public void getIndexBeanList(List<TCComponentBOMLine> endProIndexBomList);
	//����ԭ��Excel
	public void DoIndexExcel(List<MaterialaccBean> tempList,Sheet sheet,int k,int j);

}
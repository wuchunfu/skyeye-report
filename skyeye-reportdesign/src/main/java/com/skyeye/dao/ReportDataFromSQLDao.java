/*******************************************************************************
 * Copyright 卫志强 QQ：598748873@qq.com Inc. All rights reserved. 开源地址：https://gitee.com/doc_wei01/skyeye-report
 ******************************************************************************/

package com.skyeye.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * 
 * @ClassName: ReportDataFromJsonDao
 * @Description:
 * @author: skyeye云系列--卫志强
 * @date: 2021/6/03 23:19
 *   
 * @Copyright: 2021 https://gitee.com/doc_wei01/skyeye-report Inc. All rights reserved.
 * 注意：本内容具体规则请参照readme执行，地址：https://gitee.com/doc_wei01/skyeye-report/blob/master/README.md
 */
public interface ReportDataFromSQLDao {

    void insertReportDataFromSQL(Map<String, Object> map);

    String selectSqlIdByFromId(@Param("fromId") String fromId);

    Map<String, Object> selectReportDataFromSQLByFromId(@Param("fromId") String fromId);

    void delReportDataFromSQLById(@Param("id") String id);

    void updateReportDataFromSQLById(Map<String, Object> map);

}
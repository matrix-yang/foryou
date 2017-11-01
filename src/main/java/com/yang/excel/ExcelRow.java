package com.yang.excel;

import java.util.Date;

/**
 * Created by Administrator on 2017/10/10.
 */

public class ExcelRow {
    private String procice;         // 所属省
    private String city;            //所属市
    private String area;            //所属区
    private String projectCode;     //项目代码
    private String projectName;     //项目名称
    private int upYear;             //上报年份
    private int upMonth;            //上报月份
    private float designScale;      //设计规模  (万立方米/日)
    private float sumDeal;          //累计处理水量 (万立方米)
    private float maxDay;           //最高日处理量 (万立方米)
    private float loadRate;         //负荷率   ( % )
    private float CODCutCap;        //COD削减能力 (吨/日)
    private float CODCutAmo;        //COD削减量   ( 吨 )
    private float avgCODCutCap;     //吨水COD削减能力  (公斤/立方米)
    private float avgCODCutAmo;     //吨水削减量 (公斤/立方米)
    private float useEnergy;        //累计用电量  (千瓦.时)
    private float cost;             //直接成本  (元/立方米)
    private float reuseWater;       //再生水利用量 (万立方米)
    private float sumSludge;        //累计湿污泥产生量  ( 吨 )
    private float moisture;         //污泥含水率  ( % )
    private float dealSludge;       //污泥处理量 (吨)
    private float landUse;          //土地利用量 (吨)
    private float buildUse;         //建材利用量 (吨)
    private float burnUse;          //焚烧利用量 (吨)
    private float fillUse;          //卫生填埋量 (吨)
    private float otherUse;         //其他处置量 (吨)
    private float runDays;          //正常运行天数
    private float standardDays;     //达标排放天数
    private String badReason;       //不达标原因
    private String badItem;         //超标项目
    private float CODIn;            //COD进水 ( mg/L )
    private float CODOut;           //COD出水 ( mg/L )
    private float BODIn;            //...
    private float BODOut;           //...
    private float SSIn;             //
    private float SSOut;            //
    private float ADIn;             //
    private float ADOut;            //
    private float TNIn;             //
    private float TNOut;            //
    private float TPIn;             //
    private float TPOut;            //
    private String describe;        //备注
    private String reporter;        //填报人
    private String reportDate;      //填报日期
    private Date  sysDate;          //excel录入数据库时间


    public String getProcice() {
        return procice;
    }

    public void setProcice(String procice) {
        this.procice = procice;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getUpYear() {
        return upYear;
    }

    public void setUpYear(int upYear) {
        this.upYear = upYear;
    }

    public int getUpMonth() {
        return upMonth;
    }

    public void setUpMonth(int upMonth) {
        this.upMonth = upMonth;
    }

    public float getDesignScale() {
        return designScale;
    }

    public void setDesignScale(float designScale) {
        this.designScale = designScale;
    }

    public float getSumDeal() {
        return sumDeal;
    }

    public void setSumDeal(float sumDeal) {
        this.sumDeal = sumDeal;
    }

    public float getMaxDay() {
        return maxDay;
    }

    public void setMaxDay(float maxDay) {
        this.maxDay = maxDay;
    }

    public float getLoadRate() {
        return loadRate;
    }

    public void setLoadRate(float loadRate) {
        this.loadRate = loadRate;
    }

    public float getCODCutCap() {
        return CODCutCap;
    }

    public void setCODCutCap(float CODCutCap) {
        this.CODCutCap = CODCutCap;
    }

    public float getCODCutAmo() {
        return CODCutAmo;
    }

    public void setCODCutAmo(float CODCutAmo) {
        this.CODCutAmo = CODCutAmo;
    }

    public float getAvgCODCutCap() {
        return avgCODCutCap;
    }

    public void setAvgCODCutCap(float avgCODCutCap) {
        this.avgCODCutCap = avgCODCutCap;
    }

    public float getAvgCODCutAmo() {
        return avgCODCutAmo;
    }

    public void setAvgCODCutAmo(float avgCODCutAmo) {
        this.avgCODCutAmo = avgCODCutAmo;
    }

    public float getUseEnergy() {
        return useEnergy;
    }

    public void setUseEnergy(float useEnergy) {
        this.useEnergy = useEnergy;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getReuseWater() {
        return reuseWater;
    }

    public void setReuseWater(float reuseWater) {
        this.reuseWater = reuseWater;
    }

    public float getSumSludge() {
        return sumSludge;
    }

    public void setSumSludge(float sumSludge) {
        this.sumSludge = sumSludge;
    }

    public float getMoisture() {
        return moisture;
    }

    public void setMoisture(float moisture) {
        this.moisture = moisture;
    }

    public float getDealSludge() {
        return dealSludge;
    }

    public void setDealSludge(float dealSludge) {
        this.dealSludge = dealSludge;
    }

    public float getLandUse() {
        return landUse;
    }

    public void setLandUse(float landUse) {
        this.landUse = landUse;
    }

    public float getBuildUse() {
        return buildUse;
    }

    public void setBuildUse(float buildUse) {
        this.buildUse = buildUse;
    }

    public float getBurnUse() {
        return burnUse;
    }

    public void setBurnUse(float burnUse) {
        this.burnUse = burnUse;
    }

    public float getFillUse() {
        return fillUse;
    }

    public void setFillUse(float fillUse) {
        this.fillUse = fillUse;
    }

    public float getOtherUse() {
        return otherUse;
    }

    public void setOtherUse(float otherUse) {
        this.otherUse = otherUse;
    }

    public float getRunDays() {
        return runDays;
    }

    public void setRunDays(float runDays) {
        this.runDays = runDays;
    }

    public float getStandardDays() {
        return standardDays;
    }

    public void setStandardDays(float standardDays) {
        this.standardDays = standardDays;
    }

    public String getBadReason() {
        return badReason;
    }

    public void setBadReason(String badReason) {
        this.badReason = badReason;
    }

    public String getBadItem() {
        return badItem;
    }

    public void setBadItem(String badItem) {
        this.badItem = badItem;
    }

    public float getCODIn() {
        return CODIn;
    }

    public void setCODIn(float CODIn) {
        this.CODIn = CODIn;
    }

    public float getCODOut() {
        return CODOut;
    }

    public void setCODOut(float CODOut) {
        this.CODOut = CODOut;
    }

    public float getBODIn() {
        return BODIn;
    }

    public void setBODIn(float BODIn) {
        this.BODIn = BODIn;
    }

    public float getBODOut() {
        return BODOut;
    }

    public void setBODOut(float BODOut) {
        this.BODOut = BODOut;
    }

    public float getSSIn() {
        return SSIn;
    }

    public void setSSIn(float SSIn) {
        this.SSIn = SSIn;
    }

    public float getSSOut() {
        return SSOut;
    }

    public void setSSOut(float SSOut) {
        this.SSOut = SSOut;
    }

    public float getADIn() {
        return ADIn;
    }

    public void setADIn(float ADIn) {
        this.ADIn = ADIn;
    }

    public float getADOut() {
        return ADOut;
    }

    public void setADOut(float ADOut) {
        this.ADOut = ADOut;
    }

    public float getTNIn() {
        return TNIn;
    }

    public void setTNIn(float TNIn) {
        this.TNIn = TNIn;
    }

    public float getTNOut() {
        return TNOut;
    }

    public void setTNOut(float TNOut) {
        this.TNOut = TNOut;
    }

    public float getTPIn() {
        return TPIn;
    }

    public void setTPIn(float TPIn) {
        this.TPIn = TPIn;
    }

    public float getTPOut() {
        return TPOut;
    }

    public void setTPOut(float TPOut) {
        this.TPOut = TPOut;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public Date getSysDate() {
        return sysDate;
    }

    public void setSysDate(Date sysDate) {
        this.sysDate = sysDate;
    }
}

package cn.stylefeng.guns.modular.system.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 自检任务结果(机车轴箱产线)
 * </p>
 *
 * @author stylefeng
 * @since 2019-01-19
 */
@TableName("JCZX_CHKBILL_MES")
public class JczxChkbillMes extends Model<JczxChkbillMes> {

    private static final long serialVersionUID = 1L;

    /**
     * 自检任务结果
     */
    @TableField("GID")
    private String gid;
    /**
     * 检测单据号
     */
    @TableField("CODE")
    private String code;
    /**
     * 派工单编号
     */
    @TableField("DISPATCH_CODE")
    private String dispatchCode;
    /**
     * 产品名称
     */
    @TableField("PRODUCT_NAME")
    private String productName;
    /**
     * 产品编码
     */
    @TableField("PRODU_UID")
    private String produUid;
    /**
     * 工序名称
     */
    @TableField("OP_NAME")
    private String opName;
    /**
     * 工序编号
     */
    @TableField("OP_CODE")
    private String opCode;
    /**
     * 工位编号
     */
    @TableField("WORKSTATION_CODE")
    private String workstationCode;
    /**
     * 单据检测结果(0未判定、1不合格、7合格)
     */
    @TableField("RESULT")
    private Integer result;
    /**
     * 检测项编码
     */
    @TableField("CITEM_CODE")
    private String citemCode;
    /**
     * 检测项名称
     */
    @TableField("CITEM_NAME")
    private String citemName;
    /**
     * 检测项说明
     */
    @TableField("CITEM_REMARK")
    private String citemRemark;
    /**
     * 检测项类型(0定性检测1定量检测2装配信息)
     */
    @TableField("CHECK_MODEL")
    private Integer checkModel;
    /**
     * 标准值（1定量检测）
     */
    @TableField("STANDARD_VALUE")
    private Double standardValue;
    /**
     * 控制下限（1定量检测）
     */
    @TableField("MIN_VALUE")
    private Double minValue;
    /**
     * 控制上限（1定量检测）
     */
    @TableField("MAX_VALUE")
    private Double maxValue;
    /**
     * 控制上限（1定量检测）
     */
    @TableField("CHK_VALUE")
    private String chkValue;
    /**
     * 控制上限（1定量检测）
     */
    @TableField("CHK_RESULT")
    private Integer chkResult;
    /**
     * 备注（2装配信息-填写序列号）
     */
    @TableField("REMARK")
    private String remark;
    /**
     * 处理人工号
     */
    @TableField("PROCESSER")
    private String processer;
    /**
     * 处理时间
     */
    @TableField("PROCESS_DATE")
    private Date processDate;
    /**
     * 特殊编码
     */
    @TableField("SPECIAL_CODE")
    private String specialCode;
    /**
     * 检测项分组
     */
    @TableField("CHECK_GROUP")
    private String checkGroup;
    /**
     * 标志位
     */
    @TableField("FLAG")
    private Double flag;
    @TableField("FILE_CONTENT")
    private Object fileContent;


    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDispatchCode() {
        return dispatchCode;
    }

    public void setDispatchCode(String dispatchCode) {
        this.dispatchCode = dispatchCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProduUid() {
        return produUid;
    }

    public void setProduUid(String produUid) {
        this.produUid = produUid;
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName;
    }

    public String getOpCode() {
        return opCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }

    public String getWorkstationCode() {
        return workstationCode;
    }

    public void setWorkstationCode(String workstationCode) {
        this.workstationCode = workstationCode;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getCitemCode() {
        return citemCode;
    }

    public void setCitemCode(String citemCode) {
        this.citemCode = citemCode;
    }

    public String getCitemName() {
        return citemName;
    }

    public void setCitemName(String citemName) {
        this.citemName = citemName;
    }

    public String getCitemRemark() {
        return citemRemark;
    }

    public void setCitemRemark(String citemRemark) {
        this.citemRemark = citemRemark;
    }

    public Integer getCheckModel() {
        return checkModel;
    }

    public void setCheckModel(Integer checkModel) {
        this.checkModel = checkModel;
    }

    public Double getStandardValue() {
        return standardValue;
    }

    public void setStandardValue(Double standardValue) {
        this.standardValue = standardValue;
    }

    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public String getChkValue() {
        return chkValue;
    }

    public void setChkValue(String chkValue) {
        this.chkValue = chkValue;
    }

    public Integer getChkResult() {
        return chkResult;
    }

    public void setChkResult(Integer chkResult) {
        this.chkResult = chkResult;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getProcesser() {
        return processer;
    }

    public void setProcesser(String processer) {
        this.processer = processer;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public String getSpecialCode() {
        return specialCode;
    }

    public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode;
    }

    public String getCheckGroup() {
        return checkGroup;
    }

    public void setCheckGroup(String checkGroup) {
        this.checkGroup = checkGroup;
    }

    public Double getFlag() {
        return flag;
    }

    public void setFlag(Double flag) {
        this.flag = flag;
    }

    public Object getFileContent() {
        return fileContent;
    }

    public void setFileContent(Object fileContent) {
        this.fileContent = fileContent;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "JczxChkbillMes{" +
        ", gid=" + gid +
        ", code=" + code +
        ", dispatchCode=" + dispatchCode +
        ", productName=" + productName +
        ", produUid=" + produUid +
        ", opName=" + opName +
        ", opCode=" + opCode +
        ", workstationCode=" + workstationCode +
        ", result=" + result +
        ", citemCode=" + citemCode +
        ", citemName=" + citemName +
        ", citemRemark=" + citemRemark +
        ", checkModel=" + checkModel +
        ", standardValue=" + standardValue +
        ", minValue=" + minValue +
        ", maxValue=" + maxValue +
        ", chkValue=" + chkValue +
        ", chkResult=" + chkResult +
        ", remark=" + remark +
        ", processer=" + processer +
        ", processDate=" + processDate +
        ", specialCode=" + specialCode +
        ", checkGroup=" + checkGroup +
        ", flag=" + flag +
        ", fileContent=" + fileContent +
        "}";
    }
}

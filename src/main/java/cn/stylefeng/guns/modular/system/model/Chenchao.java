package cn.stylefeng.guns.modular.system.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import com.baomidou.mybatisplus.incrementer.OracleKeyGenerator;

/**
 * <p>
 * 个人信息
 * </p>
 *
 * @author stylefeng
 * @since 2018-12-28
 */
@TableName("CHENCHAO")
public class Chenchao extends Model<Chenchao> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("ID")
    private String id;
    /**
     * NAME
     */
    @TableField("NAME")
    private String name;
    /**
     * DESC
     */
    @TableField("DESCRIPTION")
    private String description;
    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;
    /**
     * 部门ID
     */
    @TableField("DEPT_ID")
    private String deptId;
    /**
     * 登陆用户
     */
    @TableField("LOGIN_USER")
    private String loginUser;
    /**
     * 用户名
     */
    @TableField("USER_NAME")
    private String userName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Chenchao{" +
        ", id=" + id +
        ", name=" + name +
        ", description=" + description +
        ", createTime=" + createTime +
        ", deptId=" + deptId +
        ", loginUser=" + loginUser +
        ", userName=" + userName +
        "}";
    }
}

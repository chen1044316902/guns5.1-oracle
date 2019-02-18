/**
 * 初始化bill详情对话框
 */
var JczxChkbillMesInfoDlg = {
    jczxChkbillMesInfoData : {}
};

/**
 * 清除数据
 */
JczxChkbillMesInfoDlg.clearData = function() {
    this.jczxChkbillMesInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
JczxChkbillMesInfoDlg.set = function(key, val) {
    this.jczxChkbillMesInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
JczxChkbillMesInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
JczxChkbillMesInfoDlg.close = function() {
    parent.layer.close(window.parent.JczxChkbillMes.layerIndex);
}

/**
 * 收集数据
 */
JczxChkbillMesInfoDlg.collectData = function() {
    this
    .set('gid')
    .set('code')
    .set('dispatchCode')
    .set('productName')
    .set('produUid')
    .set('opName')
    .set('opCode')
    .set('workstationCode')
    .set('result')
    .set('citemCode')
    .set('citemName')
    .set('citemRemark')
    .set('checkModel')
    .set('standardValue')
    .set('minValue')
    .set('maxValue')
    .set('chkValue')
    .set('chkResult')
    .set('remark')
    .set('processer')
    .set('processDate')
    .set('specialCode')
    .set('checkGroup')
    .set('flag')
    .set('fileContent');
}

/**
 * 提交添加
 */
JczxChkbillMesInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/jczxChkbillMes/add", function(data){
        Feng.success("添加成功!");
        window.parent.JczxChkbillMes.table.refresh();
        JczxChkbillMesInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.jczxChkbillMesInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
JczxChkbillMesInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/jczxChkbillMes/update", function(data){
        Feng.success("修改成功!");
        window.parent.JczxChkbillMes.table.refresh();
        JczxChkbillMesInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.jczxChkbillMesInfoData);
    ajax.start();
}

$(function() {

});

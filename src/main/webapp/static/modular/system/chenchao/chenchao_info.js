/**
 * 初始化陈超详情对话框
 */
var ChenchaoInfoDlg = {
    chenchaoInfoData : {}
};

/**
 * 清除数据
 */
ChenchaoInfoDlg.clearData = function() {
    this.chenchaoInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
ChenchaoInfoDlg.set = function(key, val) {
    this.chenchaoInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
ChenchaoInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
ChenchaoInfoDlg.close = function() {
    parent.layer.close(window.parent.Chenchao.layerIndex);
}

/**
 * 收集数据
 */
ChenchaoInfoDlg.collectData = function() {
    this
    .set('id')
    .set('name')
    .set('description')
    .set('createTime')
    .set('deptId')
    .set('loginUser')
    .set('userName');
}

/**
 * 提交添加
 */
ChenchaoInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/chenchao/add", function(data){
        Feng.success("添加成功!");
        window.parent.Chenchao.table.refresh();
        ChenchaoInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.chenchaoInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
ChenchaoInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/chenchao/update", function(data){
        Feng.success("修改成功!");
        window.parent.Chenchao.table.refresh();
        ChenchaoInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.chenchaoInfoData);
    ajax.start();
}

$(function() {

});

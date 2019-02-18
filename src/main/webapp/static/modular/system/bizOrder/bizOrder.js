/**
 * 管理初始化
 */
var BizOrder = {
    id: "BizOrderTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
BizOrder.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: '主键id', field: 'id', visible: true, align: 'center', valign: 'middle'},
            {title: '状态', field: 'state', visible: true, align: 'center', valign: 'middle'},
            {title: '标志位', field: 'flag', visible: true, align: 'center', valign: 'middle'},
            {title: '计划编号', field: 'plancode', visible: true, align: 'center', valign: 'middle'},
            {title: '工单编号', field: 'ordercode', visible: true, align: 'center', valign: 'middle'},
            {title: '操作人员', field: 'operater', visible: true, align: 'center', valign: 'middle'},
            {title: '保留字段(暂时没用）', field: 'version', visible: true, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
BizOrder.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        BizOrder.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加
 */
BizOrder.openAddBizOrder = function () {
    var index = layer.open({
        type: 2,
        title: '添加',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/bizOrder/bizOrder_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看详情
 */
BizOrder.openBizOrderDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/bizOrder/bizOrder_update/' + BizOrder.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除
 */
BizOrder.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/bizOrder/delete", function (data) {
            Feng.success("删除成功!");
            BizOrder.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("bizOrderId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询列表
 */
BizOrder.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    BizOrder.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = BizOrder.initColumn();
    var table = new BSTable(BizOrder.id, "/bizOrder/list", defaultColunms);
    table.setPaginationType("client");
    BizOrder.table = table.init();
});

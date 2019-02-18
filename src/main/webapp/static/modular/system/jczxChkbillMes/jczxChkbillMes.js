/**
 * bill管理初始化
 */
var JczxChkbillMes = {
    id: "JczxChkbillMesTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
JczxChkbillMes.initColumn = function () {
    return [
        {field: 'selectItem', checkbox: true},
              	{title: '自检任务结果', field: 'gid', visible: true, align: 'center', valign: 'middle'},
              	{title: '检测单据号', field: 'code', visible: true, align: 'center', valign: 'middle'},
              	{title: '派工单编号', field: 'dispatchCode', visible: true, align: 'center', valign: 'middle'},
              	{title: '产品名称', field: 'productName', visible: true, align: 'center', valign: 'middle'},
              	{title: '产品编码', field: 'produUid', visible: true, align: 'center', valign: 'middle'},
              	{title: '工序名称', field: 'opName', visible: true, align: 'center', valign: 'middle'},
              	{title: '工序编号', field: 'opCode', visible: true, align: 'center', valign: 'middle'},
              	{title: '工位编号', field: 'workstationCode', visible: true, align: 'center', valign: 'middle'},
              	{title: '单据检测结果(0未判定、1不合格、7合格)', field: 'result', visible: true, align: 'center', valign: 'middle'},
              	{title: '检测项编码', field: 'citemCode', visible: true, align: 'center', valign: 'middle'},
              	{title: '检测项名称', field: 'citemName', visible: true, align: 'center', valign: 'middle'},
              	{title: '检测项说明', field: 'citemRemark', visible: true, align: 'center', valign: 'middle'},
              	{title: '检测项类型(0定性检测1定量检测2装配信息)', field: 'checkModel', visible: true, align: 'center', valign: 'middle'},
              	{title: '标准值（1定量检测）', field: 'standardValue', visible: true, align: 'center', valign: 'middle'},
              	{title: '控制下限（1定量检测）', field: 'minValue', visible: true, align: 'center', valign: 'middle'},
              	{title: '控制上限（1定量检测）', field: 'maxValue', visible: true, align: 'center', valign: 'middle'},
              	{title: '控制上限（1定量检测）', field: 'chkValue', visible: true, align: 'center', valign: 'middle'},
              	{title: '控制上限（1定量检测）', field: 'chkResult', visible: true, align: 'center', valign: 'middle'},
              	{title: '备注（2装配信息-填写序列号）', field: 'remark', visible: true, align: 'center', valign: 'middle'},
              	{title: '处理人工号', field: 'processer', visible: true, align: 'center', valign: 'middle'},
              	{title: '处理时间', field: 'processDate', visible: true, align: 'center', valign: 'middle'},
              	{title: '特殊编码', field: 'specialCode', visible: true, align: 'center', valign: 'middle'},
              	{title: '检测项分组', field: 'checkGroup', visible: true, align: 'center', valign: 'middle'},
              	{title: '标志位', field: 'flag', visible: true, align: 'center', valign: 'middle'},
       			{title: '', field: 'fileContent', visible: true, align: 'center', valign: 'middle'},
    ];
};

/**
 * 检查是否选中
 */
JczxChkbillMes.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        JczxChkbillMes.seItem = selected;
        return true;
    }
};

/**
 * 点击添加bill
 */
JczxChkbillMes.openAddJczxChkbillMes = function () {
    var index = layer.open({
        type: 2,
        title: '添加bill',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/jczxChkbillMes/jczxChkbillMes_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看bill修改
 */
JczxChkbillMes.openJczxChkbillMesDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: 'bill详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/jczxChkbillMes/jczxChkbillMes_update/' + JczxChkbillMes.seItem[0].id
        });
        this.layerIndex = index;
    }
};
/**
 * 打开查看bill详情
 */
JczxChkbillMes.detail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: 'bill详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/jczxChkbillMes/jczxChkbillMes_detail/' + JczxChkbillMes.seItem[0].id
        });
        this.layerIndex = index;
    }
};


/**
 * 删除bill
 */
JczxChkbillMes.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/jczxChkbillMes/delete", function (data) {
            Feng.success("删除成功!");
            JczxChkbillMes.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        for(var i=0;i<this.seItem.length;i++){
	        ajax.set("jczxChkbillMesId",this.seItem[i].id);
        	ajax.start();
        }
    }
};

/**
 * 查询bill列表
 */
JczxChkbillMes.search = function () {
    var queryData = {};
  	 	queryData['gid'] = $("#gid").val();
   
  	 	queryData['code'] = $("#code").val();
   
  	 	queryData['dispatchCode'] = $("#dispatchCode").val();
   
  	 	queryData['productName'] = $("#productName").val();
   
  	 	queryData['produUid'] = $("#produUid").val();
   
  	 	queryData['opName'] = $("#opName").val();
   
  	 	queryData['opCode'] = $("#opCode").val();
   
  	 	queryData['workstationCode'] = $("#workstationCode").val();
   
  	 	queryData['result'] = $("#result").val();
   
  	 	queryData['citemCode'] = $("#citemCode").val();
   
  	 	queryData['citemName'] = $("#citemName").val();
   
  	 	queryData['citemRemark'] = $("#citemRemark").val();
   
  	 	queryData['checkModel'] = $("#checkModel").val();
   
  	 	queryData['standardValue'] = $("#standardValue").val();
   
  	 	queryData['minValue'] = $("#minValue").val();
   
  	 	queryData['maxValue'] = $("#maxValue").val();
   
  	 	queryData['chkValue'] = $("#chkValue").val();
   
  	 	queryData['chkResult'] = $("#chkResult").val();
   
  	 	queryData['remark'] = $("#remark").val();
   
  	 	queryData['processer'] = $("#processer").val();
   
  	 	queryData['processDate'] = $("#processDate").val();
   
  	 	queryData['specialCode'] = $("#specialCode").val();
   
  	 	queryData['checkGroup'] = $("#checkGroup").val();
   
  	 	queryData['flag'] = $("#flag").val();
   
  	 	queryData['fileContent'] = $("#fileContent").val();
   

    
    JczxChkbillMes.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = JczxChkbillMes.initColumn();
    var table = new BSTable(JczxChkbillMes.id, "/jczxChkbillMes/list", defaultColunms);
    table.setPaginationType("client");
    JczxChkbillMes.table = table.init();
});

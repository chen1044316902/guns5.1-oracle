/**
 * 陈超管理初始化
 */
var Chenchao = {
    id: "ChenchaoTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
Chenchao.initColumn = function () {
    return [
        {field: 'selectItem', checkbox: true},
	         	{title: 'ID', field: 'id', visible: false, align: 'center', valign: 'middle'},
              	{title: 'NAME', field: 'name', visible: true, align: 'center', valign: 'middle'},
              	{title: 'DESC', field: 'description', visible: true, align: 'center', valign: 'middle'},
	         	{title: '创建时间', field: 'createTime', visible: false, align: 'center', valign: 'middle'},
	         	{title: '部门ID', field: 'deptId', visible: false, align: 'center', valign: 'middle'},
	         	{title: '登陆用户', field: 'loginUser', visible: false, align: 'center', valign: 'middle'},
       			
    ];
};

/**
 * 检查是否选中
 */
Chenchao.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        Chenchao.seItem = selected;
        return true;
    }
};

/**
 * 点击添加陈超
 */
Chenchao.openAddChenchao = function () {
    var index = layer.open({
        type: 2,
        title: '添加陈超',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/chenchao/chenchao_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看陈超修改
 */
Chenchao.openChenchaoDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '陈超详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/chenchao/chenchao_update/' + Chenchao.seItem[0].id
        });
        this.layerIndex = index;
    }
};
/**
 * 打开查看陈超详情
 */
Chenchao.detail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '陈超详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/chenchao/chenchao_detail/' + Chenchao.seItem[0].id
        });
        this.layerIndex = index;
    }
};


/**
 * 删除陈超
 */
Chenchao.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/chenchao/delete", function (data) {
            Feng.success("删除成功!");
            Chenchao.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        for(var i=0;i<this.seItem.length;i++){
	        ajax.set("chenchaoId",this.seItem[i].id);
        	ajax.start();
        }
    }
};

/**
 * 查询陈超列表
 */
Chenchao.search = function () {
    var queryData = {};
  	 	queryData['id'] = $("#id").val();
   
  	 	queryData['name'] = $("#name").val();
   
  	 	queryData['description'] = $("#description").val();
   
  	 	queryData['createTime'] = $("#createTime").val();
   
  	 	queryData['deptId'] = $("#deptId").val();
   
  	 	queryData['loginUser'] = $("#loginUser").val();
   
  	 	queryData['userName'] = $("#userName").val();
   

    
    Chenchao.table.refresh({query: queryData});
};
Chenchao.param = function () {
    var queryData = {};
  	 	queryData['id'] = $("#id").val();
   
  	 	queryData['name'] = $("#name").val();
   
  	 	queryData['description'] = $("#description").val();
   
  	 	queryData['createTime'] = $("#createTime").val();
   
  	 	queryData['deptId'] = $("#deptId").val();
   
  	 	queryData['loginUser'] = $("#loginUser").val();
   
  	 	queryData['userName'] = $("#userName").val();
  	  return queryData;

    
};

$(function () {
    var defaultColunms = Chenchao.initColumn();
    var table = new BSTable(Chenchao.id, "/chenchao/list", defaultColunms);
    table.setPaginationType("server");
    table.setQueryParams(Chenchao.param());
    Chenchao.table = table.init();
});

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    
<% 
String basepath = request.getContextPath();  
session.setAttribute("basepath", basepath);
%> 
    
<script type="text/javascript" src="${basepath}/js/jquery-1.4.4.min.js"></script>

<link rel="stylesheet" href="${basepath}/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">  
<script type="text/javascript" src="${basepath}/ztree/js/jquery.ztree.core-3.5.min.js"></script>
<script type="text/javascript" src="${basepath}/ztree/js/jquery.ztree.excheck-3.5.min.js"></script>


<script type="text/javascript">
var zTree;
var setting = {
  view: {
    dblClickExpand: false,//双击节点时，是否自动展开父节点的标识
    showLine: true,//是否显示节点之间的连线
    fontCss:{'color':'black','font-weight':'bold'},//字体样式函数
    selectedMulti: false //设置是否允许同时选中多个节点
  },
  check:{
    //chkboxType: { "Y": "ps", "N": "ps" },
    chkStyle: "checkbox",//复选框类型
    enable: true //每个节点上是否显示 CheckBox 
  },
  data: {
    simpleData: {//简单数据模式
      enable:true,
      idKey: "id",
      pIdKey: "pId",
      rootPId: ""
    }
  },
  callback: {
    beforeClick: function(treeId, treeNode) {
      zTree = $.fn.zTree.getZTreeObj("user_tree");
      if (treeNode.isParent) {
        zTree.expandNode(treeNode);//如果是父节点，则展开该节点
      }else{
        zTree.checkNode(treeNode, !treeNode.checked, true, true);//单击勾选，再次单击取消勾选
      }
    }
  }
};
</script>


<script type="text/javascript">
/**
 * 页面初始化
 */
$(document).ready(function(){
  onLoadZTree();
});

/**
 * 加载树形结构数据
 */
function onLoadZTree(){
  var treeNodes;
  $.ajax({
    async:false,//是否异步
    cache:false,//是否使用缓存
    type:'POST',//请求方式：post
    dataType:'json',//数据传输格式：json
    url:"test/testTree.action",//请求的action路径
    error:function(){
      //请求失败处理函数
      alert('亲，请求失败！');
    },
    success:function(data){
      //console.log(data);
      //请求成功后处理函数
      treeNodes = data;//把后台封装好的简单Json格式赋给treeNodes
    }
  });
  
  var t = $("#user_tree");
  t = $.fn.zTree.init(t, setting, treeNodes);
}</script>


<script type="text/javascript">
	
 $(function() {  
	$.ajax({
		//url : 'http://localhost:8080/qqpay_project/user/userSelect.action',
		url : 'user/userSelect.action',
		type : 'POST',
		dataType : 'json',
		success : function(data) {
			//alert(data); 
			
			 $.each(data.list, function(i, user) {
		            $("#info").append(
		                    "<div>用户id：		" + user.userId + "</div>" + 
		                    "<div>用户名：		" + user.userName    + "</div>" +
		                    "<div>用户密码：	" + user.password    + "</div>" +
		                    "<div>登录错误次数：	" + user.operation_TIMES  + "</div>" +
		                    "<div>用户角色：	" + user.role_name + "</div><hr/>");
		        });
		},
		error : function(msg) {
			alert('加载异常!');
		}
	});
	}); 
	
 
/* function submitUserInfo (){
	
	$('#findUserInfoById').submit();
}; */

 

function submitUserInfo (){
	
	$.ajax({
		//url : 'http://localhost:8080/qqpay_project/user/userSelect.action',
		url : 'user/userSelect.action',
		type : 'POST',
		data:$('#findUserInfoById').serialize(),// 你的formid
		dataType : 'json',
		success : function(data) {
			//alert(data); 
			 $("#info").empty();
			 
			 $.each(data.list, function(i, user) {
					 
		            $("#info").append(
		                    "<div>用户id：		" + user.userId + "</div>" + 
		                    "<div>用户名：		" + user.userName    + "</div>" +
		                    "<div>用户密码：	" + user.password    + "</div>" +
		                    "<div>登录错误次数：	" + user.operation_TIMES  + "</div>" +
		                    "<div>用户角色：	" + user.role_name + "</div><hr/>");
		        });
		},
		error : function(msg) {
			alert('加载异常!');
		}
	});
};
 
  
	
	 
	
 

</script>

<html>
<body>
<h2>user select test</h2>

basepath= ${basepath}
 
 

<div id="info"></div>


<form id="findUserInfoById"action="user/userSelect.action" method="get">
	输入id查找用户信息<br>
	<input type="text" name="userId"><br>
	<input type="button" id="findUserInfoByIdSubmit" value="查找用户" onclick="submitUserInfo()"><br>

</form>



<div class="zTreeDemoBackground left">
    <ul id="user_tree" class="ztree" style="border: 1px solid #617775;overflow-y: scroll;height: 500px;"></ul>
  </div>


</body>
</html>

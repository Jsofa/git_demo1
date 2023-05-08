$.ajax({
    url:'dataListServlet?department='+department+'&gender='+gender,
    type:'GET',
    contentType : false,
    processData : false,
    cache : false,
    success : function(data) {
        if(data){

        }else{
            alert("查询失败");
        }
    }
});
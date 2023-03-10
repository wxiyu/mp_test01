/*js中的函数*/

//定义函数
function test1(){

}
var test2 = function (num1,num2){

}
//箭头函数
var test3 = (num1,num2) =>{

}

/*js中的json对象*/
var stu = {
    name: "zhangzhen",
    age:20,
    say:function (){
        console.log("---"+this.name)//注意this不能省略
    }
}

var stus = [{name:"lisi"},{name:"wangwu"},{name:"zhaoliu"}];

var stu1 = {name:"zhangsan"}

var str = JOSN.stringify(stu1);//将json对象转换为json字符串
var str2 = JSON.parse(str);//再将json字符串转换为json对象

/*js数组*/
var a =[];
a.push("zhangsan");//放数据
a.pop();//从数组里面取数据
a.splice(2,1);//第一个参数是下标，第二个参数是移除几个
a.forEach(function (value,idnex){
    console.log("下标:"+index+",值："+value)
})

(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-489b19aa"],{2423:function(t,e,a){"use strict";a.d(e,"c",function(){return n}),a.d(e,"b",function(){return l}),a.d(e,"d",function(){return r}),a.d(e,"a",function(){return o}),a.d(e,"e",function(){return s});var i=a("b775");function n(t){return Object(i["a"])({url:"/article/list",method:"get",params:t})}function l(t){return Object(i["a"])({url:"/article/detail",method:"get",params:{id:t}})}function r(t){return Object(i["a"])({url:"/article/pv",method:"get",params:{pv:t}})}function o(t){return Object(i["a"])({url:"/article/create",method:"post",data:t})}function s(t){return Object(i["a"])({url:"/article/update",method:"post",data:t})}},"31b2":function(t,e,a){"use strict";var i=a("7328"),n=a.n(i);n.a},"333d":function(t,e,a){"use strict";var i=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"pagination-container",class:{hidden:t.hidden}},[a("el-pagination",t._b({attrs:{background:t.background,"current-page":t.currentPage,"page-size":t.pageSize,layout:t.layout,"page-sizes":t.pageSizes,total:t.total},on:{"update:currentPage":function(e){t.currentPage=e},"update:current-page":function(e){t.currentPage=e},"update:pageSize":function(e){t.pageSize=e},"update:page-size":function(e){t.pageSize=e},"size-change":t.handleSizeChange,"current-change":t.handleCurrentChange}},"el-pagination",t.$attrs,!1))],1)},n=[];a("c5f6");Math.easeInOutQuad=function(t,e,a,i){return t/=i/2,t<1?a/2*t*t+e:(t--,-a/2*(t*(t-2)-1)+e)};var l=function(){return window.requestAnimationFrame||window.webkitRequestAnimationFrame||window.mozRequestAnimationFrame||function(t){window.setTimeout(t,1e3/60)}}();function r(t){document.documentElement.scrollTop=t,document.body.parentNode.scrollTop=t,document.body.scrollTop=t}function o(){return document.documentElement.scrollTop||document.body.parentNode.scrollTop||document.body.scrollTop}function s(t,e,a){var i=o(),n=t-i,s=20,u=0;e="undefined"===typeof e?500:e;var c=function t(){u+=s;var o=Math.easeInOutQuad(u,i,n,e);r(o),u<e?l(t):a&&"function"===typeof a&&a()};c()}var u={name:"Pagination",props:{total:{required:!0,type:Number},page:{type:Number,default:1},limit:{type:Number,default:20},pageSizes:{type:Array,default:function(){return[10,20,30,50]}},layout:{type:String,default:"total, sizes, prev, pager, next, jumper"},background:{type:Boolean,default:!0},autoScroll:{type:Boolean,default:!0},hidden:{type:Boolean,default:!1}},computed:{currentPage:{get:function(){return this.page},set:function(t){this.$emit("update:page",t)}},pageSize:{get:function(){return this.limit},set:function(t){this.$emit("update:limit",t)}}},methods:{handleSizeChange:function(t){this.$emit("pagination",{page:this.currentPage,limit:t}),this.autoScroll&&s(0,800)},handleCurrentChange:function(t){this.$emit("pagination",{page:t,limit:this.pageSize}),this.autoScroll&&s(0,800)}}},c=u,d=(a("6b95"),a("2877")),p=Object(d["a"])(c,i,n,!1,null,"0565df52",null);e["a"]=p.exports},"58f6":function(t,e,a){"use strict";a.r(e);var i=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"tab-container"},[a("el-tabs",{staticStyle:{"margin-top":"15px"},attrs:{type:"border-card"},model:{value:t.activeName,callback:function(e){t.activeName=e},expression:"activeName"}},t._l(t.tabMapOptions,function(e){return a("el-tab-pane",{key:e.key,attrs:{label:e.label,name:e.key}},[a("keep-alive",[t.activeName==e.key?a("tab-pane",{attrs:{type:e.key},on:{create:t.showCreatedTimes}}):t._e()],1)],1)}),1)],1)},n=[],l=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"app-container"},[a("el-table",{directives:[{name:"loading",rawName:"v-loading",value:t.listLoading,expression:"listLoading"}],key:t.tableKey,staticStyle:{width:"100%"},attrs:{data:t.list,border:"",fit:"","highlight-current-row":""},on:{"sort-change":t.sortChange}},[a("el-table-column",{attrs:{label:"商品昵称",width:"150px",align:"center"}},[void 0],2),t._v(" "),a("el-table-column",{attrs:{label:t.$t("table.id"),prop:"id",sortable:"custom",align:"center",width:"80"},scopedSlots:t._u([{key:"default",fn:function(e){return[a("span",[t._v(t._s(e.row.id))])]}}])}),t._v(" "),a("el-table-column",{attrs:{label:"评论时间",width:"150px",align:"center"},scopedSlots:t._u([{key:"default",fn:function(e){return[a("span",[t._v(t._s(t._f("parseTime")(e.row.timestamp,"{y}-{m}-{d} {h}:{i}")))])]}}])}),t._v(" "),a("el-table-column",{attrs:{label:"用户昵称","min-width":"110px"},scopedSlots:t._u([{key:"default",fn:function(e){var i=e.row;return[a("span",{staticClass:"link-type",on:{click:function(e){return t.handleUpdate(i)}}},[t._v(t._s(i.title))]),t._v(" "),a("el-tag",[t._v(t._s(t._f("typeFilter")(i.type)))])]}}])}),t._v(" "),a("el-table-column",{attrs:{label:"编辑",width:"110px",align:"center"}},[a("el-button",{attrs:{type:"primary",size:"mini"},on:{click:function(e){return t.handleUpdate(t.row)}}},[t._v("\n        "+t._s(t.$t("table.edit"))+"\n      ")])],1),t._v(" "),a("el-table-column",{attrs:{label:"删除",width:"80px"}},[a("el-button",{attrs:{size:"mini",type:"danger"},on:{click:function(e){return t.handleModifyStatus(t.row,"deleted")}}},[t._v("\n        "+t._s(t.$t("table.delete"))+"\n      ")])],1),t._v(" "),a("el-table-column",{attrs:{label:"详情",align:"center",width:"110px"}},[a("el-button",{attrs:{size:"mini"},on:{click:function(e){return t.handleModifyStatus(t.row,"draft")}}},[t._v("\n        查看详情\n      ")])],1)],1),t._v(" "),a("pagination",{directives:[{name:"show",rawName:"v-show",value:t.total>0,expression:"total>0"}],attrs:{total:t.total,page:t.listQuery.page,limit:t.listQuery.limit},on:{"update:page":function(e){return t.$set(t.listQuery,"page",e)},"update:limit":function(e){return t.$set(t.listQuery,"limit",e)},pagination:t.getList}}),t._v(" "),a("el-dialog",{attrs:{title:t.textMap[t.dialogStatus],visible:t.dialogFormVisible},on:{"update:visible":function(e){t.dialogFormVisible=e}}},[a("el-form",{ref:"dataForm",staticStyle:{width:"400px","margin-left":"50px"},attrs:{rules:t.rules,model:t.temp,"label-position":"left","label-width":"70px"}},[a("el-form-item",{attrs:{label:t.$t("table.type"),prop:"type"}},[a("el-select",{staticClass:"filter-item",attrs:{placeholder:"Please select"},model:{value:t.temp.type,callback:function(e){t.$set(t.temp,"type",e)},expression:"temp.type"}},t._l(t.calendarTypeOptions,function(t){return a("el-option",{key:t.key,attrs:{label:t.display_name,value:t.key}})}),1)],1),t._v(" "),a("el-form-item",{attrs:{label:t.$t("table.date"),prop:"timestamp"}},[a("el-date-picker",{attrs:{type:"datetime",placeholder:"Please pick a date"},model:{value:t.temp.timestamp,callback:function(e){t.$set(t.temp,"timestamp",e)},expression:"temp.timestamp"}})],1),t._v(" "),a("el-form-item",{attrs:{label:t.$t("table.title"),prop:"title"}},[a("el-input",{model:{value:t.temp.title,callback:function(e){t.$set(t.temp,"title",e)},expression:"temp.title"}})],1),t._v(" "),a("el-form-item",{attrs:{label:t.$t("table.status")}},[a("el-select",{staticClass:"filter-item",attrs:{placeholder:"Please select"},model:{value:t.temp.status,callback:function(e){t.$set(t.temp,"status",e)},expression:"temp.status"}},t._l(t.statusOptions,function(t){return a("el-option",{key:t,attrs:{label:t,value:t}})}),1)],1),t._v(" "),a("el-form-item",{attrs:{label:t.$t("table.importance")}},[a("el-rate",{staticStyle:{"margin-top":"8px"},attrs:{colors:["#99A9BF","#F7BA2A","#FF9900"],max:3},model:{value:t.temp.importance,callback:function(e){t.$set(t.temp,"importance",e)},expression:"temp.importance"}})],1),t._v(" "),a("el-form-item",{attrs:{label:t.$t("table.remark")}},[a("el-input",{attrs:{autosize:{minRows:2,maxRows:4},type:"textarea",placeholder:"Please input"},model:{value:t.temp.remark,callback:function(e){t.$set(t.temp,"remark",e)},expression:"temp.remark"}})],1)],1),t._v(" "),a("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[a("el-button",{on:{click:function(e){t.dialogFormVisible=!1}}},[t._v("\n        "+t._s(t.$t("table.cancel"))+"\n      ")]),t._v(" "),a("el-button",{attrs:{type:"primary"},on:{click:function(e){"create"===t.dialogStatus?t.createData():t.updateData()}}},[t._v("\n        "+t._s(t.$t("table.confirm"))+"\n      ")])],1)],1),t._v(" "),a("el-dialog",{attrs:{visible:t.dialogPvVisible,title:"Reading statistics"},on:{"update:visible":function(e){t.dialogPvVisible=e}}},[a("el-table",{staticStyle:{width:"100%"},attrs:{data:t.pvData,border:"",fit:"","highlight-current-row":""}},[a("el-table-column",{attrs:{prop:"key",label:"Channel"}}),t._v(" "),a("el-table-column",{attrs:{prop:"pv",label:"Pv"}})],1),t._v(" "),a("span",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[a("el-button",{attrs:{type:"primary"},on:{click:function(e){t.dialogPvVisible=!1}}},[t._v(t._s(t.$t("table.confirm")))])],1)],1)],1)},r=[],o=a("5d73"),s=a.n(o),u=a("5176"),c=a.n(u),d=a("e814"),p=a.n(d),m=a("2423"),f=a("6724"),h=a("ed08"),b=a("333d"),v=[{key:"CN",display_name:"China"},{key:"US",display_name:"USA"},{key:"JP",display_name:"Japan"},{key:"EU",display_name:"Eurozone"}],g=v.reduce(function(t,e){return t[e.key]=e.display_name,t},{}),y={name:"ComplexTable",components:{Pagination:b["a"]},directives:{waves:f["a"]},filters:{statusFilter:function(t){var e={published:"success",draft:"info",deleted:"danger"};return e[t]},typeFilter:function(t){return g[t]}},data:function(){return{tableKey:0,list:null,total:0,listLoading:!0,listQuery:{page:1,limit:20,importance:void 0,title:void 0,type:void 0,sort:"+id"},importanceOptions:[1,2,3],calendarTypeOptions:v,sortOptions:[{label:"ID Ascending",key:"+id"},{label:"ID Descending",key:"-id"}],statusOptions:["published","draft","deleted"],showReviewer:!1,temp:{id:void 0,importance:1,remark:"",timestamp:new Date,title:"",type:"",status:"published"},dialogFormVisible:!1,dialogStatus:"",textMap:{update:"Edit",create:"Create"},dialogPvVisible:!1,pvData:[],rules:{type:[{required:!0,message:"type is required",trigger:"change"}],timestamp:[{type:"date",required:!0,message:"timestamp is required",trigger:"change"}],title:[{required:!0,message:"title is required",trigger:"blur"}]},downloadLoading:!1}},created:function(){this.getList()},methods:{getList:function(){var t=this;this.listLoading=!0,Object(m["c"])(this.listQuery).then(function(e){t.list=e.data.items,t.total=e.data.total,setTimeout(function(){t.listLoading=!1},1500)})},handleFilter:function(){this.listQuery.page=1,this.getList()},handleModifyStatus:function(t,e){this.$message({message:"操作成功",type:"success"}),t.status=e},sortChange:function(t){var e=t.prop,a=t.order;"id"===e&&this.sortByID(a)},sortByID:function(t){this.listQuery.sort="ascending"===t?"+id":"-id",this.handleFilter()},resetTemp:function(){this.temp={id:void 0,importance:1,remark:"",timestamp:new Date,title:"",status:"published",type:""}},handleCreate:function(){var t=this;this.resetTemp(),this.dialogStatus="create",this.dialogFormVisible=!0,this.$nextTick(function(){t.$refs["dataForm"].clearValidate()})},createData:function(){var t=this;this.$refs["dataForm"].validate(function(e){e&&(t.temp.id=p()(100*Math.random())+1024,t.temp.author="vue-element-admin",Object(m["a"])(t.temp).then(function(){t.list.unshift(t.temp),t.dialogFormVisible=!1,t.$notify({title:"成功",message:"创建成功",type:"success",duration:2e3})}))})},handleUpdate:function(t){var e=this;this.temp=c()({},t),this.temp.timestamp=new Date(this.temp.timestamp),this.dialogStatus="update",this.dialogFormVisible=!0,this.$nextTick(function(){e.$refs["dataForm"].clearValidate()})},updateData:function(){var t=this;this.$refs["dataForm"].validate(function(e){if(e){var a=c()({},t.temp);a.timestamp=+new Date(a.timestamp),Object(m["e"])(a).then(function(){var e=!0,a=!1,i=void 0;try{for(var n,l=s()(t.list);!(e=(n=l.next()).done);e=!0){var r=n.value;if(r.id===t.temp.id){var o=t.list.indexOf(r);t.list.splice(o,1,t.temp);break}}}catch(u){a=!0,i=u}finally{try{e||null==l.return||l.return()}finally{if(a)throw i}}t.dialogFormVisible=!1,t.$notify({title:"成功",message:"更新成功",type:"success",duration:2e3})})}})},handleDelete:function(t){this.$notify({title:"成功",message:"删除成功",type:"success",duration:2e3});var e=this.list.indexOf(t);this.list.splice(e,1)},handleFetchPv:function(t){var e=this;Object(m["d"])(t).then(function(t){e.pvData=t.data.pvData,e.dialogPvVisible=!0})},handleDownload:function(){var t=this;this.downloadLoading=!0,Promise.all([a.e("chunk-e69e90f4"),a.e("chunk-58293907")]).then(a.bind(null,"4bf8d")).then(function(e){var a=["timestamp","title","type","importance","status"],i=["timestamp","title","type","importance","status"],n=t.formatJson(i,t.list);e.export_json_to_excel({header:a,data:n,filename:"table-list"}),t.downloadLoading=!1})},formatJson:function(t,e){return e.map(function(e){return t.map(function(t){return"timestamp"===t?Object(h["f"])(e[t]):e[t]})})}}},w=y,k=a("2877"),_=Object(k["a"])(w,l,r,!1,null,null,null),x=_.exports,$={name:"Tab",components:{tabPane:x},data:function(){return{tabMapOptions:[{label:"婴儿组",key:"CN"},{label:"婴儿组",key:"US"},{label:"婴儿组",key:"JP"},{label:"婴儿精品",key:"EU"}],activeName:"CN",createdTimes:0,total:20}},methods:{showCreatedTimes:function(){this.createdTimes=this.createdTimes+1}}},S=$,C=(a("31b2"),Object(k["a"])(S,i,n,!1,null,"5412f64a",null));e["default"]=C.exports},6724:function(t,e,a){"use strict";var i=a("5176"),n=a.n(i),l=(a("8d41"),"@@wavesContext");function r(t,e){function a(a){var i=n()({},e.value),l=n()({ele:t,type:"hit",color:"rgba(0, 0, 0, 0.15)"},i),r=l.ele;if(r){r.style.position="relative",r.style.overflow="hidden";var o=r.getBoundingClientRect(),s=r.querySelector(".waves-ripple");switch(s?s.className="waves-ripple":(s=document.createElement("span"),s.className="waves-ripple",s.style.height=s.style.width=Math.max(o.width,o.height)+"px",r.appendChild(s)),l.type){case"center":s.style.top=o.height/2-s.offsetHeight/2+"px",s.style.left=o.width/2-s.offsetWidth/2+"px";break;default:s.style.top=(a.pageY-o.top-s.offsetHeight/2-document.documentElement.scrollTop||document.body.scrollTop)+"px",s.style.left=(a.pageX-o.left-s.offsetWidth/2-document.documentElement.scrollLeft||document.body.scrollLeft)+"px"}return s.style.backgroundColor=l.color,s.className="waves-ripple z-active",!1}}return t[l]?t[l].removeHandle=a:t[l]={removeHandle:a},a}var o={bind:function(t,e){t.addEventListener("click",r(t,e),!1)},update:function(t,e){t.removeEventListener("click",t[l].removeHandle,!1),t.addEventListener("click",r(t,e),!1)},unbind:function(t){t.removeEventListener("click",t[l].removeHandle,!1),t[l]=null,delete t[l]}},s=function(t){t.directive("waves",o)};window.Vue&&(window.waves=o,Vue.use(s)),o.install=s;e["a"]=o},"6b95":function(t,e,a){"use strict";var i=a("bcd7"),n=a.n(i);n.a},7328:function(t,e,a){},"8d41":function(t,e,a){},bcd7:function(t,e,a){}}]);
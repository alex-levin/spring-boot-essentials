(this.webpackJsonpclient=this.webpackJsonpclient||[]).push([[0],{17:function(e,t,n){e.exports=n(42)},22:function(e,t,n){},23:function(e,t,n){e.exports=n.p+"static/media/logo.5d5d9eef.svg"},24:function(e,t,n){},42:function(e,t,n){"use strict";n.r(t);var a=n(1),o=n.n(a),r=n(11),c=n.n(r),i=(n(22),n(23),n(24),n(12)),s=n(13),l=n(16),u=n(15),m=n(14),d=n.n(m),f=function(e){Object(l.a)(n,e);var t=Object(u.a)(n);function n(e){var a;return Object(i.a)(this,n),(a=t.call(this,e)).state={users:[]},a}return Object(s.a)(n,[{key:"componentDidMount",value:function(){var e=this;d.a.get("/api/v1/person").then((function(t){e.setState({users:t.data})}))}},{key:"render",value:function(){return o.a.createElement("div",{style:{display:"flex",width:"50%"}},o.a.createElement("ul",null,this.state.users.map((function(e){return o.a.createElement("li",{key:e.UUID},e.name," ",e.age)}))))}}]),n}(o.a.Component);var h=function(){return o.a.createElement("div",{className:"App"},o.a.createElement(f,null))};Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));c.a.render(o.a.createElement(o.a.StrictMode,null,o.a.createElement(h,null)),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then((function(e){e.unregister()})).catch((function(e){console.error(e.message)}))}},[[17,1,2]]]);
//# sourceMappingURL=main.02359c72.chunk.js.map
(this["webpackJsonpsidedish-fe"]=this["webpackJsonpsidedish-fe"]||[]).push([[0],{32:function(n,e,t){},36:function(n,e,t){},38:function(n,e,t){},44:function(n,e,t){"use strict";t.r(e);var i,c,r,a,o,s,l,d,b,j,u,x=t(3),h=t.n(x),p=(t(32),t(24)),f=t.n(p),g=t(8),O=t(4),m=(t(36),t(5)),v=t(14),w=t.n(v),y=t(16),k=t(29),S=(t(38),t(2)),F=function(n){return Object(S.jsx)("a",{href:"#",children:n.content})},C=function(n){return n.contents.map((function(n){return Object(S.jsx)(F,{content:n},n)}))},z=function(n){var e=Object.values(n)[0],t=e[0].title,i=e[1].contents;return Object(S.jsxs)("div",{className:"dropdown",children:[Object(S.jsx)("button",{className:"dropdown-button",style:{cursor:"pointer"},children:t}),Object(S.jsx)("div",{className:"dropdown-content",children:Object(S.jsx)(C,{contents:i})})]})},N=function(n){return Object.values(n)[0].map((function(n){return Object(S.jsx)(z,{props:n},n[0].title)}))},D=m.a.div(i||(i=Object(O.a)(["\n    text-align: center;\n    margin: auto 0;\n"]))),T=m.a.div(c||(c=Object(O.a)(["\n    /* headerStyle */\n    // font-family: Noto Sans KR;\n    font-style: normal;\n\n    /* Gray 1 */\n    color: #333333;\n\n    margin-top: 32px;\n    display: flex;\n    justify-content: space-between\n"]))),E=Object(m.a)(D)(r||(r=Object(O.a)(["\n    display:flex;\n    flex-direction: row;\n    width:55%;\n"]))),_=m.a.div(a||(a=Object(O.a)(["\n    display:flex;\n    flex-direction: row;\n    width: 528px;\n"]))),B=m.a.div(o||(o=Object(O.a)(["\n    font-weight: 900;\n    font-size: 40px;\n    margin-right: 3%;\n\n    letter-spacing: -0.04em;\n    text-transform: uppercase;\n"]))),L=(m.a.button(s||(s=Object(O.a)(["\n    font-size: 16px;\n    line-height: 23px;\n    margin: auto 1.5%;\n    cursor:pointer;\n\n    &:hover {\n        font-weight: bold;\n        display:block;\n        background-color: transparent;\n    }\n"]))),m.a.input(l||(l=Object(O.a)(["\n    width: calc(90% - 30px);\n    height: 95%;\n\n    margin: auto 5px;\n    padding-left: 5%;\n\n    background: #F5F5F7;\n    border: none;\n    \n    border:none;\n    &:focus {\n        outline: none;\n    }\n    \n"])))),I=m.a.button(d||(d=Object(O.a)(["\n    background: none;\n    border:none;\n    /* outline: none; */\n    margin:8px;\n"]))),R=m.a.div(b||(b=Object(O.a)(["\n    background: #F5F5F7;\n    border-radius: 5px;\n    height:40px;\n    width: 63%;\n    margin: auto 0;\n    border:none;\n    display:flex;\n    flex-direction: row;\n"]))),U=m.a.button(j||(j=Object(O.a)(["\n    font-size: 16px;\n    line-height: 23px;\n    margin: auto 0;\n    width: 100px;\n    background-color: transparent;\n    border:none;\n"]))),W=m.a.button(u||(u=Object(O.a)(["\n    font-size: 16px;\n    line-height: 23px;\n    margin: auto 0;\n    width: 100px;\n    background-color: transparent;\n    border:none;\n"]))),A={HeaderLogoTitle:"BANCHAN",HeaderNav:[[{title:"\ub4e0\ub4e0\ud55c \uba54\uc778\uc694\ub9ac"},{contents:["\uc721\ub958 \uc694\ub9ac","\ud574\uc0b0\ubb3c \uc694\ub9ac"]}],[{title:"\ub728\ub048\ud55c \uad6d\ubb3c\uc694\ub9ac"},{contents:["\uad6d/\ud0d5/\ucc0c\uac1c"]}],[{title:"\uc815\uac08\ud55c \ubc11\ubc18\ucc2c"},{contents:["\ub098\ubb3c/\ubb34\uce68","\uc870\ub9bc/\ubcf6\uc74c","\uc808\uc784/\uc7a5\uc544\ucc0c"]}]]},M="\ud6c4\uae30\uac00 \uc99d\uba85\ud558\ub294 \ubca0\uc2a4\ud2b8 \ubc18\ucc2c",G=t(18);G.a.initializeApp({apiKey:"AIzaSyCjPy34uF6g0tmqNIq7r2cZvGYQqH3z18E",authDomain:"fir-test-9adc6.firebaseapp.com",projectId:"fir-test-9adc6",storageBucket:"fir-test-9adc6.appspot.com",messagingSenderId:"1000939307493",appId:"1:1000939307493:web:05c9fe7ef3a10f33fb2f0c"}),G.a.analytics();var P,H,V,q,K,J,Q,Y,Z,X,$,nn,en,tn,cn,rn,an,on,sn,ln,dn,bn,jn,un,xn=G.a,hn=function(){var n=Object(y.a)(w.a.mark((function n(e){var t;return w.a.wrap((function(n){for(;;)switch(n.prev=n.next){case 0:return t="",n.next=3,xn.auth().signInWithPopup(e).then((function(n){return t=n,n.user})).catch((function(n){return n}));case 3:return n.abrupt("return",t);case 4:case"end":return n.stop()}}),n)})));return function(e){return n.apply(this,arguments)}}(),pn=new xn.auth.GithubAuthProvider;new xn.auth.GoogleAuthProvider;function fn(){var n=Object(x.useState)(""),e=Object(g.a)(n,2),t=e[0],i=e[1],c=Object(x.useState)(""),r=Object(g.a)(c,2),a=r[0],o=r[1];Object(x.useEffect)((function(){i(localStorage.getItem("accessToken")),o(localStorage.getItem("userName")),"undefined"!==localStorage.getItem("userName")&&"undefined"!==localStorage.getItem("accessToken")||(localStorage.clear(),i(""),o(""))}),[]);var s=function(){var n=Object(y.a)(w.a.mark((function n(e){var c,r,a,s,l;return w.a.wrap((function(n){for(;;)switch(n.prev=n.next){case 0:if(t){n.next=10;break}return n.next=3,hn(e);case 3:l=n.sent,o(null===(c=l.additionalUserInfo)||void 0===c?void 0:c.username),i(null===(r=l.credential)||void 0===r?void 0:r.accessToken),localStorage.setItem("userName",null===(a=l.additionalUserInfo)||void 0===a?void 0:a.username),localStorage.setItem("accessToken",null===(s=l.credential)||void 0===s?void 0:s.accessToken),n.next=12;break;case 10:i(""),localStorage.clear();case 12:case"end":return n.stop()}}),n)})));return function(e){return n.apply(this,arguments)}}();return Object(S.jsxs)(T,{children:[Object(S.jsxs)(E,{children:[Object(S.jsx)(B,{children:A.HeaderLogoTitle}),Object(S.jsx)(N,{props:A.HeaderNav})]}),Object(S.jsxs)(_,{children:[Object(S.jsx)(W,{children:t?"".concat(a,"\ub2d8"):"GUEST"}),Object(S.jsx)("div",{style:{width:"1px",height:"24px",margin:"auto 0",backgroundColor:"lightgray"}}),Object(S.jsx)(U,{onClick:function(){return s(pn)},children:t?Object(S.jsx)("div",{style:{color:"red",fontWeight:"bold",border:"none",cursor:"pointer"},children:"\ub85c\uadf8\uc544\uc6c3"}):Object(S.jsx)("div",{style:{fontWeight:"bold",outline:"none",cursor:"pointer"},children:"\ub85c\uadf8\uc778"})}),Object(S.jsxs)(R,{children:[Object(S.jsx)(L,{}),Object(S.jsx)(I,{children:Object(S.jsx)(k.a,{size:"25px",fill:"#BDBDBD"})})]})]})]})}var gn,On,mn,vn=m.a.div(P||(P=Object(O.a)(["\n    text-align:left;\n    cursor: pointer;\n"]))),wn=Object(m.a)(vn)(H||(H=Object(O.a)(["\n    width:160px;\n    height:270px;\n"]))),yn=Object(m.a)(vn)(V||(V=Object(O.a)(["\n    width:308px;\n    height:456px;\n"]))),kn=Object(m.a)(vn)(q||(q=Object(O.a)(["\n    width:384px;\n    height:540px;\n"]))),Sn=m.a.img(K||(K=Object(O.a)(["\n    background-size: 100% 100%;\n    background-repeat: no-repeat;\n    background-image: url(",");\n"])),(function(n){return n.url})),Fn=Object(m.a)(Sn)(J||(J=Object(O.a)(["\n    width:160px;\n    height:160px;\n    margin-bottom: 8px;\n"]))),Cn=Object(m.a)(Sn)(Q||(Q=Object(O.a)(["\n    width:308px;\n    height:308px;\n    margin-bottom: 16px;\n"]))),zn=Object(m.a)(Sn)(Y||(Y=Object(O.a)(["\n    width:384px;\n    height:384px;\n"]))),Nn=m.a.div(Z||(Z=Object(O.a)(["\n    color: #333333;\n    font-weight: normal;\n"]))),Dn=Object(m.a)(Nn)(X||(X=Object(O.a)(["\n    font-size: 16px;\n    line-height: 23px;\n    margin-bottom: 8px;\n"]))),Tn=Object(m.a)(Nn)($||($=Object(O.a)(["\n    font-size: 16px;\n    line-height: 23px;\n    margin-bottom: 8px;\n"]))),En=m.a.div(nn||(nn=Object(O.a)(["\n    width:100%;\n    font-weight: normal;\n    font-size: 14px;\n    line-height: 20px;\n    color: #828282;\n"]))),_n=Object(m.a)(En)(en||(en=Object(O.a)(["\n    margin-bottom: 8px;\n"]))),Bn=Object(m.a)(En)(tn||(tn=Object(O.a)(["\n    margin-bottom: 16px;\n"]))),Ln=(m.a.div(cn||(cn=Object(O.a)(["\n    display:flex;\n    flex-direction: row;\n    margin-bottom: 16px;\n    align-items: baseline;\n    \n"]))),m.a.div(rn||(rn=Object(O.a)(["\n    font-weight: bold;\n    font-size: 14px;\n    line-height: 20px;\n"])))),In=m.a.div(an||(an=Object(O.a)(["\n    font-size: 14px;\n    line-height: 20px;\n    text-decoration-line: line-through;\n    color: #BDBDBD;\n"]))),Rn=m.a.div(on||(on=Object(O.a)(["\n    font-weight: bold;\n    font-size: 20px;\n    margin-right:16px;\n    line-height: 29px;\n"]))),Un=m.a.div(sn||(sn=Object(O.a)(["\n    display: flex;\n    flex-direction: row;\n    align-items: center; \n    justify-content: center;\n    padding: 4px 16px;\n    width: 97px;\n    height: 28px;\n\n    /* Light Blue */\n    border-radius: 5px;\n    /* text-align:center; */\n    color:white;\n    margin-right: 10px;\n    font-weight: bold;\n    \n"]))),Wn=Object(m.a)(Un)(ln||(ln=Object(O.a)(["\n    background-color : #82D32D;\n\n"]))),An=Object(m.a)(Un)(dn||(dn=Object(O.a)(["\n    background-color : #86C6FF;;\n"]))),Mn=m.a.div(bn||(bn=Object(O.a)(["\n    display:flex; \n    flex-direction:row;\n\n    margin-bottom: 16px;\n    align-items: baseline;\n"]))),Gn=m.a.div(jn||(jn=Object(O.a)([" \n    opacity: 0%;\n    position: absolute;\n    \n    display: flex;\n    flex-direction: column;\n    align-items: center;\n    justify-content: center;\n\n\n    font-weight: bold;\n    font-size: 24px;\n    line-height: 35px;\n    color: #FFFFFF;\n\n    /* text-align:center; */\n\n    top:0px;\n    left:0;\n    width:100%;\n    height:100%;\n    background: linear-gradient(0deg, rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.6));\n    :hover{\n        opacity: 100%;\n    }\n"]))),Pn=(m.a.div(un||(un=Object(O.a)(["\n    /* display: flex; */\n    /* margin:  0 auto; */\n    font-weight: bold;\n    font-size: 24px;\n    line-height: 35px;\n    color: #FFFFFF;\n\n    text-align:center;\n"]))),function(n){return Object(S.jsx)(Ln,{children:n})}),Hn=function(n){var e,t,i=n.imgUrl,c=n.title,r=n.price;return Object(S.jsxs)(wn,{children:[(t=i,Object(S.jsx)(Fn,{url:t})),(e=c,Object(S.jsx)(Dn,{value:e,children:e})),Pn(r)]})},Vn=function(n){var e=n.data,t=n.onClick;return Object(S.jsxs)(yn,{className:"MiddleCard",onClick:t,children:[qn(e.image),Qn(e.title),Yn(e.contents),Object(S.jsx)(Mn,{children:Jn(e)}),Object(S.jsxs)(Mn,{children:[$n(e),ne(e)]})]})},qn=function(n){return Object(S.jsxs)("div",{style:{display:"inline-block",position:"relative",marginBottom:"16px",height:"308px"},children:[Object(S.jsx)(Cn,{url:n}),Kn()]})},Kn=function(){return Object(S.jsxs)(Gn,{children:[Object(S.jsx)("div",{children:"\uc0c8\ubcbd\ubc30\uc1a1"}),Object(S.jsx)("div",{style:{margin:"16px 0",backgroundColor:"white",height:"1px",width:"89px"}}),Object(S.jsx)("div",{children:"\uc804\uad6d\ud0dd\ubc30"})]})},Jn=function(n){return"0\uc6d0"===n.n_price?Object(S.jsx)(Mn,{children:Zn(n.s_price)}):Object(S.jsxs)(Mn,{children:[Zn(n.s_price),Xn(n.n_price)]})},Qn=function(n){return Object(S.jsx)(Tn,{children:n})},Yn=function(n){return Object(S.jsx)(_n,{children:n})},Zn=function(n){return Object(S.jsx)(Rn,{children:n})},Xn=function(n){return Object(S.jsx)(In,{children:n})},$n=function(n){return n.badge&&n.badge.includes("\uc774\ubca4\ud2b8\ud2b9\uac00")?Object(S.jsx)(Wn,{children:"\uc774\ubca4\ud2b8\ud2b9\uac00"}):""},ne=function(n){return n.badge&&n.badge.includes("\ub860\uce6d\ud2b9\uac00")?Object(S.jsx)(An,{children:"\ub7f0\uce6d\ud2b9\uac00"}):""},ee=function(n){var e=n.data,t=n.onClick;return Object(S.jsxs)(kn,{className:"LargeCard",onClick:t,children:[re(e.image),ie(e.title),ce(e.contents),Object(S.jsx)(Mn,{children:te(e)}),Object(S.jsxs)(Mn,{children:[se(e),le(e)]})]})},te=function(n){return"0\uc6d0"===n.n_price?Object(S.jsx)(Mn,{children:ae(n.s_price)}):Object(S.jsxs)(Mn,{children:[ae(n.s_price),oe(n.n_price)]})},ie=function(n){return Object(S.jsx)(Tn,{children:n})},ce=function(n){return Object(S.jsx)(Bn,{children:n})},re=function(n){return Object(S.jsxs)("div",{style:{display:"inline-block",position:"relative",marginBottom:"16px",height:"384px"},children:[Object(S.jsx)(zn,{url:n}),Object(S.jsxs)(Gn,{children:[Object(S.jsx)("div",{children:"\uc0c8\ubcbd\ubc30\uc1a1"}),Object(S.jsx)("div",{style:{margin:"16px 0",backgroundColor:"white",height:"1px",width:"89px"}}),Object(S.jsx)("div",{children:"\uc804\uad6d\ud0dd\ubc30"})]})]})},ae=function(n){return Object(S.jsx)(Rn,{children:n})},oe=function(n){return Object(S.jsx)(In,{children:n})},se=function(n){return n.badge&&n.badge.includes("\uc774\ubca4\ud2b8\ud2b9\uac00")?Object(S.jsx)(Wn,{children:"\uc774\ubca4\ud2b8\ud2b9\uac00"}):""},le=function(n){return n.badge&&n.badge.includes("\ub860\uce6d\ud2b9\uac00")?Object(S.jsx)(An,{children:"\ub7f0\uce6d\ud2b9\uac00"}):""},de=t(13),be=m.a.h1(gn||(gn=Object(O.a)(["\n    color: #333333;\n    text-align:left;\n    margin-top:5%;\n    margin-bottom: 32px;\n    font-size:24px;\n"]))),je=m.a.div(On||(On=Object(O.a)(["\n    font-family: Noto Sans KR;\n    font-style: normal;\n    font-weight: bold;\n    font-size: 18px;\n    line-height: 58px;\n    margin-right:8px;\n\n    cursor: pointer;\n\n\n    background: #F5F5F7;\n    color: #828282;\n\n    width: 201px;\n    height: 58px;\n    left: 0px;\n    top: 0px;\n\n    border-radius: 5px 5px 0px 0px;\n    &.select {\n        color: #333333;\n        background: #EEF4FA;\n    }\n"]))),ue=m.a.div(mn||(mn=Object(O.a)(["\n    background-color: #EEF4FA;\n    width: 100%;\n    height: 620px;\n"])));var xe,he,pe,fe,ge,Oe,me,ve=function(n,e){var t=Object(x.useState)(),i=Object(g.a)(t,2),c=i[0],r=i[1],a=Object(x.useState)(),o=Object(g.a)(a,2),s=o[0],l=o[1],d=Object(x.useState)(!1),b=Object(g.a)(d,2),j=b[0],u=b[1];return Object(x.useEffect)((function(){(function(){var t=Object(y.a)(w.a.mark((function t(){var i,c;return w.a.wrap((function(t){for(;;)switch(t.prev=t.next){case 0:return u(!0),t.prev=1,t.next=4,fetch(n,e);case 4:return i=t.sent,t.next=7,i.json();case 7:c=t.sent,r(c),u(!1),t.next=15;break;case 12:t.prev=12,t.t0=t.catch(1),l(t.t0);case 15:case"end":return t.stop()}}),t,null,[[1,12]])})));return function(){return t.apply(this,arguments)}})()()}),[]),{response:c,error:s,isLoading:j}},we=m.a.div(xe||(xe=Object(O.a)(["\n    display:flex;\n    flex-direction: row;\n"]))),ye=(m.a.div(he||(he=Object(O.a)(["\n    display:flex;\n    flex-direction: col;\n"]))),"http://3.36.66.115"),ke={setServerUrl:function(n){ye=n},getServerUrl:function(){return ye},TEST_URL:"https://h3rb9c0ugl.execute-api.ap-northeast-2.amazonaws.com/develop/baminchan/best",SERVER_URL:ye},Se=m.a.div(pe||(pe=Object(O.a)(["\n  display: flex;\n  align-items: center;\n  justify-content: center;\n  position: fixed;\n  top: 0;\n  left: 0;\n  width: 100%;\n  height: 100%;\n  background-color: rgba(0, 0, 0, 0.4);\n  z-index: 9999;\n"]))),Fe=m.a.div(fe||(fe=Object(O.a)(["\n  flex: 0 0 47%;\n  display: flex;\n  flex-direction: column;\n  align-items: center;\n  box-sizing: border-box;\n  padding-right: 20px;\n"]))),Ce=m.a.img(ge||(ge=Object(O.a)(["\n  width: 100%;\n  height: 297px;\n  margin-bottom: 3px;\n  border-radius: 5px;\n"]))),ze=m.a.ul(Oe||(Oe=Object(O.a)(["\n  display: flex;\n  text-align: left;\n"]))),Ne=m.a.li(me||(me=Object(O.a)(["\n  flex: 1;\n  border-radius: 5px;\n\n  & + & {\n    margin-left: 3px;\n  }\n\n  & > img {\n    width: 100%;\n    height: 100%;\n    box-sizing: border-box;\n    border-radius: inherit;\n    pointer-events: none;\n    /* z-index: -1; */\n  }\n\n  &.no-img {\n    background-color: lightgray;\n  }\n\n  &.select > img {\n    border: 2px solid #82d32d;\n  }\n\n  &:hover {\n    opacity: 0.8;\n  }\n"])));var De,Te,Ee,_e=function(n){var e=n.imgUrls,t=n.defaultListSize,i=void 0===t?5:t,c=Object(x.useState)(0),r=Object(g.a)(c,2),a=r[0],o=r[1];return Object(S.jsxs)(Fe,{children:[Object(S.jsx)(Ce,{src:e[a]}),Object(S.jsx)(ze,{onClickCapture:function(n){var e=n.target;e.dataset.idx&&a!==Number(e.dataset.idx)&&o(Number(e.dataset.idx))},children:function(){for(var n=e.slice(0,i).map((function(n,e){return Object(S.jsx)(Ne,{"data-idx":e,className:e===a?"select":"",children:Object(S.jsx)("img",{src:n})},e)})),t=n.length;n.length<i;)n.push(Object(S.jsx)(Ne,{className:"no-img"},t++));return n}()})]})},Be=t(30),Le=m.a.div(De||(De=Object(O.a)(["\n  display: flex;\n  align-items: center;\n  justify-content: center;\n  width: ",";\n  height: ",";\n  font-size: 14px;\n  font-weight: 800;\n  color: #FFFFFF;\n  background-color: #82D32D;\n  border-radius: 5px;\n"])),(function(n){var e;return null!==(e=n.width)&&void 0!==e?e:"97px"}),(function(n){var e;return null!==(e=n.height)&&void 0!==e?e:"28px"}));function Ie(n){var e=n.text,t=void 0===e?"\uc774\ubca4\ud2b8\ud2b9\uac00":e,i=Object(Be.a)(n,["text"]);return Object(S.jsx)(Le,Object(de.a)(Object(de.a)({},i),{},{children:t}))}var Re=m.a.div(Te||(Te=Object(O.a)(["\n  & > * {\n    margin: 10px 0;\n  }\n"]))),Ue=m.a.div(Ee||(Ee=Object(O.a)(["\n  display: flex;\n  height: auto;\n\n  & > * {\n    font-size: 13px;\n    line-height: 21px;\n  }\n\n  * + * {\n    margin-left: 6px;\n  }\n\n  .entry {\n    flex: 1;\n    color: #828282;\n  }\n\n  .content {\n    flex: 5.5;\n    color: #4F4F4F;\n\n    b {\n      font-weight: 800;\n    }\n  }\n"])));var We,Ae,Me=function(n){var e=n.data,t=function(n){var e=n.match(/\([^)]*\)/);return Object(S.jsxs)(S.Fragment,{children:[n.slice(0,e.index),Object(S.jsx)("b",{children:e[0]})]})};return Object(S.jsx)(Re,{children:e.map((function(n,e){var i=Object(g.a)(n,2),c=i[0],r=i[1];return Object(S.jsxs)(Ue,{children:[Object(S.jsx)("div",{className:"entry",children:c}),Object(S.jsx)("div",{className:"content",children:"\ubc30\uc1a1\ube44"===c?t(r):r})]},e)}))})},Ge=t.p+"static/media/upbtn.7a222cc4.svg",Pe=t.p+"static/media/downbtn.41839657.svg",He=m.a.div(We||(We=Object(O.a)(["\n  display: flex;\n  width: 55px;\n  text-align: center;\n  border: 1px solid #DDDDDD;\n\n  .count {\n    flex: 4;\n    padding: 4px 0;\n    font-size: 14px;\n    line-height: 20px;\n    color: #4F4F4F;\n  }\n\n  .btn-cont {\n    flex: 1;\n    display: flex;\n    flex-direction: column;\n    border-left: 1px solid #DDDDDD;\n  }\n"]))),Ve=m.a.button(Ae||(Ae=Object(O.a)(["\n  flex: 1;\n  display: flex;\n  align-items: center;\n  justify-items: center;\n  align-self: ",";\n  border: none;\n  border-top: ",";\n  background-color: transparent;\n\n  &:disabled {\n    background-color: #DDDDDD;\n  }\n\n  &:not(:disabled):hover {\n    background-color: #EEEFFF;\n  }\n"])),(function(n){return n.down?"flex-end":"flex-start"}),(function(n){return n.down?"1px solid #DDDDDD":"none"}));var qe,Ke,Je=function(n){var e=n.onChangeCount,t=Object(x.useState)(1),i=Object(g.a)(t,2),c=i[0],r=i[1];return Object(x.useEffect)((function(){null===e||void 0===e||e(c)}),[c]),Object(S.jsxs)(He,{children:[Object(S.jsx)("div",{className:"count",children:c}),Object(S.jsxs)("div",{className:"btn-cont",children:[Object(S.jsx)(Ve,{onClick:function(){r(c+1)},children:Object(S.jsx)("img",{src:Ge,alt:"up button"})}),Object(S.jsx)(Ve,{down:!0,disabled:1===c,onClick:function(){r(c-1)},children:Object(S.jsx)("img",{src:Pe,alt:"down button"})})]})]})},Qe=m.a.div(qe||(qe=Object(O.a)(["\n  /* flex: 0 0 53%; */\n  box-sizing: border-box;\n  text-align: left;\n\n  & > :not(.title, .order-btn) {\n    margin: 16px auto;\n  }\n\n  .title {\n    color: #333333;\n    font-size: 22px;\n    line-height: 28px;\n    margin-bottom: 16px;\n  }\n\n  .product-desc {\n    color: #828282;\n    font-size: 16px;\n    line-height: 24px;\n  }\n\n  .price-cont {\n    display: flex;\n    align-items: flex-end;\n\n    * + * {\n      margin-left: 5px;\n    }\n\n    .discounted {\n      color: #333333;\n      font-weight: 800;\n      font-size: 22px;\n      line-height: 32px;\n    }\n\n    .original {\n      color: #828282;\n      font-size: 16px;\n      line-height: 23px;\n      text-decoration-line: line-through;\n    }\n  }\n\n  .line {\n    width: 100%;\n    height: 1px;\n    background-color: #e0e0e0;\n  }\n\n  .counter-cont {\n    display: flex;\n    align-items: center;\n    justify-content: space-between;\n    width: 100%;\n    font-size: 13px;\n    line-height: 21px;\n    color: #828282;\n  }\n\n  .totalprice-cont {\n    display: flex;\n    align-items: center;\n    justify-content: flex-end;\n    font-weight: 800;\n    font-size: 12px;\n    line-height: 20px;\n    color: #828282;\n\n    .totalprice {\n      margin-left: 18px;\n      font-size: 26px;\n      line-height: 34px;\n      color: #010101;\n    }\n  }\n"]))),Ye=m.a.button(Ke||(Ke=Object(O.a)(["\n  width: 90%;\n  height: 50px;\n  margin: 16px 0 16px 5%;\n  line-height: 26px;\n  font-size: 18px;\n  font-weight: 800;\n  color: #ffffff;\n  border: none;\n  border-radius: 5px;\n  background-color: #82d32d;\n"])));var Ze,Xe,$e,nt=function(n){var e,t=n.data,i=Object(x.useState)(null===(e=t.prices[1])||void 0===e?void 0:e.match(/[0-9]*/g).join("")),c=Object(g.a)(i,1)[0],r=Object(x.useState)(t.prices[1]),a=Object(g.a)(r,2),o=a[0],s=a[1];return Object(S.jsxs)(Qe,{children:[Object(S.jsx)("div",{className:"title",children:t.title}),Object(S.jsx)("div",{className:"product-desc",children:t.product_description}),Object(S.jsxs)("div",{className:"price-cont",children:[Object(S.jsx)(Ie,{}),"0\uc6d0"===t.prices[0]?Object(S.jsx)("div",{className:"original",children:t.prices[1]}):Object(S.jsxs)(S.Fragment,{children:[Object(S.jsx)("div",{className:"discounted",children:t.prices[1]}),Object(S.jsx)("div",{className:"original",children:t.prices[0]})]})]}),Object(S.jsx)("div",{className:"line"}),Object(S.jsx)(Me,{data:[["\ud3ec\uc778\ud2b8",t.point],["\ubc30\uc1a1\uc815\ubcf4",t.delivery_info],["\ubc30\uc1a1\ube44",t.delivery_fee]]}),Object(S.jsx)("div",{className:"line"}),Object(S.jsxs)("div",{className:"counter-cont",children:["\uc218\ub7c9",Object(S.jsx)(Je,{onChangeCount:function(n){s((c*n).toLocaleString({type:"currency"})+"\uc6d0")}})]}),Object(S.jsx)("div",{className:"line"}),Object(S.jsxs)("div",{className:"totalprice-cont",children:["\ucd1d \uc8fc\ubb38\uae08\uc561",Object(S.jsx)("span",{className:"totalprice",children:o})]}),Object(S.jsx)(Ye,{className:"order-btn",children:"\uc8fc\ubb38\ud558\uae30"})]})},et=m.a.div(Ze||(Ze=Object(O.a)(["\n  display: inline-block;\n  width: 100%;\n  overflow: hidden;\n"]))),tt=m.a.ul(Xe||(Xe=Object(O.a)(["\n  width: ",";\n  display: flex;\n  justify-content: space-between;\n  position: relative;\n  top: 0;\n  left: ",";\n  transition: left 300ms linear;\n"])),(function(n){return n.width+"px"}),(function(n){return n.positionLeft+"px"})),it=m.a.li($e||($e=Object(O.a)([""])));function ct(n,e){var t,i=n.itemCntOnView,c=n.items,r=n.onSlide,a=(n.defaultBtn,n.pageable),o=void 0!==a&&a,s=Object(x.useState)(0),l=Object(g.a)(s,2),d=l[0],b=l[1],j=Object(x.useState)(0),u=Object(g.a)(j,2),h=u[0],p=u[1],f=Object(x.useState)(),O=Object(g.a)(f,2),m=O[0],v=O[1],w=Object(x.useState)(),y=Object(g.a)(w,2),k=y[0],F=y[1],C=Object(x.useState)(1),z=Object(g.a)(C,2),N=z[0],D=z[1],T=Object(x.useState)(Math.ceil(c.length/i)),E=Object(g.a)(T,1)[0],_=Object(x.useRef)(),B=Object(x.useRef)(),L=Object(x.useState)(),I=Object(g.a)(L,2),R=I[0],U=I[1],W=Object(x.useState)(),A=Object(g.a)(W,2),M=A[0],G=A[1];Object(x.useEffect)((function(){U(_.current.offsetWidth),G(B.current.offsetWidth)}),[]),Object(x.useEffect)((function(){if(void 0!==R&&void 0!==M){var n=function(n){var e=n.itemWidth,t=n.sliderWidth,i=n.itemCntOnView;return(t-i*e)/(i-1)}({itemWidth:M,sliderWidth:R,itemCntOnView:i}),e=function(n){var e=n.itemWidth,t=n.itemLength,i=n.betweenMargin;return(e+i)*t-i}({itemWidth:M,itemLength:c.length,betweenMargin:n});F(n),v(e)}}),[R,M]),Object(x.useEffect)((function(){if(void 0!==d&&void 0!==k){var n=function(n){var e=n.itemWidth,t=n.currIdx;return(e+n.betweenMargin)*t*-1}({itemWidth:M,currIdx:d,betweenMargin:k});p(n),r()}}),[d,k]),Object(x.useImperativeHandle)(e,(function(){return{slideToLeft:P,slideToRight:H,slidableToLeft:V,slidableToRight:q,getCurrPage:function(){return N},getTotalPage:function(){return E}}}));var P=function(){V()&&(D(N-1),b(!o&&d%i?d-d%i:d-i))},H=function(){q()&&(D(N+1),o||d!==c.length-i-c.length%i?b(d+i):b(d+c.length%i))},V=function(){return 0!==d},q=function(){return d<c.length-i};return Object(S.jsx)(et,{ref:_,children:Object(S.jsx)(tt,{width:null!==(t=null===m||void 0===m?void 0:m.toString())&&void 0!==t?t:"0",positionLeft:h.toString(),children:c.slice(1).reduce((function(n,e,t){return n.concat(Object(S.jsx)(it,{children:e},t))}),[Object(S.jsx)(it,{ref:B,children:c[0]},-1)])})})}var rt,at,ot,st=Object(x.forwardRef)(ct),lt=t.p+"static/media/leftbtn.c0c5d229.svg",dt=t.p+"static/media/rightbtn.0d960eb8.svg",bt=t.p+"static/media/leftbtn_disabled.76b56c4e.svg",jt=t.p+"static/media/rightbtn_disabled.8b03cfda.svg",ut=m.a.div(rt||(rt=Object(O.a)(["\n  width: 100%;\n  height: 100%;\n  box-sizing: border-box;\n  padding: 20px;\n  background: #F5F5F7;\n\n  .title {\n    float: left;\n    font-weight: 800;\n    font-size: 18px;\n    line-height: 26px;\n    color: #333333;\n  }\n\n  .btn-cont {\n    float: right;\n    margin-bottom: 20px;\n    font-size: 14px;\n    line-height: 20px;\n    color: #333333;\n    vertical-align: middle;\n  }\n"]))),xt=m.a.button(at||(at=Object(O.a)(["\n  padding: 0 6px;\n  border: none;\n  background-color: transparent;\n\n  &:not(:disabled):hover {\n    opacity: 0.7;\n  }\n\n  .img {\n    pointer-events: none;\n    z-index: -1;\n  }\n"])));m.a.div(ot||(ot=Object(O.a)(["\n  width: 100px;\n  height: 200px;\n  background-color: pink;\n  border: 1px solid red;\n"])));var ht,pt=function(){var n,e,t=Object(x.useRef)(),i=Object(x.useState)(),c=Object(g.a)(i,2),r=c[0],a=c[1],o=Object(x.useState)(),s=Object(g.a)(o,2),l=s[0],d=s[1],b=ve("".concat(ke.getServerUrl(),"/recommend")).response;return Object(S.jsxs)(ut,{children:[Object(S.jsx)("div",{className:"title",children:"\ud568\uaed8\ud558\uba74 \ub354\uc6b1 \ub9db\uc788\ub294 \uc0c1\ud488"}),Object(S.jsxs)("div",{className:"btn-cont",children:[Object(S.jsx)(xt,{disabled:r,onClick:function(){t.current.slideToLeft()},children:Object(S.jsx)("img",{src:r?bt:lt,alt:"left button"})}),null===(n=t.current)||void 0===n?void 0:n.getCurrPage(),"/",null===(e=t.current)||void 0===e?void 0:e.getTotalPage(),Object(S.jsx)(xt,{disabled:l,onClick:function(){t.current.slideToRight()},children:Object(S.jsx)("img",{src:l?jt:dt,alt:"right button"})})]}),b&&Object(S.jsx)(st,{ref:t,itemCntOnView:4,items:b.map((function(n){return Object(S.jsx)(Hn,{imgUrl:n.image,title:n.title,price:n.s_price},n.detail_hash)})),onSlide:function(){a(!t.current.slidableToLeft()),d(!t.current.slidableToRight())},defaultBtn:!1})]})},ft=m.a.div(ht||(ht=Object(O.a)(["\n  display: flex;\n  flex-direction: column;\n  width: 700px;\n  height: auto;\n  box-sizing: border-box;\n  background-color: #FFFFFF;\n  border-radius: 5px;\n  pointer-events: auto;\n  overflow: hidden;\n  \n  .upper-cont {\n    flex: 6.5;\n    display: flex;\n    padding: 20px;\n  }\n\n  .bottom-cont {\n    flex: 3.5;\n  }\n"])));var gt,Ot=function(n){var e=n.data;return Object(S.jsx)(ft,{children:e&&Object(S.jsxs)(S.Fragment,{children:[Object(S.jsxs)("div",{className:"upper-cont",children:[Object(S.jsx)(_e,{imgUrls:e.thumb_images}),Object(S.jsx)(nt,{data:e})]}),Object(S.jsx)("div",{className:"bottom-cont",children:Object(S.jsx)(pt,{})})]})})},mt=t.p+"static/media/closebtn.e20279ac.svg",vt=t.p+"static/media/closebtn_hover.f0e5f5ef.svg",wt=m.a.button(gt||(gt=Object(O.a)(["\n  padding: 0 6px;\n  border: none;\n  background-color: transparent;\n\n  &:not(:disabled):hover {\n    opacity: 0.7;\n  }\n\n  .img {\n    pointer-events: none;\n    z-index: -1;\n  }\n"])));var yt=function(n){var e=n.style,t=n.onClick,i=Object(x.useState)(!1),c=Object(g.a)(i,2),r=c[0],a=c[1],o=function(){a((function(n){return!n}))};return Object(S.jsx)(wt,{style:e,onMouseEnter:o,onMouseLeave:o,onClick:t,children:Object(S.jsx)("img",{src:r?vt:mt,alt:"modal close button"})})};var kt,St=function(n){var e=n.hash,t=n.title,i=n.onClickCloseBtn,c=ve(ke.getServerUrl()+"/detail/"+e,{}).response;return Object(S.jsx)(Se,{children:c&&Object(S.jsxs)("div",{style:{display:"flex",alignItems:"flex-start"},children:[Object(S.jsx)(Ot,{data:Object(de.a)(Object(de.a)({},c.data),{},{title:t})}),Object(S.jsx)(yt,{onClick:i})]})})},Ft={GET_BEST_TEST:"https://h3rb9c0ugl.execute-api.ap-northeast-2.amazonaws.com/develop/baminchan/best",GET_BEST:"http://3.36.66.115/best"},Ct=function(){var n=Object(x.useState)(0),e=Object(g.a)(n,2),t=e[0],i=e[1],c=Object(x.useState)(),r=Object(g.a)(c,2),a=r[0],o=r[1],s=Object(x.useState)(!1),l=Object(g.a)(s,2),d=l[0],b=l[1],j=ve(Ft.GET_BEST,{}).response,u=function(n){var e=n.target;i(e.dataset.idx*=1)},h=function(n){b(!0),o(Object(de.a)(Object(de.a)({},n),{},{onClickCloseBtn:p}))},p=function(){b(!1)};return Object(S.jsxs)("div",{children:[d&&Object(S.jsx)(St,Object(de.a)({},a)),Object(S.jsx)(be,{children:M}),Object(S.jsx)(we,{children:j&&j.map((function(n,e){return Object(S.jsx)(je,{className:t===e?"select":"",data:n,"data-idx":e,onClick:u,children:n.name},e)}))}),Object(S.jsx)(ue,{children:Object(S.jsx)(we,{children:Object(S.jsx)("div",{style:{margin:"40px",display:"flex",justifyContent:"space-between",width:"100%"},children:j&&j[t].items.map((function(n,e){return Object(S.jsx)(ee,{data:n,onClick:function(){return h({hash:n.detail_hash,title:n.title})}},e)}))})})}),Object(S.jsx)("div",{className:"BestMenuContents"})]})},zt=m.a.button(kt||(kt=Object(O.a)(["\n  padding: 0 6px;\n  border: none;\n  background-color: transparent;\n\n  &:not(:disabled):hover {\n    opacity: 0.7;\n  }\n\n  .img {\n    pointer-events: none;\n    z-index: -1;\n  }\n"])));var Nt,Dt=function(n){var e=n.style,t=n.disabled,i=n.onClick;return Object(S.jsx)(zt,{style:e,disabled:t,onClick:i,children:Object(S.jsx)("img",{src:t?bt:lt,alt:"left button"})})},Tt=m.a.button(Nt||(Nt=Object(O.a)(["\n  padding: 0 6px;\n  border: none;\n  background-color: transparent;\n\n  &:not(:disabled):hover {\n    opacity: 0.7;\n  }\n\n  .img {\n    pointer-events: none;\n    z-index: -1;\n  }\n"])));var Et,_t=function(n){var e=n.style,t=n.disabled,i=n.onClick;return Object(S.jsx)(Tt,{style:e,disabled:t,onClick:i,children:Object(S.jsx)("img",{src:t?jt:dt,alt:"right button"})})},Bt=m.a.div(Et||(Et=Object(O.a)(["\n  width: 100%;\n  margin-top: 32px;\n  position: relative;\n\n  > .title {\n    margin: 32px 0;\n    float: left;\n    font-weight: 800;\n    font-size: 24px;\n    line-height: 35px;\n    color: #333333;\n  }\n"]))),Lt={position:"absolute",top:"60%",left:"-3%"},It={position:"absolute",top:"60%",right:"-3%"};var Rt,Ut=function(n){var e=n.url,t=n.title,i=ve(e,{}).response,c=Object(x.useState)(!1),r=Object(g.a)(c,2),a=r[0],o=r[1],s=Object(x.useState)(),l=Object(g.a)(s,2),d=l[0],b=l[1],j=Object(x.useState)(),u=Object(g.a)(j,2),h=u[0],p=u[1],f=Object(x.useState)(),O=Object(g.a)(f,2),m=O[0],v=O[1],w=Object(x.useRef)(),y=function(){o(!1)};return Object(S.jsxs)(Bt,{children:[a&&Object(S.jsx)(St,Object(de.a)({},d)),Object(S.jsx)("div",{className:"title",children:t}),Object(S.jsx)(Dt,{style:Lt,disabled:h,onClick:function(){w.current.slideToLeft()}}),Object(S.jsx)(_t,{style:It,disabled:m,onClick:function(){w.current.slideToRight()}}),i&&Object(S.jsx)(st,{ref:w,itemCntOnView:4,items:i.map((function(n,e){return Object(S.jsx)(Vn,{className:"slider-item",data:n,onClick:function(){return function(n){o(!0),b(Object(de.a)(Object(de.a)({},n),{},{onClickCloseBtn:y}))}({hash:n.detail_hash,title:n.title})}},e)})),onSlide:function(){p(!w.current.slidableToLeft()),v(!w.current.slidableToRight())},defaultBtn:!1})]})},Wt=m.a.div(Rt||(Rt=Object(O.a)(["\n  margin-bottom: 60px;\n"])));var At,Mt=function(n){var e=n.seeAll,t=["http://3.36.66.115/main","http://3.36.66.115/soup","http://3.36.66.115/side"],i=["\ubaa8\ub450\uac00 \uc88b\uc544\ud558\ub294 \ub4e0\ub4e0\ud55c \uba54\uc778\uc694\ub9ac","\uc815\uc131\uc774 \ub2f4\uae34 \ub728\ub048\ud55c \uad6d\ubb3c\uc694\ub9ac","\uc2dd\ud0c1\uc744 \ud48d\uc131\ud558\uac8c \ud558\ub294 \uc815\uac08\ud55c \ubc11\ubc18\ucc2c"];return Object(S.jsx)(Wt,{children:e?t.map((function(n,e){return Object(S.jsx)(Ut,{url:n,title:i[e]},e)})):Object(S.jsx)(Ut,{url:t[0],title:i[0]},0)})},Gt=m.a.button(At||(At=Object(O.a)(["\n  width: 100%;\n  height: 90px;\n  position: relative;\n  padding: 0;\n  background-color: #f5f5f7;\n  box-shadow: inset 0px 4px 4px rgba(0, 0, 0, 0.05);\n  border: 1px lightgray solid;\n  border-top: none;\n  font-weight: 800;\n  font-size: 18px;\n  line-height: 26px;\n  color: #333333;\n  cursor: pointer;\n\n  &:hover {\n    background-color: #dddddd;\n  }\n"])));var Pt=function(){var n=Object(x.useState)(!1),e=Object(g.a)(n,2),t=e[0],i=e[1],c=Object(x.useState)(""),r=Object(g.a)(c,2),a=(r[0],r[1],Object(x.useState)("")),o=Object(g.a)(a,2);return o[0],o[1],Object(x.useEffect)((function(){}),[]),Object(S.jsxs)("div",{children:[Object(S.jsxs)("div",{className:"App",children:[Object(S.jsx)(fn,{}),Object(S.jsx)(Ct,{}),Object(S.jsx)(Mt,{seeAll:t})]}),t||Object(S.jsx)(Gt,{onClick:function(){i(!0)},children:"\ubaa8\ub450 \ud3bc\uccd0\ubcf4\uae30"})]})};f.a.render(Object(S.jsx)(h.a.StrictMode,{children:Object(S.jsx)(Pt,{})}),document.getElementById("root"))}},[[44,1,2]]]);
//# sourceMappingURL=main.19ba1225.chunk.js.map
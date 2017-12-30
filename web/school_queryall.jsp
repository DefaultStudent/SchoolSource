<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2017/12/30
  Time: 下午7:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container-fluid">
    <s:if test="ulimit==1">
        <%@include file="head_admin.jsp"%>
    </s:if>
    <s:else>
        <%@include file="head_users.jsp"%>
    </s:else>
    <div class="row-fluid">
        <div class="span12">
            <form class="form-search">
                <input class="input-medium search-query" type="text" /> <button type="submit" class="btn">查找</button>
            </form>
            <table class="table">
                <thead>
                <tr>
                    <th>
                        院校编号
                    </th>
                    <th>
                        院校名称
                    </th>
                    <th>
                        院校类型
                    </th>
                    <th>
                        院校地址
                    </th>
                </tr>
                </thead>
                <tbody>
                <s:iterator value="PageBean.list">
                <tr>
                    <td>
                        <s:property value="schId"/>
                    </td>
                    <td>
                        <s:property value="schName"/>
                    </td>
                    <td>
                        <s:property value="tid"/>
                    </td>
                    <td>
                        <s:property value="schAddress"/>
                    </td>
                </tr>
                </s:iterator>
                <tr>
                    <td class="tocenter">
                        共<s:property value="PageBean.totalPage" />页
                    </td>
                    <td class="tocenter">
                        共<s:property value="PageBean.totalCount" />条记录
                    </td>
                    <td class="tocenter">
                        当前第<s:property value="PageBean.page" />页
                    </td>
                </tr>
                <tr align="center">
                    <td colspan="4">
                        第<s:property value="PageBean.page"/>/<s:property value="PageBean.totalPage"/>页
                        <s:if test="PageBean.page!=1">
                            <a href="${pageContext.request.contextPath }/findAllSchool/?page=1">首页</a>|
                            <a href="${pageContext.request.contextPath }/findAllSchool?page=<s:property value="PageBean.page-1"/>">上一页</a>|
                        </s:if>
                        <s:if test="PageBean.page!=PageBean.totalPage">
                            <a href="${pageContext.request.contextPath }/findAllSchool?page=<s:property value="PageBean.page+1"/>">下一页</a>|
                            <a href="${pageContext.request.contextPath }/afindAllSchool?page=<s:property value="PageBean.totalPage"/>">尾页</a>
                        </s:if>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>

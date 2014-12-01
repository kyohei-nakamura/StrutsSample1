<%@ page language="java" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>


<html:html>
<body>
	<html:form action="/sample_ignore">
		<h1>Welcome</h1>
		<html:submit property="execute">ignore_true</html:submit>
		<html:submit property="execute">ignore_false</html:submit>
	</html:form>
</body>
</html:html>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html>
<body>
	bean:writeタグ利用時にBeanが存在しない場合の挙動確認
	<bean:write name="message" ignore="false" />
</body>
</html>

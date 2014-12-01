<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<h1>Ignore false</h1>

<bean:write name="mBean" property="message" ignore="false" />

<bean:write name="dummyBean" property="dummyProp" ignore="false" />

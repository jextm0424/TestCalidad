<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<script src='<c:url value="dwr/engine.js"/>'></script>
<script src='<c:url value="dwr/interface/ajax.js"/>'></script>


<html>
  <head>
    <title><sitemesh:write property='title'/></title>
    <sitemesh:write property='head'/>
  </head>
  <body>
    <sitemesh:write property='body'/>
  </body>
</html>
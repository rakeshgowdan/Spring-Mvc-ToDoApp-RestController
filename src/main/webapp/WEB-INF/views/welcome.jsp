<%@ include file="commons/header.jspf"%>
<%@ include file="commons/navbar.jspf"%>

<div class="container">
<spring:message code="welcome.message" /> ${name}
<br>
Now you can <a href="/list-todos">manage your todo's</a>
</div>
<%@ include file="commons/footer.jspf"%>
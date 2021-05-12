<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Enter Customer Information</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles.css">

</head>
<body>
<jsp:include page="_header.jsp" />
<jsp:include page="_menu.jsp" />

<div class="page-title">Enter Customer Information</div>

   <form:form method="POST" modelAttribute="customerForm"
       action="${pageContext.request.contextPath}/shoppingCartCustomer">

       <table>
           <tr>
               <td>Name *</td>
               <td><form:input path="name" /></td>
               <td><form:errors path="name" class="error-message" /></td>
           </tr>

           <tr>
               <td>Email *</td>
               <td><form:input path="email" /></td>
               <td><form:errors path="email" class="error-message" /></td>
           </tr>

           <tr>
               <td>Phone *</td>
               <td><form:input path="phone" /></td>
               <td><form:errors path="phone" class="error-message" /></td>
           </tr>
              <tr>
                          <td>phonenumber *</td>
                          <td><form:input path="phonenumber" /></td>
                          <td><form:errors path="phonenumber" class="error-message" /></td>
                      </tr>

           <tr>
               <td>Address *</td>
               <td><form:input path="address" /></td>
               <td><form:errors path="address" class="error-message" /></td>
           </tr>

           <tr>
               <td>&nbsp;</td>
               <td><input type="submit" value="Submit" /> <input type="reset"
                   value="Reset" /></td>
           </tr>
       </table>

   </form:form>


   <jsp:include page="_footer.jsp" />


</body>
</html>
<%
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","12345");
Statement st=con.createStatement();
String name=request.getParameter("name");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
String address=request.getParameter("address");

String strQuery = "SELECT COUNT(*) FROM users where name='"+name+"'";
ResultSet rs = st.executeQuery(strQuery);
rs.next();
String Countrow = rs.getString(1);v out.println(Countrow);
if(Countrow.equals("0")){
int i=st.executeUpdate("insert into users(name,email,phone,address)values('"+name+"','"+email+"','"+phone+"','"+address+"')");
}
else{
out.println("User name already exists !");
}
}
catch (Exception e){
e.printStackTrace();
}
%>
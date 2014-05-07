
          "http://jakarta.apache.org/struts/dtds/struts-config_1_2.dtd">
 
<struts-config>
 
<!-- Form Beans -->
 
    <form-beans>
        <form-bean name="formCertificacao" type="org.apache.struts.validator.DynaValidatorActionForm">
         <form-property name="method" type="java.lang.String">
        </form-property></form-bean>
    </form-beans>
     
 <!-- Action Mappings -->
 
    <action-mappings>
        <action br="">            path="/certificacao"
            type="br.com.struts.ActionCertificacao"
            parameter="method"
            scope="request"
            name="formCertificacao"
            validate="false">
             
   <forward name="token" path="/certificacao/token.jsp">
     </forward></action>
 </action-mappings></struts-config>
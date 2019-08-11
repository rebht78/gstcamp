<%-- 
    Document   : ClientView
    Created on : Aug 3, 2019, 10:24:34 PM
    Author     : aziz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${process eq 'add'}">           
    <div id="clientbox" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Add Client</div>
            </div>  
            <div class="panel-body" >
                <form method="post" action=".">
                    <div id="div_id_gstno" class="form-group required">
                        <label for="id_gstno" class="control-label col-md-4  requiredField">GST No<span class="asteriskField">*</span> </label>
                        <div class="controls col-md-8 ">
                            <input class="input-md  textinput textInput form-control" id="id_gstno" maxlength="30" name="gstno" placeholder="Enter GST No. of the Client" style="margin-bottom: 10px" type="text" />
                        </div>
                    </div>
                    <div id="div_id_clientname" class="form-group required">
                        <label for="id_email" class="control-label col-md-4  requiredField">Client Name<span class="asteriskField">*</span> </label>
                        <div class="controls col-md-8 ">
                            <input class="input-md textinput form-control" id="id_clientname" name="clientname" placeholder="Enter Name of the Client" style="margin-bottom: 10px" type="email" />
                        </div>     
                    </div>
                    <div id="div_id_number" class="form-group required">
                        <label for="id_address" class="control-label col-md-4  requiredField">Address<span class="asteriskField">*</span> </label>
                        <div class="controls col-md-8 ">
                            <textarea class="form-control" rows="5" id="id_address" name="address"></textarea>
                        </div> 
                    </div>
                    <div id="div_id_state" class="form-group required"> 
                        <label for="id_company" class="control-label col-md-4  requiredField">State<span class="asteriskField">*</span> </label>
                        <div class="controls col-md-8 "> 
                            <input class="input-md textinput textInput form-control" id="id_state" name="state" placeholder="Enter State of the Client" style="margin-bottom: 10px" type="text" />
                        </div>
                    </div>
                    <div id="div_id_number" class="form-group required">
                        <label for="id_number" class="control-label col-md-4  requiredField">Contact Number<span class="asteriskField">*</span> </label>
                        <div class="controls col-md-8 ">
                            <input class="input-md textinput textInput form-control" id="id_number" name="number" placeholder="Enter Contact Number of the Client" style="margin-bottom: 10px" type="text" />
                        </div> 
                    </div>
                    <div class="form-group"> 
                        <div class="aab controls col-md-4 "></div>
                        <div class="controls col-md-8 ">
                            <input type="submit" name="submitclient" value="Submit" class="btn btn-primary btn btn-info" id="submit-id-addclient" />
                            <input type="reset" name="resetclient" value="Reset" class="btn btn-danger btn btn-info" id="reset-id-addclient" />
                        </div>
                    </div> 

                </form>
            </div>
        </div>
    </div>
</c:if>
<c:if test="${process eq 'Edit' or process eq 'Delete'}">
    <div id="clientbox" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">${process} Client</div>
            </div>  
            <div class="panel-body" >
                <form method="post" action=".">
                    <div id="div_id_gstno" class="form-group required">
                        <label for="id_username" class="control-label col-md-4  requiredField">GST No<span class="asteriskField">*</span> </label>
                        <div class="controls col-md-8 ">
                            <select id="gstdropdown" name="gstno" class="textInput form-control input-md">
                                <option>Select All</option>
                                <c:forEach var="gst" items="${gstlist}">
                                    <option>${gst}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <br/>
                    <br/>
                    <div class="form-group"> 
                        <div class="aab controls col-md-4 "></div>
                        <div class="controls col-md-8 ">
                            <input type="submit" name="submitclient" value="Search Client" class="btn btn-primary btn btn-info" id="submit-id-client" />
                            <input type="reset" name="resetclient" value="Reset" class="btn btn-danger btn btn-info" id="reset-id-client" />
                        </div>
                    </div> 
                </form>
            </div>
        </div>
    </div>
</c:if>
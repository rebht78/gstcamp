<%-- 
    Document   : purchase
    Created on : Aug 20, 2019, 10:11:29 PM
    Author     : aziz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${process eq 'add'}">           
    <div id="productbox" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Add Purchase</div>
            </div>  
            <div class="panel-body" >
                <form method="post">
                    <div id="div_id_purchasedate" class="form-group required">
                        <label for="id_purchasedate" class="control-label col-md-4  requiredField">Purchase Date<span class="asteriskField">*</span> </label>
                        <div class="controls col-md-8 ">
                            <input class="input-md textinput textInput form-control" id="id_purchasedate" maxlength="30" name="purchasedate" placeholder="Enter Purchase Date" style="margin-bottom: 10px" type="text" />
                        </div>
                    </div>
                    <div id="div_id_clientname" class="form-group required">
                        <label for="id_clientname" class="control-label col-md-4  requiredField">Client Name<span class="asteriskField">*</span> </label>
                        <div class="controls col-md-8 ">
                            <input class="input-md textinput form-control" id="id_clientname" name="clientname" placeholder="Enter Client Name" style="margin-bottom: 10px" type="text" />
                        </div>     
                    </div>
                    <div id="div_id_totalamt" class="form-group required">
                        <label for="id_totalamt" class="control-label col-md-4  requiredField">Total Amt<span class="asteriskField">*</span> </label>
                        <div class="controls col-md-8 ">
                            <input class="input-md textinput form-control" id="id_totalamt" name="totalamt" placeholder="Enter Total Amt" style="margin-bottom: 10px" type="text" />
                        </div> 
                    </div>
                    <div id="div_id_hsncode" class="form-group required"> 
                        <label for="id_hsncode" class="control-label col-md-4  requiredField">HSN Code<span class="asteriskField">*</span> </label>
                        <div class="controls col-md-8 "> 
                            <input class="input-md textinput textInput form-control" id="id_hsncode" name="hsncode" placeholder="Enter HSN Code" style="margin-bottom: 10px" type="text" />
                        </div>
                    </div>
                    <div id="div_id_taxrate" class="form-group required">
                        <label for="id_taxrate" class="control-label col-md-4  requiredField">Tax Rate<span class="asteriskField">*</span> </label>
                        <div class="controls col-md-8 ">
                            <input class="input-md textinput textInput form-control" id="id_taxrate" name="taxrate" placeholder="Enter Tax Rate" style="margin-bottom: 10px" type="text" />
                        </div> 
                    </div>
                    <div class="form-group"> 
                        <div class="aab controls col-md-4 "></div>
                        <div class="controls col-md-8 ">
                            <input type="submit" name="submitproduct" value="Submit" class="btn btn-primary btn btn-info" id="submit-id-addproduct" />
                            <input type="reset" name="resetproduct" value="Reset" class="btn btn-danger btn btn-info" id="reset-id-addproduct" />
                        </div>
                    </div> 

                </form>
            </div>
        </div>
    </div>
</c:if>


<%-- 
    Document   : ProductView
    Created on : Aug 12, 2019, 8:41:03 PM
    Author     : aziz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${process eq 'add'}">           
    <div id="productbox" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Add Product</div>
            </div>  
            <div class="panel-body" >
                <form method="post">
                    <div id="div_id_productno" class="form-group required">
                        <label for="id_productno" class="control-label col-md-4  requiredField">Product No<span class="asteriskField">*</span> </label>
                        <div class="controls col-md-8 ">
                            <input class="input-md  textinput textInput form-control" id="id_productno" maxlength="30" name="productno" placeholder="Enter Product No." style="margin-bottom: 10px" type="text" />
                        </div>
                    </div>
                    <div id="div_id_productname" class="form-group required">
                        <label for="id_productname" class="control-label col-md-4  requiredField">Product Name<span class="asteriskField">*</span> </label>
                        <div class="controls col-md-8 ">
                            <input class="input-md textinput form-control" id="id_productname" name="productname" placeholder="Enter Product Name" style="margin-bottom: 10px" type="text" />
                        </div>     
                    </div>
                    <div id="div_id_rate" class="form-group required">
                        <label for="id_rate" class="control-label col-md-4  requiredField">Rate<span class="asteriskField">*</span> </label>
                        <div class="controls col-md-8 ">
                            <input class="input-md textinput form-control" id="id_productrate" name="productrate" placeholder="Enter Product Rate" style="margin-bottom: 10px" type="text" />
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
<c:if test="${process eq 'Edit' or process eq 'Delete'}">
    <div id="productbox" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">${process} Product</div>
            </div>  
            <div class="panel-body" >
                <form method="post">
                    <div id="div_id_productno" class="form-group required">
                        <label for="id_username" class="control-label col-md-4  requiredField">Product No<span class="asteriskField">*</span> </label>
                        <div class="controls col-md-8 ">
                            <select id="productdropdown" name="productno" class="textInput form-control input-md">
                                <option>Select All</option>
                            </select>
                        </div>
                    </div>
                    <br/>
                    <br/>
                    <div class="form-group"> 
                        <div class="aab controls col-md-4 "></div>
                        <div class="controls col-md-8 ">
                            <input type="submit" name="submitproduct" value="Search Product" 
                                   class="btn btn-primary btn btn-info" id="submit-id-product"
                                   onclick="return ShowProducts()"/>
                            <input type="reset" name="resetproduct" value="Reset" class="btn btn-danger btn btn-info" id="reset-id-product" />
                        </div>
                    </div> 
                </form>
            </div>
        </div>
    </div>
</c:if>

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function ajaxCall(url, data, method, divid)
{
    var xmlhttp = false;
    if (window.XMLHttpRequest) {
        // code for modern browsers
        xmlhttp = new XMLHttpRequest();
    } else {
        // code for old IE browsers
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    if (xmlhttp) {
        var obj = document.getElementById(divid);
        xmlhttp.open(method, url, false);
        xmlhttp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
        xmlhttp.send(data);
        if (xmlhttp.readyState == 4)
        {
            if (xmlhttp.status == 200)
                obj.innerHTML = xmlhttp.responseText;
            else
                obj.innerHTML = "There is some problem, Kindly contact your Admin!";

        }

    }
}
function showHome()
{
    window.location = "home.gst?action=showHome";
}
function ClientLoader()
{
    ajaxCall('home.gst?action=showClient', '', 'GET', 'load');
}
function AddClientLoader()
{
    ajaxCall('home.gst?action=addClient', '', 'GET', 'clientview');
}
function EditClientLoader()
{
    ajaxCall('home.gst?action=editClient', '', 'GET', 'clientview');
}
function ViewClientLoader()
{
    ajaxCall('home.gst?action=viewClient', '', 'GET', 'clientview');
}
function DeleteClientLoader()
{
    ajaxCall('home.gst?action=deleteClient', '', 'GET', 'clientview');
}
function ShowClients()
{
    ajaxCall('home.gst?action=displayClient', '', 'GET', 'viewbox');
    return false;
}
function ProductLoader()
{
    ajaxCall('home.gst?action=showProduct', '', 'GET', 'load');
}
function AddProductLoader()
{
    ajaxCall('product.gst?action=addProduct', '', 'GET', 'productview');
}
function EditProductLoader()
{
    ajaxCall('product.gst?action=editProduct', '', 'GET', 'productview');
}
function DeleteProductLoader()
{
    ajaxCall('product.gst?action=deleteProduct', '', 'GET', 'productview');
}
function PurchaseLoader()
{
    ajaxCall('home.gst?action=showPurchase', '', 'GET', 'load');
}
function AddPurchaseLoader()
{
    ajaxCall('invoice.gst?action=addPurchase', '', 'GET', 'purchaseview');
}
function checkLogin()
{
    if (validate_required('username', 'Username')
            && validate_required('password', 'Password'))
    {
        var form = document.getElementById('loginform');
        var params = getFormData(form);
        getSynchronousData('login.gst?action=checkLogin', params, 'load');

        if (document.getElementById('rownum').value > 0)
        {
            window.location = "home.gst?action=showHome";
        } else
        {
            alert('Invalid Username or Password!');
        }
    }
    return false;
}
function resetLogin()
{
    document.getElementById('password').value = "";
    document.getElementById('username').value = "";
}
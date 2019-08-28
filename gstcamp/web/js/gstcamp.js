/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function ajaxCall(url, data, method, divid)
{
    if (window.XMLHttpRequest) {
        // code for modern browsers
        xmlhttp = new XMLHttpRequest();
    } else {
        // code for old IE browsers
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }

    xmlhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            document.getElementById(divid).innerHTML = this.responseText;
        }
    };
    xmlhttp.open(method, url, true);
    if (method === 'POST')
    {
        xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    }
    xmlhttp.send(data);
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
        var params = "username=" + document.getElementById('username').value
                + "&password=" + document.getElementById('password').value;

        ajaxCall('login.gst?action=checkLogin', params, 'POST', 'load');

        if (document.getElementById('rownum').value > 0)
        {
            alert("Login Successful");
        } else
        {
            alert("Invalid Username/Password");
        }
    }
    return false;
}
function resetLogin()
{
    document.getElementById('password').value = "";
    document.getElementById('username').value = "";
}
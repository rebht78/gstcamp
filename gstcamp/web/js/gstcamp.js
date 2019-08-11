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
    xmlhttp.send(data);
}
function showHome()
{
    window.location = "home.gst?action=showHome";
}
function ClientLoader()
{
    ajaxCall('home.gst?action=showClient','','GET','load');
}
function AddClientLoader()
{
    ajaxCall('home.gst?action=addClient','','GET','clientview');
}
function EditClientLoader()
{
    ajaxCall('home.gst?action=editClient','','GET','clientview');
}
function ViewClientLoader()
{
    ajaxCall('home.gst?action=viewClient','','GET','clientview');
}
function DeleteClientLoader()
{
    ajaxCall('home.gst?action=deleteClient','','GET','clientview');
}
function ShowClients()
{
    ajaxCall('home.gst?action=displayClient','','GET','viewbox');
    return false;
}
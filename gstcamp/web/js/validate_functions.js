/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validate_required(elementid, elementname)
{
    var value = document.getElementById(elementid).value;
    
    if (value.trim() === '')
    {
        alert("Please enter value for "+elementname);
        return false;
    }
    return true;
}


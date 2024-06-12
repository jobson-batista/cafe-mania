// Validar se o valor do input é número ou texto
function isNumberKey(evt) {
    var charCode = (evt.which) ? evt.which : evt.keyCode;
    if (charCode != 8 && charCode != 0 && (charCode < 48 || charCode > 57) && charCode != 46) {
        return false;
    }
    return true;
}

$(document).ready(function()
{
	
$(".tab").click(function()
{
var X=$(this).attr('id');
 
if(X=='signupHome')
{
$("#loginHome").removeClass('select');
$("#signupHome").addClass('select');
$("#loginbox").slideUp();
$("#signupbox").slideDown();
}
else
{
$("#signupHome").removeClass('select');
$("#loginHome").addClass('select');
$("#signupbox").slideUp();
$("#loginbox").slideDown();
}
 
});

});
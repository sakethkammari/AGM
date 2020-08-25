function onSignIn(googleUser)
{
	window.alert('ss');
	var profile=googleUser.getBasicProfile();
	$(".g-signin2").css("display","none");
	$(".data").css("display","block");
	$("#pic").attr('src',profile.getImageUrl());
	$("#email").text(profile.getEmail());
	
}
function test()
{
	window.alert('sasa')
	}
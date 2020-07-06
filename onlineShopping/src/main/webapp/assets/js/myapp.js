$(function(){
	/* solving active menu problem */
	if(menu== "About" || menu== "Contact"){
		$('#home').removeClass('active');
	}
	switch(menu){
	case 'About':
		$('#about').addClass('active');
		break;
	case 'Contact':
		$('#contact').addClass('active');
		break;
	default:
		$('#home').addClass('active');
		break;
	}
});
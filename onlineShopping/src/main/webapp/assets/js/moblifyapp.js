$(function(){
	/* solving active menu problem */
	if(menu== "About" || menu== "Contact" || menu== "AllProducts"){
		$('#home').removeClass('active');
	}
	switch(menu){
	case 'About':
		$('#about').addClass('active');
		break;
	case 'Contact':
		$('#contact').addClass('active');
		break;
	case 'AllProducts':
		$('#productList').addClass('active');
		break;
	default:
		$('#productList').addClass('active');
		$('#a_'+menu).addClass('active');
		$('#home').removeClass('active');
		break;
	}
});
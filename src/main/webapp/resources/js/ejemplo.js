function GrabarForm(){
  		var data = $('#formPrincipal').serialize();
  		$.post("grabarCiudad",data,function(){
  				location.reload();
  				limpiarCajas();
  		});
  	}

function limpiarCajas(){
		$(':text').val('');
	}
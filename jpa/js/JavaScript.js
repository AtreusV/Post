$(document).ready(function() {
    $('#listar').on('click',function() {

        let tabla = document.querySelector('#tabla')
        tabla.innerHTML = '<table><tr><th>ID</th><th>NOMBRE</th><th>PAÍS</th><th>FECHA NACIMIENTO</th><th>CORREO</th></tr></table>'

        $.ajax({

            url:"http://localhost:8080/listarPersonas",
            type:"GET",
            dataType: "JSON",
            success: function(respuesta) {
                for (i = 0;i <= respuesta.length; i++){
                    tabla.innerHTML += 
                    '<tr><td>' + respuesta[i].id +
                    '<td>' + respuesta[i].nombre +
                    '<td>' + respuesta[i].apellido +
                    '<td>' + respuesta[i].correo +
                    '<td>' + respuesta[i].telefono
                }
            }
        })
    })

    $('#enviar').on('click',function(){
        let datos = {
            id: parseInt($('#Id').val()),
            nombre: $('#Nombre').val(),
            apellido: $('#Apellido').val(),
            correo: $('#Correo').val(),
            telefono: $('#Telefono').val()
        }
        console.log(datos)

        let datosEnvio = JSON.stringify(datos);
        console.log(datosEnvio);
        $.ajax({
            url: "http://localhost:8080/agregarPersona",
            type: "POST",
            data: datosEnvio,
            contentType: "application/JSON",
            dataType: "TEXT",
        })
    });

    $('#Eliminar').on('click',function(){
    
        let codigo = $('#Id').val();
        console.log(codigo)

        $.ajax({
            url:"http://localhost:8080/eliminarPersona/"+codigo,
            Type:"DELETE",
            dataType:"JSON",
            success:function(respuesta){
                alert("UnU")
            }
        })
    });
});
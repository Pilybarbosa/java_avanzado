<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="ppp?op=styleamigos">

</head>
<body>
    <header> 
        <div class="logo-name">
            <div class="logo">
                <img src="resources/assets/img/mimi (1).ico" alt="">
            </div>
            <div class="nombre">
                <h1>Carolina Barbosa</h1>
            </div>
        </div>
     
       
    </header>
    <div class="contenidos">
    <form action="formulario ">
        <h1>MODIFICAR USUARIO</h1>
        <div class="contenedor">
            <p>este funcion te dara la posibilidad de modificar tu datos de usuario dandote la
                seguridad de que nadie mas quetu pueda obbtener tus datos personales.</p>
            <div class=" incontenedor">
                <p>ID AMIGO</p>
                <i class="fas fa-user"></i>
                <input type="text" placeholder="inegrese  amigo ">
            </div>

            <div class=" incontenedor">
                <p>NOMBRE</p>
                <i class="fas fa-envelope"></i>
                <input type="text" placeholder="ingrese nombre">
            </div>
             <input type="submit" value="BUSCAR" class="boton">
            
            
        </div>
    </form>
</div>
<form action="amigos" method="podt">
    <label for="MODIFICAR USUARIO">ID AMIGOS</label>
    <input type="text" name="ID AMIGOS">
    <button type="submit"  name="AMIGOS" value="enviar">
    </button>
</form>

</body>
</html>
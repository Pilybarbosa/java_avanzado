<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="ppp?op=stylepublicar">

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
    <form action="ppp" method="post">
        <h1>Publicaciones Usuario</h1>
        <div class="contenedor">
            <div class=" incontenedor">
                <p>comentario</p>
                <i class="fas fa-user"></i>
                <input type="text" name="comentar" placeholder="...">
                
            </div>

            <div class=" incontenedor">
                <p>ingrese su imagen </p>
                <i class="fas fa-envelope"></i>
                <input type="text" placeholder="imagen " name="imagen">
              
            </div>

            <div class=" incontenedor">
                <i class="fas fa-key"></i>
                <p>Etiqueta Amigo</p>
                <input type="text" placeholder="id amigo " name="etiqueta">
            </div>
               <input type="submit" value="publicar" class="boton" name="op" >
              

        </div>
   
    </form>


 </div>
</body>
</html>
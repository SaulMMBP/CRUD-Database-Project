# CRUD Data Base Project

Proyecto básico en Java con Springboot y MySQL

El proyecto está realizado mediante las siguientes capas

- Base de Datos en MySQL
- DAO (Data Access Object)
- Servicios
- Controlador
- Vista

## Base de datos

Se encuentra en el script database/database.sql, es una base de datos ejemplo con fines de testeo de la aplicación. Contiene una sola tabla que almacena
datos de empleados ficticios (first_name, last_name, email e id).

## DAO

En este proyecto, esta capa se realizó mediante Spring Data JPA, implementando la interfaz CrudRepository autoimplementada.

Se agregó un método más para la obtención de datos ordenados alfabéticamente por last_name.

## Servicio

Esta capa se utilizó para la comunicación con el controlador delegando los métodos implementados al DAO.

## Controlador

En esta capa se realizó todo el mappeo con ayuda de las anotaciones provistas por spring. Haciendo uso de los métodos GET y POST para controlar las peticiones de la vista.

## Vista

Ejercicio realizado por medio de Thymeleaf, con sus respectivas etiquetas para manipular los objetos y sus campos, así como el ruteo para hojas de estilo y scripts.

Para el estilo de la vista se usó css simple y en cuanto scripts solo se requirió una funcioón para pedir la confirmación de un evento. 
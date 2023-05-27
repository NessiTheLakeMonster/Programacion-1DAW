package com.example.git_interfaz

class Constantes {

    companion object {
        val url = "jdbc:mysql://localhost/videoclub"
        val user = "root"
        val password = ""
        val forname = "com.mysql.cj.jdbc.Driver"

        // TABLA DE VIDEOJUEGO
        val id_videojuego = "id_videojuego"
        val titulo_videojuego = "titulo"
        val saga = "saga"
        val distribuidora = "distribuidora"
        val fecha_lanz = "fecha_lanzamiento"
        val genero = "genero"

        val select_videojuegos = "SELECT * FROM videojuego"
        val insert_videojuegos = "INSERT INTO videojuego VALUES (?,?,?,?,'01/01/2001',?)"
        val update_videojuegos = "UPDATE videojuego SET titulo=?, saga=?, distribuidora=?, fecha_lanzamiento=?, " +
                "genero=? WHERE id_videojuego = ?"
        val delete_videojuegos = "DELETE FROM videojuego WHERE id_videojuego = ?"

        // TABLA DE ALQUILER
        val alquiler_sql_select = "SELECT * FROM alquiler"
        val alquiler_sql_insert = "INSERT INTO alquiler VALUES (?,?,?,?,?,?)"
        val update_alquiler = "UPDATE alquiler SET fecha_inicio=?, fecha_fin=?, precio=? WHERE id_alquiler = ?"
        val delete_alquiler = "DELETE FROM alquiler WHERE id_alquiler = ?"

        val nombre_id_alquiler = "id_alquiler"
        val nombre_id_videojuego = "id_videojuego"
        val nombre_id_socio = "id_socio"
        val nombre_fecha_inicio = "fecha_inicio"
        val nombre_fecha_fin = "fecha_fin"
        val nombre_precio = "precio"

        // TABLA DE SOCIOS
        val socio_sql_select = "SELECT * FROM socio"
        val socio_sql_insert = "INSERT INTO socio VALUES (?,?,?,?,?)"
        val update_socio = "UPDATE socio SET dni=?, nombre=?, apellido1=?,fecha_nac=? WHERE id_socio=?"
        val delete_socio = "DELETE FROM socio WHERE id_socio=?"
        val select_x_socio = "select * from socio where id_socio = ?"
        var select_max_socio = "select max(id_socio) from socio"

        val nombre_dni = "dni"
        val nombre_nombre_socio = "nombre"
        val nombre_apellido1 = "apellido1"
        val nombre_fecha_nac = "fecha_nac"

        // TABLA DE INVENTARIO
        val id_inventario = "id_inventario"
        val cant_disponible = "cant_disponible"
        val cant_reparacion = "cant_reparacion"
        val cant_prestamo = "cant_prestamo"
        val last_date_up = "fecha_ultima_actualizacion"

        val select_inventario = "select * from inventario"

    }
}
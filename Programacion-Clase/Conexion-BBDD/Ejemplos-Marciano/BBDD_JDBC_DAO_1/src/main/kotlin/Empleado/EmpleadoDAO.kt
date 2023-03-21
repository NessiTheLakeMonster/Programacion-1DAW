package Empleado

import Empleado.Empleado

interface EmpleadoDAO {
    fun insertEmpleado(empleado: Empleado): Boolean
    fun updateEmpleado(empleado: Empleado): Boolean
    fun deleteEmpleado(DNI: Int): Boolean
}
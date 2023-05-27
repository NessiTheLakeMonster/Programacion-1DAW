package Administradores

interface AdminDAO {
    open fun selectXAdmin(): Boolean
    open fun insertAdmin(admin: admin) : Boolean
    open fun deleteAdmin(admin: admin) : Boolean
}
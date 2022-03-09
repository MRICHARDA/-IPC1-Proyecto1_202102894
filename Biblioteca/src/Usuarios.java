
public class Usuarios {
    private String ID;
    private String Nombre;
    private String Apellido;
    private String User;
    private String Rol;
    private String Clave;

    public Usuarios(String ID, String Nombre, String Apellido, String User, String Rol, String Clave) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.User = User;
        this.Rol = Rol;
        this.Clave = Clave;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    
     
} 
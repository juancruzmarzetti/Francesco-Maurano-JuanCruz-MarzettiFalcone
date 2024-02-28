package dao;
import entity.Odontologo;
import java.util.List;

public interface IDao<Odontologo> {
    public List<Odontologo> buscarTodos();
    public Odontologo buscar(int id);
    public void guardar(Odontologo odontologo);
    public void eliminar(int id);
}

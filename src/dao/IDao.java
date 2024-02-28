package dao;
import entity.Odontologo;
import java.util.List;

public interface IDao<Odontologo> {
    public List<Odontologo> buscarTodos();
    public Odontologo buscar(Long id);
    public void guardar(Odontologo odontologo);
    public void eliminar(Long id);
}

package mvc.DAOInterface;

import java.util.List;
import mvc.Model.Mahasiswa;

public interface IMahasiswa {
    public void insert(Mahasiswa b);
    public void update(Mahasiswa b);
    public void delete(int id);
    public List<Mahasiswa> getAll();
    public List<Mahasiswa> getCariNama(String nama);
}

package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        /* Je me connecte à la DB pour récuperer une valeur*/
        double data=100;
        return data;
    }
}

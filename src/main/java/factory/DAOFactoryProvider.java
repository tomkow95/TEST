package factory;

import domain.User;
import sources.TypeOfSource;

import java.util.List;

public enum DAOFactoryProvider implements Factory {
    INSTANCE;

    private Factory factory;

    public void setSource(TypeOfSource source) {
        factory = source.getFactory();
    }

    private Factory getFactoryInstance() {
        return factory;
    }

    @Override
    public User selectUserById(int id) {
        return factory.selectUserById(id);
    }

    @Override
    public List selectAllUsers() {
        return factory.selectAllUsers();
    }
}

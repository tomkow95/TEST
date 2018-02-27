import domain.User;
import factory.DAOFactoryProvider;
import sources.TypeOfSource;

public class Main {
    public static void main(String... args){
        DAOFactoryProvider.INSTANCE.setSource(TypeOfSource.XML);
        User user = DAOFactoryProvider.INSTANCE.selectUserById(1);

    }
}

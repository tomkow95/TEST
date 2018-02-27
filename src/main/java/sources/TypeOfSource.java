package sources;

import factory.Factory;
import factory.implementation.CSVFactory;
import factory.implementation.DBFFactory;
import factory.implementation.XMLFactory;

public enum TypeOfSource {
    DBF ( new DBFFactory() ),
    CSV ( new CSVFactory() ),
    XML ( new XMLFactory() );

    Factory factory;

    TypeOfSource(Factory factory){
        this.factory = factory;
    }

    public Factory getFactory() {
        return factory;
    }
}

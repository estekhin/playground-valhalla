package playground.valhalla.separate_compilation;

public class SubClass extends SuperClass<SubClass.Inner> {

    @Override
    public Inner get() {
        return new Inner();
    }

    public class Inner {
    }

}

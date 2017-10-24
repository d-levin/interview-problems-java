package patterns.factory;

import patterns.factory.EngineFactory.Engine;
import patterns.factory.EngineFactory.EngineType;

public class Main {

    public static void main(String[] args) {
        Engine gasolineEngine1 = EngineFactory.getEngine(EngineType.GASOLINE, 1500);
        System.out.println("gasolineEngine1");
        System.out.println(gasolineEngine1);

        Engine gasolineEngine2 = EngineFactory.getEngine(EngineType.GASOLINE, 1500);
        System.out.println("gasolineEngine2");
        System.out.println(gasolineEngine2);
        System.out.println(gasolineEngine2.equals(gasolineEngine1)
                ? "gasolineEngine2 has same specs as gasolineEngine1"
                : "gasolineEngine2 does not have same specs as gasolineEngine1"
        );

        Engine gasolineEngine3 = EngineFactory.getEngine(EngineType.GASOLINE, 1000);
        System.out.println("gasolineEngine3");
        System.out.println(gasolineEngine3);
        System.out.println(gasolineEngine3.equals(gasolineEngine1)
                ? "gasolineEngine3 has same specs as gasolineEngine1"
                : "gasolineEngine3 does not have same specs as gasolineEngine1"
        );

        Engine dieselEngine = EngineFactory.getEngine(EngineType.DIESEL, 2500);
        System.out.println("dieselEngine");
        System.out.println(dieselEngine);
    }

}

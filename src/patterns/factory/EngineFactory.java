package patterns.factory;

import java.util.UUID;

public final class EngineFactory {

    private EngineFactory() {}

    public static Engine getEngine(EngineType engineType, int horsepower) {
        if (engineType == null || horsepower <= 0) {
            throw new IllegalArgumentException("An engine must have a type and a positive horsepower value");
        }
        return new Engine(engineType, horsepower);
    }

    public static class Engine {
        private UUID uuid;
        private EngineType engineType;
        private int horsepower;

        private Engine(EngineType engineType, int horsepower) {
            this.uuid = UUID.randomUUID();
            this.engineType = engineType;
            this.horsepower = horsepower;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Engine engine = (Engine) o;
            return horsepower == engine.horsepower && engineType == engine.engineType;
        }

        @Override
        public int hashCode() {
            int result = uuid.hashCode();
            result = 31 * result + engineType.hashCode();
            result = 31 * result + horsepower;
            return result;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "uuid=" + uuid +
                    ", engineType=" + engineType +
                    ", horsepower=" + horsepower +
                    '}';
        }
    }

    public enum EngineType {
        DIESEL("diesel"), GASOLINE("gasoline");

        private String value;

        EngineType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

}



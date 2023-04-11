package zoo;

import zoo.core.Controller;
import zoo.core.ControllerImpl;
import zoo.core.Engine;
import zoo.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl();
        engine.run();
    }
}

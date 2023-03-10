package Calculator_04;

public class Extensions {
    public static InputInterpreter buildInterpreter(CalculationEngine engine){
        return new InputInterpreter(engine);
    }

}

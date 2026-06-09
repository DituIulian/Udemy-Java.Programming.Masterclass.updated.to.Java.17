public class PersonalComputer extends Product {

  private ComputerCase computerCase;
  private Monitor monitor;
  private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer, Motherboard motherboard, Monitor monitor, ComputerCase computerCase) {
        super(model, manufacturer);
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.computerCase = computerCase;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}

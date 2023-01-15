public class ConcreteFactory1 extends PcFactory{
    @Override
    public HddAbstract createHdd() {
        return new HddConcrete1();
    }

    @Override
    public RamAbstract createRam() {
        return new RamConcrete1();
    }
}

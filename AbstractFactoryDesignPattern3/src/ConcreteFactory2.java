public class ConcreteFactory2 extends PcFactory{
    @Override
    public HddAbstract createHdd() {
        return new HddConcrete2();
    }

    @Override
    public RamAbstract createRam() {
        return new RamConcrete2();
    }
}

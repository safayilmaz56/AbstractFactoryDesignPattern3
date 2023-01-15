public class Factory {
    private PcFactory pcFactory;
    private HddAbstract hddAbstract;
    private RamAbstract ramAbstract;

    public Factory(PcFactory pcFactory){
        this.pcFactory = pcFactory;
        hddAbstract = pcFactory.createHdd();
        ramAbstract = pcFactory.createRam();
    }

    public void birlestir(){
        System.out.println(hddAbstract.hddTur());
        hddAbstract.hddIslem();
        System.out.println(ramAbstract.ramTur());
        ramAbstract.ramIslem();
    }
}

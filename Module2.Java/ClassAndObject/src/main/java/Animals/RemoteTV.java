package Animals;

public class RemoteTV extends TV {
    public RemoteTV (){}
    public RemoteTV (int channel,int volume, boolean on ){
        super(channel, volume, on);
    }

    @Override
    public String toString() {
        return "RemoteTV{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", on=" + on +
                '}';
    }

    public static void main(String[] args) {
        RemoteTV tom = new RemoteTV();
        tom.turnOn();
        tom.setChannel(7);
        tom.setVolume(tom.getVolume()+2);
        tom.volumeUp();
        tom.volumeUp();
        tom.volumeDown();
        tom.volumeDown();
        tom.volumeDown();
        tom.volumeDown();
        System.out.println(tom.toString());
    }
}

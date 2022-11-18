package Animals;

public class TV {
    public int channel;
    public int volume;
    public boolean on;
    public TV(){

    }
    public TV (int channel,int volume, boolean on){
        this.channel = channel;
        this.volume = volume;
        this.on = on;
    }
    public boolean turnOn (){
        return on=true;
    }
    public boolean turnOff (){
        return on = false;
    }
    public int getVolume (){
        return this.volume;
    }
    public void setVolume (int volume){
        if (on) this.volume = volume;
    }
    public void setChannel (int channel){
        if(on) this.channel = channel;
    }
    public int getChannel (){
        return this.channel;
    }
    public void volumeUp (){
        if (on)
        volume++;
    }
    public void volumeDown (){
        if (on)
            volume--;
    }
    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", on=" + on +
                '}';
    }
    //    int channel;
//    int volumeValue;
//    boolean on =false;
//    public TV (){
//
//    }
//    public void turnOn (){
//        on = true;
//    }
//    public void turnOff (){
//        on = false;
//    }
//    public void setChannel(int newchanel){
//        if (on&&newchanel>=1&&newchanel<=120){
//            channel=newchanel;
//        }
//    }
//    public void channelUp () {
//        if (on&&channel<120){
//            channel++;
//        }
//    }
//    public void channelDown (){
//        if (on&&channel>1){
//            channel--;
//        }
//    }
//    public void volumeUp (){
//        if (on&&volumeValue<7){
//            volumeValue++;
//        }
//    }
//    public void volumeDown (){
//        if (on&&volumeValue>1){
//            volumeValue--;
//        }
//    }
//    public void setVolumeValue(int newVolume){
//        if (on&&newVolume>=1&&newVolume<=7){
//            volumeValue = newVolume;
//        }
//    }

    public static void main(String[] args){






//    TV tom = new TV();
//    tom.turnOn();
//    tom.setChannel(25);
//    tom.setVolumeValue(5);
//        System.out.println("Tom's chanel is:"+tom.channel+ "Volume:"+ tom.volumeValue);
//
//        TV nam = new TV();
//        nam.turnOn();
//        nam.setChannel(12);
//        nam.setVolumeValue(4);
//        nam.channelUp();
//        nam.volumeDown();
//        System.out.println("Tom's chanel is:"+nam.channel+ "Volume:"+ nam.volumeValue);
    }



}

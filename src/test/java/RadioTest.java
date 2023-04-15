import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.service.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void actualStationNumber() {

        radio.setCurrentStation(4);
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNumber15() {

        radio.setCurrentStation(15);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNumber11() {

        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNumber10() {

        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNumber9() {

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StationNumber1() {

        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minStationNumber() {

        radio.setCurrentStation(-1);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroStationNumber() {

        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void overStationNumber() {

        radio.setCurrentStation(12);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void overNextStation() {

        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation4() {

        radio.setCurrentStation(4);
        radio.nextStation();

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroNextStation() {

        radio.setCurrentStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevLastStation() {

        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevZeroStation() {

        radio.setCurrentStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation6() {

        radio.setCurrentStation(6);
        radio.prevStation();

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation9() {

        radio.setCurrentStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeZero() {

        radio.setCurrentVolume(0);
        radio.nextVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume65() {

        radio.setCurrentVolume(65);
        radio.nextVolume();

        int expected = 66;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxVolume() {

        radio.setCurrentVolume(100);
        radio.nextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseOverMaxVolume() {

        radio.setCurrentVolume(101);
        radio.nextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMinVolume() {

        radio.setCurrentVolume(-1);
        radio.nextVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeZero() {

        radio.setCurrentVolume(0);
        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume65() {

        radio.setCurrentVolume(65);
        radio.prevVolume();

        int expected = 64;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume100() {

        radio.setCurrentVolume(100);
        radio.prevVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseMinVolume() {

        radio.setCurrentVolume(-1);
        radio.prevVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void oneLessStation() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(-1);

        int expected = 49;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void oneStation1() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void oneStation20() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(20);

        int expected = 20;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void oneMoreStation49() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(49);

        int expected = 49;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void oneMoreStation50() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(50);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void oneMoreNextStation() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(0);
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void oneMoreNextStation20() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(20);
        radio.nextStation();

        int expected = 21;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void oneMoreNextStation49() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(49);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void oneMorePrevStation() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 49;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void oneMorePrevStation49() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(49);
        radio.prevStation();

        int expected = 48;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void oneMorePrevStation1() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


}

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.netology.service.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void validateChangFields() {
        assertEquals(0,radio.getCurrentStation());
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());

    }

    @Test
    public void changeAfterLastRadioStation() {
        radio.setCurrentStation(9);
        radio.pressNextStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void changeUnderInitialRadioStation() {
        radio.setCurrentStation(0);
        radio.pressPrevStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void nextRadioStation() {
        radio.setCurrentStation(7);
        radio.pressNextStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void prevRadioStation() {
        radio.setCurrentStation(4);
        radio.pressPrevStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void afterInitialRadioStation() {
        radio.setCurrentStation(12);
        radio.getMaxStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void underInitialRadioStation() {
        radio.setCurrentStation(-2);
        radio.getMinStation();
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void volumeOverMax() {
        radio.setCurrentVolume(103);
        radio.getMaxVolume();
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void volumeDownUnderMin() {
        radio.setCurrentVolume(-11);
        radio.getMinVolume();
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void plusVolume() {
        radio.setCurrentVolume(2);
        radio.pressPlusVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void minusVolume() {
        radio.setCurrentVolume(5);
        radio.pressMinusVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

}


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.*;

public class BookingTest {

    @Test
    public void test() {
        Booking booking = new Booking();
        Assert.assertEquals(Booking.State.newBooking, booking.getState());

        booking.assignSeat();
        Assert.assertEquals(Booking.State.seatAssigned, booking.getState());

        booking = new Booking();
        booking.cancel();
        Assert.assertEquals(Booking.State.cancelled, booking.getState());

        booking = new Booking(); 
        booking.assignSeat();
        booking.checkIn();
        Assert.assertEquals(Booking.State.checkedIn, booking.getState());

        booking = new Booking(); 
        booking.assignSeat();
        booking.cancel();
        Assert.assertEquals(Booking.State.cancelled, booking.getState());

        booking = new Booking(); 
        booking.assignSeat();
        booking.checkIn();
        booking.complete();
        Assert.assertEquals(Booking.State.completed, booking.getState());

        booking = new Booking(); 
        booking.assignSeat();
        booking.checkIn();
        booking.cancel();
        Assert.assertEquals(Booking.State.cancelled, booking.getState());
    }
}


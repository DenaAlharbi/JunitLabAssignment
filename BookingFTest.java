import org.junit.*;

public class BookingFTest {

    @Test
    public void test1() {
        BookingF booking = new BookingF();
        Assert.assertEquals(BookingF.State.newBooking, booking.getState());
    }

    @Test
    public void testSeatAssigned() {
        BookingF booking = new BookingF();
        booking.assignSeat();
        Assert.assertEquals(BookingF.State.seatAssigned, booking.getState());
    }

    @Test
    public void testCancelling() {
        BookingF booking = new BookingF();
        booking.cancel();
        Assert.assertEquals(BookingF.State.cancelled, booking.getState());
    }

    @Test
    public void testCheckedIn() {
        BookingF booking = new BookingF();
        booking.assignSeat();
        
        booking.checkIn();
        Assert.assertEquals(BookingF.State.checkedIn, booking.getState());
    }

    @Test
    public void testFromSeatAssignedToCancelled() {
        BookingF booking = new BookingF();
        booking.assignSeat();
        booking.cancel();
        Assert.assertEquals(BookingF.State.cancelled, booking.getState());
    }

    @Test
    public void testCompleted() {
        BookingF booking = new BookingF();
        booking.assignSeat();
        booking.checkIn();
        booking.complete();
        Assert.assertEquals(BookingF.State.completed, booking.getState());
    }

    @Test
    public void testFromCheckedInToCancelled() {
        BookingF booking = new BookingF();
        booking.assignSeat();
        booking.checkIn();
        booking.cancel();
        Assert.assertEquals(BookingF.State.cancelled, booking.getState());
    }
}

public class JunitFault {

    public static void main(String[] args) {
        test1();
        testSeatAssigned();
        testCancelling();
        testCheckedIn();
        testFromSeatAssignedToCancelled();
        testCompleted();
        testFromCheckedInToCancelled();
    }

    public static void test1() {
        BookingF booking = new BookingF();
        if (booking.getState() == BookingF.State.newBooking) {
            System.out.println("Initialization successful");
        } else {
            System.out.println("Initialization failed");
        }
    }

    public static void testSeatAssigned() {
        BookingF booking = new BookingF();
        booking.assignSeat();
        if (booking.getState() == BookingF.State.seatAssigned) {
            System.out.println("ToSeatAssigned successful");
        } else {
            System.out.println("ToSeatAssigned failed");
        }
    }

    public static void testCancelling() {
        BookingF booking = new BookingF();
        booking.cancel();
        if (booking.getState() == BookingF.State.cancelled) {
            System.out.println("Cancellation successful");
        } else {
            System.out.println("Cancellation failed");
        }
    }

    public static void testCheckedIn() {
        BookingF booking = new BookingF();
        booking.assignSeat();
        booking.checkIn();
        if (booking.getState() == BookingF.State.checkedIn) {
            System.out.println("CheckedIn state successful");
        } else {
            System.out.println("CheckedIn state failed");
        }
    }

    public static void testFromSeatAssignedToCancelled() {
        BookingF booking = new BookingF();
        booking.assignSeat();
        booking.cancel();
        if (booking.getState() == BookingF.State.cancelled) {
            System.out.println("testFromSeatAssignedToCancelled successful");
        } else {
            System.out.println("testFromSeatAssignedToCancelled failed");
        }
    }

    public static void testCompleted() {
        BookingF booking = new BookingF();
        booking.assignSeat();
        booking.checkIn();
        booking.complete();
        if (booking.getState() == BookingF.State.completed) {
            System.out.println("Completed state successful");
        } else {
            System.out.println("Completed state failed");
        }
    }

    public static void testFromCheckedInToCancelled() {
        BookingF booking = new BookingF();
        booking.assignSeat();
        booking.checkIn();
        booking.cancel();
        if (booking.getState() == BookingF.State.cancelled) {
            System.out.println("testFromCheckedInToCancelled successful");
        } else {
            System.out.println("testFromCheckedInToCancelled failed");
        }
    }
}


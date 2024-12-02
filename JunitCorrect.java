public class JunitCorrect {
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
        Booking booking = new Booking();
        if (booking.getState() == Booking.State.newBooking) {
            System.out.println("Initialization successful");
        } else {
            System.out.println("Initialization failed");
        }
    }

    public static void testSeatAssigned() {
        Booking booking = new Booking();
        booking.assignSeat();
        if (booking.getState() == Booking.State.seatAssigned) {
            System.out.println("ToSeatAssigned successful");
        } else {
            System.out.println("ToSeatAssigned failed");
        }
    }

    public static void testCancelling() {
        Booking booking = new Booking();
        booking.cancel();
        if (booking.getState() == Booking.State.cancelled) {
            System.out.println("Cancellation successful");
        } else {
            System.out.println("Cancellation failed");
        }
    }

    public static void testCheckedIn() {
        Booking booking = new Booking();
        booking.assignSeat();
        booking.checkIn();
        if (booking.getState() == Booking.State.checkedIn) {
            System.out.println("CheckedIn state successful");
        } else {
            System.out.println("CheckedIn state failed");
        }
    }

    public static void testFromSeatAssignedToCancelled() {
        Booking booking = new Booking();
        booking.assignSeat();
        booking.cancel();
        if (booking.getState() == Booking.State.cancelled) {
            System.out.println("testFromSeatAssignedToCancelled successful");
        } else {
            System.out.println("testFromSeatAssignedToCancelled failed");
        }
    }

    public static void testCompleted() {
        Booking booking = new Booking();
        booking.assignSeat();
        booking.checkIn();
        booking.complete();
        if (booking.getState() == Booking.State.completed) {
            System.out.println("Completed state successful");
        } else {
            System.out.println("Completed state failed");
        }
    }

    public static void testFromCheckedInToCancelled() {
        Booking booking = new Booking();
        booking.assignSeat();
        booking.checkIn();
        booking.cancel();
        if (booking.getState() == Booking.State.cancelled) {
            System.out.println("testFromCheckedInToCancelled successful");
        } else {
            System.out.println("testFromCheckedInToCancelled failed");
        }
    }
}


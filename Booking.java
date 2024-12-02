/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.35.0.7523.c616a4dce modeling language!*/



/**
 * UML state diagram for a Booking on an airline, represented in Umple
 */
// line 4 "model.ump"
// line 27 "model.ump"
public class Booking
{

    //------------------------
    // MEMBER VARIABLES
    //------------------------

    //Booking State Machines
    public enum State { newBooking, seatAssigned, checkedIn, cancelled, completed }
    private State state;

    //------------------------
    // CONSTRUCTOR
    //------------------------

    public Booking()
    {
        setState(State.newBooking);
    }

    //------------------------
    // INTERFACE
    //------------------------

    public String getStateFullName()
    {
        String answer = state.toString();
        return answer;
    }

    public State getState()
    {
        return state;
    }

    public boolean assignSeat()
    {
        boolean wasEventProcessed = false;

        State aState = state;
        switch (aState)
        {
            case newBooking:
                setState(State.seatAssigned);
                wasEventProcessed = true;
                break;
            default:
                // Other states do respond to this event
        }

        return wasEventProcessed;
    }

    public boolean cancel()
    {
        boolean wasEventProcessed = false;

        State aState = state;
        switch (aState)
        {
            case newBooking:
                setState(State.cancelled);
                wasEventProcessed = true;
                break;
            case seatAssigned:
                setState(State.cancelled);
                wasEventProcessed = true;
                break;
            case checkedIn:
                setState(State.cancelled);
                wasEventProcessed = true;
                break;
            default:
                // Other states do respond to this event
        }

        return wasEventProcessed;
    }

    public boolean checkIn()
    {
        boolean wasEventProcessed = false;

        State aState = state;
        switch (aState)
        {
            case seatAssigned:
                setState(State.checkedIn);
                wasEventProcessed = true;
                break;
            default:
                // Other states do respond to this event
        }

        return wasEventProcessed;
    }

    public boolean complete()
    {
        boolean wasEventProcessed = false;

        State aState = state;
        switch (aState)
        {
            case checkedIn:
                setState(State.completed);
                wasEventProcessed = true;
                break;
            default:
                // Other states do respond to this event
        }

        return wasEventProcessed;
    }

    private void setState(State aState)
    {
        state = aState;
    }

    public void delete()
    {}

}
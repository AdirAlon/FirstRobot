package frc.robot;

public interface RoborMap {
    public interface CAN{
       static final int LEFT = 0;
       static final int RIGHT = 1;
       static  final int GRIPPER = 2;
       static final int FEEDER = 3;
       static final int SHOOTER_MASTER = 4;
       static final int SHOOTER_SLAVE = 5;

    }
    public interface DIO{
        static final int ENCODER_POSITIVE = 0;
        static final int ENCODER_NEGETIVE = 1;
    }

}

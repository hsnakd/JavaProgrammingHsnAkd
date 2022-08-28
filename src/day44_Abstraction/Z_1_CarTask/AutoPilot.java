package day44_Abstraction.Z_1_CarTask;

public interface AutoPilot extends AutoPark{
     boolean hasAutoPilot = true;

     void selfDrive();
}

/*
    3. Create a child interface of AutoPark named AutoPilot
                    Variables:
                        hasAutoPilot

                    Abstract method:
                        selfDrive();

 */
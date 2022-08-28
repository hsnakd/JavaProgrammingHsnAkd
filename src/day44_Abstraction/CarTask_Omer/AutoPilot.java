package day44_Tasks_Abstraction_Interface;

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
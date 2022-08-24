package day44_Abstraction.Z_2_DeviceTAsk;

public abstract class Phone {
    public void call(long phoneNum){
        System.out.println(phoneNum + " is calling");
    }

    public void text(long phoneNum){
        System.out.println(phoneNum + " is texting");
    }


}

/*
        2. Create a child abstract class of Device named Phone:

				Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()

 */